pipeline {
  agent {
        kubernetes {
yaml """
apiVersion: v1
kind: Pod
metadata:
  name: jenkins-slave
spec:
  containers:
  - name: jnlp
    image: jenkins/inbound-agent:4.10-3-jdk11
    imagePullPolicy: IfNotPresent
    tty: true
  - name: maven
    image: maven:3.8.5-eclipse-temurin-17
    imagePullPolicy: IfNotPresent
    command:
    - cat
    tty: true
  - name: tools
    image: ghcr.io/eve-online-tools/jenkins-tools:0.1
    imagePullPolicy: IfNotPresent
    command:
    - cat
    tty: true
  - name: kaniko
    image: gcr.io/kaniko-project/executor:debug
    imagePullPolicy: IfNotPresent
    command:
      - /busybox/sh
      - "-c"
    args:
      - /busybox/cat
    tty: true
    volumeMounts:
      - name: jenkins-docker-cfg
        mountPath: /kaniko/.docker
  hostAliases:
    - ip: 172.19.4.104
      hostnames:
        - gerrit.faktorzehn.de
  volumes:
    - name: m2
      persistentVolumeClaim:
        claimName: cache
    - name: jenkins-docker-cfg
      projected:
        sources:
        - secret:
            name: externalregistry
            items:
              - key: .dockerconfigjson
                path: config.json
  restartPolicy: Never
  nodeSelector:
    kubernetes.io/arch: amd64
  imagePullSecrets:
    - name: externalregistry
"""
    }
  }
    
  environment {
    IMAGE = readMavenPom().getArtifactId()
    VERSION = readMavenPom().getVersion()
    BUILD_RELEASE_VERSION = readMavenPom().getVersion().replace("-SNAPSHOT", "")
    IS_SNAPSHOT = readMavenPom().getVersion().endsWith("-SNAPSHOT")
  }

  stages {
    stage('Build') {
      steps {
        container('maven') {
  	      sh 'mvn --version'
  	        configFileProvider([configFile(fileId: 'maven-settings.xml', variable: 'MAVEN_SETTINGS')]) {
  	            sh 'mvn -s $MAVEN_SETTINGS -U -T 1C clean install -DskipTests'
  	        }
        }
     }
   }

    stage('create & push docker-image') {
        steps {        
          container('kaniko') {
              sh "/kaniko/executor --skip-tls-verify --dockerfile `pwd`/Dockerfile --context `pwd` --destination $TARGET_REGISTRY/wwk-ics:$BUILD_RELEASE_VERSION-$GERRIT_CHANGE_NUMBER --cleanup"
              sh "/kaniko/executor --skip-tls-verify --dockerfile `pwd`/initIcsSchema.Dockerfile --context `pwd` --destination $TARGET_REGISTRY/init-ics-schema:$BUILD_RELEASE_VERSION-$GERRIT_CHANGE_NUMBER --cleanup"

          }
        }
      }
  }
}

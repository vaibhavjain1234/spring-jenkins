pipeline {
    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage('Buld Maven') {
            steps {
                checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vaibhavjain1234/spring-jenkins']])
                sh "mvn clean install"
            }
        }
        stage('Build Docker Image')
        {
            steps{
                script{
                    sh "docker build -t sjain7882/springboot-k8s-demo:2.0 ."
                }
            }
        }
        stage('Push Image to Docker Hub')
        {
            steps{
               script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    // some block
                    sh 'docker login -u sjain7882@gmail.com -p ${dockerhubpwd}'
                }
                sh 'docker push sjain7882/springboot-k8s-demo:2.0'
               }
            }
        }
    }
}

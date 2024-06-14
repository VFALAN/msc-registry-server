
pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'development',
                    credentialsId: 'git-hub-credentials',
                    url: 'https://github.com/VFALAN/msc-registry-server.git'
            }
        }
        stage('Build Project') {
            steps {
                bat 'set LOKI_URL=http://localhost:3100/api/loki/v1/push'
                bat 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com','dcoker-credentials'){
                        def dockerImageBuild = docker.build("vifa951002/msc-registry-server")
                        dockerImageBuild.push()
                    }
                }

            }
        }
        /* stage('Deploy App'){
                steps{
               withCredentials(bindings: [
                                     string(credentialsId: 'k8s-token', variable: 'api_token')
                                     ]) {
                                     bat 'dir'
                           bat 'kubectl --token $api_token --server http://127.0.0.1:51416 apply -f DeployK8s.yaml --validate=false'
                         }
        }


    } */
}
}
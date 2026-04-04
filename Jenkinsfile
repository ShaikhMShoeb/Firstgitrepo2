pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                pkill -f jar || true
                nohup java -jar target/*.jar &
                '''
            }
        }
    }
}

pipeline {
    agent any

    tools {
        maven 'Maven'
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
                pkill -f demo-app || true
                nohup java -jar target/demo-app-1.0.jar > app.log 2>&1 &
                '''
            }
        }
    }
}

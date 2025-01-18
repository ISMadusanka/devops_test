pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'mkdir -p /mnt/c/Users/ismad/devops/test2'
            }
        }
    }
}

pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
				   bat 'echo step1:::::::::::::'
				   bat 'cd ValidateSignedUser'
				   bat 'mvn install'
            }
        }
    }
}
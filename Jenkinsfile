pipeline {
@Library('indrolibrary@master') _
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Running buildl"
				   bat 'mvn install -f ValidateSignedUser'
            }
        }
    }
}
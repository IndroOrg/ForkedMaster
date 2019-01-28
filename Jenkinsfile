@Library('indrolibrary@master') _

pipeline {

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
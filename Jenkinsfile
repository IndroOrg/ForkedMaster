pipeline {
@Library(['my-shared-library', 'amarbababholebaba@indra12#$%'])_
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
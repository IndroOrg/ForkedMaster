pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
				cd ValidateSignedUser
				bat mvn install
            }
        }
    }
}
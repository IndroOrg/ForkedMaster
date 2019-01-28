pipeline {
 agent any
    stages {
        stage('build') {
            steps {
				echo 'Building..>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>............'
                sh 'mvn --version'
            }
        }
		 stage('Test') {
            steps {
				echo 'Testing..>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>............'
                sh 'mvn --version'
            }
        }
    }
}
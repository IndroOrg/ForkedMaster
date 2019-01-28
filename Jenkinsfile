pipeline {
 agent any
  environment {
    PATH = "C:\Program Files\Git\git-bash.exe"
    stages {
        stage('build') {
            steps {
				echo 'Building..>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>............'
                sh 'mvn --version'
            }
        }
		
    }
	}
}
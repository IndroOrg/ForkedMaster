@Library('indrolibrary@master') _
import com.ban.indro.*
pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Running buildl"
				   bat 'mvn install -f ValidateSignedUser'
				   mycode()
            }
        }
    }
}
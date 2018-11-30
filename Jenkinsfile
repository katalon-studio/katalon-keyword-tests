pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args "-u root"
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'katalon-execute.sh -retry=1 -retryFailedTestCases=true -statusDelay=15 -testSuiteCollectionPath="Test Suites/All Tests"'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'report/**/*.*', fingerprint: true
            junit 'report/**/JUnit_Report.xml'
        }
    }
}

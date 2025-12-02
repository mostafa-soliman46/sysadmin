def call() {
    stage('Test') {
        sh 'mvn test'
        junit 'target/surefire-reports/*.xml'
    }
}


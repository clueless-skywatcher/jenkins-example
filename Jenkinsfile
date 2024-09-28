pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/clueless-skywatcher/jenkins-example', branch: 'main')
      }
    }
    stage('Build') {
      steps {
          sh './mvnw clean install'
      }
    }
  }
}
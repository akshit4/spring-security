pipeline{
  agent any
  tools{
    jdk 'openjdk-8'
    maven 'mymaven'
  }
  
  stages{
    stage('source-code-import'){
      steps{
        git branch: 'main', changelog: false, poll: false, url: 'https://github.com/akshit4/spring-security'
      }
    }
  
    stage('compile'){
      steps{
        sh 'mvn clean compile'
      }
    }
  }
}

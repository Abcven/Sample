pipeline {
    agent any
    stages {
       stage ('Build') {
            steps {
                sh '/home/aeon/jenkins/tools/hudson.tasks.Maven_MavenInstallation/3.3/bin/mvn clean install="com.cerner.picklist"'
            }
        }
         
        stage('UnitTests') {
            steps {
                sh 'mvn test -Dtest="com.cerner.project.unittest.**"'
            }
        }
 
       stage('IntegrationTests') { 
           steps {
                sh 'mvn test -Dtest="com.cerner.project.integrationtest.**"'
           }
       }
    }
}

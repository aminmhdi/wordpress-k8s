pipeline{
    agent any
    tools{
        maven 'maven_tool'
    }
    stages{
        stage('Checkout Code'){
            steps{
                git 'https://github.com/Sonal0409/DevOpsCodeDemo.git'
            }
        }
        stage('Compile the code'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('Review the code'){
            steps{
                sh 'mvn pmd:pmd'
            }
        }
        stage('Run Unit Tests'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Package the code'){
            steps{
                sh 'mvn package'
            }
        }
    }
}
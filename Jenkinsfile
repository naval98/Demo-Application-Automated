pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/yourusername/DemoTest-Automation.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false, results: [[path: 'allure-results']]
            }
        }

    }
}
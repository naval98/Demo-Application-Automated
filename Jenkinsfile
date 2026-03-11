pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/naval98/Demo-Application-Automated.git'
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
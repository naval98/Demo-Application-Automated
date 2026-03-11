pipeline {
    agent any

    stages {

        stage('Build Project') {
            steps {
                bat 'mvnw clean'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvnw test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                allure includeProperties: false, results: [[path: 'allure-results']]
            }
        }

    }
}
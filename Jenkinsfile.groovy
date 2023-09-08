pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // 添加构建步骤
                sh 'mvn clean package' // 这里示例使用 Maven 构建
            }
        }
        stage('Test') {
            steps {
                // 添加测试步骤
                sh 'mvn test' // 这里示例运行单元测试
            }
        }
        // 添加更多阶段和步骤
    }
}
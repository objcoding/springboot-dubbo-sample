#!groovy

// 在多分支构建下，严格规定Jenkinsfile只存在可以发版的分支上

// 引用在jenkins已经全局定义好的library
library 'chaos-pipeline-library'
    def map = [:]

    // 远程管理节点地址（用于执行发版）
    map.put('REMOTE_HOST','172.17.10.127')
    // 项目gitlab代码地址
    map.put('REPO_URL','https://github.com/objcoding/springboot-dubbo-sample.git')
    // 分支名称
    map.put('BRANCH_NAME','master')
    // 服务栈名称
    map.put('STACK_NAME','dubbo')

// 调用library中var目录下的deploy.groovy脚本
deploy(map)
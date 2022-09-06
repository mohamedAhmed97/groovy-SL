package com.example

class Docker implements Serializable {

    def script

    Docker(script) {
        this.script = script
    }

    def bulidDockerImage(String imageName) {
        script.echo '=========== bulding image ============'
        script.sh "docker build -t $imageName ."
    }

    def dockerLogin() {
        script.withCredentials([script.usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                script.sh "echo $script.PASSWORD | docker login -u $script.USERNAME --password-stdin"
        }
    }

    def dockerPush(String imageName) {
        script.sh "docker push $imageName"
    }

}

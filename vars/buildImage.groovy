def call(){
    echo "=========== bulding image ============"
        withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {  
                        sh "docker build -t mar97/first-repositary:1.2 ."
                        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
                        sh "docker push mar97/first-repositary:1.2"
        }
}
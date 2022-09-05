def call(){
        echo "========bulding jar========"
        sh 'mvn install'
        sh 'mvn package'
}

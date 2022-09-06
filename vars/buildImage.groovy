import com.example.Docker
def call(String dockerImage){
   return new Docker(this).bulidDockerImage(dockerImage)
}

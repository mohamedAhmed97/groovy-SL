import com.example.Docker

def call(String imageName)
{
    retunr new Docker(this).dockerPush(imageName)
}
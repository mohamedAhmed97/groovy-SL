import com.example.Docker

def call(string imageName)
{
    retunr new Docker(this).dockerLogin(imageName)
}
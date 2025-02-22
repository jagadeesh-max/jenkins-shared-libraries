def call(String Project,String ImageTag, String DockerHubUser){
     echo "This is pushing the image to Docker Hub"
                withCredentials([usernamePassword('credentialsId':"dockerHubCred",
                passwordVariable:'dockerHubPass',
                usernameVariable:'dockerHubUser')]){
            sh "docker login -u ${dockerHubUser} -p ${dockerHubPass} "
            echo "logging done"
            sh "docker push ${dockerHubUser}/${project}:${ImageTag}"
            echo "docker push done"
            }
}
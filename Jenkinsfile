node {
   def mvnHome
   stage('Compile') {
    git 'https://github.com/jglick/simple-maven-project-with-tests.git'
	sleep 3	  
   }
   stage('Test') {
	echo 'I am from Compile Statge'
	sleep 3
   }
   stage('Sample') {
	echo 'I am from Testing Statge'
    sleep 3
   }
   stage('Deployment') {
	echo 'I am from Deployment Statge'
	sleep 3
   }
}

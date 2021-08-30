def buildApp() {
    echo 'building the application...'
    
   } 

def testApp() {
    
    
    def str = "Hello world"
    def num =0
    def arg = ["Groovy","Java","Python"]

    println arg.class
    println arg[1]
    echo 'testing the application...'

    
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
    
    def no = [1,2,3,4]
    def no2 = no +5 //=[1,2,3,4,5]
    def no3 = no - [2,3] //=[1,4]
    
       
} 

return this

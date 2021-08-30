def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    
    
    def str = "Hello world"
    def num =0
    def arg = ["Groovy","Java","Python"]
    
    for(x in 1..5){
    println x //0,1,2,3,4,5

    println arg.class
    println arg[1]
    echo 'testing the application...'
    def str = "Hello world"
    def num =0
    
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this

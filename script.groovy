def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    
    def arg = ["Groovy","Java","Python"]
    println arg.class
    println arg[1]
    echo 'testing the application...'
    
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this

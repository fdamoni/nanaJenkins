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
        def repeat(val, x=10){
           for(i in 0..<x){
             println val
      }
}
} 

return this

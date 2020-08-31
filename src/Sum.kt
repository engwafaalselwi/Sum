fun main(){
    var s = Sum(5 , 7)
    println(s.result)
}

class Sum ( x : Int , y : Int){
    var result : Int = 0


    init {
        result = x + y
    }

}

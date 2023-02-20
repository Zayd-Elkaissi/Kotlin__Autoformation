fun main() {
    println("Add number")
    var num:Int= readLine()!!.toInt()
    for(index in 0..num -1){
        for(i in 1..index +1){
            print("*")
        }
            println()
    }

}
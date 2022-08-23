fun main(){
    print("Enter a no:")
    val num=readLine()!!.toInt()

    if(num%2==0){
        print("$num is even.")
    }else{
        print("$num is odd.")
    }
}

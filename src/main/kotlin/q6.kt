fun main(args: Array<String>){
    sum()
    sub()
    mul()
    div()
}
fun sum(){
    var num1 =123
    var num2 = 2345
    var num3 = -345
    println("Addition of $num1 , $num2,$num3 is "+(num1+num2+num3))
}
fun sub(){
    var num1 =123456
    var num2 = 2345
    var num3 = 345
    println("Subtraction of $num1 , $num2,$num3 is "+(num1-num2-num3))
}

fun mul(){
    var num1 =123
    var num2 = 2345
    var num3 = 345
    println("Multiplication of $num1 , $num2,$num3 is "+(num1*num2*num3))
}

fun div(){
    var num1 = 2345
    var num2 = 123
    println("Division of $num1 , $num2 is "+(num1/num2))
}

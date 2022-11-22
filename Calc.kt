package  oops

import java.util.Scanner

fun main(){
   var sc=Scanner(System.`in`)
    println("Enter number 1:-")
    var num1=sc.nextInt()
    println("Enter number 2:-")
    var num2=sc.nextInt()
    println("Enter Choice:- ")
    var ch=sc.nextInt()


    var calc =Calculation(num1,num2)
    when(ch){
        1-> println(calc.add())
        2-> println(calc.sub())
        3-> println(calc.mul())
        4-> println(calc.div())
        else->
            println("Wrong Choice!!!")
    }



}


class Calculation(var num1: Int, var num2: Int){

    fun add():Int{
        return num1+num2
    }
    fun sub():Int{
        return num1-num2
    }
    fun mul():Int{
        return num1*num2
    }
    fun div():Int{
        return num1/num2
    }

}

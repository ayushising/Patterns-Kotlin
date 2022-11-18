import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)

    //Question 1:- swapping of two numbers
    var a=4
    var b=5
    a=a+b
    b=a-b
    a=a-b
    println("Swapping without variable:- $a and $b")

    //swapping without variable
    var c=5
    var d=6
    var temp:Int=0
    temp=c
    c=d
    d=temp
    println("Swapping without variable:- $c and $d")

    // Question 2:- Leap year program

    println("Enter the year:-")
    var year =sc.nextInt()
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}

// Question 3:- factorial of a number
   println("Enter number to find factorial:-")
   var num= sc.nextInt()
   var fact = 1
   for (i in 1..num) {
       fact *= i
   }
   println("Factorial of $num = $fact")


//Question 4:- reverse a number
   println("Enter the number to revese:-")
   var num =sc.nextInt()
   var rev=0

   while(num!=0){
       val d=num%10
       rev=rev*10+d
       num/=10
   }
   println("Revese :- $rev")

//Question 5:- Loop to print 1 to 20
for(i in 1..20){
    println(i)
}


//    Question 6:- Palindrome or not
   println("Enter the number to check for palindrome:-")
   var num =sc.nextInt()
   var tempo:Int
   temp=num
   var rev=0

   while(num!=0){
       val d=num%10
       rev=rev*10+d
       num/=10
   }
   if(rev==temp){
       println("$temp is palindrome")
   }
   else{
       println("$temp is not palindrome")
   }

    //Question 7:- fibonaci
   println("Fibacani Program:-")
   val n = sc.nextInt()
   var f= 0
   var m = 1

   print("First $n terms: ")

   for (i in 1..n) {
       print("$f  ")

       val sum = f + m
       f = m
       m = sum
   }

//
//Question 8
   println("Aramstrong Program:-")
   val num2= sc.nextInt()
   var temp1: Int
   var remainder: Int
   var result = 0

   temp1 = num2

   while (temp1 != 0) {
       remainder = temp1 % 10
       result += Math.pow(remainder.toDouble(), 3.0).toInt()
       temp1 /= 10
   }

   if (result == num2)
       println("$num2 is an Armstrong number.")
   else
       println("$num2 is not an Armstrong number.")
////Star
   println("Start Patter;--")
   for (i in 1..3) {
       for (j in 1..8) {
           if (j >= 5 - i && j <= 3 + i) {
               print("*")
           } else {
               print(" ")
           }
           println()
       }


   }
//
//
//    //10th question
   for (i in 1..5)
   {
       for (j in i downTo 1)
       {
           print(" "+ j)
       }
       println()
   }


}

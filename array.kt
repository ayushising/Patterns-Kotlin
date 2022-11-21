import java.util.*

fun main(){
    arr()
}
fun arr(){
    var sc= Scanner (System.`in`)
    print("Enter no of elemnt:-")
    var n=sc.nextInt()

    var arr=Array<Int>(n){0}
    for(i in 0..(n-1)){
        arr[i]=sc.nextInt()
    }
    println("-------------------------------------------------")
    println("Dsscending Order:-")
    arr.sortDescending()
    for(ele in arr){
        print("- $ele ")

    }
    println()

    println("-------------------------------------------------")
    println("Largest number:- ")
    println(arr[0])

    println("-------------------------------------------------")
    println("Second Largest element ")
    println(arr[1])

    println("-------------------------------------------------")
    println("Asscending Order:-")
    arr.sort()
    for(ele in arr){
        print("$ele + ->")
    }
    println()
    println("-------------------------------------------------")
    println("Smallest number:-")
    println(arr[0])

    println("-------------------------------------------------")
    var sum=0

    for(i in 0..n-1){
        sum+=arr[i]
    }
    println("Sum is:-> $sum")


}

package oops
fun main(){
    var emp=Employee(1,"ayushi",60,30)
    var mSalary=emp.calculatePerDaySalary()

    emp.display()
    println("Salary: $mSalary")

    var tSalary=emp.totalSalaryEarned()
    println("Total Salary: $tSalary")


}
class Employee(var id: Int, var name: String, var salary: Int, var days: Int) {

    fun display(){
        println("ID: $id Name: $name Days: $days")
    }
    fun calculatePerDaySalary():Int{
        return salary/30
    }
    fun totalSalaryEarned():Int{
        return days*calculatePerDaySalary()

    }
}

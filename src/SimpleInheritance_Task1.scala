/**************************************
 ******* Assignment 15 Task 1 *********
 **** Simple Inheritance Program ******
 **************************************/
class Employee {
  var basicSalary: Double = 10000
  def salaryHike(): Double = {
    basicSalary * 0.10
  }
}

class Programmer extends Employee {
  var bonus: Int = 5000
  println("Salary = " + basicSalary)
  println("Increment = " + salaryHike())
}

object SimpleInheritance_Task1 {
  def main(args: Array[String]) {
    new Programmer()
  }
}  
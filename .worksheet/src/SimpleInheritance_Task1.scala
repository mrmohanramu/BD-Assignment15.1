
class Employee {
  var basicSalary: Float = 10000
  def salaryHike(): Float = {
    basicSalary * (10 / 100)
  }
}

class Programmer extends Employee {
  var bonus: Int = 5000
  println("Salary = " + basicSalary)
  println("Increment = " + salaryHike())
}

object SimpleInheritance_Task1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(349); 
  def main(args: Array[String]) {
    new Programmer()
  };System.out.println("""main: (args: Array[String])Unit""")}
}

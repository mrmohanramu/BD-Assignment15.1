
object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
var basicSalary: Double = 10000;System.out.println("""basicSalary  : Double = """ + $show(basicSalary ));$skip(95); 
  def salaryHike(): Double = {
  print("Basic salary: "+basicSalary)
    basicSalary * 0.2
  };System.out.println("""salaryHike: ()Double""");$skip(13); val res$0 = 
salaryHike();System.out.println("""res0: Double = """ + $show(res$0));$skip(47); 

def adder(m: Int, n: Int, p: Int) = m + n + p;System.out.println("""adder: (m: Int, n: Int, p: Int)Int""");$skip(40); 
val add2 = adder(_: Int, 5:Int, _: Int);System.out.println("""add2  : (Int, Int) => Int = """ + $show(add2 ));$skip(11); val res$1 = 
add2(3, 5);System.out.println("""res1: Int = """ + $show(res$1));$skip(34); 
def sq(add2:Int):Int= add2 * add2;System.out.println("""sq: (add2: Int)Int""")}
}

object Margin extends Enumeration {
        type Margin = Value;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
        val TOP, BOTTOM, LEFT, RIGHT = Value;System.out.println("""TOP  : Margin.Value = """ + $show(TOP ));System.out.println("""BOTTOM  : Margin.Value = """ + $show(BOTTOM ));System.out.println("""LEFT  : Margin.Value = """ + $show(LEFT ));System.out.println("""RIGHT  : Margin.Value = """ + $show(RIGHT ))}
    }
object Test2 {
  println("Welcome to the Scala worksheet")
  
  import Margin._

    // use an enumeration value in a test
    var currentMargin = TOP
    
    // later in the code ...
    if (currentMargin == TOP) println("working on Top")

    // print all the enumeration values
    Margin.values foreach println
    
}

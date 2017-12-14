object Timer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread.sleep(1000) }
  };System.out.println("""oncePerSecond: (callback: () => Unit)Unit""");$skip(68); 
  def timeFlies() {
    println("time flies like an arrow ...")
  };System.out.println("""timeFlies: ()Unit""");$skip(68); 

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  };System.out.println("""main: (args: Array[String])Unit""")}
}

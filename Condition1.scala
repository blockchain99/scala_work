

object Condition1 {
  def main(args: Array[String]): Unit = {
    println("if , else if program")
    var age = 18
    if((age >= 5) && (age <=6)) {
    println("Goto kindergarten")
    } else if((age > 6) && (age <= 7)){
    println("Go to grade 1")
    } else {
    println(" Goto grade" + (age - 5))
    }
  }
}
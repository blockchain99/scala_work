

object ForIfTest {
  def main(args: Array[String]) {
    var i = 0
    for (i <- 1 to 5; j <- 6 to 10) {
      println(" i : " + i)
      println(" j : " + j)
    }
   println("_________________________________") 
   def printPrimes(){  
      var i = 0  // new variable i is effective within def printPrimes area.so no need remane such as i2...
      val primeList = List(1,2,3,5,7,11)
      for(i <- primeList) {
        if(i == 11) {
          return  // return the control outside of function printPrmes(), so exit function
        }
        
        if(i != 1) {
          println(i)
        }
      }
    }
    printPrimes //execute function.
  }
}
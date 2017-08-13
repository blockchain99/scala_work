import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object FileIo {
  def main(args: Array[String]){
//    val writer = PrintWriter("test.txt")  //Error : PrintWriter is not a value
    val writer = new PrintWriter("test.txt")  
    writer.write("Just some random test\nSome more random ")
    writer.close()
    
    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    
    val lineIterator = textFromFile.getLines 
    for(line <- lineIterator)
      println(line)
    
/* make ref */
//  val favNums = new Array[Int](20)
//  for(j <- 0 to (favNums.length-1)){
//    favNums(j) = j
//    println(favNums(j))
//  }  
     
    def divideNums(num1 : Int, num2 : Int) = try
    {
      (num1 / num2)
    } catch {
      case ex : java.lang.ArithmeticException => "Can't divide by zero "
    } finally {
      //clean up after exception 
    }
    println("3 / 0 = " + divideNums(3, 0))
    
      
  }
}
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object MapsObj {
   def main(args: Array[String]){
//immutable Map    
    val employees = Map("Manager" -> "Bob Smith",
        "Secretary" -> "Sue Brown")
        
    if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))
    if(employees.contains("Secretary"))
      printf("Secretary : %s\n", employees("Secretary"))
      
//mutable Map      
    val customers = collection.mutable.Map(100 -> " Paul Smith", 101 -> " Sally Smith")
    printf("Cust 1 : %s\n", customers(100))
//change the variable 
    customers(100) = " Tom Marks"
    customers(102) = " Megan Swift"
    
    for((k,v) <- customers)
      printf("%d : %s\n", k, v)
      
//tuple
    var tupleMarge = (103, "Marge Simpson", 10.25)  // (._1, ._2, ._3)
    // ._2 : tuple second element , ._3 : third element
    printf("Number %d, %s owes us $%.2f\n", tupleMarge._1, tupleMarge._2, tupleMarge._3) 
    println("-----------------------------------")    
//def foreach[U](f: A => U): Unit
//Applies a function f to all values produced by this iterator. 
    
    tupleMarge.productIterator.foreach(i => println("* each element in tupleMarge : " + i))
    
//    for(ele <- tupleMarge)  //error : value foreach is not a member of (int, string, double)
//      println(ele)
    
    println("Entire tuple : " + tupleMarge.toString())
  }
}



import scala.collection.mutable.ArrayBuffer
import scala.math.BigInt


object FunctionTest {
  def main(args: Array[String]) {
    //def funcName (param1:dataType, param2:dataType) : returnType =  {
    //    function body
    //    return valueToReturn
    // }
    
  def getSum(num1 : Int =1, num2 : Int =1) : Int = {
    return num1 + num2
  }
  
   def getSum2(num1 : Int =1, num2 : Int =1) : Int = {
     num1 + num2  //without return, same result since scala doesn't require return as default.
  }
  
  println("5 + 4 =" +getSum(5, 4))
  println("5 + 4 =" +getSum2(5, 4)) // same as above 
  println("5 + 4 =" +getSum2(num2 = 5, num1 =  4))
  
  def sayHi() : Unit = {  //not return anything
    println("Hi how are you") 
  }
    
  println("sayHi func: "+sayHi)
  println("-------------------- function call by function_name")
  sayHi
  
  def getSum3(arguments: Int*) : Int = {  //multiple parameter with integer arguments and return type Int
    var sum : Int = 0
    for(num <- arguments){
      sum += num
    }
    sum
  }
  println("Get Sum " + getSum3(1,2,3,4,5,6,7,8,9,10))
  
  def factorial(num : BigInt) : BigInt = {
    if(num <= 1)
      1
    else
      num * factorial(num -1)
  }
  println("Factorial of 4 = " + factorial(4))
  
//  def factorial2(num : Int) : Unit = {  //not as intented !
//    var mul = 1
//    while (num >= 1) {
//      mul = mul * num
//      num -1
//    }
//  }
//  println("Factorial of 4 : is " + factorial2(6))
  
  val friends = Array("Bob", "Tom")
  
  friends(0) = "Sue"
  println("friends elements: " + friends)
  println("Best freinds " + friends(0))
  
  for (e <- friends) 
    println(" element of friends : "+e)
 println("^^^^^^^^^^^^^^^^^^^^^^^^^^")   
//ArrayBuffer  
  val friends2 = ArrayBuffer[String]()
  friends2.insert(0, "Phil")
  for (e2 <- friends2) 
    println(" element of friends2 : "+e2)
  
  friends2 += "Mark"
  for (e2 <- friends2) 
    println(" after friends2+=\"Mark\" : "+e2)
  
  friends2 ++= Array("Susy", "Paul")
  for (e2 <- friends2) 
    println( " after : friends2 ++= Array(\"Susy\", \"Paul\") : "+e2)
    
  friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")  //insert all lists from index 1, to the original index1,Mark
  for (e2 <- friends2) 
    println( " after : friends2.insert(1, \"Mike\", \"Sally\", \"Sam\", \"Mary\", \"Sue\") : "+e2)  
  
 // friends2.remove(n, count)  //index 
  friends2.remove(1, 2)  //remove from index 1, two elements, so "Mike", "Sally" removed. 
  for (e2 <- friends2) 
    println( " after : friends2.remove(1, 2) : "+e2) 
    
  println("################################")
  val favNums = new Array[Int](20)
  for(j <- 0 to (favNums.length-1)){
    favNums(j) = j
    println(favNums(j))
  }
  
  println("Sum : " + favNums.sum)
  println("Min : " + favNums.min)
  println("Max : " + favNums.max)
  
  var sortedNumsAsc = favNums.sortWith(_<_)  //ascending
  println("<<<*** ascending : "+ sortedNumsAsc)  //print just object name:
   for(j <- 0 to (sortedNumsAsc.length-1)){
    println(sortedNumsAsc(j))
  }
  
  var sortedNumsDes = favNums.sortWith(_>_)  //descending
  println(">>> descending : "+ sortedNumsDes)
  for(j <- 0 to (sortedNumsDes.length-1)){
    println(sortedNumsDes(j))
  }
// output with , separated   
  println("string with \",\" : " + sortedNumsDes.deep.mkString(", "))
  
  // how about mean value ?
  println("-------------------------------")  
//for each favNums element, multiply 2, then stored them in new Array, favNumsTimes2 
  val favNumsTimes2 = for(num <- favNums) yield 2 * num  
  favNumsTimes2.foreach(println)  //Array.foreach(function)
  
  println("***********************numbers can be divided by 4") 
  var  favNumsDiv4 = for(num <-favNums if num % 4 == 0) yield num
  favNumsDiv4.foreach(println)
  
//multi-dimensional array 
  var multTable = Array.ofDim[Int](10, 10)  //Array.ofDim : creat 2-dim Array
  for(i <- 0 to 9){
    for(j <- 0 to 9) {
      multTable(i)(j) = i * j
    }
  }
  println("**** Multiplication table ****\n")
  for(i <- 1 to 9){
    printf("\n stage %d\n",i)
    for(j <- 1 to 9) {
      printf("%d * %d = %d\n", i,j, multTable(i)(j))
    }
  }
    //1. never set(assig) the value ; assignment less programming(notghing to protect , thread safe
    //2. Function don't have side effiect. multiple threads call function, don't worrry about messing up, so concurrent programming guranteed
    // which makes refrential tranparency: move around the function.
    //3. Functions are first class citizens: creat a function with a function comparing an object with a function
    // return funtion from frunction, pass function to function, Since object is decomposed to functions. function is smallest granuality .
    // ojbect consits of function, so, function is maller than object.
    // 4. functions are higher order, we can put functions together to compose the system. not object.
    // creating the base class.

  def total(list: List[Int]) = {  //list is type List[Int]
    var sum = 0
    for(i <- list){
      sum += 1
    }
    sum
  }

   def totalFuntional(list:List[Int]) = {
     list.foldLeft(0) { (carryOver, e) =>
       carryOver + e
     }
   }

    def total_func_high_order(list:List[Int])={
      var sum = 0
      list.foreach{e => sum += e}   //"e => sum += 2" is a function.
      sum
    }
    def total_func_even(list:List[Int])={
      var sum = 0
      list.foreach { e =>
        if (e %2 ==0) sum += e
      }
      sum
    }
    //but when create toal_func_odd function, do I cut & paste above code to make it ?
    //

    def totalSelectValues(list:List[Int],
                          selector : Int => Boolean)= { //selector is function with input value Int , output Boolean.
      var sum = 0
      list.foreach { e =>
        if (selector(e)) sum += e
      }
      sum
    }

    println("total sum is :"+ total(List(1,2,3,4,5)))
    println("immutable total sum : "+ totalFuntional(List(1,2,3,4,5)))
    println("functon_high_order sum : " + total_func_high_order(List(1,2,3,4,5,6)))
    println("functon_even sum : " + total_func_even(List(1,2,3,4,5,6)))
    println("totalSelectValues_all : " + totalSelectValues(List(1,2,3,4,5,6), { e => true }))
    println("totalSelectValues_even : " + totalSelectValues(List(1,2,3,4,5,6), { e => e % 2 == 0 }))
    println("totalSelectValues_greaterthan4 : " + totalSelectValues(List(1,2,3,4,5,6), { e => e > 4 }))
    println("totalSelectValues_greaterthan4_concise : " + totalSelectValues(List(1,2,3,4,5,6), { _ > 4 }))

   // scala no need define type for every variable, just once in front of code. not afterward for same variable.
    var str = "scala no need define type for every variable, just once in front of code. not afterward for same variable. "
    // NO need using ":String" , which is not scala-like programming, had better remove type information.
//    var str : String = "scala no need define type for every variable, just once in front of code. not afterward for same variable. "
    println(str)
    str = "changed sentence"
    println(str)
   // str = 1
   // println(str)  // error cause by type mismatching. - compile time typing

  }
} 
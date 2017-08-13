import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object InputOutput {
  def main(args: Array[String]) {
    
//    var numberGuess = 0
//    
//    do{
//      print("Guess a number, Input number(if 15, it finish input looping) : ")
////      numberGuess = readLine.toInt
////      readInt readDouble readByte
////      readShort readLong
//      numberGuess = readLine.toInt
//    } while(numberGuess != 15) 
//      printf("You guessed the secret number %d\n",15)
      
 // new variable      
    val name = "Derek"  // "val name "Derek" , makes error
    val age = 39
    val weight = 175.5
    
    println(s"Hello $name")   //println(s"Statement $variable string name")
    //%f for floating number, %d for integer , %c for character, %s for  string
    println(f"I am ${age +1} and weigh $weight%.2f") //println(f"Statement $variable number")

    println(f"After two years, I will be ${age +2} and I will reduce weight to ${weight-20}%.3f" )
    
    println(f"blabla for age : $age%2d")
    
    printf("'%5d'\n",5)  //right justified
    printf("'%-5d'\n",5)  //left justified  : -
    printf("'%05d'\n",5)  //filled with 0
//    printf("'%.5f'\n",5)  //error sinece 5 is integer but expression shoud be float point with floating point nuber 5 
    printf("'%.5f'\n",5.1254)
    printf("'%-5s'\n","hi")
    printf("'%5s'\n","hi")
    printf("'%-5s'\n","hi scala programming")
    println("___________________________ ")
    // index no     000000000  :index 8 for d~
    var randSent = "I saw a dragon fly by"
    
    println("3rd index : " + randSent(3))
    println("String length : " + randSent.length)
    println(randSent.concat(" and explode")) //" I saw a dragon fly by and explode"
    println("Are strings equal : " + "I saw a dragon".equals(randSent))
    println("dragon starts at index " +
        randSent.indexOf("dragon"))
    var randSentArray = randSent.toArray
    for (v <- randSentArray)
      println(v)
  }
}
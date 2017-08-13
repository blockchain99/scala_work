import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ClassTest {
  def main(args: Array[String]){
    /* create object */
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)
    
    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.sound}")
    
    println(whiskers.toString)
    
    val spike = new Dog("Spike", "Woof", "Grrrrrr")
    spike.setName("Spike")
    println(spike.toString) 
    
/*          */    
    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.5
    println(fang.move)
    
/* trait  */    
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
/* function can be passed just like any other variables    */  
    val log10Func = log10 _  // _ means this is function instead of variables
    
/* map   */    
    println("## log10Func(1000) : "+log10Func(1000))
    println(" --------------")
    List(1000.0, 10000.0).map(log10Func).foreach(println)
    println("***************List(1,2,3,4,5).map((x : Int) => x * 50).foreach(println)****")
    List(1,2,3,4,5).map((x : Int) => x * 50).foreach(println)
    
/* filter */   
    List(1.0,2.0,3.0,4,5).map(log10Func).foreach(println)
    print("____ filter to be even num___.filter(_ % 2 == 0) \n")
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)
    
    def times3(num : Int) = num * 3
    def times4(num : Int) = num * 4
//func parameters consists of (function named "func" with input type Int, output type Double) (variable named "num" w/ Int type )    
    def multIt(func : (Int) => Double, num : Int) = {
      func(num)
    }
    
    printf("^^ 3 * 100 = %.1f\n", multIt(times3, 100))  // parameters are function and func_var
    printf("$$ 4 * 100 = %.1f\n", multIt(times4, 100))
/* variable =  input var with input type perform operation with input var and other variable.  */    
    val divisorVal = 5
    val divisor5 = (num : Double) => num / divisorVal
    
    println("*** 5 / 5  = " + divisor5(5.0))
  }  //END OF MAIN
   
}//end of object ClassTest  

  class Animal(var name: String, var sound: String) {
    this.setName(name)
    val id = Animal.newIdNum
//    protected var name = "No Name"  
    
    def getName() : String = name
    
    def getSound() : String = sound
    
    def setName(name : String){
      if(!(name.matches(".*\\d+.*"))) //Check if a String contains numbers, same as Java
        this.name = name
      else
        this.name = "No Name"
    }
    
    def setSound(sound: String){
      this.sound = sound
    }
    
    def this(name: String){
      this("No Name", "No Sound")
      this.setName(name)
    }
    
    def this() {
      this("No Name", "No Sound")
    }
    
    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }
  } // end of class Animal
  
/* find static variables(fields) and static functions */  
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber}  //perform operation(each object has unique id) and return id number
  } // end of object Animal

/* inheritance   */
  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound){
     def this(name: String, sound: String) {
       this("No Name",  sound, "No Growl")
       this.setName(name)
     }
     def this(name: String) {
       this("No Name", "No Sound", "No Growl")
       this.setName(name)
     }
     def this(){
       this("No Name", "No sound", "No Growl")
     }
     override def toString(): String = {
       return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl) 
     }
   }  //end of class Dog

/* abstract class */  
   abstract class Mammal(val name : String) {
     var moveSpeed : Double
     def move : String     
   }
   
   class Wolf(name : String) extends Mammal(name){
     var moveSpeed = 35.0
     
     def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)  
   }
   
/* trait is similar with java interface : class can be extended more than one taits */   
   trait Flyable {
     def fly : String
   }
   trait BulletProof{
     def hitByBullet : String  
     def ricochet(startSpeed : Double) : String = {
       "The bullet, ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
     }
   }
   
   class Superhero(val name: String) extends Flyable with BulletProof{
     def fly = "%s flys through the air".format(this.name)
     
     def hitByBullet = "The bullet bounces off of %s".format(this.name)
     
   }
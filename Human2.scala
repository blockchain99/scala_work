/* you can create abstact class and chain them together with trait and get combination of flavors of things w/o
writing any hierachical classes, but method chaining:form the china passing a method on after another from ritht to left.
 */

object Human2 {
  def main(args: Array[String]): Unit = {
    val peter = new Human("Peter")

    peter.listen
    println("------------seekHelp---------------")

    //can pass Human2 to a funtion that takes a friend
    def seekHelp(friend: Friend) = friend.listen  //send friend with trait Friend to method listen

    seekHelp(peter)
    println("+++++++++Dog+++class extends Friend+++++++")

    val rover = new Dog("Rover")
    rover.listen  //after class Dog extends Animal(name) with Friend, it works
    seekHelp(rover)
    println("=========cat =====instance(object) extends Friend======")
//    val snow = new Cat("snow")
//    snow.listen // not work
//    seekHelp(snow) //not work
    /* so I changed not class but instance "with Friend" */
    val snow = new Cat("snow") with Friend
    snow.listen
    seekHelp(snow)

  } //end of main

//dog : man's best freind , how to define friendship of dog.
//Scala: remove function listen from class Human, and create trait called Friend with "val name" and "def listen"

trait Friend {
  val name: String
  def listen = println("I am " + name + " your friend.")
}

class Human(val name: String) extends Friend  //Human is still Friend
class Animal(val name: String)
class Dog(override val name: String) extends   //sometinh strange with override !
  Animal(name) with Friend

class Cat(override val name: String) extends Animal(name)
}// end of object
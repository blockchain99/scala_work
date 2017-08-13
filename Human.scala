

object ClassHumanTest {
  def main(args: Array[String]) = {
    val peter = new Human("Peter")
//    val peter3 = new Human3("Peter_updated")

    peter.listen
//    peter3.listen
    println("------------seekHelp---------------")

    //can pass Human3 to a funtion that takes a friend
//    def seekHelp(friend: Friend) = friend.listen  //send friend with trait Friend to method listen
//    seekHelp(peter3)
    println("++++++++++++++++++++++++")
   /* val rover = new Dog("Rover")
    rover.listen  */

  } //end of main
}// end of object
  class Human(val name: String) {
    def listen = println(" I am " + name + " your friend. ")
  }

  //dog : man's best freind , how to define friendship of dog.
  //Scala: remove function listen from class Human, and create trait called Friend with "val name" and "def listen"

    trait Friend {
      val name: String
      def listen = println("I am " + name + " your friend.")
    }

//    class Human3(str: String)(val name: String) extends Friend  //Human is still Friend







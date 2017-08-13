object ScalaProg {
  def main(args: Array[String]): Unit = {
    println("Scala first program")
    val a = 10 + 3 * 5 / 2
    println("a is :",a)
    var myName = "Ys park"
    println("b is :",myName)
    println( myName.size)
    println(myName.startsWith("Y"))
//    val myAge_val = 40  //val : immutable
//    println(myAge_val)
//    myAge_val = 50  //so error
//    println(myAge_val)
    var myAge_var = 40  //var : mutable
    println(myAge_var)
    myAge_var = 50
    println(myAge_var)
    //Byte
    //Boolean
    //Char
    //Short
    //Int
    //Long
    //Float
    //Double
    /* 
     * multi line comments.
     * 
     */
    val num13 = 1.999999999
    println(num13)
    val lgprime = BigInt("654894575733333333333331111111111111444444444444444288888888885525")
    val lgprime2 : Any = BigInt("6548945757333333333333311111111111114444444444444442888844477777")
    def flgprime2[T](v: T) = v match {
      case _: Int => "Int"
      case _: BigInt => "BigInt"
      case _         => "I don't know"  
    }
    println("resut:",flgprime2(lgprime2))
    println("*******++++++++++++++**************")
    val pi50 = BigDecimal("3.1415925612872549475764647475753")
    println(pi50 )
    println(pi50.scale)
    println(0.00000000000000000000000000001 + pi50)
    println((0.00000000000000000000000000001 + pi50).scale)

    println("**********************************")
    //val x1: Any = 5
    //val x1: Any = "This is String"
    val x1: Any = 1.99999
    //value : v, Type : T - function of Type T produce "Int", "String",.. with input val: v
    def f[T](v: T) = v match {  
      case _: Int    => "Int"
      case _: String => "String"
      case _         => "Unknown"
      }
    println(f(x1))
   
    println("------------------------------")
    val x = 'c'
    val y = 5
    val z: Any = 5
    // ClassTag will also let you use type parameters you received on match.
    import scala.reflect.ClassTag
    def l[A, B: ClassTag](a: A, b: B) = a match {
      case _: B => "A is a B"
      case _ => "A is not a B"
      }
    println(l(x, y)) // A (Char) is not a B (Int)
    println(l(x, z)) // A (Char) is a B (Any)
    
  }
}
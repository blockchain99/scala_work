

object ScalaTutorial {
  def main(args: Array[String]){
    var i = 0
    
    while( i <= 10) {
     println(i) 
     i += 1
    }
    println("result " + i)
    println("*******++++++++++++++++++*****")
    var i2 = 0
    do{ 
      println(i2) 
     i2 += 1
    }while(i2 <= 10)
    println("result " + i2)  
    
    println("***************************************")
    var i3 = 0
    //for( i3 = 0 ; i3 <= 10 ; i3 ++)
    for ( j <- 0 to 10){  // iteration number is 11, from 0 to 10
      println(i3)
      i3 += 1
    }
    println("result for loop : " + i3)
    
    println("*======================************")
    var i4 = 0
    val randLetters = "ABCDEFGHIJKLMNOPRSTUVWXYZ"  //String array
    for(i4 <- 0 until randLetters.length) {
      println(randLetters(i4))
    }
    
    println("*=====--------=========************") // option1
    var i5=0
    val aList5 = List(1,2,3,4,5) 
    for(i5 <- 0 until aList5.length) {   // for each index number within the scope of aList5's length
      println(aList5(i5))
    }
    
//    println("*=================================*")  //original List for loop : but error happened !
//    var i6 = 0
//    val aList6 = List(6,7,8,9,10) 
//    /* in python - for i in aList2.length - for element in aList2 - for key, value in arrayList  */
//    for(i6 <- aList6) {
//      println(aList6(i6))  //it shoud be println(i6)
//    }
    
    println("*=================================*")  //original List for loop : but error happened !
    var i6 = 0
    val aList6 = List(6,7,8,9,10) 
    /* in python - for i in aList2.length - for element in aList2 - for key, value in arrayList  */
    for(i6 <- aList6) { // for each element in aList6
      println(i6)  
    }
    println("--------------------------------------")
    var i7 = 0
    val aList7 = List(1,2,3,4,5)
    for(i7 <- aList7){
      println("List items "+ i7)
    }

    println("--------------------------------------") //store even number : my option1
    var i8 = 0
    val aList8 = List(1,2,3,4,5)
    for(i8 <- aList8){
      if (i8%2 == 0)
      println("Even number List items "+ i8)
      
    }
    println("**************************") //store even number : original
    var i9 = 0
    
    var evenList = for { i9 <- 1 to 20
      if (i9 % 2) == 0
    } yield i9
    
    for(i9 <- evenList)
      println(i9)
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^") //store even number : original
    var i10 = 0
    //var j10 = 0
    
    for(i10 <- 1 to 5; j10 <- 6 to 10 ){
      println("i10 : " + i10)
      println("j10 : " + j10)
    }
      
    
  }
}
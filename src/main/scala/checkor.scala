//Create a Scala program to determine if a given value is either less than -10 or greater than 10
object checkor {
  def main(args:Array[String]): Unit={
    var x = -15
    if(x< -10 || x> 10){
      println(s"${x} is in the range less than -10 or greater than 10")
    }
    else {
      println(s"${x} is not in the range less than -10 or greater than 10")
    }

  }

}

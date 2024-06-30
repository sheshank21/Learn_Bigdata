//Write a Scala program to check if a given number is divisible by either 4 or 6
object question4 {
  def main(args:Array[String]):Unit={
    var x= 18
    if(x%4 == 0 || x%6 == 0){
      println(s"${x}  is divisible by either 4 or 6")
    }
    else {
      println(s"${x} is not divisible by either 4 or 6")
    }
  }
}

//Implement a Scala function to check if a given number is odd and not divisible by 3.
object question3 {
    def main(args:Array[String]): Unit={
      var x = 17
      if(x%2 != 0 && x%3 != 0){
        println(s"${x} is odd and not divisible by 3")
      }
      else if(x%2 == 0 && x%3 != 0){
        println(s"${x} is even and not divisible by 3")
      }
      else if(x%3 == 0 && x%2 != 0){
        println(s"${x} is divisible by 3 and is a odd number")
      }
      else {
        println(s"${x} is even and divisible by 3")
      }

    }

}

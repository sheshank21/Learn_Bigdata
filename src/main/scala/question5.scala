//Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or eligible to drive (age greater than or equal to 16).
object question5 {

  def question5(): Unit = {
   var age= 24
    if(age >= 18 || age>=16){
      println("Eligible to vote and Drive")
    }
    else if(age>=16){
      println("can drive")
    }
    else{
      println("Eligible to Vote and Drive")
    }

  }
  def main(args:Array[String]): Unit = {
  question5()
  }
}

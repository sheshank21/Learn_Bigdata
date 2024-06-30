object assignment {
  def question6(): Unit = {
    val n = 25
    if ((1 <= n && n <= 10) || (20 <= n && n <= 30)) {
      println("In Range")
    }
    else {
      println("Not in Range")
    }
  }

  def question7():Unit={
    val x = -7
    if (x<0 && x%2 != 0){
      println(s"${x} is negative and Odd ")
    }
    else if (x<0 && x%2 == 0){
      println(s"${x} is negative and even ")
    }
    else if(x>0 && x%2 != 0){
      println(s"${x} is Positive and Odd ")
    }
    else{
      println(s"${x} is Positive and even ")
    }
  }

  def question8():Unit={
    var age = 63
    if(age>60){
      println("Eligible for Senior Citizen DIscount")
    }
    else if(age>25){
      println("Eligible for Student Discount")
    }
    else {
      println("Not Eligible for any Discount")
    }
  }

  def question9():Unit={
    val x = 35
    if (x%5 ==0 && x%7 == 0){
      println(s"${x} is divisible by 5 and 7 ")
    }
    else if (x%5 ==0 && x%7 != 0){
      println(s"${x} is divisible by 5 and not 7 ")
    }
    else if (x%5 !=0 && x%7 == 0){
      println(s"${x} is divisible 7 and not 5 ")
    }
    else{
      println(s"${x} is not divisible by 5 and 7 ")
    }
  }

  def question10():Unit={
    val x = -8
    if (x<0 && x%2 != 0){
      println(s"${x} is negative and Odd ")
    }
    else if (x<0 && x%2 == 0){
      println(s"${x} is negative and even ")
    }
    else if(x>0 && x%2 != 0){
      println(s"${x} is Positive and Odd ")
    }
    else{
      println(s"${x} is Positive and even ")
    }
  }

  def question11(): Unit = {
    val x = 17

    def isPrime(n: Int): Boolean = {
      if (n <= 1) return false
      for (i <- 2 until n) {
        if (n % i == 0) return false
      }
      true
    }

    def isOdd(n: Int): Boolean = {
      n % 2 != 0
    }

    if (isPrime(x) && isOdd(x)) {
      println(s"$x is both prime and odd")
    } else {
      println(s"$x is not both prime and odd")
    }
  }

  def question12(): Unit = {
    var purchase_amount = 120
    if(purchase_amount > 150 ){
      println("Eligible for Discount and Free Shipping")
    }
    else if(purchase_amount > 120){
      println("Eligible for free Shipping ")
    }
    else{
      print("Not Eligible for any discounts ")
    }
  }

  def question13():Unit={
    val x = 24
    if (x%3 ==0 || x%8 == 0){
      println(s"${x} is divisible by 3 or 8 ")
    }
    else{
      println(s"${x} is not divisible by 3 or 8 ")
    }
  }

  def question14():Unit= {
    val x = -6
    if (x<0 && x%2 != 0){
      println(s"${x} is Non-positive and Odd ")
    }
    else if (x<0 && x%2 == 0){
      println(s"${x} is Non-positive and even ")
    }
    else if(x>0 && x%2 != 0){
      println(s"${x} is Positive and Odd ")
    }
    else{
      println(s"${x} is Positive and even ")
    }
  }

  def question15():Unit= {
    var age = 6
    if (age >= 20){
      println("Adult")
    }
    else if(age >= 13 && age <= 19){
      println("Teenager")
    }
    else if(age <13 && age > 0){
      println("Child")
    }
    else {
      println("invalid age")
    }
  }

  def question16():Unit={
    val x = 25
    if (x%2 ==0 || x%5 == 0){
      println(s"${x} is divisible by 2 or 5 ")
    }
    else{
      println(s"${x} is not divisible by 2 or 5 ")
    }
  }

  def question19():Unit={
    val x = 21
    if (x%3 ==0 && x%7 == 0){
      println(s"${x} is divisible by 3 and 7 ")
    }
    else if (x%3 ==0 && x%7 != 0){
      println(s"${x} is divisible by 3 and not 7 ")
    }
    else if (x%3 !=0 && x%7 == 0){
      println(s"${x} is divisible 7 and not 3 ")
    }
    else{
      println(s"${x} is not divisible by 3 and 7 ")
    }
  }

  def question20():Unit={
    val x = 45
    if (x%5 ==0 || x%9 == 0){
      println(s"${x} is divisible by 5 or 9 ")
    }
    else{
      println(s"${x} is not divisible by 5 or 9 ")
    }
  }

  def question21():Unit={
    val x = 15
    if (x%2 ==0 && x%4 == 0){
      println(s"${x} is a even number and divisible by 4 ")
    }
    else if (x%2 !=0 && x%4 == 0){
      println(s"${x} is a odd number and divisible by 4 ")
    }
    else if (x%2 ==0 && x%4 != 0){
      println(s"${x} is a even number and not divisible by 4 ")
    }
    else{
      println(s"${x} is a odd number and not divisible by 4 ")
    }
  }

  def question22():Unit={
    val x = 15
    if (x%3 ==0 && x%5 == 0){
      println(s"${x} is divisible by 3 and 5 ")
    }
    else if (x%3 ==0 && x%5 != 0){
      println(s"${x} is divisible by 3 and not 5 ")
    }
    else if (x%3 !=0 && x%5 == 0){
      println(s"${x} is divisible 5 and not 3 ")
    }
    else{
      println(s"${x} is not divisible by 3 and 5 ")
    }
  }

  def question23(): Unit = {
    var purchase_amount = 120
    var loyality_card: Boolean= false
    if(purchase_amount >200 || loyality_card){
      println("Eligible for Discount or qualifies for membership benefits ")
    }
    else{
      println("Not Eligible for Discount or qualifies for membership benefits ")
    }
  }


  def question24():Unit={
    val x = 9
    if (x%2 ==0 || x%3 == 0){
      println(s"${x} is divisible by 2 or 3")
    }
    else{
      println(s"${x} is not divisible by 2 or 3 ")
    }
  }

  def question25():Unit={
    val x = 7
    if (x>0 && x%3 == 0){
      println(s"${x} is a Positive and divisible by 3 ")
    }
    else if (x<0 && x%3 == 0){
      println(s"${x} is a Negative and divisible by 3 ")
    }
    else if (x>0 && x%3 != 0){
      println(s"${x} is a Positive and not divisible by 3 ")
    }
    else{
      println(s"${x} is a Negative and not divisible by 3 ")
    }
  }

  def question26(): Unit = {
    var age = 70
    var new_customer: Boolean= true
    if(age> 65 && new_customer){
      println("Eligible for Senior Citizen Discount and not a New Customer")
    }
    else if(age< 65 && new_customer){
      println("Not Eligible for Senior Citizen Discount and not a New Customer")
    }
    else if(age> 65 ){
      println("Eligible for Senior Citizen Discount and a New Customer")
    }
    else{
      println("Not Eligible for Senior Citizen Discount and a New Customer")
    }
  }

  def question27(): Unit = {
    val x = 11

    def isPrime(n: Int): Boolean = {
      if (n <= 1) return false
      for (i <- 2 until n) {
        if (n % i == 0) return false
      }
      true
    }

    def isOdd(n: Int): Boolean = {
      n % 2 != 0
    }

    if (isPrime(x) && isOdd(x)) {
      println(s"$x is both prime and odd")
    } else {
      println(s"$x is not both prime and odd")
    }
  }

  def question28(): Unit = {
    var purchase_amount = 120
    if(purchase_amount > 150 ){
      println("Eligible for Discount and Free Shipping")
    }
    else if(purchase_amount > 120){
      println("Eligible for free Shipping ")
    }
    else{
      println("Not Eligible for any discounts ")
    }
  }

  def question29():Unit={
    val x = 14
    if (x>0 && x%7 == 0){
      println(s"${x} is a Non-Negative and divisible by 7 ")
    }
    else if (x<0 && x%7 == 0){
      println(s"${x} is a Negative and divisible by 7 ")
    }
    else if (x>0 && x%7 != 0){
      println(s"${x} is a Non-Negative and not divisible by 7 ")
    }
    else{
      println(s"${x} is a Negative and not divisible by 7 ")
    }
  }

  def question30(): Unit = {
    var age = 22
    var free_trail: Boolean= false
    if(age < 25 || free_trail){
      println("Eligible for Student Discount or for a Free Trail ")
    }
    else{
      println("Not Eligible for Student Discount or for a Free Trail ")
    }
  }

  def question31():Unit={
    val x = 24
    if (x%4 ==0 || x%6 == 0){
      println(s"${x} is divisible by 4 or 6")
    }
    else{
      println(s"${x} is not divisible by 4 or 6 ")
    }
  }



  def main(args:Array[String]): Unit = {
    question6()
    question7()
    question8()
    question9()
    question10()
    question11()
    question12()
    question13()
    question14()
    question15()
    question16()
    question19()
    question20()
    question21()
    question22()
    question23()
    question24()
    question25()
    question26()
    question27()
    question28()
    question29()
    question30()
    question31()
  }
}

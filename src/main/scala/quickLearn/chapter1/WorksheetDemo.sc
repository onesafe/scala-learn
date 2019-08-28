object Sheet1 {
  println("Welcome to the Scala worksheet")

  // 声明数据 类型
  val greeting, message : String = null

  val answer = 8 * 5 + 2
  answer * 0.5
  ("Hello " + answer).toLowerCase


  // 下面两个是一样的 to 相当于 1 的方法
  1.to(10)
  1 to 10

  // range 2 到 10
  2 to 10

  val s = "hello"
  s(1)

  // apply 将生产另一个对象
  s.apply(4)
}
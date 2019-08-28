// 条件表达式
val x = 2
val s = if (x > 0)  6 else -1


// 语句终止
var n : Int = 10
var r : Int = 2
if (n > 9) {
  r = r * n
  n -= 1
}


// 块表达式和求值
import scala.math.sqrt
val x1 = 1
val y = 3
val y1 = 2
val distance = { val dx = x - x1; val dy = y - y1; sqrt((dx * dx) + (dy * dy)) }


// 输入输出
//val name = StdIn.readLine("Your name: ")
val name = "jack"
print(f"Hello, $name!")


// 循环
val s1 = "Hello"
var sum = 0
for (i <- 0 to s1.length - 1)
  sum += s1(i)

for (ch <- "Hello") sum += ch


for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")



// 函数
def fac(n : Int): Unit = {
  var r = 1
  for (i <- 1 to n)  r = r * i
  r
}

def facc(n: Int): Int = if (n <= 0) 1 else n * facc(n - 1)


// 默认参数和带名参数
def decorate(str: String, left: String = "[", right: String = "]") =
left + str + right


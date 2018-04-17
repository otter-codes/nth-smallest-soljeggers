object NthLargest extends App {

  def findNum(numberList: List[Int], n: Int) : Int = {
    val reverseList = numberList.reverse
    reverseList.indexOf(n - 1)
  }
}

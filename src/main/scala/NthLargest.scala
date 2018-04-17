object NthLargest extends App {

  def findNum(numberList: List[Int], n: Int) : Int = {
    val removeDups = numberList.distinct.reverse
    val findInList = removeDups.indexOf(n - 1)

    if (findInList < 0)
      n
    else {
      findInList
    }
  }
}

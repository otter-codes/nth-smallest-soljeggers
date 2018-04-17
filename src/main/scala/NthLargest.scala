object NthLargest extends App {

  def findNum(numberList: List[Int], n: Int) : Int = {
    val removeDups = numberList.distinct.reverse
    val findInList = removeDups.indexOf(n - 1)

    if (findInList < 0)
      n
    else if (n > findInList) {
      throw new IllegalArgumentException ("n is larger than the list length")
    } else {
      findInList
    }
  }
}

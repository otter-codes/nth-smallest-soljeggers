object NthLargest extends App {

  def findNum(numberList: List[Int], n: Int) : Int = {
    val removeDups = numberList.sorted.distinct.reverse

    if (n <= 0 || n > removeDups.length)
      throw new IndexOutOfBoundsException("n is larger than the list length")
    else {
      removeDups(n - 1)
    }
  }
}

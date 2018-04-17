import org.scalatest._

class NthLargestSpec extends WordSpec with MustMatchers {

  "NthLargest" must {

    "when given a list of 1,2,3 and n equal to 2 return 2" in {
      NthLargest.findNum(List(1,2,3) ,2) mustEqual 2
    }

    "when given a list of 1,2,3,4,5 and n equal to 2 return 4" in {
      NthLargest.findNum(List(1,2,3,4,5),2) mustEqual 4
    }

    "when given a list of 3,3,4,4,5,5 and n equal to 3 return 3" in {
      NthLargest.findNum(List(3,3,4,4,5,5),3) mustEqual 3
    }

  }

}

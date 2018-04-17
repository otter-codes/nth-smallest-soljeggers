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

    "when given a list of 3,3,4,4,5,5,6,6,7,7 and n equal to 3 return 5" in {
      NthLargest.findNum(List(3,3,4,4,5,5,6,6,7,7), 3) mustEqual 5

    }

    "when given the list of 1,2 and n equal to 3 throw Exception" in {
     val x =  intercept[IllegalArgumentException] {
        NthLargest.findNum(List(1,2) ,3)
      }
      x.getMessage mustEqual "n is larger than the list length"


    }

  }

}

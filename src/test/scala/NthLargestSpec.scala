import org.scalatest._

class NthLargestSpec extends WordSpec with MustMatchers {

  "NthLargest" must {

    //simplest test

    "when given a list of 1 and n equal to 1 return 1" in {
      NthLargest.findNum(List(1), 1) mustEqual 1
    }

    //testing smaller ammount

    "when given a list of 1,2,3 and n equal to 2 return 2" in {
      NthLargest.findNum(List(1,2,3) ,2) mustEqual 2
    }

    //set user test

    "when given a list of 1,2,3,4,5 and n equal to 2 return 4" in {
      NthLargest.findNum(List(1,2,3,4,5),2) mustEqual 4
    }

    "when given a list of 3,3,4,4,5,5 and n equal to 3 return 3" in {
      NthLargest.findNum(List(3,3,4,4,5,5),3) mustEqual 3
    }

    //testing larger amount

    "when given a list of 3,3,4,4,5,5,6,6,7,7 and n equal to 3 return 5" in {
      NthLargest.findNum(List(3,3,4,4,5,5,6,6,7,7), 3) mustEqual 5

    }

    //testing if the list is not ordered

    "when given a list of 3,2,5,4,1,7 and n is equal to 2 return 5" in {
      NthLargest.findNum(List(3,2,5,4,1,7), 2) mustEqual 5
    }

    //testing exception handling

    "when given the list of 1,2 and n equal to 3 throw Exception" in {
     val x =  intercept[IndexOutOfBoundsException] {
        NthLargest.findNum(List(1,2) ,3)
      }
      x.getMessage mustEqual "n is larger than the list length"
    }
    "when given a list of 1,2 and n is equal to 0 or below throw Exception" in {
      val x =  intercept[IndexOutOfBoundsException] {
        NthLargest.findNum(List(1,2) ,0)
      }
      x.getMessage mustEqual "n is larger than the list length"
    }
  }

}

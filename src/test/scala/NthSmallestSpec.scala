import org.scalatest._

class NthSmallestSpec extends WordSpec with MustMatchers {

  "NthSmallest" must {

    "when given a list 1 and a key of 1 return 1" in {
      NthSmallest.findNum(List(1), 1) mustEqual 1
    }
  }

}

import org.scalatest.{MustMatchers, WordSpec}

class SmallestIntSpec extends WordSpec with MustMatchers {

  "SmallestInt" must {

    "when provided with a list of 1 return 1" in {
      SmallestInt.findSmallNum(List(1)) mustEqual 1
    }

    "when provided with a list of 2,3,4 return 2" in {
      SmallestInt.findSmallNum(List(2,3,4)) mustEqual 2
    }
  }



}

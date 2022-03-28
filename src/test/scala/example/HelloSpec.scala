package example

import com.keithalcock.json.common.Test

class HelloSpec extends Test {

  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}

package example

import org.scalatest.FunSuite

/**
  * Created by wangyiping on 27/08/2019 6:43 PM.
  */
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
}

package com.nature.hub.gotest.main

import org.hamcrest.CoreMatchers.is
import org.hamcrest.MatcherAssert.assertThat
import org.scalatest.FunSuite

class TwoTest extends FunSuite {
  test("one test") {
    val one = new Two()
    assertThat(one.useTheCommon("ONE","TWO"), is("this is a common [ONE,TWO]"))
  }
}

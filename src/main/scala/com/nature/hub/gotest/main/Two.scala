package com.nature.hub.gotest.main

import com.nature.hub.gotest.common.SomeCommonClass

class Two {
  def useTheCommon(s1:String,s2:String) = {
    val commonClass = new SomeCommonClass()
    commonClass.someCommonFunction(s"$s1,$s2")
  }
}

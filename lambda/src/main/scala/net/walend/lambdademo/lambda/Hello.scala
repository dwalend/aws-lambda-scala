package net.walend.lambdademo.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

/**
  *
  *
  * @author dwalend
  * @since v0.2.1
  */
class Hello {

 def myHandler(name:String, context:Context):String = {
    val logger = context.getLogger()
    logger.log("received : " + name)
    s"Hello $name via ${context}"
  }

}

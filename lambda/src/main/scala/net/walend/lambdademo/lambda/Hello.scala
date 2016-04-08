package net.walend.lambdademo.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

import java.net.URLDecoder

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
    logger.log(s"context.getClientContext is ${context.getClientContext}")

    s"Hello $name with client context ${Option(context.getClientContext).map(_.getCustom)} and environment ${Option(context.getClientContext).map(_.getEnvironment)}"
  }

}
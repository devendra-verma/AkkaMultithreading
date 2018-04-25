package com.pers.practice


import akka.actor._
import com.pers.practice.core.Bean
import com.pers.practice.objects.ProcessThreadPool

/**
 * Base Actor class.
 */
class MessageProcessorAkka extends Actor {
 
  override def receive: Receive = {
    case x: Bean => { 
      println(x.getRequestText)
      println(x.getAlertType.getDescription)
      }
  }
}
  

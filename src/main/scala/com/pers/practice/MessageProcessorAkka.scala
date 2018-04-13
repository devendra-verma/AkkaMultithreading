package com.pers.practice


import akka.actor._
import com.pers.practice.core.Bean
import com.pers.practice.objects.ProcessThreadPool

/**
 * Base Actor class.
 */
class MessageProcessorAkka extends Actor {
  
 val greeter: ActorRef = context.actorOf(
    ProcessThreadPool.propsWithDispatcherAndRoundRobinRouter("default-dispatcher",3),
    name = "processor"
  )
  
  override def receive: Receive = {
    case x: Bean => { 
      println(x.getRequestText)
      }
  }
}
  
object MessageProcessorAkka {
    def props = Props(classOf[MessageProcessorAkka])
  }

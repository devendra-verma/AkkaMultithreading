
package com.pers.practice

import com.pers.practice.core.Bean
import com.pers.practice.core.DataType
import akka.actor.ActorRef
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import com.pers.practice.objects.ProcessThreadPool

/**
 * Main Class to start sending message to 
 * the actors
 */
object AkkaThreadTest extends App {
  
  //Load the config details from the reference.conf 
  //scala looks for reference.conf file by default
  val config = ConfigFactory.load()
  val _system: ActorSystem = ActorSystem.create("hello-Super", config.getConfig("configuration"))
  val sender: ActorRef = _system.actorOf(ProcessThreadPool.propsWithDispatcherAndRoundRobinRouter("default-dispatcher",3))
  var reqBean:Bean = new Bean("Hello", DataType.GET)
  sender ! reqBean
  sender ! reqBean
  sender ! reqBean
 

}
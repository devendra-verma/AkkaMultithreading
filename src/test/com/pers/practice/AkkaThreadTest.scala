
package com.pers.practice

import com.pers.practice.core.Bean
import com.pers.practice.core.DataType
import akka.actor.ActorRef
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
/**
 * Main Class to start sending message to 
 * the actors
 */
object AkkaThreadTest extends App {
  
  //Load the config details from the reference.conf 
  //scala looks for reference.conf file by default
  val config = ConfigFactory.load()
  val _system: ActorSystem = ActorSystem.create("hello-Super", config.getConfig("configuration"))
  val supervisor: ActorRef = _system.actorOf(MessageProcessorAkka.props, name = "supervisor")
  var reqBean:Bean = new Bean("Hello", DataType.GET)
  supervisor ! reqBean
  supervisor ! reqBean
  supervisor ! reqBean

}
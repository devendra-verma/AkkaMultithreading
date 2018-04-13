package com.pers.practice.objects

import akka.actor._
import akka.routing.RoundRobinPool

import akka.actor.{Actor, ActorRef, Props}

import com.pers.practice.MessageProcessorAkka

object ProcessThreadPool  {
  
  def props = Props(classOf[MessageProcessorAkka])

  def propsWithDispatcherAndRoundRobinRouter(dispatcher: String, nrOfInstances: Int): Props = {
    props.withDispatcher(dispatcher).withRouter(RoundRobinPool(nrOfInstances = nrOfInstances))
  }
  
 }
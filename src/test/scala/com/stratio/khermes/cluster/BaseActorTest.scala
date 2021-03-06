/*
 * Copyright (C) 2016 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.khermes.cluster

import akka.actor.ActorSystem
import akka.testkit.{DefaultTimeout, ImplicitSender, TestKit}
import com.stratio.khermes.commons.implicits.AppImplicits
import com.typesafe.config.{Config, ConfigFactory}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}
import scala.concurrent.duration._
import akka.util.Timeout

/**
 * Generic class used to test actors. All tests that uses akka should extend this class.
 */
abstract class BaseActorTest extends TestKit(ActorSystem("ActorTest", ConfigFactory.load()))
  with DefaultTimeout
  with ImplicitSender
  with WordSpecLike
  with Matchers
  with BeforeAndAfterAll {

  lazy implicit val config: Config = AppImplicits.config
  lazy implicit val executionContext = AppImplicits.executionContext
  override implicit val timeout: Timeout = Timeout(10 seconds)

  override def afterAll {
    system.terminate()
  }
}

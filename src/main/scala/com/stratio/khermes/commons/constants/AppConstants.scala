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

package com.stratio.khermes.commons.constants

/**
  * Global constants used in the application.
  */
object AppConstants {

  val DefaultLocale = "ALL"
  val AkkaClusterName = "khermes"
  val DecimalValue = 10
  val SupervisorStart = 5
  val SupervisorStop = 30

  val GeneratedTemplatesPrefix = "generated-templates"
  val GeneratedClassesPrefix = "generated-classes"
  val KafkaAvroSerializer = "io.confluent.kafka.serializers.KafkaAvroSerializer"

  val ZookeeperParentPath = "/stratio/khermes"
  val ZookeeperConnection = "zookeeper.connection"
  val ZookeeperConnectionDefault = "master.mesos:2181"
  val ZookeeperConnectionTimeout = "zookeeper.connectionTimeout"
  val ZookeeperSessionTimeout = "zookeeper.sessionTimeout"
  val ZookeeperRetryAttempts = "zookeeper.retryAttempts"
  val ZookeeperRetryInterval = "zookeeper.retryInterval"

  val KafkaConfigPath = "kafka-config"
  val GeneratorConfigPath = "generator-config"
  val TwirlTemplatePath = "twirl-template"
  val AvroConfigPath = "avro-config"

  val CommandNotFoundMessage = "Command not found. Type help to list available commands."
  val HelpMessage =
    s"""Khermes client provides the next commands to manage your Khermes cluster:
        |  Usage: COMMAND [args...]
        |
        |  Commands:
        |     start [command options] : Starts event generation in N nodes.
        |       --generator-config  : Khermes configuration
        |       --kafka-config      : Kafka configuration
        |       --twirl-template    : Template to generate data
        |       --avro-template     : Avro configuration
        |       --ids               : Node id where start khermes
        |     stop [command options] : Stop event generation in N nodes.
        |       --ids               : Node id where start khermes
        |     ls : List the nodes with their current status
        |     save [command options] : Save your configuration in zookeeper
        |       --generator-config  : Khermes configuration
        |       --kafka-config      : Kafka configuration
        |       --twirl-template    : Template to generate data
        |       --avro-template     : Avro configuration
        |     show [command options] : Show your configuration
        |       --generator-config  : Khermes configuration
        |       --kafka-config      : Kafka configuration
        |       --twirl-template    : Template to generate data
        |       --avro-template     : Avro configuration
        |     clear : Clean the screen.
        |     help : Print this usage.
        |     exit | quit | bye : Exit of Khermes Cli. """.stripMargin

  val DefaultWSHost = "0.0.0.0"
  val DefaultWSPort = 8080

  val DefaultStrategy = Option("default")
}

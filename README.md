GeoMesa Kafka Quick Start - Clojure
============================

* rewrite of the Java [Geomesa Kafka Quickstart](https://github.com/geomesa/geomesa-tutorials/tree/master/geomesa-quickstart-kafka) tutorial for Geomesa 1.2.5


This tutorial will show you how to:

1. Write custom Clojure code to produce and consume messages in [Apache Kafka](http://kafka.apache.org/) using GeoMesa.
2. Query the data and replay the messages in a Kafka topic to achieve an earlier state.
3. Visualize the changes being made in Kafka with GeoServer.

Background
----------

[Apache Kafka](http://kafka.apache.org/) is
> publish-subscribe messaging rethought as a distributed commit log.

In the context of GeoMesa, Kafka is a useful tool for working with streams of geospatial data.
Interaction with Kafka in GeoMesa occurs with the KafkaDataStore which implements the
GeoTools [DataStore](http://docs.geotools.org/latest/userguide/library/data/datastore.html) interface.

Prerequisites
-------------

* basic knowledge of [GeoTools](http://www.geotools.org), [GeoServer](http://geoserver.org), and Kafka
* an instance of Kafka 0.8.2.x with (an) appropriate Zookeeper instance(s)
* an instance of GeoServer version 2.8.1 with the GeoMesa Kafka plugin installed
* [Java JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven](http://maven.apache.org/) 3.2.2 or better
* a [git](http://git-scm.com/) client

In order to install the GeoMesa Kafka GeoServer plugin, follow the instructions
[here](https://github.com/locationtech/geomesa/tree/master/geomesa-gs-plugin/geomesa-kafka-gs-plugin).

Ensure your Kafka and Zookeeper instances are running. You can use Kafka's
[quickstart](http://kafka.apache.org/documentation.html#quickstart) to get Kafka/Zookeeper
instances up and running quickly.

Download and Build the Tutorial
--------------------------

Pick a reasonable directory on your machine, and run:

```bash
$ git clone https://github.com/trinityXmontoya/geomesa-quickstart-kafka.git
$ cd geomesa-quickstart-kafka
```

To build, run

```bash
java -jar geomesa-quickstart-kafka-0.1.0-standalone.jar [args]
```

> :warning: Note: ensure that you are running Kafka 0.8.2.1 and Zookeeper 3.4.6

## Current Status

- [x] Quickstart
- [ ] Listener
- [ ] Load Tester
- [ ] Tests

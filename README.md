# Kafka State Store Spring Boot Example 

## How to run

1. Start all the kafka services following [this guide](https://github.com/tintinrevient/log-aggregation-pipeline).

2. Start the application:
```bash
./gradlew bootRun
```

3. The result is shown in terminal as below:
```bash
received = 17 with key so
received = 25 with key go
received = 25 with key thorin
received = 25 with key gandalf
received = 55 with key never
received = 30 with key fall
received = 262 with key you
received = 27 with key this
```

## How to check result

Go to http://localhost:8090/count/this, and also `27` will be shown.

## References

* https://spring.io/blog/2019/12/09/stream-processing-with-spring-cloud-stream-and-apache-kafka-streams-part-6-state-stores-and-interactive-queries
* https://kafka.apache.org/10/documentation/streams/developer-guide/interactive-queries.html
* https://www.baeldung.com/spring-kafka
* https://developer.confluent.io/learn-kafka/spring/hands-on-process-messages-with-kafka-streams/
* https://github.com/confluentinc/demo-scene
* https://medium.com/bakdata/queryable-kafka-topics-with-kafka-streams-8d2cca9de33f
* https://github.com/bakdata/kafka-key-value-store
* https://github.com/tonyzampogna/kafka-state-store-example
* https://docs.confluent.io/platform/current/clients/consumer.html
* https://kafka.apache.org/documentation/streams/developer-guide/processor-api.html
* https://kafka.apache.org/documentation/streams/developer-guide/running-app.html
* https://kafka.apache.org/documentation/streams/developer-guide/testing.html
* https://kafka.apache.org/documentation.html
* https://docs.confluent.io/platform/current/streams/code-examples.html#java

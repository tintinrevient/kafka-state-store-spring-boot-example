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

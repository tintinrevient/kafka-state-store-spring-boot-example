package com.example.producer;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Component
public class Producer {

    private final KafkaTemplate<Integer, String> template;

    Faker faker;

    @EventListener(ApplicationStartedEvent.class)
    public void generate() {

        faker = Faker.instance();
        final Flux<Long> interval = Flux.interval(Duration.ofMillis(1_000));

        final Flux<String> quotes = Flux.fromStream(Stream.generate(() -> faker.hobbit().quote()));

        Flux.zip(interval, quotes)
                .map(it -> template.send("hobbit", faker.random().nextInt(42), it.getT2())).blockLast();
    }

}

package io.github.receus.jpaquerylogger;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration
public class JpaQueryLoggerAutoConfiguration {

    private static final Logger log = LoggerFactory.getLogger(JpaQueryLoggerAutoConfiguration.class);

    @PostConstruct
    public void init() {
        log.info("JPA Query Logger is active");
    }
}

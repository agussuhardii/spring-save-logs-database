package com.agussuhardi.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author agus.suhardii@gmail.com
 * @created 13/06/23/06/2023 :18.57
 * @project logging
 */

@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    void logTest() {
        log.info("INFO");
        log.error("ERROR");
        log.warn("WARN");
        log.debug("DEBUG");

    }
}

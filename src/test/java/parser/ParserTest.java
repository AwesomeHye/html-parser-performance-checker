package parser;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;

@Disabled
@Slf4j
public class ParserTest {
    private long start = 0;
    private long end = 0;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        start = 0;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        log.info("running time: {}ms", (end - start));
    }

}

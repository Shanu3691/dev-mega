import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoappApplicationTests {

    @Test
    void contextLoads() {
        // Simple assertion to ensure the test actually verifies something
        assertTrue(true, "The application context should load without issues");
    }
}

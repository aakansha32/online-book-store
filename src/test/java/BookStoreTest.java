import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStoreTest {

    @Test
    void testBookStore() {
        String message = "Online Book Store";
        assertEquals("Online Book Store", message);
    }
}
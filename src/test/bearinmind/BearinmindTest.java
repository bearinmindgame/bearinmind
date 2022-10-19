package bearinmind;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BearinmindTest {
    @Test
	@DisplayName("Main window creates")
	void createMainWindow() throws IOException {
        MainWindow mainWindow = new MainWindow();
        assertNotNull(mainWindow);
	}
}

package test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.bearinmind.MainWindow;

public class BearinmindTest {
    @Test
	@DisplayName("Main window creates")
	void createMainWindow() throws IOException {
        MainWindow mainWindow = new MainWindow();
        assertNotNull(mainWindow);
	}
}

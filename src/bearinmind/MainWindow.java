/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearinmind;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Majercsik Szabolcs
 */
public class MainWindow extends JFrame {
    public MainWindow() throws IOException {
        setTitle("Unnamed 2D Adventure Game");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}

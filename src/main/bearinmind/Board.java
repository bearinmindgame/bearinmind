/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.bearinmind;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Majercsik Szabolcs
 */
public class Board extends JPanel {
    
    private Model model = new Model();
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello World!", getWidth() / 2, getHeight() / 2);
        for (int i = 0; i < model.getBoardWidth(); i++) {
            for (int j = 0; j < model.getBoardHeight(); j++) {
                //here comes the reading of the lines out of the file
            }
        }
    }
}

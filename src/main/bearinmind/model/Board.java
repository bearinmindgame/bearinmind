/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearinmind.model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.swing.JPanel;
import bearinmind.Model;

/**
 *
 * @author Majercsik Szabolcs
 */
public class Board extends JPanel {
    
    private Model model = new Model();
    private Image grass, road, water, wall, tree, gate1, gate2;
    
    Board() throws IOException {

    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        int scaleWidth = this.getSize().width / model.getBoardWidth();
        int scaleHeight = this.getSize().height / model.getBoardHeight();
        for (int i = 0; i < model.getBoardWidth(); i++) {
            for (int j = 0; j < model.getBoardHeight(); j++) {
                Image img = null;

                //pálya kirajzolása
                switch (model.getBoardElement(i, j)) {
                    case "-":
                        img = grass;
                        break;

                    case "@":
                        img = road;
                        break;

                    case "%":
                        img = water;
                        break;

                    case "#":
                        img = wall;
                        break;

                    case "|":
                        img = tree;
                        break;

                    case "^":
                        img = gate1;
                        break;

                    case "=":
                        img = gate2;
                        break;
                }

                gr.drawImage(img, i * scaleWidth, j * scaleHeight, scaleWidth, scaleHeight, this);
            }
        }
    }
}

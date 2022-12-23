/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearinmind.model;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Majercsik Szabolcs
 */
public class Board extends JPanel {
    GameModel model;
    
    public Board(GameModel model) {
        this.model = model;
    }
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        int width = model.getMap().width;
        int height = model.getMap().height;
        int scaleWidth = this.getSize().width / model.getMap().width;
        int scaleHeight = this.getSize().height / model.getMap().height;
        
        
        
        for (int i = 0; i < model.getMap().height; i++) {
            for (int j = 0; j < model.getMap().width; j++) {
                g.drawImage(model.getMap().terrainAt(j, i).image, j * scaleWidth, i * scaleHeight, scaleWidth, scaleHeight, this);
            }
        }
        
    }
}

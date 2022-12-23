/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearinmind;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Majercsik Szabolcs
 */
public class Model {
    private int boardWidth;
    private int boardHeight;
    private ArrayList<String> levelRows = new ArrayList<>();
    
    public Model() {
        fileReader();
    }
    
    private void fileReader() {
        
    }
    
    private String readNextLine(Scanner sc) {
        String line = "";
        while (sc.hasNextLine() && line.trim().isEmpty()) {
            line = sc.nextLine();
        }
        return line;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }
    
    public String getBoardElement(int x, int y) {
        return Character.toString(levelRows.get(y).charAt(x));
    }
    
}
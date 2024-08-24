package br.upe;

import javax.swing.*;
import java.awt.*;

public class SolarSystem extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw a line from (50, 50) to (250, 250)
        g.drawLine(50, 50, 250, 250);
    }
}

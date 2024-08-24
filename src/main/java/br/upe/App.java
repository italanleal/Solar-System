package br.upe;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        frame.setTitle("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        frame.add(new SolarSystem());
        frame.setVisible(true);
    }
}

import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.lang.Math.*;

/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int WIDTH = 200, HEIGHT = 200;
    /**
     * Constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setSize(800, 800);
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(WIDTH, HEIGHT);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void paintComponent(Graphics2D g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        TreeComponent comp = new TreeComponent(0.2, 0.2, 0, 50, 2, new Point2D.Double(300, 300));
        comp.drawTree(g2);
    }
}

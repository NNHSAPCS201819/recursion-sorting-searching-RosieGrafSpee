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
    private static final int WIDTH = 600, HEIGHT = 600;
    /**
     * Constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
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
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.BLACK);
        
        TreeComponent comp = new TreeComponent(0.2, 0.3, Math.PI / 2, 100, 1.4, new Point2D.Double(300, 300));
        comp.paintComponent(g2);
    }
}

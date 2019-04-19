import java.util.ArrayList;
import javax.swing.JColorChooser;
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
    private double l_angle, r_angle, x, y, size, branch;
    private static final int WIDTH = 1366, HEIGHT = 768;
    private Color col;
    /**
     * Constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        this.col = Color.BLACK;
        this.l_angle = Math.PI / 2;
        this.r_angle = Math.PI / 2;
        
        this.x = WIDTH / 2;
        this.y = 4 * HEIGHT / 5;
        this.size = HEIGHT / 2;
        this.branch = 12;
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
        g.setColor(col);
        
        TreeComponent comp = new TreeComponent(l_angle, r_angle, Math.PI / 2, size, branch, new Point2D.Double(x, y));
        comp.paintComponent(g2);
    }
    
    public Color getColor()
    {
        return this.col;
    }
    
    public void setLeft(double l_deg)
    {
        this.l_angle = l_deg;
    }
    
    public void setRight(double r_deg)
    {
        this.r_angle = r_deg;
    }
    
    public void setScale(double scale)
    {
        this.size = scale;
    }
    
    public void setBranch(double branch)
    {
        this.branch = branch;
    }
    
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.col );
        
        if( selectedColor != null )
        {
            this.col = selectedColor;
        }
    }
}

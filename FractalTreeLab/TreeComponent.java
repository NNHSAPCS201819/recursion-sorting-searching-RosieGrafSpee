import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.lang.Math.*;

/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeComponent
{
    private double l_deg, r_deg, br_size, scale;

    /**
     * Constructor for objects of class TreeComponent
     */
    public TreeComponent(double l_deg, double r_deg, double scale, double br_size)
    {
        this.l_deg = l_deg;
        this.r_deg = r_deg;
        this.br_size = br_size;
        this.scale = scale;
    }
    
    public void drawTree(Graphics2D g)
    {
        TreeComponent temp = new TreeComponent(l_deg, r_deg, scale, br_size / scale);
        if (this.scale >= 1)
        {
            temp.drawTree(g);
        }
        
        
    }
    
    public double getLeft()
    {
        return this.l_deg;
    }
    
    public double getRight()
    {
        return this.r_deg;
    }
}
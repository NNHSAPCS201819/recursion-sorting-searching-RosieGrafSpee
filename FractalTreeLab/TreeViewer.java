import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.geom.Point2D;
/**
 * Write a description of class TreeViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeViewer extends JFrame
{
    DrawingPanel canvas;
    TreeControl control;
    /**
     * Constructor for objects of class TreeViewer
     */
    public TreeViewer()
    {   
        this.setTitle( "Tree Viewer" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setLayout(new BorderLayout());
        
        this.setSize(800,400);
        
        this.canvas = new DrawingPanel();
        this.control = new TreeControl(this.canvas);
        this.add(this.canvas, BorderLayout.CENTER);
        this.add(this.control, BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible( true );
    }
    
    public static void main( String[] args )
    {
       TreeViewer thing = new TreeViewer();
    }
}

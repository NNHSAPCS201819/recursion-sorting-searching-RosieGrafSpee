import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
/**
 * Write a description of class TreeViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeViewer extends JFrame
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TreeViewer
     */
    public TreeViewer()
    {
        this.setLayout(new BorderLayout());
        
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        this.add(new TreeComponent(), BorderLayout.CENTER);
        
        this.pack();
        this.setVisible( true );
    }
    
    public static void main( String[] args )
    {
       TreeViewer thing = new TreeViewer();
    }
}

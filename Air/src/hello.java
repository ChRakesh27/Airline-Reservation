
import java.awt.Color; 
import java.awt.GradientPaint; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Paint; 
import javax.swing.JPanel; 
import java.awt.Color; 
import java.awt.GridLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.SwingUtilities; 

 class hello1 extends JPanel { 
    private int red = 240; 
    private int green = 240; 
    private int blue = 240; 

    public hello1(Color bgColor) { 
        this.red = bgColor.getRed(); 
        this.green = bgColor.getGreen(); 
        this.blue = bgColor.getBlue(); 
    } //  w    w  w  . d  e  m  o  2   s  .c  o   m 

    @Override 
    protected void paintComponent(Graphics g) { 
        if (g instanceof Graphics2D) { 
            int width = this.getWidth(); 
            int height = this.getHeight(); 
            float startPointX = 0.0f; 
            float startPointY = 0.0f; 
            float endPointX = width; 
            float endPointY = 0.0f; 
            Color startColor = new Color(red, green, blue, 255); 
            Color endColor = new Color(red, green, blue, 0); 

            // Create a GradientPaint object 
            Paint paint = new GradientPaint(startPointX, startPointY, 
                                            startColor, 
                                            endPointX, endPointY, 
                                            endColor); 

            Graphics2D g2D = (Graphics2D) g; 
            g2D.setPaint(paint); 
            g2D.fillRect(0, 0, width, height); 
        } 
    } 
} 


public class hello extends JFrame { 
    private JButton closeButton = new JButton("Close"); 

    public hello(String title) { 
        super(title); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 

        // Make sure the frame is undecorated  
        this.setUndecorated(true); 

        // Set the background color with all components as zero, 
        // so per-pixel translucency is used 
        this.setBackground(new Color(0, 0, 0, 0)); 

        // Set its size 
        this.setSize(200, 200); 

        // Center it on the screen 
        this.setLocationRelativeTo(null); 

        this.getContentPane().setLayout(new GridLayout(0, 1)); 

        // Create and add three JPanel with different color gradients 
        this.add(new hello1(Color.RED)); 
        this.add(new hello1(Color.GREEN)); 
        this.add(new hello1(Color.BLUE)); 

        // Add a button to close the window 
        this.add(closeButton); 
        closeButton.addActionListener(e -> System.exit(0)); 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            hello frame 
                = new hello("Per-Pixel Translucent Frame"); 
            frame.setVisible(true); 
        }); 
    } 
}
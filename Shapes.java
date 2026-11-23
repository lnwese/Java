import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class Shapes extends JPanel
{
    private static final long serialVersionUID = 1L;
    private int choice;

    public Shapes( int userChoice )
    {
        choice = userChoice;
    }

    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );

        for (int i = 0; i < 10; i++ )
        {
            switch ( choice )
            {
                case 1:
                    // growing rectangles
                    g.drawRect( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                    break;
                case 2:
                    // growing ovals
                    g.drawOval( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                    break;
                default:
                    // do nothing if invalid number
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for rectangles, enter 2 for ovals:");
        int pick = input.nextInt();
        input.close();

        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Shapes drawingPanel = new Shapes(pick);
        frame.add(drawingPanel);

        frame.setVisible(true);
    }
}

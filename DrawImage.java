import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
public class DrawImage extends Frame {
    int x,y;
    Image img;
    DrawImage()
    {
        super("Draw Image");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                draw();
            }
        });
        File f = new File("winter.jpeg");
        try    
        {
            img = (Image)ImageIO.read(f);
        }
        catch(Exception e){}
        setSize(400,400);
        setVisible(true);
    }    
    void draw()
    {
        Graphics g = getGraphics();
        g.drawImage(img,x,y,200,200,this);
    }
    public static void main(String[] args)
    {
        DrawImage a = new DrawImage();
    }
}
package Modelos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JPanel;

public class Ventana extends JFrame implements WindowListener{
    
    public Ventana(String title)
    {
        super(title);
        setSize(500,500);
        addWindowListener(this);
        setBackground(Color.BLACK);
    }
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override    
        public void paint (Graphics g)
        {
            
        }
    }
    
    
    @Override
    public void windowOpened(WindowEvent e) {    }

    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);}

    @Override
    public void windowClosed(WindowEvent e) {    }

    @Override
    public void windowIconified(WindowEvent e) {    }

    @Override
    public void windowDeiconified(WindowEvent e) {    }

    @Override
    public void windowActivated(WindowEvent e) {    }

    @Override
    public void windowDeactivated(WindowEvent e) {    }
    
}

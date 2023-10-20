package Modelos;

import java.awt.Color;
import java.awt.Graphics;


public class EnemigoGrafico extends Enemigo implements Dibujo{

    Color color;
    
    public EnemigoGrafico(Coordenada cor, float x, float y, Color uncolor)
    {
        super(cor,x,y);
        this.color = uncolor;
    }
    
    
    
    @Override
    public void dibujar(Graphics dw) 
    {
        dw.setColor(color);
        dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.Getlado(1),(int)this.Getlado(2));
    }
    
    
    
    
}

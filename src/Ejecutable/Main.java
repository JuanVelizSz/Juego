package Ejecutable;
import java.awt.*;
import Modelos.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       
        Ventana nuevaventana = new Ventana("Space Invaders");
        ArrayList ArregloDeObjetos = new ArrayList();
        Coordenada cor1 = new Coordenada(250, 250);
        Coordenada cor2 = new Coordenada(500, 300);
        EnemigoGrafico enemigo = new EnemigoGrafico(cor1,80,80,Color.blue); 
        CirculoGrafico circulo = new CirculoGrafico(cor2,50,Color.RED);
        
        ArregloDeObjetos.add(enemigo);
        ArregloDeObjetos.add(circulo);
        PanelFG nuevopanel =  new PanelFG(ArregloDeObjetos);
        
        nuevaventana.add(nuevopanel);
        nuevaventana.setSize(800,600);
        nuevaventana.setVisible(true);
        
    } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author tremor
 */
public class graphicsArray extends javax.swing.JPanel{
public static int randarray[];
public final int SIZE = 600; //to be changed
public int width=SIZE/50; //to be changed
public int current = -1; //to be changed
public int check = -1; //to be changed
    //@Override
    public static void recieve(){
        for (int x=0;x<randarray.length;x++){
           System.out.print(randarray[x]+" ");  
        } 
    }
    public void arrayDisplay(Graphics g){
        Graphics2D graphics = (Graphics2D)g;
        super.paintComponent(g);
        for(int i = 0; i < randarray.length; i++) {	//RUNS TROUGH EACH ELEMENT OF THE LIST
                int HEIGHT = randarray[i]*width;	//SETS THE HEIGHT OF THE ELEMENT ON THE GRAPH
 
                        g.setColor(Color.white);	//DEFAULT COLOR
                        if(current > -1 && i == current) {
                                g.setColor(Color.green);	//COLOR OF CURRENT
                        }
                        if(check > -1 && i == check) {
                                g.setColor(Color.red);	//COLOR OF CHECKING
                        }
                        //DRAWS THE BAR AND THE BLACK OUTLINE
                        g.fillRect(i*width, SIZE-HEIGHT, width, HEIGHT);
                        g.setColor(Color.black);
                        g.drawRect(i*width, SIZE-HEIGHT, width, HEIGHT);   
        }
}
}
 
    

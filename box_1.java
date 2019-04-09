import java.io.*;
import java.util.*;

public class Box
{ 
    int width;
    int height;
    int depth;
    int  vol;
    
    Box(int width, int height, int depth) 
    { 
        this.width = width; 
        this.height = height; 
        this.depth = depth;
    } 

    public int Volume() 
    {   
                 vol= depth*width*height;
                 return vol;
    }
    
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int depth = sc.nextInt();
        
        Box obj = new Box(width,height,depth); 
        int vol=obj.Volume();
        System.out.println("Volume of the box is :"+vol);
        
    } 
    

}
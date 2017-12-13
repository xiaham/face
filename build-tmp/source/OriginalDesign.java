import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {


public void setup ()
{
	size (400, 400);
}

public void draw () 
{
	if (mousePressed)
	{
		face ();
	}
	else 
	{
		darkness ();
	}
	
}

public void darkness ()
{
	fill (0);
	rect (0,0,400,400);
	fill (250); ellipse (175, 150, 50, 50); ellipse (225, 150, 50, 50); fill (0); ellipse (175,150, 10, 10); ellipse(225, 150, 10, 10); //eyes
}

public void face ()
{	stroke(0);
	fill (255, 250, 77);
	rect (0,0,400,400);
	fill (242,226,174); ellipse(200,180,200,250); //face 
	fill (250); ellipse (175, 150, 50, 50); ellipse (225, 150, 50, 50); fill (0); ellipse (175,150, 10, 10); ellipse(225, 150, 10, 10); //eyes
	noStroke(); fill(255,150,236); arc(200,220,150,90,0,PI);//mouth
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

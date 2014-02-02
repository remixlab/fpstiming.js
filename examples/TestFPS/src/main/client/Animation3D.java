package main.client;

import com.google.gwt.core.client.JavaScriptObject;

import processing.core.PApplet;
import remixlab.fpstiming.*;

public class Animation3D  //extends PApplet 
{

	
	public PApplet p;
//	public Animation3D(){}
//	public Animation3D(JavaScriptObject ctx) {
//		super(ctx);		
//	}

	
    public Animation3D(){}
    public Animation3D(PApplet p){
    	this.p = p;
    }		
	
	ParticleSystem system;
	public TimingHandler handler;

	public void setup() {
	  p.size(640, 360);
	  /**
	   scene = new ParticleSystem(this);
	   handler = new TimingHandler(scene);
	   scene.startAnimation();
	   //*/
	  // /**
	  handler = new TimingHandler();
	  system = new ParticleSystem(p, handler);
	  //*/
	  p.smooth();
	}

	public void draw() {
		p.background(0);

		p.pushStyle();
		p.strokeWeight(3); // Default

	  /**
	   pushMatrix();
	   translate(width/2, height/2);    
	   beginShape(POINTS);
	   for (int i = 0; i < system.particle.length; i++) {
	   system.particle[i].draw();
	   }
	   endShape();
	   popMatrix();
	   // */

	  // /**
		p.pushMatrix();
		p.translate(p.width()/2, p.height()/2, -200);
		p.rotateX(p.frameCount() * p.PI / 500);
		p.rotateY(p.frameCount() * p.PI / 500);    
		p.beginShape(p.POINTS);
	  for (int i = 0; i < system.particle.length; i++) {
	    system.particle[i].draw();
	  }
	  p.endShape();
	  p.popMatrix();
	  //*/

	  p.popStyle();

	  handler.handle();
	}



	public void keyPressed() {
	  if ((p.key() == 'x') || (p.key() == 'X'))
	    system.setAnimationPeriod(system.animationPeriod()-2);
	  if ((p.key() == 'y') || (p.key() == 'Y'))
	    system.setAnimationPeriod(system.animationPeriod()+2);
	}	
	
}

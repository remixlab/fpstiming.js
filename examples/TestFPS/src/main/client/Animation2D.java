package main.client;

import processing.core.PApplet;
import remixlab.fpstiming.TimingHandler;

public class Animation2D {
	
	

	private PApplet p;
	
	ParticleSystem system;
	TimingHandler handler;
	
	
    public Animation2D(){}
    public Animation2D(PApplet p){
    	this.p = p;
    }	
	

	public void setup() {
	  //size(640, 360, P2D);
	  p.size(640, 360);
	  // /**
	  system = new ParticleSystem(p);
	  handler = new TimingHandler(system);
	  system.startAnimation();
	  //*/
	  /**
	   handler = new TimingHandler();
	   system = new ParticleSystem(this, handler);
	   //*/
	  p.smooth();

	}

	public void draw() {
		p.background(0);
		p.pushStyle();
		p.pushMatrix();
		p.translate(p.width()/2, p.height()/2);
		
		
		p.strokeWeight(3); // Default
		p.beginShape(p.POINTS);
	  for (int i = 0; i < system.particle.length; i++) {
	    system.particle[i].draw();
	  }
	  p.endShape();
	  p.popMatrix();
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

/*******************************************************************************
 * FPSTiming (version 1.0.0)
 * Copyright (c) 2014 National University of Colombia, https://github.com/remixlab
 * @author Jean Pierre Charalambos, http://otrolado.info/
 *     
 * All rights reserved. Library that eases the creation of interactive
 * scenes, released under the terms of the GNU Public License v3.0
 * which is available at http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package main.client;

import processing.core.PApplet;
import remixlab.fpstiming.TimingHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class Animation2D.
 */
public class Animation2D {
	
	

	/** The p. */
	private PApplet p;
	
	/** The system. */
	ParticleSystem system;
	
	/** The handler. */
	TimingHandler handler;
	
	
    /**
     * Instantiates a new animation2 d.
     */
    public Animation2D(){}
    
    /**
     * Instantiates a new animation2 d.
     *
     * @param p the p
     */
    public Animation2D(PApplet p){
    	this.p = p;
    }	
	

	/**
	 * Setup.
	 */
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

	/**
	 * Draw.
	 */
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

	/**
	 * Key pressed.
	 */
	public void keyPressed() {
	
	  if ((p.key() == 'x') || (p.key() == 'X'))
	    system.setAnimationPeriod(system.animationPeriod()-2);
	  
	  if ((p.key() == 'y') || (p.key() == 'Y'))
	    system.setAnimationPeriod(system.animationPeriod()+2);
	  
	}	

}

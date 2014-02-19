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
import processing.core.PVector;

// TODO: Auto-generated Javadoc
/**
 * The Class Particle2D.
 */
public class Particle2D {
	  
  	/** The parent. */
  	PApplet parent;
	  
  	/** The speed. */
  	public PVector speed;
	  
  	/** The pos. */
  	public PVector pos;
	  
  	/** The age. */
  	public int age;
	  
  	/** The age max. */
  	public int ageMax;

	  /**
  	 * Instantiates a new particle2 d.
  	 *
  	 * @param p the p
  	 */
  	public Particle2D(PApplet p) {
	    parent = p;
	    speed = new PVector();
	    pos = new PVector();
	    init();
	  }

	  /**
  	 * Animate.
  	 */
  	public void animate() {
		speed.z -= 0.05f;
	    pos = PVector.add(pos, PVector.mult(speed, 10f));

	    if (++age == ageMax)
	      init();
	  }

	  /**
  	 * Draw.
  	 */
  	public void draw() {    
	    parent.stroke( 255 * ((float) age / (float) ageMax), 255 * ((float) age / (float) ageMax), 255);
	    parent.vertex(pos.x, pos.y);
	  }

	  /**
  	 * Inits the.
  	 */
  	public void init() {    
	    pos = new PVector();
	    float angle = 2.0f * PApplet.PI * parent.random(1);
	    float norm = 0.04f * parent.random(1);
	    speed = new PVector(norm * PApplet.cos(angle), norm  * PApplet.sin(angle));
	    age = 0;
	    ageMax = 50 + (int) parent.random(100);
	  }
	}

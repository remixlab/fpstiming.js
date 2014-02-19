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
import remixlab.fpstiming.AnimatedObject;
import remixlab.fpstiming.TimingHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class ParticleSystem.
 */
class ParticleSystem extends AnimatedObject {
	  
  	/** The nb part. */
  	int nbPart;
	  
  	/** The particle. */
  	Particle2D[] particle;
	  
  	/** The parent. */
  	PApplet parent;

	  // We need to call super(p) to instantiate the base class
	  /**
  	 * Instantiates a new particle system.
  	 *
  	 * @param p the p
  	 * @param handler the handler
  	 */
  	public ParticleSystem(PApplet p, TimingHandler handler) {
	    super(handler);
	    parent = p;
	    nbPart = 2000;
	    particle = new Particle2D[nbPart];
	    for (int i = 0; i < particle.length; i++)
	      particle[i] = new Particle2D(parent);
	    startAnimation();
	  }

	  /**
  	 * Instantiates a new particle system.
  	 *
  	 * @param p the p
  	 */
  	public ParticleSystem(PApplet p) {
	    parent = p;
	    nbPart = 2000;
	    particle = new Particle2D[nbPart];
	    for (int i = 0; i < particle.length; i++)
	      particle[i] = new Particle2D(parent);
	  }

	  // Initialization stuff could have also been performed at
	  // setup(), once after the Scene object have been instantiated

	  // Define here your animation.
	  /* (non-Javadoc)
  	 * @see remixlab.fpstiming.AnimatedObject#animate()
  	 */
  	@Override
	    public void animate() {
	    for (int i = 0; i < nbPart; i++)
	      if (particle[i] != null)
	        particle[i].animate();
	  }
	}
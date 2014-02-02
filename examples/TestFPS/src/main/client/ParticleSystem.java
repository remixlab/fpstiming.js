package main.client;

import processing.core.PApplet;
import remixlab.fpstiming.AnimatedObject;
import remixlab.fpstiming.TimingHandler;

class ParticleSystem extends AnimatedObject {
	  int nbPart;
	  Particle2D[] particle;
	  PApplet parent;

	  // We need to call super(p) to instantiate the base class
	  public ParticleSystem(PApplet p, TimingHandler handler) {
	    super(handler);
	    parent = p;
	    nbPart = 2000;
	    particle = new Particle2D[nbPart];
	    for (int i = 0; i < particle.length; i++)
	      particle[i] = new Particle2D(parent);
	    startAnimation();
	  }

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
	  @Override
	    public void animate() {
	    for (int i = 0; i < nbPart; i++)
	      if (particle[i] != null)
	        particle[i].animate();
	  }
	}
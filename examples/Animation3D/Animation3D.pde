import remixlab.fpstiming.*;

ParticleSystem system;
public TimingHandler handler;

public void setup() {
  size(640, 360, P3D);
  /**
   scene = new ParticleSystem(this);
   handler = new TimingHandler(scene);
   scene.startAnimation();
   //*/
  // /**
  handler = new TimingHandler();
  system = new ParticleSystem(this, handler);
  //*/
  smooth();
}

public void draw() {
  background(0);

  pushStyle();
  strokeWeight(3); // Default

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
  pushMatrix();
  translate(width/2, height/2, -200);
  rotateX(frameCount * PI / 500);
  rotateY(frameCount * PI / 500);    
  beginShape(POINTS);
  for (int i = 0; i < system.particle.length; i++) {
    system.particle[i].draw();
  }
  endShape();
  popMatrix();
  //*/

  popStyle();

  handler.handle();
}

public void keyPressed() {
  if ((key == 'x') || (key == 'X'))
    system.setAnimationPeriod(system.animationPeriod()-2);
  if ((key == 'y') || (key == 'Y'))
    system.setAnimationPeriod(system.animationPeriod()+2);
}

class ParticleSystem extends AnimatedObject {
  int nbPart;
  AnimatedParticle[] particle;
  PApplet parent;

  // We need to call super(p) to instantiate the base class
  public ParticleSystem(PApplet p, TimingHandler handler) {
    super(handler);
    parent = p;
    nbPart = 2000;
    particle = new AnimatedParticle[nbPart];
    for (int i = 0; i < particle.length; i++)
      particle[i] = new AnimatedParticle(parent);
    startAnimation();
  }

  /**
   public ParticleSystem(PApplet p) {
   parent = p;
   nbPart = 2000;
   particle = new AnimatedParticle[nbPart];
   for (int i = 0; i < particle.length; i++)
   particle[i] = new AnimatedParticle(parent);
   }
   */

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

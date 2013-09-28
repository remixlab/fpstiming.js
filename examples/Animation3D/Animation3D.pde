import remixlab.fpstiming.*;

ParticleSystem system;
public TimingHandler handler;

public void setup() {
  size(640, 360, P3D);
  handler = new TimingHandler();
  system = new ParticleSystem(this, handler);
  smooth();
}

public void draw() {
  background(0);
  pushStyle();
  strokeWeight(3); // Default
  beginShape(POINTS);
  for (int i = 0; i < system.particle.length; i++) {
    system.particle[i].draw();
  }
  endShape();
  popStyle();
  handler.handle();
}

public void keyPressed() {
  if ((key == 'x') || (key == 'X'))
    system.setAnimationPeriod(system.animationPeriod()-2);
  if ((key == 'y') || (key == 'Y'))
    system.setAnimationPeriod(system.animationPeriod()+2);
  if (key == '+')
    system.setParticlesAnimationPeriod(system.particlesAnimationPeriod()-2);
  if (key == '-')
    system.setParticlesAnimationPeriod(system.particlesAnimationPeriod()+2);
}

class ParticleSystem extends AnimatedObject {
  int nbPart;
  AnimatedParticle[] particle;
  PApplet parent;
  int rotation;

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

  @Override
  public void animate() {
    float orbitRadius= mouseX/2+50;
    float ypos= mouseY/3;
    float xpos= cos(radians(rotation))*orbitRadius;
    float zpos= sin(radians(rotation))*orbitRadius;
    camera(xpos, ypos, zpos, 0, 0, 0, 0, -1, 0);
    rotation++;
  }
  
  public void setParticlesAnimationPeriod(long period) {
    for (int i = 0; i < particle.length; i++)
      particle[i].setAnimationPeriod(period);
  }
  
  public long particlesAnimationPeriod() {
    return particle[0].animationPeriod();
  }
}

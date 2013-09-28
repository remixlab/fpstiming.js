public class Particle2D {
  PApplet parent;
  public PVector speed;
  public PVector pos;
  public int age;
  public int ageMax;

  public Particle2D(PApplet p) {
    parent = p;
    speed = new PVector();
    pos = new PVector();
    init();
  }

  public void animate() {
    speed.z -= 0.05f;
    pos = PVector.add(pos, PVector.mult(speed, 10f));

    if (++age == ageMax)
      init();
  }

  public void draw() {    
    parent.stroke( 255 * ((float) age / (float) ageMax), 255 * ((float) age / (float) ageMax), 255);
    parent.vertex(pos.x, pos.y);
  }

  public void init() {    
    pos = new PVector();
    float angle = 2.0f * PApplet.PI * parent.random(1);
    float norm = 0.04f * parent.random(1);
    speed = new PVector(norm * PApplet.cos(angle), norm  * PApplet.sin(angle));
    age = 0;
    ageMax = 50 + (int) parent.random(100);
  }
}
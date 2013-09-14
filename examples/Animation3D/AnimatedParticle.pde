public class AnimatedParticle extends AnimatedObject {
  PApplet parent;
  public PVector speed;
  public PVector pos;
  public int age;
  public int ageMax;

  public AnimatedParticle(PApplet p) {
    super(((Animation3D)p).handler);
    parent = p;
    speed = new PVector();
    pos = new PVector();
    init();
    //startAnimation();
  }

  @Override
  public void animate() {
    speed.z -= 0.05f;
    pos = PVector.add(pos, PVector.mult(speed, 10f));

    if (pos.z < 0.0) {
      speed.z = -0.8f * speed.z;
      pos.z = 0.0f;
    }

    if (++age == ageMax)
      init();
  }

  public void draw() {    
    parent.stroke( 255 * ((float) age / (float) ageMax), 255 * ((float) age / (float) ageMax), 255);
    parent.vertex(pos.x, pos.y, pos.z);
  }

  public void init() {    
    pos = new PVector(0.0f, 0.0f, 0.0f);
    float angle = 2.0f * PApplet.PI * parent.random(1);
    float norm = 0.04f * parent.random(1);
    speed = new PVector(norm * PApplet.cos(angle), norm  * PApplet.sin(angle), parent.random(1));
    age = 0;
    ageMax = 50 + (int) parent.random(100);
  }
}
int distX=175;
int distY=110;
PImage face;
void setup() {
  size(400,400);
  face =loadImage ("geckonator.jpg");
  face.resize(400,400);
}

void draw() {
  background(face);
  fill(#FBEDFF);
  ellipse(175,110,50,75);
  ellipse(304,110,45,80);
    fill(#000000);
  ellipse(distX,distY,10,10);
ellipse(distX+125,distY,10,9);
if(dist(mouseX,mouseY,175,110)<25){
  distX=mouseX;
  distY=mouseY;
}
}

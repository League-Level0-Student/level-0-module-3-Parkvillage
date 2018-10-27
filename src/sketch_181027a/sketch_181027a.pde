
int D=400;
int X=250;
int Y=250;

void setup(){
  size(500,500);
  //noFill();
  for(int i=0; i<=20; i++){
    if(i%2==0)
        fill(255,0,0);
    else
        fill(0,0,0);
    if(D>0){
        ellipse(X,Y,D,D);
         D=D-20;
    }
  }
  
}
void draw(){
  

}
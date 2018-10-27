int D=400;
int X1=250;
int Y1=250;
int X2=750;
int Y2=250;

void setup(){
  size(1000,500);
 
  
  
  
}
void draw(){
 background(255,255,255);
  D=400;
  for(int i=0; i<=20; i++){
     if(D>0){
        ellipse(X1,Y1,D,D);
        ellipse(X2,Y2,D,D);
        D=D-20;
    }
  }
  if(X1==1000) X1=250;
  if(X2==0)    X2=750;
  X1+=1;
  X2-=1;
}
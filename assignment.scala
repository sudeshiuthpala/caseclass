object assignment extends App{
  val p1=new Point(1,3);
  val p2=new Point(0,1);
  // p1.distance(p2);
  // println(p1+p2);
  // println(p1.invert());
}
case class Point(x:Int,y:Int){
  def move(dx:Int,dy:Int)= new Point(this.x+dx,this.y+dy)
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  def distance(p1:Point):Unit={
    var a=this.x-p1.y
    var b=this.y-p1.y
    var p= math.pow(a,2)
    var q= math.pow(b,2)
    var tot=p+q
    var f=math.pow(tot,0.5)
    println(f);
  }
  def invert()=new Point(this.y,this.x)
}

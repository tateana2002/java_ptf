package il.stqa.ptf.sandbox;

public class Point {
  double x;
  double y;
  Point(double x,double y){ // конструктор
    this.x=x;
    this.y=y;
  }

  public double distance(double x, double y) {
    double dist_x = this.x - x;
    double dist_y = this.y - y;
    return Math.sqrt(dist_x * dist_x + dist_y * dist_y);
  }
    double distance(Point p){
      return distance (p.x,p.y);

  }

  }





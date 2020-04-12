import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Point X = new Point();
        Point Y = new Point();
        X. SetPoint1();
        X. SetPoint2();
        Y. SetPoint1();
        Y. SetPoint2();
        double distance=Math.sqrt(Math.pow((X.getPoint2()-X.getPoint1()),2)+Math.pow((Y.getPoint2()-Y.getPoint1()),2));
        System. out. print(distance);
    }
}

class Point{
    private double p1;
    private double p2;
    public void SetPoint1(){
        Scanner myOb = new Scanner(System. in);
        this. p1 = myOb. nextDouble();
    }
    public void SetPoint2(){
        Scanner myOb = new Scanner(System.in);
        this. p2 = myOb. nextDouble();
    }
    public double getPoint1(){
        return this.p1;
    }
    public double getPoint2(){
        return this.p2;
    }
}
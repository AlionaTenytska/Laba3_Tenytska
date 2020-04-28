public class Formula {

    private double x;
    private double y;
    private double z;
    private double result;

    public void set(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void run(){
        result=((Math.pow(x,y+1)+Math.pow(Math.E,y-1))/(1+x*Math.abs(y-Math.tan(z))))*(1+Math.abs(y-x))+Math.pow(Math.abs(y-x),2)/2-Math.pow(Math.abs(y-x),3)/3;
    }

    public void print(){
        System.out.println("Результат: "+result);
    }


}

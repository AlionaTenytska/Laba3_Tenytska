public class Main {
    public static void main(String[] args){
        Formula zad1=new Formula();
        zad1.set(2.444,0.00869,130);
        zad1.run();
        zad1.print();

        Vector vector1=new Vector();
        vector1.setDimension(4);
        vector1.setElement(0,5);
        vector1.setElement(1,8);
        vector1.setElement(2,3);
        vector1.setElement(3,4);
        vector1.print();

        Vector vector2=new Vector();
        vector2.setDimension(4);
        vector2.setElement(0,7);
        vector2.setElement(1,8);
        vector2.setElement(2,0);
        vector2.setElement(3,5);
        vector2.print();

        Vector vector3=new Vector();
        vector3= vector2.multiply(vector1);
        vector3.print();

        Vector vector4=new Vector();
        vector4=vector1.add(vector2);
        vector4.print();

        Vector vector5=new Vector();
        vector5=vector1.divide(vector2);
        vector5.print();

        Vector vector6=new Vector();
        vector6=vector1.deduct(vector2);
        vector6.print();

    }
}

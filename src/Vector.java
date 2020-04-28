import java.util.Arrays;

public class Vector {
    private int[] array1;
    private int dim;

    public Vector(){

    }
    /**
     *
     * @param dim - size of my array1
     */

    public void setDimension (int dim){
        this.dim=dim;
        array1=new int[dim];
    }

    /**
     *
     * @param index - the element index in me array1
     * @param value - value of the element with index @param index
     */

    public void setElement(int index, int value){
        this.array1[index]=value;
    }

    /**
     *
     * @param index - element index which you want to find
     * @return element which you find
     */

    public int getElement(int index){
        return array1[index];
    }

    /**
     *
     * @param vector - the vector which you want to add to your first array
     * @return the sum of arrays
     */

    public Vector add(Vector vector) {
        Vector vector1 = new Vector();
        vector1.setDimension(dim);
        for (int i = 0; i < dim; i++) {
            vector1.array1[i] = vector.array1[i] + this.array1[i];
        }
        System.out.println("Сумма елементов двух массивов: ");
        return vector1;
    }

    /**
     *
     * @param vector - the vector which you want to multiply to your first array
     * @return the product of arrays
     */

    public Vector multiply(Vector vector){
        Vector vector1 = new Vector();
        vector1.setDimension(dim);
        for (int i = 0; i < dim; i++) {
            vector1.array1[i] = vector.array1[i] * this.array1[i];
        }
        System.out.println(" Произведение двух массиво : ");
        return vector1;
    }

    /**
     *
     * @param vector - the vector which you want to divide
     * @return the product of arrays
     */

    public Vector divide(Vector vector){
        Vector vector1 = new Vector();
        vector1.setDimension(dim);
        for (int i = 0; i < dim; i++) {
            vector1.array1[i] = vector.array1[i] / this.array1[i];
        }
        System.out.println("Деление двух массивов : ");
        return vector1;
    }

    /**
     *
     * @param vector - the vector which you want to deduct
     * @return the difference of arrays
     */
    public Vector deduct(Vector vector){
        Vector vector1 = new Vector();
        vector1.setDimension(dim);
        for (int i = 0; i < dim; i++) {
            vector1.array1[i] = vector.array1[i] - this.array1[i];
        }
        System.out.println("Разница двух массивов : ");
        return vector1;
    }

    public void print() {
        String intArrayString = Arrays.toString(this.array1);
        System.out.println("Массив:" +intArrayString);
    }

}








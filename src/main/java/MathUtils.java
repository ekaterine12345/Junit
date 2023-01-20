public class MathUtils {

    public int getSum(int... numbers){
        int sum=0;
        for(int x: numbers){
            sum+=x;
        }

//        for (int i=0; i<numbers.length; i++){
//            sum+=i;
//        }
        return sum;
    }

    public int getMultiply(int... numbers){
        int product=1;
        for(int x: numbers){
            product *= x;
        }
        return product;
    }
}

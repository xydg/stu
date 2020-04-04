package lambda;

public class LambdaTest {
//    String s = "lambda good!!!";
    public static void main(String[] args) {
//        LambdaTest lambdaTest = new LambdaTest();
        IMathListener iMathListener = Integer::sum;
        int sum = iMathListener.doMathOperator(5, 7);
        System.out.println(sum);
    }
}

package methods;

//method demo
public class methodExecution {

    public int multiPyNumbers(int a, int b) {
        int z = a * b;
        return z;
    }

    public static void main(String[] args) {

        methodExecution b = new methodExecution();
        int ans = b.multiPyNumbers(10, 3);
        System.out.println("Multiplication is :" + ans);
    }
}



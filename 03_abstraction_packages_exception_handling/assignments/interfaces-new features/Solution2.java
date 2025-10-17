/*Q: Create interface Test with abstract method myFunction. Use lambda expressions for t1 and t2.*/
interface Test {
    int myFunction(int a, int b, int c);
}

public class Solution2 {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition result: " + t1.myFunction(2, 3, 4));
        System.out.println("Multiplication result: " + t2.myFunction(2, 3, 4));
    }
}

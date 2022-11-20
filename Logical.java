package Operators;

public class Logical
{
    public static void main(String[] args)
    {
        int K=100;
        int J=50;
        System.out.println(K>J && K<J);
        System.out.println(K<J || K>J);
        System.out.println(!(!(K>J || K<J)));
        System.out.println(!(!(K>J)));
    }
}

import java.util.*;

public class Pi {
public static void main(String[] args) {
    Scanner n1 = new Scanner(System.in);
    double hit = 0;
    int num;
    System.out.println("What is the total number you want to try? ");
    num = n1.nextInt();

    for(int i = 0; i < num; i ++)
    {
        double x = Math.random();
        double y = Math.random();
        if (x * x + y * y <= 1) 
        {hit++; }
    }

    double pi;
    pi = hit *4 / num;
    System.out.println("the value of pi may be: "+ pi);
}
}

package examples;
import java.util.*;
public class dowhile {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        do {
            System.out.println(i*n);
            i++;
        }while (i<=10);

    }
}

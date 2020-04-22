import java.util.Scanner;
public class ASN {
	public static void main(String[] args) {
		int num, n, temp, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter three Digit Number");
        num = sc.nextInt();
        n = num;
        for( ;n!=0;n /= 10)
        {
            temp = n % 10;
            total = total + temp*temp*temp;
        }
        if(total == num)
        {
            System.out.println(num + " is an Armstrong number");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
	}

}

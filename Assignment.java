import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int f_num, s_num, t_num;

        System.out.println("Value for f_num:");
        f_num = input.nextInt();
        System.out.println("Value for s_num:");
        s_num = input.nextInt();
        System.out.println("Value for t_num:");
        t_num = input.nextInt();
        
        if ((f_num > s_num) == true) {
            if (f_num > t_num){
                System.out.println(f_num);
            } else {
                System.out.println(t_num);
            }
        }

        if ((f_num > s_num) == false) {
            if (s_num > t_num){
                System.out.println(s_num);
            } else {
                System.out.println(t_num);
            }
        }
    }
}
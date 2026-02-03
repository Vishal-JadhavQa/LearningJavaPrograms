package ex_02_Java_Basics;

public class Lab005_Max_Out_of_Thr
{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 9;
        int n3 = -7;

        String result = (n1 > n2) ? "n1" : (n2 > n3) ? "n2" : "n3";
        System.out.println(result);
    }
}

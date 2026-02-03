package ex_03_Java_Basics;

public class Lab006_CLI_Command_Line {
    public static void main(String[] args)
    {
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string);

        String result = (age_user_input < 18) ? "Minor" : (age_user_input <= 60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);
    }
}
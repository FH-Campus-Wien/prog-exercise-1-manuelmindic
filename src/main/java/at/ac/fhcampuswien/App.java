package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        int z1 = 'Z';
        int ox = 0xface;
        int a = 012;

        long l = 80L;
        int l1 = (int) l;

        float fl = 44e-1f;
        int fl1 = ((int) fl);

        float fl2 = 5.5f;
        int fl21 = ((int) fl2);

        double dec1 = 8.88e1;
        int dec12 = ((int) dec1);

        double do1 = 99.9;
        int do12 = (int) do1;

        int sum = z1+ox+a+l1+fl1+fl21+dec12+do12;
        System.out.println(sum);
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        int solution;
        int a;
        int b;

        Scanner sc1 = new Scanner(System.in);
        a=sc1.nextInt();
        b=sc1.nextInt();

        solution=a+b;
        System.out.println(solution);
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner sc1 = new Scanner(System.in);
        int x;
        int y;
        x=sc1.nextInt();
        y=sc1.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x=x-y;
        y=y+x;
        x=y-x;

        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int x;
        int y;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("n1: ");
        x=sc1.nextInt();

        System.out.print("n2: ");
        y=sc1.nextInt();

        if(x<y){
            System.out.println("n2 > n1");
        }

        if(x>y){
            System.out.println("n1 > n2");
        }

        if(x==y){
            System.out.println("n1 == n2");
        }
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int x;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        x=sc1.nextInt();
        if (x < 0 || x >= 100000){
            System.out.println("Invalid Revenue");
        }
        if (x >= 0 && x < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (x >= 20000 && x < 50000){
            System.out.println("Average Sales Revenue");
        }
        if (x >= 50000 && x < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (x >= 80000 && x < 100000){
            System.out.println("Excellent Sales Revenue");
        }
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        int x;
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();
        System.out.print("Enter CommissionClass: ");
        switch (x){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        int x;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Year: ");
        x = sc1.nextInt();
        if((x%4)==0 && (x%400)==0){
            System.out.println("Leapyear");
        }else{
            System.out.println("Not a Leapyear");
            return;
        }
        if((x%100)==0 && (x%400)!=0){
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        int x;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Number: ");
        x = sc1.nextInt();
        if(String.valueOf(x).length() == 3){
           int a;
           a=x%10;
           int b = x/10;
           b = b%10;
           int c = x/100;
            System.out.println(""+a+""+b+""+c);
        }
        if(String.valueOf(x).length() == 2){
            int a;
            a=x%10;
            int b = x/10;
            System.out.println(""+a+""+b+"");
        }if(String.valueOf(x).length() == 1){
            System.out.println(x);
        }
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
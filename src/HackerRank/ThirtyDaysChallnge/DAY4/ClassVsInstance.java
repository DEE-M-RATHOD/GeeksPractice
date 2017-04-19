package HackerRank.ThirtyDaysChallnge.DAY4;

import java.util.Scanner;

/**
 * Created by deepali on 25-09-2016.
 */
public class ClassVsInstance {
    private int age;

    public ClassVsInstance(int initialAge) {
        this.age = initialAge;
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }

    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            ClassVsInstance obj = new ClassVsInstance(age);
            obj.amIOld();
            for (int j = 0; j < 3; j++) {
                obj.yearPasses();
            }
            obj.amIOld();
            System.out.println();
        }
        sc.close();


    }
}

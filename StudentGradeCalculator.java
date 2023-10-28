import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the Subject1 marks : ");
        float sub1=sc.nextFloat();
        System.out.print("\nEnter the Subject2 marks : ");
        float sub2=sc.nextFloat();
        System.out.print("\nEnter the Subject3 marks : ");
        float sub3=sc.nextFloat();
        System.out.print("\nEnter the Subject4 marks : ");
        float sub4=sc.nextFloat();
        System.out.print("\nEnter the Subject5 marks : ");
        float sub5=sc.nextFloat();

        float total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total Marks : "+total);
        float avg=total/5;
        System.out.println("Average Percentage : "+avg);

        if (avg>=80){
            System.out.println("A Grade");
        }else if(avg>=60 && avg<80){
            System.out.println("B Grade");
        } else if (avg>=40 && avg<60) {
            System.out.println("C Grade");
        }else {
            System.out.println("D Grade");
        }

    }
}

import java.util.*;

public class ExpertSystem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Employee");
        String name, domain, gender;
        int n1, n2, n3, n4, n5, n6, n7, n8;
        name = sc.nextLine();

        System.out.println("In which domain " + name + "is working (web/testing/design) ");
        domain = sc.nextLine();

        System.out.println("What is the gender of " + name + " (M/F) ");
        gender = sc.nextLine();

        System.out.println("Lets evaluate the performance of " + name);
        System.out.println();

        System.out.println("What is the number of tasks successfully completed by " + name + " out of 10");
        n1 = sc.nextInt();

        System.out.println("What is the average hours " + name + " has worked each week ");
        n2 = sc.nextInt();

        System.out.println("What is the salary of " + name + " per year ");
        n3 = sc.nextInt();

        System.out.println("What is the previous rating of " + name + " out of 5 ");
        n4 = sc.nextInt();

        System.out.println("How many presentation does " + name + " given last year");
        n5 = sc.nextInt();

        System.out.println("What is the age of the employee");
        n6 = sc.nextInt();

        System.out.println("What is the experience of " + name + " ");
        n7 = sc.nextInt();

        System.out.println("How many leave " + name + " has taken last year");
        n8 = sc.nextInt();

        sc.close();

        int rat = 0;

        if (n5 >= 10){
            rat++;
        }
        if (n8 <= 20){
            rat++;
        }
        if (n1 > 8){
            rat += 2;
        }
        if (n2 > 49){
            rat++;
        }

        System.out.println("The evaluation of " + name );
        System.out.println("This year rating is " + rat);

        if (gender == "M"){
            if (domain == "web"){
                if (n2 >= 37 && n1 >= 7){
                    if (n3 <= 800000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }

                    else{
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
                else{
                    if (n3 >= 1500000){
                        System.out.println("Acccording to the performance of "+name+" the salary should be decremented by 100000");
                    }
                    else{
                        System.out.println("Acccording to the performance of "+name+" the salary should remain same");
                    }
                }
            }
            else if (domain == "testing"){
                if (n2 >= 40 && n1 > 8){
                    if (n3 <= 500000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }

                    else{
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
                else{
                    if (n3 >= 1000000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be decremented by 100000");
                    }
                    else{
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
            }
            else if (domain == "design"){
                if (n2 >= 37 && n1 > 6){
                    if (n3 <= 1000000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }

                    else
                    {
                        System.out.println("Acccording to the performance of " + name +" the salary should remain same");
                    }
                }
                else
                {
                    if (n3 > 1800000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be decremented by 100000");
                    }
                    else{
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
            }
            if (rat > n4){
                System.out.println("The rating of " + name + " has increased. He has performed well this year");
            }
            else if (rat < n4 && n6 < 25){
                System.out.println("The employee has underperformed but can be trained for effective performance");
            }
            else if (rat < n4 && n6 > 25){
                System.out.println("The employee has underperformed and proved to be unproductive for the company");
            }
            else{
                System.out.println("The performance of the employee is maintained");
            }
            if (n7 > 8 && n4 == 5){
                System.out.println(name + " should get a promotion in the company");
            }
        }
        if (gender == "F"){
            if (domain == "web"){
                if (n2 >= 30 && n1 > 7){
                    if (n3 <= 800000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }
                    else if (n3 >= 1500000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be decremented by 100000");
                    }
                    else{
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
            }
            else if (domain == "testing")
            {
                if (n2 >= 35 && n1 > 8){
                    if (n3 <= 500000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }
                    else if (n3 >= 1000000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be decremented by 100000");
                    }
                    else
                    {
                        System.out.println("Acccording to the performance of " + name + " the salary should remain same");
                    }
                }
            }
            else if (domain == "design"){
                if (n2 >= 32 && n1 > 6){
                    if (n3 <= 1000000){
                        System.out.println("Acccording to the performance of " + name + " the salary should be incremented by 100000");
                    }
                    else if (n3 > 1800000)
                    {
                        System.out.println("Acccording to the performance of " + name + " the salary should be decremented by 100000");
                    }
                    else
                    {
                        System.out.println("Acccording to the performance of " + name + " the salaray should remain same");
                    }
                }
            }
            if (rat > n4){
                System.out.println("The rating of "+name+" has increased. He has performed well this year");
            }
            else if (rat < n4 && n6 < 25){
                System.out.println("The employee has underperformed but can be trained for effective performance");
            }
            else if (rat < n4 && n6 > 25){
                System.out.println("The employee has underperformed and proved to be unproductive for the company");
            }
            else{
                System.out.println("The performance of the employee is maintained");
            }
            if (n7 > 8 && n4 == 5){
                System.out.println(name + " should get a promotion in the company");
            }
        }
    }
}
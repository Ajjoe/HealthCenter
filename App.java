import java.util.Scanner;

class Staff {
    String firstName;
    String lastName;
    String gender;
    String phone;
    int age;
    String department;
    Double weeklyHours;
    Double payRate;
    String jobTitle;
    Double yearpay;
    Double payperweek;
    public Staff(Scanner scnr) {
        System.out.println("Please enter your first name: ");
        firstName = scnr.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = scnr.nextLine();
        System.out.println("Please enter your Gender M/F: ");
        gender = scnr.nextLine();
        System.out.println("Please input your phone number in the (111)-111-1111 format: ");
        phone = scnr.nextLine();
        System.out.println("Please enter your year of birth: ");
        age = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character
        System.out.println("Please enter department: ");
        department = scnr.nextLine();
        System.out.println("Please enter weekly hours: ");
        weeklyHours = scnr.nextDouble();
        System.out.println("Please enter pay rate: ");
        payRate = scnr.nextDouble();
        scnr.nextLine(); // Consume
        System.out.print("Please enter job Title: ");
        jobTitle = scnr.nextLine();
        // Consume
        if(weeklyHours > 40){
         payperweek = (payRate * 40);
         weeklyHours = weeklyHours - 40;
         payperweek = (payperweek + (weeklyHours * (payRate * 1.5)));
        } else{
        payperweek = (weeklyHours * payRate);}
        yearpay = (payperweek * 52);
    }

    public void printDetails() {
        System.out.println("Year you were born: " + age);
        System.out.println("Last name: " + lastName);
        System.out.println("First name: " + firstName);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Hours: " + weeklyHours);
        System.out.println("Rate: " + payRate);
        System.out.println("Weekly pay: " + payperweek );
        System.out.println("Yearly pay: " + yearpay);
        System.out.println("Pay after tax: " + (yearpay - (yearpay * .05)));
        System.out.println("Phone: " + phone);
        System.out.println("Job: " + jobTitle );
        System.out.println("Age in 2024: " + (2024 - age) );
        if (jobTitle.equalsIgnoreCase("Doctor")) {
            System.out.println(firstName + " " + lastName + " is a doctor");}


    }
}

class Patient {
    String firstName;
    String lastName;
    int age;
    String gender;
    String phone;
    Double weight;
    double height;
    int heart;
    int resrate;
    int hirate;
    int lowrate;
    String allergies;
    float staff1star;
    float staff2star;
    float staff3star;
    double power;
    double temp;
    double BMI;




    public Patient(Scanner scnr) {
        System.out.println("Hello patient, please enter your first name: ");
        firstName = scnr.nextLine();
        System.out.println("Hello " + firstName + ", please enter your last name: ");
        lastName = scnr.nextLine();
        System.out.println("Hello " + firstName + ", please enter your age: ");
        age = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character
        System.out.println("Hello " + firstName + ", please enter your gender M/F: ");
        gender = scnr.nextLine();
        System.out.println("Hello " + firstName + ", please enter your phone number: ");
        phone = scnr.nextLine();
        System.out.println("Please input your weight: ");
        weight = scnr.nextDouble();
        System.out.println("Please input your height in inches: ");
        height = scnr.nextDouble();
        System.out.println("please input your temprature in C :" );
        temp = scnr.nextDouble();
        System.out.println("Please input your heartrate: ");
        heart = scnr.nextInt();
        System.out.println("Please input your high blood pressure: ");
        hirate = scnr.nextInt();
        System.out.println("Please input your low blood pressure:");
        lowrate = scnr.nextInt();
        System.out.println("Please input your respiratory rate: ");
        resrate = scnr.nextInt();
        System.out.println("Please input your rating of Staff member 1");
        staff1star = scnr.nextFloat();
        System.out.println("Please input your rating of Staff member 2");
        staff2star = scnr.nextFloat();
        System.out.println("Please input your rating of Staff member 3");
        staff3star = scnr.nextFloat();
        power = Math.pow(height, 2);
        BMI = ((weight / power ) * 730.0);
        scnr.nextLine();
    

    }

    public void printDetails() {
        System.out.println("Patient name: " + firstName + " " + lastName);
        System.out.println("DOB :" + age);
        System.out.println("Age :" + (2024 - age));
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("height: " + height);
        System.out.println("heartrate: " + heart);
        System.out.println("Your BMI is: " + BMI);
        System.out.println("High blood pressure: " + hirate );
        System.out.println("low blood pressure: " + lowrate );
        System.out.println("respiratory rate: " + resrate );
        if (hirate < 120) {
            system.out.println(" This patient has normal blood pressure ");}
            else if(hirate > 120) { 
            System.out.println("This patient has a elevated blood pressure");
            } else if(hirate < 130 && hirate > 120 )
            {System.out.println("This patient has a high blood pressure");}
            else if(hirate < 140 && hirate > 130 )
            {System.out.println("This patient has a high Blood pressure(stage 2) blood pressure");}
            else if (hirate < 180 && hirate > 140)
            {System.out.println("This patient has a elevated blood pressure");}
        System.out.println("Temp in F°:" + ((temp * 9.0)/ 5.0) + "F°");
        if(BMI < 18.5) {System.out.println("Weight class: Underweight");}
        else if(BMI > 18.5 && BMI < 24.9){System.out.println("Weight class: Healthy");} 
        else if(BMI > 25.0 && BMI < 29.9){System.out.println("Weight class: overweight");}
        else if(BMI > 30){System.out.println("Weight class: Obese");}
        System.out.println("Staff 1 rating: " + staff1star );
        System.out.println("Staff 2 rating: " + staff2star );
        System.out.println("Staff 3 rating: " + staff3star );
///Part 2 additions have **
        

    }
}
public class App {
    private static void printSeparator() {
        System.err.println("   ");
    }

    public static void main(String[] args) throws Exception {
    
       
        Scanner scnr = new Scanner(System.in);

        // Staff 1 info
        Staff staff1 = new Staff(scnr);

        // Staff 2 info
        printSeparator();
        Staff staff2 = new Staff(scnr);

        // Staff 3 info
        System.out.println("  ");
        Staff staff3 = new Staff(scnr);
        // Patients info
        printSeparator();
        Patient patient1 = new Patient(scnr);
        printSeparator();
        Patient patient2 = new Patient(scnr);
        printSeparator();
        Patient patient3 = new Patient(scnr);
        
        double averstar1 = ((patient1.staff1star + patient1.staff2star + patient1.staff3star) / 3);
        double averstar2 = ((patient2.staff1star + patient2.staff2star + patient2.staff3star) / 3);
        double averstar3 = ((patient1.staff1star + patient1.staff2star + patient1.staff3star) / 3);
        double averageYearlyPay = (staff1.yearpay + staff2.yearpay + staff3.yearpay) / 3;
        
        // Print staff details
        System.out.println("  Staff 1 ");
        staff1.printDetails();
       // staff1.department()
        System.out.println("  ");


        System.out.println("  Staff 2 ");
        staff2.printDetails();
        System.out.println("  ");

        System.out.println("  Staff 3 ");
        staff3.printDetails();
        System.out.println("  ");
        Double averageyearlypay;
        Double yearlytotal = staff1.yearpay + staff2.yearpay + staff3.yearpay;
        averageyearlypay = ((staff1.yearpay + staff2.yearpay + staff3.yearpay) / 3);
        // Print patient details
        System.out.println("Patient 1 details: ");
        patient1.printDetails();   
        printSeparator();
        System.out.println("Patient 2 details: ");
        patient2.printDetails();
        printSeparator();
        System.out.println("Patient 3 details: ");
        patient3.printDetails();
        printSeparator();
        Double aveweight = (patient1.weight + patient2.weight + patient3.weight) / 3;
        Double aveheight = (patient1.height + patient2.height + patient3.height) / 3;
        printSeparator();
       
       
       
       
        /// yearly averages and totals
        System.out.println("    Yearly totals   ");
        double lowestSalary = Math.min(staff1.yearpay, Math.min(staff2.yearpay, staff3.yearpay));
        double highestSalary = Math.max(staff1.yearpay, Math.max(staff2.yearpay, staff3.yearpay));
  // Determine staff members with lowest and highest salaries
  
  
  String staffWithLowestSalary = null;
  String staffWithHighestSalary = null;
  if (staff1.yearpay == lowestSalary) {
      staffWithLowestSalary = staff1.firstName + " " + staff1.firstName;
  } else if (staff2.yearpay == lowestSalary) {
      staffWithLowestSalary = staff2.firstName + " " + staff2.firstName;
  } else if (staff3.yearpay == lowestSalary) {
      staffWithLowestSalary = staff3.firstName + " " + staff3.firstName;
  }

  if (staff1.yearpay == highestSalary) {
      staffWithHighestSalary = staff1.firstName + " " + staff1.lastName;
  } else if (staff2.yearpay == highestSalary) {
      staffWithHighestSalary = staff2.firstName+ " " + staff2.lastName;
  } else if (staff3.yearpay == highestSalary) {
      staffWithHighestSalary = staff3.firstName+ " " + staff3.lastName;
  }

  // Print lowest and highest yearly salaries along with staff names
  
        System.out.println("Staff member with lowest yearly salary: " + staffWithLowestSalary + " - $" + lowestSalary);
        System.out.println("Staff member with highest yearly salary: " + staffWithHighestSalary + " - $" + highestSalary);
        System.out.println("yearly pay: " + yearlytotal);
        System.out.println("yearly budget: " + (averageyearlypay * 100));
        System.out.println("Average weight of patients: " + (aveweight / 3.0));
        System.out.println("Average height of patients: " + (aveheight / 3.0));
        System.out.println("    ");
        System.out.println(" Overall ratings  ");
        System.out.println("Ratings of" + staff1.firstName + " : " + averstar1);
        System.out.println("Ratings of" + staff2.firstName + " : " + averstar2);
        System.out.println("Ratings of" + staff3.firstName + " : " + averstar3);
        
        
        
        if (averstar1 >= 5){
            System.out.println(staff1.firstName + " has excellent service");
        } else if(averstar1 < 5 && averstar1 > 3) {
            System.out.println(staff1.firstName + " has good service");
        } else if(averstar1 < 3) {
            System.out.println(staff1.firstName +" has bad service");
        }
        if (averstar2 >= 5){
            System.out.println(staff2.firstName + " has excellent service");
        } else if(averstar2 < 5 && averstar2 > 3) {
            System.out.println(staff2.firstName + " has good service");
        } else if(averstar2 < 3) {
            System.out.println(staff2.firstName +" has bad service");
        }
        if (averstar2 >= 5){
            System.out.println(staff2.firstName + " has excellent service");
        } else if(averstar2 < 5 && averstar2 > 3) {
            System.out.println(staff2.firstName + " has good service");
        } else if(averstar2 < 3) {
            System.out.println(staff2.firstName +" has bad service");
        }
        scnr.close();
    }
}
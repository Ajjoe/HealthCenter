import java.util.Scanner;

class Staff {
    String[] firstName;
    String[] lastName;
    String[] gender;
    String[] phone;
    int[] age;
    String[] department;
    Double[] weeklyHours;
    Double[] payRate;
    String[] jobTitle;
    Double[] yearpay;
    Double[] payperweek;

    public Staff(Scanner scnr) {
        System.out.println("Please enter the amount of Staff members:");
        int staffNum = scnr.nextInt();
        scnr.nextLine(); // consume newline
        firstName = new String[staffNum];
        lastName = new String[staffNum];
        gender = new String[staffNum];
        phone = new String[staffNum];
        age = new int[staffNum];
        department = new String[staffNum];
        weeklyHours = new Double[staffNum];
        payRate = new Double[staffNum];
        jobTitle = new String[staffNum];
        yearpay = new Double[staffNum];
        payperweek = new Double[staffNum];

        for (int i = 0; i < staffNum; i++) {
            System.out.println("Please enter details for Staff member " + (i + 1) + ":");
            System.out.println("Please enter your first name: ");
            firstName[i] = scnr.nextLine();
            System.out.println("Please enter your last name: ");
            lastName[i] = scnr.nextLine();
            System.out.println("Please enter your Gender M/F: ");
            gender[i] = scnr.nextLine();
            System.out.println("Please input your phone number in the (111)-111-1111 format: ");
            phone[i] = scnr.nextLine();
            System.out.println("Please enter your year of birth: ");
            age[i] = 2024 - scnr.nextInt();
            scnr.nextLine(); // Consume the newline character
            System.out.println("Please enter department: ");
            department[i] = scnr.nextLine();
            System.out.println("Please enter weekly hours: ");
            weeklyHours[i] = scnr.nextDouble();
            System.out.println("Please enter pay rate: ");
            payRate[i] = scnr.nextDouble();
            scnr.nextLine(); // Consume
            System.out.print("Please enter job Title: ");
            jobTitle[i] = scnr.nextLine();
            // Calculate other fields
            if (weeklyHours[i] > 40) {
                payperweek[i] = (payRate[i] * 40);
                weeklyHours[i] -= 40;
                payperweek[i] = (payperweek[i] + (weeklyHours[i] * (payRate[i] * 1.5)));
            } else {
                payperweek[i] = (weeklyHours[i] * payRate[i]);
            }
            yearpay[i] = (payperweek[i] * 52);
        }
    }

    public void printDetails() {
        for (int i = 0; i < firstName.length; i++) {
            System.out.println("Staff member " + (i + 1) + " details:");
            System.out.println("Year you were born: " + age[i]);
            System.out.println("Last name: " + lastName[i]);
            System.out.println("First name: " + firstName[i]);
            System.out.println("Gender: " + gender[i]);
            System.out.println("Department: " + department[i]);
            System.out.println("Hours: " + weeklyHours[i]);
            System.out.println("Rate: " + payRate[i]);
            System.out.println("Weekly pay: " + payperweek[i]);
            System.out.println("Yearly pay: " + yearpay[i]);
            System.out.println("Pay after tax: " + (yearpay[i] - (yearpay[i] * .05)));
            System.out.println("Phone: " + phone[i]);
            System.out.println("Job: " + jobTitle[i]);
            System.out.println("Age in 2024: " + age[i]);
            System.out.println();
            if (jobTitle[i].toLowerCase().contains("Doctor")){
                System.out.println(firstName[i] + "is a Doctor ");
            }
        }
    }
}

class Patient {
    String[] firstName;
    String[] lastName;
    int[] age;
    String[] gender;
    String[] phone;
    Double[] weight;
    double[] height;
    int[] heart;
    int[] resrate;
    int[] hirate;
    int[] lowrate;
    String[] allergies;
    float[] ratings; // Changed this from staff1star, staff2star, staff3star

    public Patient(Scanner scnr) {
        System.out.println("Please enter the number of Patients:");
        int patientNum = scnr.nextInt();
        scnr.nextLine(); // consume newline
        firstName = new String[patientNum];
        lastName = new String[patientNum];
        age = new int[patientNum];
        gender = new String[patientNum];
        phone = new String[patientNum];
        weight = new Double[patientNum];
        height = new double[patientNum];
        heart = new int[patientNum];
        resrate = new int[patientNum];
        hirate = new int[patientNum];
        lowrate = new int[patientNum];
        allergies = new String[patientNum];
        ratings = new float[patientNum]; // Initialize ratings array
        double[] temp = new double[patientNum];
        double[] bMI = new double[patientNum];

        for (int i = 0; i < patientNum; i++) {
            System.out.println("Please enter details for Patient " + (i + 1) + ":");
            System.out.println("Hello patient, please enter your first name: ");
            firstName[i] = scnr.nextLine();
            System.out.println("Hello " + firstName[i] + ", please enter your last name: ");
            lastName[i] = scnr.nextLine();
            System.out.println("Hello " + firstName[i] + ", please enter your DOB: ");
            age[i] = 2024 - scnr.nextInt();
            scnr.nextLine(); // Consume the newline character
            System.out.println("Hello " + firstName[i] + ", please enter your gender M/F: ");
            gender[i] = scnr.nextLine();
            System.out.println("Hello " + firstName[i] + ", please enter your phone number: ");
            phone[i] = scnr.nextLine();
            System.out.println("Please input your weight: ");
            weight[i] = scnr.nextDouble();
            System.out.println("Please input your height in inches: ");
            height[i] = scnr.nextDouble();
            System.out.println("please input your temprature in C :");
            temp[i] = scnr.nextDouble();
            System.out.println("Please input your heartrate: ");
            heart[i] = scnr.nextInt();
            System.out.println("Please input your high blood pressure: ");
            hirate[i] = scnr.nextInt();
            System.out.println("Please input your low blood pressure:");
            lowrate[i] = scnr.nextInt();
            System.out.println("Please input your respiratory rate: ");
            resrate[i] = scnr.nextInt();
            System.out.println("Please input your rating for the staff (1-5): ");
            ratings[i] = scnr.nextFloat(); // Store rating in ratings array
            scnr.nextLine(); // Consume newline

            Double power = Math.pow(height[i], 2);
            bMI[i] = ((weight[i] / power) * 730.0);
        }
    }

    public void printDetails() {
        for (int i = 0; i < firstName.length; i++) {
            System.out.println("Patient " + (i + 1) + " details:");
            System.out.println("Patient name: " + firstName[i] + " " + lastName[i]);
            System.out.println("DOB :" + age[i]);
            System.out.println("Age :" + (2024 - age[i]));
            System.out.println("Gender: " + gender[i]);
            System.out.println("Phone number: " + phone[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println("height: " + height[i]);
            System.out.println("heartrate: " + heart[i]);
            System.out.println("Your BMI is: " + bMI[i]);
            System.out.println("High blood pressure: " + hirate[i]);
            System.out.println("low blood pressure: " + lowrate[i]);
            System.out.println("respiratory rate: " + resrate[i]);
            if (hirate[i] < 120) {
                System.out.println(" This patient has normal blood pressure ");
            } else if (hirate[i] >= 120 && hirate[i] < 130) {
                System.out.println("This patient has a elevated blood pressure");
            } else if (hirate[i] >= 130 && hirate[i] < 140) {
                System.out.println("This patient has a high blood pressure");
            } else if (hirate[i] >= 140 && hirate[i] < 180) {
                System.out.println("This patient has a high Blood pressure(stage 2) blood pressure");
            } else if (hirate[i] >= 180) {
                System.out.println("Seek medical attention");
            }
            System.out.println("Temp in F°:" + ((temp[i] * 9.0) / 5.0 + 32) + "F°");
            if (bMI[i] < 18.5) {
                System.out.println("Weight class: Underweight");
            } else if (bMI[i] >= 18.5 && bMI[i] < 24.9) {
                System.out.println("Weight class: Healthy");
            } else if (bMI[i] >= 25.0 && bMI[i] < 29.9) {
                System.out.println("Weight class: overweight");
            } else if (bMI[i] >= 30) {
                System.out.println("Weight class: Obese");
            }
        }
    }

    public float getAverageRating() {
        float sum = 0;
        for (float rating : ratings) {
            sum += rating;
        }
        return sum / ratings.length;
    }
}

public class App {
    private static void printSeparator() {
        System.out.println("   ");
    }

    public static void main(String[] args) throws Exception { //Everything gets printed
        Scanner scnr = new Scanner(System.in);
        Staff staff = new Staff(scnr);
        staff.printDetails();
        System.out.println("__________");

        Patient patient = new Patient(scnr);
        patient.printDetails();
        System.out.println("____________1");

        scnr.close();

        double yearlytotal = 0;
        for (double yearpay : staff.yearpay) {
            yearlytotal += yearpay;
        }

        printSeparator();

        double aveweight = 0;
        double aveheight = 0;
        for (int i = 0; i < patient.weight.length; i++) {
            aveweight += patient.weight[i];
            aveheight += patient.height[i];
        }
        aveweight /= patient.weight.length;
        aveheight /= patient.height.length;

        printSeparator();
        System.out.println("    Yearly totals   ");
        double lowestSalary = Double.MAX_VALUE;
        double highestSalary = Double.MIN_VALUE;
        String staffWithLowestSalary = null;
        String staffWithHighestSalary = null;

        for (int i = 0; i < staff.yearpay.length; i++) {
            if (staff.yearpay[i] < lowestSalary) {
                lowestSalary = staff.yearpay[i];
                staffWithLowestSalary = staff.firstName[i] + " " + staff.lastName[i];
            }
            if (staff.yearpay[i] > highestSalary) {
                highestSalary = staff.yearpay[i];
                staffWithHighestSalary = staff.firstName[i] + " " + staff.lastName[i];
            }
        }

        System.out.println("Staff member with lowest yearly salary: " + staffWithLowestSalary + " - $" + lowestSalary);
        System.out.println("Staff member with highest yearly salary: " + staffWithHighestSalary + " - $" + highestSalary);
        System.out.println("Yearly pay total: " + yearlytotal);
        System.out.println("Yearly budget:" + (yearlytotal * 1.2)); // Assuming 20% extra for budget
        System.out.println("Average weight of patients: " + aveweight);
        System.out.println("Average height of patients: " + aveheight);
        System.out.println("    ");
        System.out.println(" Overall ratings  ");

        float averageRating = patient.getAverageRating();
        System.out.println("Average rating for staff: " + averageRating);

        if (averageRating >= 5) {
            System.out.println("The staff has excellent service");
        } else if (averageRating >= 3 && averageRating < 5) {
            System.out.println("The staff has good service");
        } else {
            System.out.println("The staff has bad service");
        }
    }
}
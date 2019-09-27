package patientintake;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClinicMain {
    private static ClinicCalender calender;

    public static void main(String[] args) throws Throwable {
        calender = new ClinicCalender();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Patient Intake Computer System!\n\n");
        String lastOption = "";
        while (!lastOption.equalsIgnoreCase("x")){
            lastOption = displayMenu(scanner);
        }
        System.out.println("\nExiting System.....\n");

    }

    private static String displayMenu(Scanner scanner) throws Throwable{
        System.out.println("Please Select an option :");
        System.out.println("1. Enter a Patient Appointment.. ");
        System.out.println("2. View All Appointments.. ");
        System.out.println("x Exit System ");
        System.out.print("Option: ");
        String option = scanner.next();
        switch (option){
            case "1": performPatientEntry(scanner);
                return option;
            case "2": perFormAllAppointments();
                return option;
            default:
                System.out.println("Invalid option , please reenter,");
                return option;
        }
    }


    private static void performPatientEntry(Scanner scanner){
        scanner.nextLine();
        System.out.println("\n\n Please Enter Appointment Info :");
        System.out.print("Patient Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Patient First Name: " );
        String firstName = scanner.nextLine();
        System.out.print("Appointment Date (M/D/yyyy h:mm a)");
        String when = scanner.nextLine();
        System.out.print("  Doctor Last Name: ");
        String doc = scanner.nextLine();
        try{
            calender.addAppointment(firstName,lastName,doc, when);

           } catch (Throwable t){
           System.out.println("Error! " + t.getMessage());
           return;
    }
        System.out.println("Patient entered successfully. \n\n");
    }

        private static void perFormAllAppointments() throws Throwable{
            System.out.println("\n\nAll Appointments in System: ");
            for (PatientAppointment appointment : calender.getAppointments()){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("m/d/yy hh:mm a");
                String appTime = formatter.format(appointment.getAppointmentDateTime());
                System.out.println(String.format("%s %s, %s\t\tDoctor: %s", appTime,appointment.getPatientLastName(),appointment.getPatientFirstName(), appointment.getDoctor().getName()));
            }
            System.out.println("\nPress any key to continue ......");

        }
}

package week2.projektmunka01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Office office = new Office();

    public void readOffice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány tárgyalót szeretne rögzíteni?");
        int numberOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < numberOfMeetingRooms; i++){
            System.out.println(i + ". tárgyaló neve:");
            String name = scanner.nextLine();
            System.out.println(i + ". tárgyaló szélessége méterben:");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.println(i + ". tárgyaló hossza méterben:");
            int length = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }
    }

    public void printMenu(){
        System.out.println("Válassz az alábbi menüpontok közül:");
        System.out.println();
        List<String> menu = new ArrayList<>();
        menu.add("1. Tárgyalók sorrendben");
        menu.add("2. Tárgyalók visszafele sorrendben");
        menu.add("3. Minden második tárgyaló");
        menu.add("4. Területek");
        menu.add("5. Keresés név alapján");
        menu.add("6. Keresés névtöredék alapján");
        menu.add("7. Keresés terület alapján");

        for(int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        int menuSelected = scanner.nextInt();
        scanner.nextLine();

        switch (menuSelected){
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEvenNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("Melyik tárgyalót keresed?");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                break;
            case 6:
                System.out.println("Melyik tárgyalót keresed?");
                String part = scanner.nextLine();
                office.meetingRoomsContains(part);
                break;
            case 7:
                System.out.println("Hány nm-nél nagyobb tárgyalót keresel?");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreaLargerThan(area);
                break;
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }


}

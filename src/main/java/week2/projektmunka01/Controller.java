package week2.projektmunka01;

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

    }


}

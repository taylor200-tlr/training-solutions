package week2.projektmunka01;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom (MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }
    public void printNames(){
        for (int i = 0; i < meetingRooms.size(); i++){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printNamesReverse(){
        for (int i = meetingRooms.size() - 1; i < 0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printEvenNames(){
        for (int i = 0; i < meetingRooms.size(); i=i+2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }
    public void printAreas (){
        for (int i = 0; i < meetingRooms.size(); i++){
            System.out.println(meetingRooms.get(i).getName() + " - " + meetingRooms.get(i).getArea() + "nm");
        }
    }
    public void printMeetingRoomsWithName(String name){
        for (int i = 0; i < meetingRooms.size(); i++){
            if (meetingRooms.get(i).getName().equals(name)){
                printMeetingRoomData(i);
            }
        }
    }
    public void meetingRoomsContains(String part){
        for (int i = 0; i < meetingRooms.size(); i++){
            if (meetingRooms.get(i).getName().indexOf(part) < 0){
                printMeetingRoomData(i);
            }
        }
    }
    public void printAreaLargerThan(int area){
        for (int i = 0; i < meetingRooms.size(); i++){
            if (meetingRooms.get(i).getArea() > area){
                printMeetingRoomData(i);
            }
        }
    }
    public void printMeetingRoomData(int index){
        System.out.println(meetingRooms.get(index).getWidth() + "m * " +
                meetingRooms.get(index).getLength() + "m * "+
                meetingRooms.get(index).getArea() + "nm");
    }
}

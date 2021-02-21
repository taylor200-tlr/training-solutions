package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1980);
        client.setAddress("Budapest");

        System.out.println(client.getName() + " " + client.getYear() + " " + client.getAddress());
        client.migrate("Debrecen");

        System.out.println(client.getName() + " " + client.getYear() + " " + client.getAddress());
    }


}

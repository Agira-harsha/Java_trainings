package Java8features.streams;

import java.util.*;

public class PlayerRunner {
    static List<Player> usa = new ArrayList<>(PlayersData.usa());
    static List<Player> south = new ArrayList<>(PlayersData.south());
    static List<Player> india = new ArrayList<>(PlayersData.india());

    public static void main(String[] args) {

           DMLOperations();
    }


    public static void addPlayer() {
        System.out.println("enter country Name");
        String country = new Scanner(System.in).next();
        switch (country) {
            case "india":
                Player players1 = enterPlayer();
                india.add(players1);
                System.out.println("Player is successfully Added to the India...");
                break;
            case "usa":
                Player player2 = enterPlayer();
                usa.add(player2);
                System.out.println("Player is successfully Added to the USA...");
                break;
            case "south":
                Player player3 = enterPlayer();
                south.add(player3);
                System.out.println("Player is successfully Added to the South...");
                break;
            default:
                System.err.println("Country not supported: " + country);
                System.out.println("please enter these countries.\n 1.india \n 2.usa \n 3.south");
                addPlayer();
        }
    }

    static Player enterPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player Name:");
        String playerName = scanner.nextLine();
        System.out.println("Enter Player Age:");
        int age = 0;
        try {
            age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
            enterPlayer();
        }
        return new Player(playerName, age);
    }


    public static void removePlayer() {
        System.out.println("removing a player.");
        System.out.println("Enter the Country Name:");
        String country = new Scanner(System.in).nextLine();
        System.out.println("Enter the playername:");
        String playerName = new Scanner(System.in).nextLine();
        switch (country) {
            case "india":
                if (!india.removeIf(player -> player.getName().equalsIgnoreCase(playerName))) {
                    System.err.println("player is Not Found..");
                } else {
                    System.out.println("player has remove successfully");
                }
                break;
            case "usa":
                if (!usa.removeIf(player -> player.getName().equalsIgnoreCase(playerName))) {
                    System.err.println("Player  is Not Found..");
                } else {
                    System.out.println("Player removed successfully..");
                }
                break;
            case "south":
                if (!south.removeIf(player -> player.getName().equalsIgnoreCase(playerName))) {
                    System.err.println("Player is Not Found..");
                } else {
                    System.out.println("Player removed successfully..");
                }
                break;
            default:
                System.err.println("Country not supported: " + country);
                System.out.println("please enter these countries.\n 1.india \n 2.usa \n 3.south");
                removePlayer();
        }
    }

    static boolean updatePlayerInList(List<Player> playerList, String playerName, Player updatedPlayer) {
        for (int i = 0; i < playerList.size(); i++) {
            Player player = playerList.get(i);
            if (player.getName().equalsIgnoreCase(playerName)) {
                playerList.set(i, updatedPlayer);
                return true;
            }
        }
        return false;
    }

    public static void updatePlayer() {
        System.out.println("Updating a player.");
        System.out.println("Enter the Country Name:");
        String country = new Scanner(System.in).nextLine();
        System.out.println("Enter the exisiting palyer name:");
        String playerName = new Scanner(System.in).nextLine();
        System.out.println("enter the details for updating");

        Player updatedPlayer = enterPlayer(); // Get updated player details

        switch (country) {
            case "india":
                boolean indiaUpdated = updatePlayerInList(india, playerName, updatedPlayer);
                if (indiaUpdated) {
                    System.out.println("Player updated successfully in India.");
                } else {
                    System.err.println("Player not found in India.");
                }
                break;
            case "usa":
                boolean usaUpdated = updatePlayerInList(usa, playerName, updatedPlayer);
                if (usaUpdated) {
                    System.out.println("Player updated successfully in USA.");
                } else {
                    System.err.println("Player not found in USA.");
                }
                break;
            case "south":
                boolean southUpdated = updatePlayerInList(south, playerName, updatedPlayer);
                if (southUpdated) {
                    System.out.println("Player updated successfully in South.");
                } else {
                    System.err.println("Player not found in South.");
                }
                break;
            default:
                System.err.println("Country not supported: " + country);
                System.out.println("Please enter one of these countries: India, USA, South");
                updatePlayer();
        }
    }

    public static void displayingDetails() {
        System.out.println("Choose for Player Details:");
        System.out.println("1.All player details\n2.India Player details\n3.USA player details\n4.South players details");
        byte value = 0;
        try {
            value = new Scanner(System.in).nextByte();
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        switch (value) {
            case 1:
                List<List<Player>> allPlayersdetails = Arrays.asList(india, usa, south);
                System.out.println("All Players Details..");
                allPlayersdetails.stream().flatMap(player -> player.stream()).forEach(System.out::println);
                break;
            case 2:
                System.out.println("Indian Player Details..");
                india.forEach(System.out::println);
                break;

            case 3:
                System.out.println("USA Player Details..");
                usa.forEach(System.out::println);
                break;

            case 4:
                System.out.println("South Africa Player Details..");
                south.forEach(System.out::println);
                break;

            default:
                System.err.println("Enter Correct number ...Below options!");
                displayingDetails();
        }


    }
    public static void DMLOperations(){
        while (true){
            System.out.println("**** CRUD Operations *****\n");
            System.out.println("1.Adding a player\n2.Removing a player \n3.Updating a player \n4.Retriving players\n5.exit");
            byte value=0;
            try{
                value=new Scanner(System.in).nextByte();
            }
            catch (InputMismatchException e){
                System.err.println(e.getMessage());
            }
            switch (value){
                case 1:
                    addPlayer();
                    break;
                case 2:
                    removePlayer();
                    break;
                case 3:
                    updatePlayer();
                    break;
                case 4:
                    displayingDetails();
                    break;
                case 5:
                    System.out.println("**** Thank You Teams *****");
                    System.exit(0);


            }
        }
    }
}

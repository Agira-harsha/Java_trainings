package ReaderAndWriter;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CityLocations {

    private static final String FILE_PATH = "data.txt";
    private static Map<String, String> dataMap = new HashMap<>();

    public void loadFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    dataMap.put(parts[0], parts[1]);
                } else {
                    System.out.println("Data not found :");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {

            System.err.println("Error loading data from file: " + e.getMessage());
        }
    }

    static void saveToFile() throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH, false)) {
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {

            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    public void put(String key, String value) {
        if (key != null && value != null) {
            if (dataMap.containsKey(key)) {
                System.err.println("City is already Invoked: " + key);
            } else {
                dataMap.put(key, value);
                System.out.println("City is added To the map:" + key + " : " + value);
            }
        } else {
            System.err.println("Invalid key or value provided.");
        }
    }

    public String get(String key) {
        if (key != null) {
            String value = dataMap.get(key);
            if (value != null) {
                return value;
            } else {
                return "Key not found: " + key;
            }
        } else {
            return "Invalid key provided.";
        }
    }

    public void remove(String key) {
        if (key != null) {
            if (dataMap.containsKey(key)) {
                dataMap.remove(key);
                System.out.println("Deleted key: " + key);
            } else {
                System.err.println("Key not found: " + key);
            }
        } else {
            System.err.println("Invalid key provided.");
        }
    }

    public void display() {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println("city : " + entry.getKey() + " : value " + entry.getValue());
        }
    }

    public void acceptInput() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter city :");
            String key = reader.readLine();
            System.out.println("enter value:");
            String value = reader.readLine();
            if (key.matches("^[a-zA-Z]*$")) {
                put(key, value);
            } else {
                System.err.println("don't enter specail symobls");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }

    }

    public void operations() {
        while (true) {
            System.out.println("1.loadTheCitysFromFile");
            System.out.println("2. View Citys and address");
            System.out.println("3. Search city value by key");
            System.out.println("4. Add City");
            System.out.println("5. Remove City");
            System.out.println("6. saveToFile");
            System.out.println("7. Exit");

            int choice = 0;
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.println("please enter numeric values !!");
            }

            switch (choice) {
                case 1:
                    try {
                        loadFromFile();
                        System.out.println("loading....");
                        System.out.println("successfully loaded city and address");
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println("enter city name:");
                    String key;
                    String value = get(key = new Scanner(System.in).nextLine());
                    System.out.println("city :" + key + "\nvalue :" + value);
                    break;
                case 4:
                    try {
                        acceptInput();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("enter city :");
                    remove(new Scanner(System.in).nextLine());
                    break;
                case 6:
                    try {
                        saveToFile();
                    } catch (FileNotFoundException e) {
                        System.err.println(e.getMessage());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("data saved and Updated");
                    break;
                case 7:
                    System.out.println("Exiting...Thank You");
                    System.exit(0);

                default:
                    System.err.println("Invalid choice.");
            }

        }

    }

}

package Genrics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GenricRunner {
    public static void main(String[] args) {
        GenricsClass<String> stringGenricsClassgenricsClass = new GenricsClass<>("java");
        System.out.println(stringGenricsClassgenricsClass.getData());

        GenricsClass<Integer> integerGenricsClass = new GenricsClass<>(190);
        System.out.println(integerGenricsClass.getData());

        try {
            Files.list(Paths.get(".")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

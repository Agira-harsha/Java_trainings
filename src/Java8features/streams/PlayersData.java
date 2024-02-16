package Java8features.streams;

import java.util.Arrays;
import java.util.List;

public class PlayersData {

    static List<Player> india(){
        return Arrays.asList(
                new Player("viratkohli", 39),
                new Player("rohitSharma", 40),
                new Player("jadeja", 41),
                new Player("gill", 27),
                new Player("siraj", 26)
        );
    }
    static List<Player> usa(){
        return Arrays.asList(
                new Player("deviller", 39),
                new Player("warner", 30),
                new Player("smith", 21),
                new Player("fench", 27),
                new Player("zampa", 36)
        );
    }
    static  List<Player>south(){
        return Arrays.asList(
                new Player("Kagiso Rabada", 30),
                new Player("faf ", 43),
                new Player("henrich", 41),
                new Player("Amla", 22),
                new Player("decock", 26)
        );
    }
}


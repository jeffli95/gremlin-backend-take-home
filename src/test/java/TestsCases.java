import org.example.Main;
import org.junit.jupiter.api.Test;

public class TestsCases {
    @Test
    void englishArg() {
        try {
            String[] args = { "English" };
            Main.main(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void russianArg() {
        try {
            String[] args = { "Russian" };
            Main.main(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void noArg() {
        try {
            String[] args = { };
            Main.main(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void chineseArg() {
        try {
            String[] args = { "Chinese" };
            Main.main(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

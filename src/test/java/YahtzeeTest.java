import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {

    @Test
    void scoreOnChance() {
        var dice = new YahtzeeDice(new int[] {
            1, 1, 1, 1, 1, 1
        }
        );
        assertEquals(6,dice.scoreAs(YahtzeeStep.CHANCE));
    }
}

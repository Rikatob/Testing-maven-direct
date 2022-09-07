package no.kristiania.yahtzee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {

    @Test
    void scoreOnChance() {
        var dice = new YahtzeeDice(new int[] {
            1, 1, 1, 1, 1, 1
        }
        );
        Assertions.assertEquals(6,dice.scoreAs(YahtzeeStep.CHANCE));
    }
}

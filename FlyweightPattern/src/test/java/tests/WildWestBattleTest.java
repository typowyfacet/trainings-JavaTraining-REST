package tests;

import game.CowboyFactory;
import org.junit.Test;
import utilities.SpanishInquisitionException;

import java.util.stream.IntStream;

import static playgame.WildWestBattle.createCowboy;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Test is creating 10 Cowboys, by using createCowboy() static method from WildWestBattle class.
 */

public class WildWestBattleTest {

    @Test
    public void battleTest() {
        IntStream.rangeClosed(0, 9)
                .forEach(i -> {
                    try {
                        createCowboy();
                    } catch (SpanishInquisitionException e) {
                        e.getMessage();
                    }
                });
    }

    @Test
    public void exceptionTest() {
        assertThatExceptionOfType(SpanishInquisitionException.class).isThrownBy(() -> CowboyFactory.getCowboy("This will throw exception"));
    }
}

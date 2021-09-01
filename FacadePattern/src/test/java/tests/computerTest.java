package tests;

import computer.ComputerFacade;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class computerTest {

    @Test
    public void startingComputer(){
        ComputerFacade computer = new ComputerFacade();
        assertThat(computer.startComputer()).isEqualTo("Computer works!");
    }
}

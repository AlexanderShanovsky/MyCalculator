package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Саша on 08.08.2017.
 */
public class CalculatorTest {

    private Calculator calculator;
    private Display display = new DisplayStub();

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(display);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getNumber() throws Exception {

    }

    @Test
    public void setNumber() throws Exception {

    }

    @Test
    public void digit() throws Exception {

    }

    @Test
    public void clear() throws Exception {

    }

    @Test
    public void negate() throws Exception {

    }

    @Test
    public void sqrt() throws Exception {

    }

    @Test
    public void comma() throws Exception {

    }

    private static class DisplayStub implements Display {
        private String displayNumber;
        @Override
        public String getDisplayNumber() {
            return displayNumber;
        }

        @Override
        public void setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
        }
    }

}
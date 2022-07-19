import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before public void before() {
        printer = new Printer();
    }

    @Test public void getNumOfSheets(){
        assertEquals(5, Printer.printSheets());
    }

}

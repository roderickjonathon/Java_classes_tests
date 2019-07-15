import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before

    public void before(){ printer = new Printer(50, 20);}

    @Test
    public void hasPaper()
    { assertEquals(true, printer.hasPaper());}

    @Test
    public void canPrint() {
        printer.print(2, 2);
        {
            assertEquals(46, printer.getPaperLeft());
        }
    }

    @Test
    public void wontPrintIfNoPaper(){
        printer.useAllPaper();
        printer.print(2,2);
        assertEquals("No Paper Left", printer.print(2, 2));
    }

    @Test
    public void tonerIsReducedBy1(){
        printer.print(2, 2);
        assertEquals(16, printer.getTonerVolume());
    }




}

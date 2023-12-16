package stepDefinitions;

import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinition {

    @Test
    public void name() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS); //windows tuşuna basılı tutturduk
        robot.keyRelease(KeyEvent.VK_WINDOWS); //windows tuşundan parmağı kaldırttık.
        robot.delay(3000);


        robot.keyPress(KeyEvent.VK_N); //N yazdırdık
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_O); //O yazdırdık
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(3000);


    }


}

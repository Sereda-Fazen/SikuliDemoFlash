package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.io.IOException;

/**
 * Created by Alex on 11.11.2016.
 */
public class SikuliDemo extends BeforeClass {


    @Test
    public void testDemo() throws FindFailed, InterruptedException {

        Screen screen = new Screen();
        Pattern wrongBlock = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\wrongBlock.jpg");
        Pattern start = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\start.jpg");
        Pattern openMenu = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\openMenu.jpg");
        Pattern startGame = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\startGame.jpg");
        Pattern great = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\greate.jpg");
        Pattern nextLevel = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\nextLevel.jpg");
        Pattern play = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\play.jpg");
        Pattern one = new Pattern("C:\\Users\\Alex\\.jenkins\\jobs\\SikuliDemo\\FlashDemo\\img\\one.jpg");

        screen.click(wrongBlock);

        screen.wait(start);
        screen.click(start);
        screen.wait(openMenu,20);

        screen.click(openMenu);
        screen.click(startGame);
        screen.wait(great,10);
        screen.click(great);
        screen.wait(openMenu,10);
        screen.click(openMenu);
        screen.click(startGame);
        screen.wait(nextLevel,10);
        screen.click(nextLevel);
        screen.wait(play, 10);
        screen.click(play);
        screen.wait(one,10);
        screen.wait(one,5);



    }


}

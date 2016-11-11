package demo;

import com.utils.DataProperties;
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

    private Pattern wrongBlock;
    private Pattern start;
    private Pattern openMenu;
    private Pattern startGame;
    private Pattern great;
    private Pattern nextLevel;
    private Pattern play;
    private Pattern one;


    @Test
    public void testDemo() throws FindFailed {

        Screen screen = new Screen();
        wrongBlock = new Pattern(DataProperties.path("wrongBlock.jpg"));
        start = new Pattern(DataProperties.path("start.jpg"));
        openMenu = new Pattern(DataProperties.path("openMenu.jpg"));
        startGame = new Pattern(DataProperties.path("startGame.jpg"));
        great = new Pattern(DataProperties.path("greate.jpg"));
        nextLevel = new Pattern(DataProperties.path("nextLevel.jpg"));
        play = new Pattern(DataProperties.path("play.jpg"));
        one = new Pattern(DataProperties.path("one.jpg"));

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

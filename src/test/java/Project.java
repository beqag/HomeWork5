import Utils.ChromeRunner;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Project extends ChromeRunner {
@Test
    public void go(){
    $(byText("კომპიუტერული და")).click();
    sleep(1000);
    $(byClassName("ty-text-links__a"), 2).click();
    sleep(1000);
    $(byText("Asus SDRW-08D2S-U LITE")).shouldBe(Condition.visible);
    }
}

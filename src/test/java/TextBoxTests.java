import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        // https://demoqa.com/text-box
        open("/text-box");

        $("#userName").setValue("Artem Zholobov");
        $("[id=userEmail").setValue("zzeleb@gmail.com");
        $("[id=currentAddress").setValue("lenina st. 8");
        $("[id=permanentAddress").setValue("lenina st. 9");
        $("[id=submit").click();

        $("[id=output").shouldHave(text("Artem Zholobov"), text("zzeleb@gmail.com"), text("lenina st. 8"), text("lenina st. 9"));

    }
}

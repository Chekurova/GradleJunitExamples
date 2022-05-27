import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class PracticeFormTests {
    @Test
    void successFieldForm() throws InterruptedException {
        // <input required="" autocomplete="off" placeholder="First Name" type="text" id="firstName" class=" mr-sm-2 form-control">
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").val("Name");
        $("#lastName").val("LastName");
        $("#userEmail").val("email@email.com");

        $("#gender-radio-1").click();
        sleep(5000);
    }
}

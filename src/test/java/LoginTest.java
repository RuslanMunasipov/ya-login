import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @BeforeAll
    static void setUp() {
        Configuration.startMaximized = true;
    }

    String loginName = "Frankthemurder",
            password = "4NTGJDTCJD";

    @Test
    public void main() {
      open("https://yandex.ru/");

        // заполняем

        $x("//a[@class = 'home-link desk-notif-card__login-new-item desk-notif-card__login-new-item_enter home-link_black_yes home-link_hover_inherit']//div[@class = 'desk-notif-card__login-new-item-title']").click();
        $x("//span[@class = 'Textinput Textinput_view_big-input Textinput_size_l']//input[@type = 'text']").setValue(loginName);
        $x("//button[@id = 'passp:sign-in']").click();
        $x("//input[@id = 'passp-field-passwd']").setValue(password);
        $x("//button[@id = 'passp:sign-in']").click();
        System.out.println("123");
    }
    }


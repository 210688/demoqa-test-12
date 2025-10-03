package hadHunter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@Tag("simple")
public class TestHadHunter {

    @Test
    void checkingTheWebsitesFunctionality() {
       open("https://hh.ru/");
       $(".bloko-header-promo-3").shouldHave(text("Работа найдётся для каждого"));
       $("#a11y-search-input").setValue("Тестировщик");
       $(byText("Найти")).click();
       $(".search-catalog-header-magritte").shouldHave(text("Работа тестировщиком в Москве"));
       $(byText("Ассистент инженера-тестировщика")).click();
    }
}

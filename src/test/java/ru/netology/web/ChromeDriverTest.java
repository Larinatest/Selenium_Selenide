package ru.netology.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class ChromeDriverTest {

    @Test
    public void openBrowser() {
        // Указываем путь к chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:/Users/Zhenya/IdeaProjects/Selenium_Selenide/drivers/chromedriver.exe");


        // Создаем экземпляр ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Открываем тестовую страницу
        driver.get("https://www.google.com");

        // Закрываем браузер
        driver.quit();
    }
}

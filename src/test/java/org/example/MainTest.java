package org.example;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test() {
        WebDriver driver;
        driver = new EdgeDriver();
        // D:\Download Program\edgedriver_win64
        System.setProperty("webdriver.edge.driver", "D:\\Download Program\\edgedriver_win64\\msedgedriver.exe");

        driver.manage().window().maximize();
        String url = "https://sv.ugm.ac.id";
        driver.get(url);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Sekolah Vokasi UGM – Sekolah Vokasi UGM";
        assertEquals(expectedTitle, actualTitle);

        driver.quit();
    }

}
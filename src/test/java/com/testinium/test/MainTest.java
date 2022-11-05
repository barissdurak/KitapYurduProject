package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.MainPage;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void MainPageBack() {
        MainPage mainPage = new MainPage();
        mainPage.MainPageBack();
    }

    @Test
    public void PuanKatalog() {
        MainPage mainPage = new MainPage();
        mainPage.PuanKatalog();
    }

    @Test
    public void TumKitaplar() {
        MainPage mainPage = new MainPage();
        mainPage.TumKitaplar();
    }

    @Test
    public void randomChoose() {
        MainPage mainPage = new MainPage();
        mainPage.randomChoose();
    }


}


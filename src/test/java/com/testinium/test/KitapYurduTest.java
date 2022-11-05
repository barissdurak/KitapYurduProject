package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.FavoritesPage;
import com.testinium.page.LoginPage;
import com.testinium.page.MainPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class KitapYurduTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        MainPage mainPage = new MainPage();
        FavoritesPage favoritesPage = new FavoritesPage();
        SepetTest sepetTest = new SepetTest();

        loginPage.login();
        productPage.scrollAndSelect();
        productPage.FavoriSelect();
        productPage.attributeTest();
        mainPage.MainPageBack();
        mainPage.PuanKatalog();
        mainPage.TumKitaplar();
        mainPage.randomChoose();
        favoritesPage.Favorilerim();
        favoritesPage.UrunSilme();
        sepetTest.sepeteGit();
        sepetTest.UrunAdeti();


    }
}

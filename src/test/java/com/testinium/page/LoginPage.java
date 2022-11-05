package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.xpath("//div[@class=\"menu-top-button login\"]/a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"), "baris.durak@testinium.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "59706899");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-login-btn"));
        methods.waitBySeconds(5);

        //Assert true ile "Sipariş Geçmişim" yazısı kontrol edilir. Bu yazı ana ekranda bulunmamaktadır.
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class=\"highlight-link\"])[2]")));
        methods.waitBySeconds(2);
        logger.info("başarılı bir şekilde üye girişi yapılmıştır.");

    }

}

package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class MainPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public MainPage() {

        methods = new Methods();
    }

    public void MainPageBack() {
        methods.click(By.xpath("//*[@class=\"logo-text\"]"));
        methods.waitBySeconds(2);
    }

    public void PuanKatalog() {
        methods.click(By.cssSelector("div.lvl1catalog"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@title=\"Puan Kataloğundaki Türk Klasikleri\"]"));
        methods.waitBySeconds(2);

        //yüksek oylama seçilir
        methods.click(By.xpath("//div[@class=\"sort\"]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//option[text()=\"Yüksek Oylama\"]"));
        methods.waitBySeconds(2);

    }

    public void TumKitaplar() {
        methods.click(By.xpath("//span[contains(@class, 'mn-strong common-sprite') and text() = 'Tüm Kitaplar']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(@class, 'mn-icon icon-angleRight') and text() = 'Hobi']"));
        methods.waitBySeconds(2);
    }

    public void randomChoose() {
        methods.randomElement(By.cssSelector(".pr-img-link")).click();
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@id=\"button-cart\"]"));
        methods.waitBySeconds(2);
    }

}

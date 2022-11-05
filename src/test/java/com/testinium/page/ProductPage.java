package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    String UniqeKitapName;


    public ProductPage() {

        methods = new Methods();
    }

    public void scrollAndSelect() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("(//*[@class=\"pr-img-link\"])[7]"));
        methods.waitBySeconds(3);
        logger.info("Sayfadaki 7. kitaba scroll edildi.");
    }

    public void FavoriSelect() {
        //4. ürünün favorilere eklendiği, favori butonunun kırmızı olup olmamasıyla kontrol edilir.
        methods.click(By.xpath("(//*[@class=\"fa fa-heart\"])[4]"));
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class=\"fa fa-heart red\"])[4]")));
        methods.waitBySeconds(3);

        //5. ürünün favorilere eklendiği, favori butonunun kırmızı olup olmamasıyla kontrol edilir.
        methods.click(By.xpath("(//*[@class=\"fa fa-heart\"])[5]"));
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class=\"fa fa-heart red\"])[5]")));
        methods.waitBySeconds(3);

        //6. ürünün favorilere eklendiği, favori butonunun kırmızı olup olmamasıyla kontrol edilir.
        methods.click(By.xpath("(//*[@class=\"fa fa-heart\"])[6]"));
        methods.waitBySeconds(4);
//        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class=\"fa fa-heart red\"])[6]")));
//        methods.waitBySeconds(4);

        //7. ürünün favorilere eklendiği, favori butonunun kırmızı olup olmamasıyla kontrol edilir.
        methods.click(By.xpath("(//*[@class=\"fa fa-heart\"])[7]"));
        methods.waitBySeconds(4);
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class=\"fa fa-heart red\"])[7]")));
        methods.waitBySeconds(4);

        logger.info("Sayfadaki 4 kitap favorilere eklendi");
        System.out.println("ürünler basarılı bir sekilde favorilere eklendi");

        //3. URUN ATTTRIBUTE TUTMA
        String UniqeKitapName = methods.getAttribute(By.xpath("(//div[@class=\"name\"])[4]/a"), "title");
        System.out.println("Favorilere eklenen 3. kitabın Adı: " + UniqeKitapName);
        logger.info("Favorilere eklenen 3. kitabın Adı: " + UniqeKitapName);
        methods.waitBySeconds(3);

    }

    public void attributeTest() {
        methods.hoverElement(By.xpath("(//*[@class=\"in-favorites\"])[7]"));
        String attribute = methods.getAttribute(By.xpath("(//*[@class=\"in-favorites\"])[7]"),
                "data-title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        Assert.assertEquals("Ürün favorilere eklenemedi.", "Favorilerinizde", attribute);
        methods.waitBySeconds(3);
    }

    public void randomElement() {
    }

}



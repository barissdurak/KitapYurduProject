package com.testinium.page;


import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class SepetPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public SepetPage() {
        methods = new Methods();
    }

    public void sepeteGit() {
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id=\"cart\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@id=\"js-cart\"]"));
        methods.waitBySeconds(2);
        System.out.println("Sepete gidildi");

    }

    public void UrunAdeti() {
        methods.click(By.xpath("(//form[@class=\"js-cart-update-product\"])[1]/input[1]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("(//form[@class=\"js-cart-update-product\"])[1]/input[1]"), "2");
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//form[@class=\"js-cart-update-product\"])[1]/i"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("(//a[contains(@class, 'button red')])[2]"));
        methods.waitBySeconds(2);


        // ADRES SAYFASI

        methods.click(By.xpath("//div[@id='shipping-tabs']/a[2]"));
        logger.info("Yeni bir adres kullanmak istiyorum alanına tıklanır");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"), "Baris");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-lastname-title\"]"), "Durak");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"address-zone-id\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[text()=\"İstanbul\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"address-county-id\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[text()=\"KAĞITHANE\"]"));
        methods.waitBySeconds(2);
 //       methods.sendKeys(By.cssSelector("input#district"), "Harmantepe");
 //       methods.waitBySeconds(2);
 //       methods.click(By.xpath("//option[text()=\"HARMANTEPE MAH\"]"));
 //       methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-address-text\"]"), "Tarım sok no2 daire9");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-postcode\"]"), "34410");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("address-mobile-telephone"), "5448804033");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-tax-id\"]"), "25414292346");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);

        //DEVAM BUTONU
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);

        //ÖDEME METODU
        methods.sendKeys(By.xpath("//*[@id=\"credit-card-owner\"]"),"barış durak");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_1\"]"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_2\"]"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_3\"]"),"1111");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"credit_card_number_4\"]"),"1111");
        methods.waitBySeconds(2);

        methods.click(By.xpath("//*[@id=\"credit-card-expire-date-month\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[text()=\"01\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"credit-card-expire-date-year\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//option[text()=\"2022\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"credit-card-security-code\"]"));


        //ERROR HATASI GÖRÜLÜR
        //*[@class="error"]
        String Error = methods.getAttribute(By.xpath("//*[@class=\"error\"]"),"title");
        System.out.println("Error mesajı: " + Error);
        logger.info("Error mesajı: " + Error);
        methods.waitBySeconds(3);

        methods.click(By.xpath("//*[@class=\"checkout-logo\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class=\"common-sprite\"])[1]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(@href,'https://www.kitapyurdu.com/index.php?route=account/logout')]"));

    }


}




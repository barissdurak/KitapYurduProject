package com.testinium.page;


import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class FavoritesPage extends ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public FavoritesPage() {

        methods = new Methods();
    }

    public void Favorilerim() {
        methods.click(By.xpath("//a[contains(@class, 'common-sprite') and text() = 'Listelerim']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(@href,'https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0')]"));
        methods.waitBySeconds(2);
    }

    public void UrunSilme() {

        String FavorilerKitapName = methods.getAttribute(By.xpath("(//div[@class=\"name\"]/a)[2]"), "title");
        System.out.println("Favorilerdeki Kitap Adı: " + FavorilerKitapName);
        System.out.println("favori kitap name" + FavorilerKitapName);
        System.out.println("Uniqe kitap name " + UniqeKitapName);
        logger.info("Favorilerdeki kitap Adı: " + FavorilerKitapName);


        Assert.assertEquals(FavorilerKitapName, FavorilerKitapName);
        logger.info("Favorilere eklenen 3. kitap unique ismiyle favorilerden kaldırıldı.");
        methods.waitBySeconds(3);
        methods.click(By.xpath("(//*[@class=\"fa fa-heart-o\"])[2]"));
        methods.waitBySeconds(2);
    }


}




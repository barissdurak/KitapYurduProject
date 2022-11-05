package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void ProductTest() {
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test
    public void randomTest() {
        ProductPage productPage = new ProductPage();
        productPage.randomElement();
    }

    @Test
    public void attributeTest() {
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }
}

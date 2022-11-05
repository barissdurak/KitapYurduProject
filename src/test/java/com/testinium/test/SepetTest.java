package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.SepetPage;
import org.junit.Test;

public class SepetTest extends BaseTest {

    @Test
    public void sepeteGit() {
        SepetPage sepetPage = new SepetPage();
        sepetPage.sepeteGit();
    }

    @Test
    public void UrunAdeti() {
        SepetPage sepetPage = new SepetPage();
        sepetPage.UrunAdeti();

    }
}

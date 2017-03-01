package main.org.seeker;

import main.org.seeker.model.LoginStrategy;
import main.org.seeker.model.Provider;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.Connection;

import geb.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;
import java.util.List;

/**
 * Created by RStreltsov on 01.03.2017.
 */
public class Agregator {

    public static void main(String[] args) {
        /*Provider p = new Provider(new LoginStrategy());
        Controller c = new Controller(p);
        c.tryLogin();
        System.out.println(c);*/

        Connection.Response page1 = null;
        Connection.Response document = null;

        /*try {
            page1 = Jsoup.connect("http://localhost:8080/probe")
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36")
                    .referrer("http://www.google.com")
                    .method(Connection.Method.GET)
                    .execute();

            System.out.println(page1.parse());

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        HtmlUnitDriver driver = new HtmlUnitDriver();
        //WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/probe");
        //WebElement element = driver.findElement(By.name("Test Page"));
        //element.submit();
        System.out.println(driver.getTitle());


        List<WebElement> elements = driver.findElements(By.xpath("//input") );
        System.out.println("size = "+elements.size());

        for (WebElement e : elements) {
            //System.out.println(e.getAttribute("value"));
            if(e.getAttribute("value").equals("Test Page"))
                e.submit();
        }

        System.out.println(driver.getTitle());
        driver.findElement(By.id("user"));
        //System.out.println(element.);

        driver.close();



        //Browser browser = new Browser();

        //browser.setDriver(new HtmlUnitDriver());

        //browser.go("http://localhost:8080/probe");

    }
}

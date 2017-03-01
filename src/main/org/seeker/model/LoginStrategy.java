package main.org.seeker.model;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.Connection;

import java.io.IOException;

/**
 * Created by RStreltsov on 01.03.2017.
 */
public class LoginStrategy implements Strategy {

    private static final String URL_FORMAT = "http://localhost:8080/probe";
            //"http://hh.ua/search/vacancy?text=java+%s&page=%d";
    private static final String LOGIN = "";
    private static final String PASSWORD = "";

    @Override
    public Boolean login() {
        Connection.Response doc = null;

        try {
            doc = getDocument(null, null, null);
            System.out.println(doc.parse());
            System.out.println("get doc");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected Connection.Response getDocument(String searchString, String login, String password) throws IOException {
        //String url = String.format(URL_FORMAT, searchString, page);
        String url = URL_FORMAT;

        Connection.Response document = Jsoup.connect(url)
                .data("submit", "Test Page")
                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36")
                .referrer("http://www.google.com")
                .method(Connection.Method.GET)
                .execute();

        /*Document document = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36")
                .referrer("http://www.google.com")
                .get();*/

        return document;
    }
}

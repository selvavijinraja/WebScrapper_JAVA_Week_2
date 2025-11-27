package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class App {

    // Reusable method to scrape headlines from an RSS feed
    public static void scrapeRSS(String siteName, String url) {
        try {
            Document doc = Jsoup.connect(url)
                                .userAgent("Mozilla/5.0")
                                .timeout(10 * 1000)
                                .get();

            Elements items = doc.select("item > title");

            System.out.println("=== " + siteName + " Headlines ===");
            int count = 1;
            for (Element item : items) {
                System.out.println(count + ". " + item.text());
                count++;
            }
            System.out.println(); // blank line after each site
        } catch (Exception e) {
            System.out.println("Error scraping " + siteName + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // BBC News RSS
        scrapeRSS("BBC News", "http://feeds.bbci.co.uk/news/rss.xml");

        // The Hindu - Top Stories RSS
        scrapeRSS("The Hindu - Top Stories", "https://www.thehindu.com/news/feeder/default.rss");

        // You can add more sections if needed:
        // scrapeRSS("The Hindu - National", "https://www.thehindu.com/news/national/feeder/default.rss");
        // scrapeRSS("The Hindu - International", "https://www.thehindu.com/news/international/feeder/default.rss");
    }
}

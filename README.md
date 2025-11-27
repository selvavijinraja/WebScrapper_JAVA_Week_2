# 📰 Java News Scraper (BBC + The Hindu)

A simple **Java console application** that fetches and displays the latest news headlines from multiple sources using **web scraping** with the [Jsoup](https://jsoup.org/) library.

---

## 📌 Features
- Fetches headlines from **BBC News** and **The Hindu** via their RSS feeds.
- Displays headlines in a **numbered list** format for clarity.
- Handles different website structures using a **reusable scraping method**.
- Uses headers to mimic a browser request and avoid blocking.
- Built with **Java + Jsoup** (no Maven required).

---

## 🛠️ Tech Stack
- **Java** (Core language)
- **Jsoup** (HTML/XML parsing library)

---

## 📂 Project Structure
WEB_SCRAPPER/
└── scrapper/
├── src/
│ └── org/example/App.java
└── lib/jsoup-1.15.3.jar


---

## ⚙️ Setup & Installation

1. Download the [Jsoup JAR](https://jsoup.org/packages/jsoup-1.15.3.jar) and place it in the `lib/` folder.

2. Compile the project:
   ```bash
   javac -cp lib/jsoup-1.15.3.jar src/org/example/App.java -d out
3. Run the scraper:
   java -cp "out;lib/jsoup-1.15.3.jar" org.example.App

▶️ Example Output

=== BBC News Headlines ===
1. Death toll in Hong Kong fire rises to 44
2. Delhi’s toxic air is making children sick
...

=== The Hindu - Top Stories ===
1. Supreme Court delivers verdict on key case
2. Cyclone warning issued for Tamil Nadu coast
...

package project.encurtador.app.domain;

public class ShortUrl {
    private String shortUrl;
    public ShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @Override
    public String toString() {
        return
                "Url Transformada: " + shortUrl + "\n";
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}

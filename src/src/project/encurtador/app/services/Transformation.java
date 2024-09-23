package project.encurtador.app.services;

import project.encurtador.app.domain.LongUrl;
import project.encurtador.app.domain.ShortUrl;
import project.encurtador.app.exception.InvalidUrlLenght;

import java.util.Map;

public class Transformation {
    private final String urlToConverted;
    Base base;

    public Transformation(String urlToConverted) {
        this.urlToConverted = urlToConverted;
    }

    public void convertedBase62(Map<ShortUrl, LongUrl> map) {
        if (urlToConverted.length() < 6) {
            throw new InvalidUrlLenght("URL INVALIDA PARA USO");
        } else {
            LongUrl longUrl = new LongUrl(urlToConverted);
            ShortUrl shortUrl = new ShortUrl(Base.convertToShort(longUrl, Base.BASE62));
            map.put(shortUrl, longUrl);
        }
    }

    public void convertedBase58(Map<ShortUrl, LongUrl> map) {
        if (urlToConverted.length() < 6) {
            throw new InvalidUrlLenght("URL INVALIDA PARA USO");
        } else {
            LongUrl longUrl = new LongUrl(urlToConverted);
            ShortUrl shortUrl = new ShortUrl(Base.convertToShort(longUrl, Base.BASE58));
            map.put(shortUrl, longUrl);
        }
    }


}

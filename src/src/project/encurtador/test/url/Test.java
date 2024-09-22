package project.encurtador.test.url;

import project.encurtador.app.domain.LongUrl;
import project.encurtador.app.domain.ShortUrl;
import project.encurtador.app.services.Base;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        LongUrl longUrl = new LongUrl("watch?v=T5mFXrYBsao&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=198");
        ShortUrl shortUrl = new ShortUrl(Base.convertToShort(longUrl, Base.BASE58));
        Map<ShortUrl,LongUrl> beforeUrlConverted = new HashMap<>();


    }
}

package project.encurtador.test.url;

import project.encurtador.app.domain.LongUrl;
import project.encurtador.app.domain.ShortUrl;
import project.encurtador.app.services.Base;
import project.encurtador.app.services.Transformation;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Transformation transformation = new Transformation("watch?v=T5mFXrYBsao&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=198");
        Map<ShortUrl, LongUrl> key = new HashMap<>();
        transformation.convertedBase58(key);
        System.out.println(key);
        transformation.convertedBase62(key);
        System.out.println("--------------------------");
        System.out.println(key);
    }
}

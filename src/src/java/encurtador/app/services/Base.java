package java.encurtador.app.services;

import java.encurtador.app.domain.LongUrl;

public enum Base {
    BASE62("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 62),
    BASE58("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", 58);
    public final int NUMBASE;
    public final String BASE;

    Base(String base, int numBase) {
    this.NUMBASE = numBase;
    this.BASE = base;
    }
    public String convertToShort(LongUrl longUrl, Base base){
        int urlNumber = longUrl.hashCode();
        StringBuilder encondedUrl = new StringBuilder();
        String shortUrl;
        int numUrl;
        while(urlNumber / base.NUMBASE != 0){
             numUrl = urlNumber % base.NUMBASE;
             encondedUrl.append(base.BASE.charAt(numUrl));
             urlNumber /= base.NUMBASE;

        }
        shortUrl = encondedUrl.toString();
        return shortUrl;
    }

}

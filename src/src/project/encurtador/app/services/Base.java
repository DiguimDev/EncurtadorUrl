package project.encurtador.app.services;

import project.encurtador.app.domain.LongUrl;
import project.encurtador.app.exception.InvalidUrlLenght;
import project.encurtador.app.exception.NotFoundBaseException;

public enum Base {
    BASE62("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 62),
    BASE58("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", 58);
    public final long NUMBASE;
    public final String BASE;

    Base(String base, int numBase) {
    this.NUMBASE = numBase;
    this.BASE = base;
    }
    public static String convertToShort(LongUrl longUrl, Base base)throws NotFoundBaseException, InvalidUrlLenght {
        long urlNumber = longUrl.hashCode();
        StringBuilder encondedUrl = new StringBuilder();
        String shortUrl;
        int numUrl;
        if(urlNumber < 0){
            urlNumber *= -1;
        }
        while(urlNumber / base.NUMBASE != 0){
             numUrl = (int)(urlNumber % base.NUMBASE);
             encondedUrl.append(base.BASE.charAt(numUrl));
             urlNumber /= base.NUMBASE;

        }
        shortUrl = encondedUrl.toString();
        return shortUrl;
    }

}

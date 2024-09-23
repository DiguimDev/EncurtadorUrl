package project.encurtador.app.domain;

import java.util.Objects;

public class LongUrl {
    private String longUrl;

    public LongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    @Override
    public String toString() {
        return
                "Url Original: " + longUrl + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongUrl longUrl1 = (LongUrl) o;
        return Objects.equals(longUrl, longUrl1.longUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(longUrl);
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }
}

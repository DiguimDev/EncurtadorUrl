package java.encurtador.app.enums;

public enum Base {
    BASE62("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 62),
    BASE58("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", 58);

    Base(String base, int numBase) {
    }
}

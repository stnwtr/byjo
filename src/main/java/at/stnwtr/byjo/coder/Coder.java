package at.stnwtr.byjo.coder;

public interface Coder<T> {

    byte[] encode(T value);

    T decode(byte[] bytes);
}

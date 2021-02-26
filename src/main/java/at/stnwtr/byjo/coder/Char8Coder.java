package at.stnwtr.byjo.coder;

public final class Char8Coder implements Coder<Character> {

    private static final Char8Coder coder = new Char8Coder();

    private Char8Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Char8Coder instances for you!");
    }

    public static Char8Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Character value) {
        return new byte[]{(byte) (value & 0xFF)};
    }

    @Override
    public Character decode(byte[] bytes) {
        return (char) (bytes[0] & 0xFF);
    }
}

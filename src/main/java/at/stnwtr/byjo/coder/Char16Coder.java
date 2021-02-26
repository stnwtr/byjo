package at.stnwtr.byjo.coder;

public final class Char16Coder implements Coder<Character> {

    private static final Char16Coder coder = new Char16Coder();

    private Char16Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Char16Coder instances for you!");
    }

    public static Char16Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Character value) {
        return new byte[]{
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value) & 0xFF)
        };
    }

    @Override
    public Character decode(byte[] bytes) {
        return (char) (((bytes[0] & 0xFF) << 8) |
                (bytes[1] & 0xFF));
    }
}

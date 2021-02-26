package at.stnwtr.byjo.coder;

public final class Int16Coder implements Coder<Short> {

    private static final Int16Coder coder = new Int16Coder();

    private Int16Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Int16Coder instances for you!");
    }

    public static Int16Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Short value) {
        return new byte[]{
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value) & 0xFF)
        };
    }

    @Override
    public Short decode(byte[] bytes) {
        return (short) (((bytes[0] & 0xFF) << 8) |
                (bytes[1] & 0xFF));
    }
}

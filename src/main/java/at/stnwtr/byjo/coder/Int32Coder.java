package at.stnwtr.byjo.coder;

public final class Int32Coder implements Coder<Integer> {

    private static final Int32Coder coder = new Int32Coder();

    private Int32Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Int32Coder instances for you!");
    }

    public static Int32Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Integer value) {
        return new byte[]{
                (byte) ((value >> 24) & 0xFF),
                (byte) ((value >> 16) & 0xFF),
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value) & 0xFF)
        };
    }

    @Override
    public Integer decode(byte[] bytes) {
        return ((bytes[0] & 0xFF) << 24) |
                ((bytes[1] & 0xFF) << 16) |
                ((bytes[2] & 0xFF) << 8) |
                ((bytes[3] & 0xFF));
    }
}

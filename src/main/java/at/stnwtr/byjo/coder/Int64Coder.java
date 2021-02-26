package at.stnwtr.byjo.coder;

public final class Int64Coder implements Coder<Long> {

    private static final Int64Coder coder = new Int64Coder();

    private Int64Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Int64Coder instances for you!");
    }

    public static Int64Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Long value) {
        return new byte[]{
                (byte) ((value >> 56) & 0xFF),
                (byte) ((value >> 48) & 0xFF),
                (byte) ((value >> 40) & 0xFF),
                (byte) ((value >> 32) & 0xFF),
                (byte) ((value >> 24) & 0xFF),
                (byte) ((value >> 16) & 0xFF),
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value) & 0xFF)
        };
    }

    @Override
    public Long decode(byte[] bytes) {
        return (((long) bytes[0] & 0xFF) << 56) |
                (((long) bytes[1] & 0xFF) << 48) |
                (((long) bytes[2] & 0xFF) << 40) |
                (((long) bytes[3] & 0xFF) << 32) |
                (((long) bytes[4] & 0xFF) << 24) |
                ((bytes[5] & 0xFF) << 16) |
                ((bytes[6] & 0xFF) << 8) |
                ((bytes[7] & 0xFF));
    }
}

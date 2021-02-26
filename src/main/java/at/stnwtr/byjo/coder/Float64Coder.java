package at.stnwtr.byjo.coder;

public final class Float64Coder implements Coder<Double> {

    private static final Float64Coder coder = new Float64Coder();

    private Float64Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Float64Coder instances for you!");
    }

    public static Float64Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Double value) {
        long longValue = Double.doubleToLongBits(value);
        return new byte[]{
                (byte) ((longValue >> 56) & 0xFF),
                (byte) ((longValue >> 48) & 0xFF),
                (byte) ((longValue >> 40) & 0xFF),
                (byte) ((longValue >> 32) & 0xFF),
                (byte) ((longValue >> 24) & 0xFF),
                (byte) ((longValue >> 16) & 0xFF),
                (byte) ((longValue >> 8) & 0xFF),
                (byte) ((longValue) & 0xFF)
        };
    }

    @Override
    public Double decode(byte[] bytes) {
        return Double.longBitsToDouble((((long) bytes[0] & 0xFF) << 56) |
                (((long) bytes[1] & 0xFF) << 48) |
                (((long) bytes[2] & 0xFF) << 40) |
                (((long) bytes[3] & 0xFF) << 32) |
                (((long) bytes[4] & 0xFF) << 24) |
                ((bytes[5] & 0xFF) << 16) |
                ((bytes[6] & 0xFF) << 8) |
                ((bytes[7] & 0xFF)));
    }
}

package at.stnwtr.byjo.coder;

public final class Float32Coder implements Coder<Float> {

    private static final Float32Coder coder = new Float32Coder();

    private Float32Coder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.Float32Coder instances for you!");
    }

    public static Float32Coder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Float value) {
        int intValue = Float.floatToIntBits(value);
        return new byte[]{
                (byte) ((intValue >> 24) & 0xFF),
                (byte) ((intValue >> 16) & 0xFF),
                (byte) ((intValue >> 8) & 0xFF),
                (byte) ((intValue) & 0xFF)
        };
    }

    @Override
    public Float decode(byte[] bytes) {
        return Float.intBitsToFloat(((bytes[0] & 0xFF) << 24) |
                ((bytes[1] & 0xFF) << 16) |
                ((bytes[2] & 0xFF) << 8) |
                ((bytes[3] & 0xFF)));
    }
}

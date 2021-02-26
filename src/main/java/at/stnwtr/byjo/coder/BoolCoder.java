package at.stnwtr.byjo.coder;

public final class BoolCoder implements Coder<Boolean> {

    private static final BoolCoder coder = new BoolCoder();

    private BoolCoder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.BoolCoder instances for you!");
    }

    public static BoolCoder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Boolean value) {
        return new byte[]{value ? (byte) 1 : (byte) 0};
    }

    @Override
    public Boolean decode(byte[] bytes) {
        return bytes[0] != 0;
    }
}

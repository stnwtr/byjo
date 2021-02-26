package at.stnwtr.byjo.coder;

public final class ByteCoder implements Coder<Byte> {

    private static final ByteCoder coder = new ByteCoder();

    private ByteCoder() {
        throw new AssertionError("No at.stnwtr.byjo.coder.ByteCoder instances for you!");
    }

    public static ByteCoder getCoder() {
        return coder;
    }

    @Override
    public byte[] encode(Byte value) {
        return new byte[]{value};
    }

    @Override
    public Byte decode(byte[] bytes) {
        return bytes[0];
    }
}

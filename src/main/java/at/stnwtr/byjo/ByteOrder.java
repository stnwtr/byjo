package at.stnwtr.byjo;

import java.util.function.Function;

public enum ByteOrder {
    BIG_ENDIAN(bytes -> bytes),
    LITTLE_ENDIAN(ByteOrder::reverse);

    private final Function<byte[], byte[]> transformer;

    ByteOrder(Function<byte[], byte[]> transformer) {
        this.transformer = transformer;
    }

    public byte[] transform(byte[] bytes) {
        return transformer.apply(bytes);
    }

    private static byte[] reverse(byte[] bytes) {
        for (int i = 0; i < bytes.length / 2; i++) {
            byte temp = bytes[i];
            int offset = bytes.length - 1 - i;
            bytes[i] = bytes[offset];
            bytes[offset] = temp;
        }
        return bytes;
    }
}

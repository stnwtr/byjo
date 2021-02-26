package at.stnwtr.byjo.coder;

public final class StandardCoders {

    private StandardCoders() {
        throw new AssertionError("No at.stnwtr.byjo.coder.StandardCoders instances for you!");
    }

    public static final Coder<Byte> BYTE = ByteCoder.getCoder();
    public static final Coder<Short> INT16 = Int16Coder.getCoder();
    public static final Coder<Integer> INT32 = Int32Coder.getCoder();
    public static final Coder<Long> INT64 = Int64Coder.getCoder();

    public static final Coder<Float> FLOAT32 = Float32Coder.getCoder();
    public static final Coder<Double> FLOAT64 = Float64Coder.getCoder();

    public static final Coder<Character> CHAR8 = Char8Coder.getCoder();
    public static final Coder<Character> CHAR16 = Char16Coder.getCoder();

    public static final Coder<Boolean> BOOL = BoolCoder.getCoder();
}

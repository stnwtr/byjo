package at.stnwtr.byjo.coder;

public final class CoderType {

    private CoderType() {
        throw new AssertionError("No at.stnwtr.byjo.coder.CoderType instances for you!");
    }

    public static final Class<? extends Coder<?>> BYTE = ByteCoder.class;
    public static final Class<? extends Coder<?>> INT16 = Int16Coder.class;
    public static final Class<? extends Coder<?>> INT32 = Int32Coder.class;
    public static final Class<? extends Coder<?>> INT64 = Int64Coder.class;

    public static final Class<? extends Coder<?>> FLOAT32 = Float32Coder.class;
    public static final Class<? extends Coder<?>> FLOAT64 = Float64Coder.class;

    public static final Class<? extends Coder<?>> CHAR8 = Char8Coder.class;
    public static final Class<? extends Coder<?>> CHAR16 = Char16Coder.class;

    public static final Class<? extends Coder<?>> BOOL = BoolCoder.class;
}

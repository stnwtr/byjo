package at.stnwtr.byjo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ByjoLayout {

    ByteOrder byteOrder() default ByteOrder.BIG_ENDIAN;
}

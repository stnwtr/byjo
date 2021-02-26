package at.stnwtr.byjo;

import at.stnwtr.byjo.coder.Coder;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Marshal {

    Class<? extends Coder<?>> type();

    int times() default 1;
}

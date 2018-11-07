package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by operator on 05.07.2017.
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ZadanieAnnotation {
    public String englishName();
    public String polishName();
    public int value();
}

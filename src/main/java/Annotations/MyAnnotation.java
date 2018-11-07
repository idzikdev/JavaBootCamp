package Annotations;

/**
 * Created by operator on 05.07.2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by operator on 04.07.2017.
 */
@Target(ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public String info();
    public boolean usingInternet();

}

package jp.co.sac.sac10323.sacamservice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author shogo_saito
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SheetMap {
    int startColumn();
    int startRow();
    Direction direction();

    public enum Direction {
        UP,DOWN,LEFT,RIGHT;
    }
}

package jp.co.sac.sac10323.sacamservice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author shogo_saito
 */
@Target(ElementType.FIELD)
public @interface SheetMap {
    int startColumn();
    int startRow();
    Direction direction();

    public enum Direction {
        UP,DOWN,LEFT,RIGHT;
    }
}

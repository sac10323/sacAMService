/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.sac.sac10323.sacamservice.manage.excel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import jp.co.sac.sac10323.sacamservice.entity.excel.XlLoadOption;
import jp.co.sac.sac10323.sacamservice.entity.functionInterface.XlLoadable;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author shogo_saito
 */
public class XlLoader {
    public void load(XlLoadable entity, Sheet sheet, XlLoadOption option) throws Exception {
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annos = field.getDeclaredAnnotations();
            if (annos != null) {
                for (Annotation anno : annos) {
                    
                }
            }
        }
    }
}

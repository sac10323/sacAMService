/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.sac.sac10323.sacamservice.core;

import java.io.InputStream;
import java.io.OutputStream;
import jp.co.sac.sac10323.sacamservice.core.option.LoadOption;
import jp.co.sac.sac10323.sacamservice.core.option.SaveOption;

/**
 *
 * @author shogo_saito
 */
public interface DocumentController {
    public void load(InputStream xlInput, Object loadObject, LoadOption option);
    public void Save(OutputStream xlOutput, Object saveObject, SaveOption option);
}

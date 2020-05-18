/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goddard;

import com.digitalpersona.MessageBox;
import com.digitalpersona.uareu.Reader;
import com.digitalpersona.uareu.UareUException;
import com.digitalpersona.uareu.UareUGlobal;
import py.com.oym.formularios.Menu;

/**
 *
 * @author JORGE
 */
public class Goddard {

    public static Reader m_reader;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize capture library by acquiring reader collection
        try {
            UareUGlobal.GetReaderCollection().GetReaders();
            m_reader = UareUGlobal.GetReaderCollection().get(0);
        } catch (UareUException e) {
            MessageBox.DpError("UareUGlobal.getReaderCollection()", e);
            return;
        }
        new Menu().setVisible(true);
    }
}

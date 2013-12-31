/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Toni
 */
public enum Action {

    FILE_CLOSE("fileClose"),
    SYSTEM_FINALIZE("systemFinalize"),
    FILE_OPEN("fileOpen");
    
    
    private final String action;

    private Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

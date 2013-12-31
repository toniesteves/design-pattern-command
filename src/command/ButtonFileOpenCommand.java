package command;

import com.Icommand.Icommand;
import util.Util;

/**
 *
 * @author Toni
 */
public class ButtonFileOpenCommand implements Icommand {

    @Override
    public void execute() {

        Util.setMessage("The file will be open...");
    }
}

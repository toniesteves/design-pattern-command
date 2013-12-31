package command;

import com.Icommand.Icommand;
import util.Util;

/**
 *
 * @author Toni
 */
public class ButtonExitCommand implements Icommand {

    @Override
    public void execute() {

        Util.setMessage("The system will be shutdown...");

    }
}

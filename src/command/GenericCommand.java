package command;

import java.util.HashMap;
import java.util.Map;

import com.Icommand.Icommand;

/**
 *
 * @author Toni
 */
public class GenericCommand implements Icommand{

    public GenericCommand() {
    }
    public static Map<String, Icommand> commandMap = new HashMap<String, Icommand>() {
        {

            put("systemFinalize", new ButtonExitCommand());
            put("fileOpen", new ButtonFileOpenCommand());
            put("fileClose", new ButtonFileCloseCommand());

        }
    };

    @Override
    public void execute() {
    }
}

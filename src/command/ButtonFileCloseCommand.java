package command;

import com.Icommand.Icommand;
import util.Util;
import view.MainFrame;

/**
 *
 * @author Toni
 */
public class ButtonFileCloseCommand implements Icommand {

    MainFrame mainFrame;

    public ButtonFileCloseCommand() {

        this.mainFrame = new MainFrame();
    }

    @Override
    public void execute() {
        Util.setMessage("The file is close now !");
    }
}

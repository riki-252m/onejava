package startup;

/**
 * ������������
 */

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import gui.panel.MainFrame;
import gui.panel.MainPanel;
import gui.panel.SpendPanel;
import util.GUIUtil;

public class Bootstrap {
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		GUIUtil.useLNF();

		SwingUtilities.invokeAndWait(new Runnable() {

			@Override
			public void run() {
				MainFrame.instance.setVisible(true);
				MainPanel.instance.workingPanel.show(SpendPanel.instance);
				// 这是一个注释
				// 这是第二个注释
			}
		});
	}
}

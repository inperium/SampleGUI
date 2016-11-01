package samplegui.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import samplegui.controller.SampleGUIController;

public class FirstFrame extends JFrame
{
	private SampleGUIController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(SampleGUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new FirstPanel(baseController);
		
		this. setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Blur Pro Installer");
		this.setSize(new Dimension(600,400));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}

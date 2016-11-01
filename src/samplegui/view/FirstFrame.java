package samplegui.view;

import javax.swing.JFrame;
import samplegui.controller.SampleGUIController;

public class FirstFrame extends JFrame
{

	private SampleGUIController baseController;
	
	public FirstFrame(SampleGUIController baseController)
	{
		super();
		this.baseController = baseController;
	}
}

package samplegui.controller;

import javax.swing.JFrame;
import java.awt.Dimension;
import samplegui.view.FirstFrame;

public class SampleGUIController extends JFrame
{
	private FirstFrame appFrame;
	
	public SampleGUIController()
	{
		this.appFrame = new FirstFrame(this);
	}
	public void start()
	{
		
	}
}
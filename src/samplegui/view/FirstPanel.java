package samplegui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import samplegui.controller.SampleGUIController;

public class FirstPanel extends JPanel
{
	private SampleGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	
	public FirstPanel(SampleGUIController baseController)
	{
		super();
		this.baseController = baseController;
		
		this.colorButton = new JButton("Access Color");
		this.randomButton = new JButton("New Color");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(java.awt.Color.LIGHT_GRAY);
		this.add(colorButton);
		this.add(randomButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}

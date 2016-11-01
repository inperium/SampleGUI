package samplegui.view;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;

import samplegui.controller.SampleGUIController;

public class FirstPanel extends JPanel
{
	private SampleGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public FirstPanel(SampleGUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.colorButton = new JButton("Reset");
		this.randomButton = new JButton("New Color");
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(56,56,56));
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -38, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -210, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 0, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 6, SpringLayout.EAST, randomButton);
	}

	private void setupListeners()
	{
		randomButton.addActionListener((event) -> setBackground(new Color(ThreadLocalRandom.current().nextInt(0, 255), ThreadLocalRandom.current().nextInt(0, 255), ThreadLocalRandom.current().nextInt(0, 255))));
		colorButton.addActionListener((event) -> setBackground(new Color(56,56,56)));
	}
}
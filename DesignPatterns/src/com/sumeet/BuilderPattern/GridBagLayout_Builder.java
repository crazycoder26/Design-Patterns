package com.sumeet.BuilderPattern;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;

import javax.swing.JPanel;

public class GridBagLayout_Builder implements Builder {
	
	private JPanel m_panel = new JPanel();
	private GridBagConstraints c = new GridBagConstraints();
	private int i = 0, j = 0;
	
	@Override
	public void set_width_and_height(int width, int height) {
		m_panel.setLayout(new GridBagLayout());
		m_panel.setBackground(Color.white);
	}

	@Override
	public void start_row() {
		++i;
		j = 0;
	}

	@Override
	public void build_cell(String value) {
		// TODO Auto-generated method stub
		c.gridx = j++;
		c.gridy = i;
		m_panel.add(new Label(value), c);
	}

	@Override
	public Component get_result() {
		// TODO Auto-generated method stub
		return m_panel;
	}
	
}

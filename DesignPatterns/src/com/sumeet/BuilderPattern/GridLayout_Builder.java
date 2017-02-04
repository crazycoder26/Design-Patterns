package com.sumeet.BuilderPattern;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;

public class GridLayout_Builder implements Builder {

	private JPanel m_panel = new JPanel();
	
	@Override
	public void set_width_and_height(int width, int height) {
		m_panel.setLayout(new GridLayout(height, width));
		m_panel.setBackground(Color.white);
	}

	@Override
	public void start_row() {
		// TODO Auto-generated method stub
	}

	@Override
	public void build_cell(String value) {
		m_panel.add(new Label(value));
	}

	@Override
	public Component get_result() {
		// TODO Auto-generated method stub
		return m_panel;
	}
		
}

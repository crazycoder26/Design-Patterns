package com.sumeet.BuilderPattern;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTableBuilder implements Builder {
	private JTable m_table;
	private TableModel m_model;
	private int i = 0, j = 0;

	@Override
	public void set_width_and_height(int width, int height) {
		m_table = new JTable(height, width);
		m_model = m_table.getModel();	
	}
	
	@Override
	public void start_row() {
		++i;
		j = 0;
	}
	
	@Override
	public void build_cell(String value) {
		m_model.setValueAt(value, i, j++);
	}
	
	@Override
	public Component get_result() {
		return m_table;
	}

}

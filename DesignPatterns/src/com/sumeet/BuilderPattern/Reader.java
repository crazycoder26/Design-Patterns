package com.sumeet.BuilderPattern;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
	private Builder m_builder;
	
	public Reader(Builder b){
		m_builder = b;
	}
	
	public void construct(String file_name){
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(file_name));
			String line , cell = "";
			String[] tokens;
			boolean first_line = true;
			
			while((line = br.readLine()) != null){
				tokens = line.split("\\s");
				int i = 0;
				if(first_line){
					 m_builder.set_width_and_height(Integer.parseInt(tokens[0]),
		                      Integer.parseInt(tokens[1]));
					 i = 0;
					 first_line = false;
				}
				for(; i < tokens.length; i++){
					if(tokens[i].equals("")){
						m_builder.build_cell(cell);
						cell = "";
						m_builder.start_row();
					}else if(tokens[i].equals("")){
						m_builder.build_cell(cell);
					}else{
						cell += " " + tokens[i];
					}
				}
				m_builder.build_cell(cell);
				br.close();
			}
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
}

package com.sumeet.factorymethod;

import java.io.File;
import java.util.List;

public class CSVParser extends TextParser{
	public CSVParser(File file){
		System.out.println("Created parser");
	}

	@Override
	public List<Record> parse() {
		// TODO Auto-generated method stub
		System.out.println("Parsing CSV Values");
		return null;
	}
	
	
}

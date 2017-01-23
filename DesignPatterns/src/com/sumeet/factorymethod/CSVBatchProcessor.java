package com.sumeet.factorymethod;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor {

	@Override
	public Parser createParser(File file) {
		// TODO Auto-generated method stub
		return new CSVParser(file);
	}

	
}

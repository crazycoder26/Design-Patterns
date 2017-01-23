package com.sumeet.factorymethod;

import java.io.File;
import java.util.List;

/*
 * CREATED A ABSTRACT CLASS FOR THE BATCH PROCESSOR 
 * TO THE PARSE THE FILE SPECIFIC TO THE FORMAT, CREATE A PARSER INTERFACE.
 * CREATEPARSER METHOD DECIDES WHICH FILE PARSER TO CALL.
 * 
 */
public abstract class BatchProcessor {
	public void processBatch(String fileName){
		File file = openFile(fileName);
		Parser parser  = createParser(file);
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile();
	}
	
	//FACTORY METHOD//
	public abstract Parser createParser(File file);

	private File openFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Opened File");
		return null;
	}

	private void processRecords(List<Record> records){
		System.out.println("processing each records Db calls ");
	}
	private void writeSummary() {
		// TODO Auto-generated method stub
		System.out.println("Wrote Summary");
	}

	private void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closed File");
	}
}

package com.sumeet.factorymethod;

public class Test {
	public static void main(String[] args) {
		BatchProcessor batchProcessor = createBatchProcess(args[1]);
		batchProcessor.processBatch(args[0]);
		System.out.println("Done");
	}

	//STATIC METHOD OR THE STATIC FACTORY
	private static BatchProcessor createBatchProcess(String file) {
		// TODO Auto-generated method stub
		if(file.equals("text")) return new TextBatchProcessor();
		if(file.equals("csv")) return new CSVBatchProcessor();
		return null;
	}
}

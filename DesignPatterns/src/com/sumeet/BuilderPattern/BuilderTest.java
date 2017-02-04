package com.sumeet.BuilderPattern;

import javax.swing.JFrame;

public class BuilderTest {
	public static void main(String[] args) {
		Builder target = null;
		try{
			target = (Builder)Class.forName(args[0]).newInstance();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		Reader parser = new Reader(target);
		parser.construct("BuilderTest.dat");
		
		JFrame frame = new JFrame("BuilderTest - " + args[0]);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(target.get_result());
		frame.pack();
		frame.setVisible(true);
	}
}

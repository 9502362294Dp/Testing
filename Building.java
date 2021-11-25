package com.technoelvate.constructor1;

public class Building {
	private String Areaname;
	private String Blocks;
	int Numberofblocks;

	public Building(String areaname, String blocks, int numberofblocks) {
		Areaname = areaname;
		Blocks = blocks;
		Numberofblocks = numberofblocks;
	}

	public String getAreaname() {
		return Areaname;
	}

	public String getBlocks() {
		return Blocks;
	}

	public int getNumberofblocks() {
		return Numberofblocks;
	}

}

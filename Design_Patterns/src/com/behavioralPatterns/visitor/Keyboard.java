package com.behavioralPatterns.visitor;

public class Keyboard implements ComputerPart{

	@Override
	public void visited(ComputerPartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

}

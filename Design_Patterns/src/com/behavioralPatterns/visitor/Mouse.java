package com.behavioralPatterns.visitor;

public class Mouse implements ComputerPart{

	@Override
	public void visited(ComputerPartVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

}

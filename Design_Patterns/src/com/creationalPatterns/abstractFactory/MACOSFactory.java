package com.creationalPatterns.abstractFactory;

public class MACOSFactory implements WindowFactory {

	public OperatingSystem createOS(){
		return new MACOS();
	}

}

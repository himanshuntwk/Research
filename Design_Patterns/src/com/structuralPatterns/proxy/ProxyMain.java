package com.structuralPatterns.proxy;

public class ProxyMain {
	
	public static void main(String[] args){
		ProxyImage proxyImage = new ProxyImage();
		proxyImage.getRequiredName("real");
		proxyImage.getRequiredName("hidden");
		
	}
}

package com.InheiAssignment;

public class Laptop {
	int noOfUSBPort, processorSpped;
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int n)
	{
		noOfUSBPort = n;
	}
	public int getProcessorSpped()
	{
		return processorSpped;
	}
	public void setProcessorSpped(int s)
	{
		processorSpped = s;
	}
	

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setNoOfUSBPort(5);
		System.out.println("No.of USB Port : "+l.getNoOfUSBPort());
		l.setProcessorSpped(1000);
		System.out.println("Processor Speed : "+l.getProcessorSpped());

	}

}

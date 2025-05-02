package ai.indxo;

public class CheckJavaInstallation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// display java version
		System.out.println("java Version: "+System.getProperty("java.version"));
		
		// display java runtime version
		System.out.println("java runtime version: "+System.getProperty("java.runtime.version"));
		
		// display java home directory
		System.out.println("java home: "+System.getProperty("java.home"));
		
		//display java vendor name
		System.out.println("java Vendor: "+System.getProperty("java.vendor"));
		
		//display java vendor URL
		System.out.println("java vendor URL: "+System.getProperty("java.vendor.url"));
		
		// display java class path
		System.out.println("java class path: "+System.getProperty("java.class.path"));
	}

}

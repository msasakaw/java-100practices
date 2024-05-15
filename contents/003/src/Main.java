public class Main {
	
	public static void main(String[] args) {
		
	    long total = Runtime.getRuntime().totalMemory();
	    long free = Runtime.getRuntime().freeMemory();
	    long max = Runtime.getRuntime().maxMemory();
	    System.out.println("total: " + total/(1024 * 1024));
	    System.out.println("free: " + free/(1024 * 1024));
	    System.out.println("max: " + max/(1024 * 1024));
	}
}
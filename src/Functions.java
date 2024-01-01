
public class Functions {  // Gerçekçilik açısından mesajlar arasında bekleme süresi koyan iki fonksiyon yapısı, Biri int diğeri double
							// Bu sayede polymorphism kullanmış oldum.
	
	
	public void delayInSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
	
	
	public void delayInSeconds(double seconds) {
		
		try {
			Thread.sleep((long) (seconds*1000));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
}

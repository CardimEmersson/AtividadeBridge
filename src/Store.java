
public class Store extends WebApplication{
	
	public Store(Theme theme) {
		super.theme = theme;
		System.out.println("Store" + theme);
	}
	
	public Store() {
		System.out.println("Store");
	}
	
}

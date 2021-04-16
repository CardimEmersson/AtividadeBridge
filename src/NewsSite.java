
public class NewsSite extends WebApplication{
	
	public NewsSite(Theme theme) {
		super.theme = theme;
		System.out.println("NewsSite" + theme);
	}
	
	public NewsSite() {
		System.out.println("NewsSite");
	}
}

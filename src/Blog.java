
public class Blog extends WebApplication {
	
	public Blog(Theme theme) {
		super.theme = theme;
		System.out.println("Blog" + theme);
	}
	
	public Blog() {
		System.out.println("Blog");
	}
	
}

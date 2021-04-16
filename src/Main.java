
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theme light = new Light();
		Theme dark = new Dark();
		
		WebApplication blog = new Blog(light);
		WebApplication store = new Store(dark);
		WebApplication news = new NewsSite(dark);
		
		
	}

}

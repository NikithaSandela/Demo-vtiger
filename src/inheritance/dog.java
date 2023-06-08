package inheritance;

public class dog  extends animal{
	public void Bark()
	{
		System.out.println("Dog says Bark");
	}

	public static void main(String[] args) {
		dog d =new dog();
		d.name("sony");
d.age(15);
d.Bark();
	}

}

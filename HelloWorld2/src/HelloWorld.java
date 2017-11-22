public class HelloWorld {

	public static void main(String[] args) {
		
		String a = "This is a Java App";
		//Create new Car object and define it's plate number
		Cars one = new Cars("SBX12345");
		Cars two = new Cars("ISS65432");
		
		
		System.out.println(a);
		System.out.println("Hello World!");
		//Print the car plate number using the function provided in Car class
		one.ShowCarPlateNumber();
		two.ShowCarPlateNumber();
		one.ShowCarPlateNumber();
	}

}

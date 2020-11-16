
public class InstrumentTest {

	public static void main(String[] args) {
		Instrument ins1= new Guitar();
//		System.out.println(ins1);
		ins1.play();
		Instrument ins2 = new Flute();
		ins2.play();
		Instrument ins3= new Harmonica();
		ins3.play();
//		Instrument ins4 = new Instrument("Flute");
//		ins4.play();
	}
}

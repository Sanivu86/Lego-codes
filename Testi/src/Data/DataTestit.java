package Data;

public class DataTestit implements Runnable{
	
	protected String nimi;
	
	public DataTestit(String nimi)
	{
		this.nimi = nimi;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.print(nimi + " k�ynnistyi");
		//T�m� on Jennin tekem� testi
		
	}

}


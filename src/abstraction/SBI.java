package abstraction;

class Bank{
public class SBI implements Atm {

	@Override
	public String withdraw() {
		
		return "withdraw the money";
	}

	@Override
	public String checkblance() {
		
		return "checkblance";
	}

	@Override
	public String savemoney() {
		
		return "savemoney";
	}

}
  public  Atm Atm() {
	  return new SBI();
  }
}

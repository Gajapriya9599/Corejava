package abstr;
abstract class Bank{
	abstract public void rateOfInterest();
	
}
class SbiBank extends Bank{
	 
	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest is  " +4.5f);
	}
}

class HdfcBank extends Bank{
	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest is  " +4.0f);
		
	}
}

class IciciBank extends Bank{
	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest is  " +5.0f);
		
	}
}

public class BankMain {

	public static void main(String[] args) {
		SbiBank sbi = new SbiBank();
		sbi.rateOfInterest();
		HdfcBank hd = new HdfcBank();
		hd.rateOfInterest();
        IciciBank ic = new IciciBank();
        ic.rateOfInterest();
        
        Bank bk;
        bk = new SbiBank();
        bk.rateOfInterest();
        bk = new HdfcBank();
        bk.rateOfInterest();
        bk = new IciciBank();
        bk.rateOfInterest();
	}

}

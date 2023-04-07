package ProbleS1;

public class Bank {
	public double getRateOfInterest() {
        return 0; // default implementation
    }
}

  public class SBI extends Bank {
    public double getRateOfInterest() {
        return 8.0; // SBI's rate of interest
    }
}

public class ICICI extends Bank {
    public double getRateOfInterest() {
        return 7.0; // ICICI's rate of interest
    }
}

 public class AXIS extends Bank {
    public double getRateOfInterest() {
        return 9.0; // AXIS's rate of interest
    }
}
  public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        
        System.out.println("SBI rate of interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI rate of interest: " + icici.getRateOfInterest());
        System.out.println("AXIS rate of interest: " + axis.getRateOfInterest());
    }

}



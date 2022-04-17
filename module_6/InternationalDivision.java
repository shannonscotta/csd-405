package module_6;

public class InternationalDivision extends Division {
  
    private String divisionCreationCountry;
    private String languageSpoken;
    
    public InternationalDivision(
      String divisionName, // super class param 1
      String accountNumber,          // super class param 2
      String divisionCreationCountry, // sub class parm 1
      String languageSpoken           // sub class param 2
    ){
      super(divisionName, accountNumber);
      this.divisionCreationCountry = divisionCreationCountry;
      this.languageSpoken = languageSpoken;
    }
    
    public void display(){
        system.out.println("The division name is " + divisionName);
        system.out.println("The account number is " + accountNumber);
        system.out.println("The language spoken is " + languageSpoken);
        system.out.println("The division creation country is " + divisionCreationCountry);
    }
    
  }
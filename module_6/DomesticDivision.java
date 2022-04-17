package module_6;

public class DomesticDivision extends Division {
  
    private String stateDivision;
   
   public DomesticDivision(String divisionName, String accountNumber, String stateDivision){
     super(divisionName, accountNumber);
     this.stateDivision = stateDivision;
     
   }
     public void display(){
       system.out.println("The state division is " + stateDivision);
       system.out.println("The division name is " + divisionName);
       system.out.println("The account number is " + accountNumber);
   }
 }
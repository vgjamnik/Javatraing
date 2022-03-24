import java.math.BigDecimal;
public class TotalAmount {
    BigDecimal Principal;
    BigDecimal Interest;


    public TotalAmount(String Principal, String Interest) {
        this.Principal = new BigDecimal(Principal);
        this.Interest = new BigDecimal(Interest).divide(new BigDecimal(100));
    }

    public static void main(String [] args){
        System.out.println("This is a program for Total Amount calculator:- ");
        TotalAmount SIcal = new TotalAmount( "100","10");
        BigDecimal totalvalue =SIcal.calculateTotalValue( 5);  // For 5 years interest
        System.out.println(totalvalue);


    }

    public BigDecimal calculateTotalValue(int noOfYears) {

        BigDecimal noOfYearBigDecimal = new BigDecimal(noOfYears);
    //Total value = Principal + Principal * Interest * NoOfYears;
        System.out.println("The Total Amount is  :- ");
        BigDecimal totalvalue = Principal.add(Principal.multiply(Interest).multiply(new BigDecimal(String.valueOf(noOfYearBigDecimal))));

        return totalvalue;

    }

}

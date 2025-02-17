public class LoanCalc {
 private   double rate;
   private int loanAmount;
   private double period;
   

    //constructor
    public LoanCalc(){
        rate =0.0;
        loanAmount = 0;
        period = 0.0;
    }
    //setters
    public void setRate(double r){
        rate = r;
    }
    public void setLoanAmount(int l){
        loanAmount = l;
    }
    public void setPeriod(double p){
        period = p;
    }
    public double getRate(){
        return rate;
    }
    public int getLoanAmount(){
        return loanAmount;
    }
    public double getPeriod(){
        return period;
    }
    public double totalAmount(){
double interest= (loanAmount * rate * period)/100;
double result = loanAmount + interest;
return result;
    }
}

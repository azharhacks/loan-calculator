import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CalcTest {
    public void main (String args[]){
       double rate;
       String rateString;
        int loanAmount;
       double result;
       double period;
       double months;

       LoanCalc loan = new LoanCalc();
       
      
     loanAmount= Integer.parseInt(JOptionPane.showInputDialog("Enter loan amount "));
     loan.setLoanAmount(loanAmount);
    JFrame frame = new JFrame("Loan Calculator");
     rate= Double.parseDouble(JOptionPane.showInputDialog("Enter rate in %"));
     loan.setRate(rate);

    period= Double.parseDouble(JOptionPane.showInputDialog("Enter period in years"));
    loan.setPeriod(period);
    months=period*12;

    result=loan.totalAmount();

    JOptionPane.showMessageDialog(frame, "Total amount to be paid in "+period+" years is "+ result+" and  monthly payments is "+result/months);


       
    }
}

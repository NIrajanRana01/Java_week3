package Java_week3;
public class SimpleInterest {
    // Private data fields
    private double principal;
    private double time;
    private double rate;

    
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    
    public double getPrincipal() {
        return principal;
    }

    
    public void setTime(double time) {
        this.time = time;
    }

    
    public double getTime() {
        return time;
    }

    
    public void setRate(double rate) {
        this.rate = rate;
    }

    
    public double getRate() {
        return rate;
    }

    
    public double calculateInterest() {
        return (principal * time * rate) / 100;
    }

    
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();

        si.setPrincipal(10000); 
        si.setTime(2);          
        si.setRate(5);          

        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}

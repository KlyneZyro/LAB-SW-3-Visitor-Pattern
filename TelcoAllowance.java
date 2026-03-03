// TelcoAllowance.java concrete visitor interface
public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        if (telcoName.equals("Smart")) {
            return "15 GB for ₱" + money + " per month";
        } else if (telcoName.equals("Globe")) {
            return "10 GB for ₱" + money + " per month";
        } else if (telcoName.equals("Ditto")) {
            return "8 GB for ₱" + money + " per month";
        }
        return "Unknown Telco";
    }
}
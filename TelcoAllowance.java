public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        String allowance = "";
        if (telcoName.equalsIgnoreCase("Smart")) {
            allowance = "15 GB";
        } else if (telcoName.equalsIgnoreCase("Globe")) {
            allowance = "10 GB";
        } else if (telcoName.equalsIgnoreCase("Ditto")) {
            allowance = "8 GB";
        }
        return allowance + " for ₱" + promoPrice + " per month.";
    }
}
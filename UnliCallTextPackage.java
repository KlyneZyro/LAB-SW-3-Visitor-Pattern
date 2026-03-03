// UnliCallTextPackage.java concrete visitor interface
public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (telcoName.equals("Smart")) {
            return "They do not offer any free calls or texts, and you will be charged per use.";
        } else if (telcoName.equals("Globe")) {
            return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        } else if (telcoName.equals("Ditto")) {
            return "This plan includes unlimited calls and texts to all networks within the country.";
        }
        return "No package available.";
    }
}
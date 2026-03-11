public class customeException {


    public static void except() throws InvalidAmountException {
        int amount = -500; // Try with 5000 to see normal flow

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount: " + amount + ". Must be greater than 0.");
        }

        System.out.println("Amount accepted: " + amount);
    }


    public static void main(String[]args){
        customeException c=new customeException();

        try{
            except();
        } catch (InvalidAmountException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        }

    }
}

public class Can {

    //Instansvariabler
    private String deposit;
    private double value;
    private String description;

    //Constructor der tager den panttype brugeren angiver og udregner value ud fra dette
    public Can(String deposit) {
        this.deposit = deposit;

            if (deposit.equalsIgnoreCase("A")) {
                value = 1.0;
                description = "Can or bottle less than 1 liter.";
            } else if (deposit.equalsIgnoreCase("B")) {
                value = 1.5;
                description = "Bottle of plastic 0,5 liter.";
            } else if (deposit.equalsIgnoreCase("C")) {
                value = 3.0;
                description = "Can or bottle more than 1 liter.";
            }

        System.out.println("Dåse med værdi " + value + " er oprettet.");
    }

    //Metode der returnerer værdi på Can-objekt
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CAN\nDeposit: " + deposit + "\nValue: " + value + "\nDescription: " + description;
    }
}
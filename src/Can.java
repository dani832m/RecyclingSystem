public class Can {

    private Deposit deposit;
    private double value;


    public Can(Deposit deposit, double value) {
        this.deposit = deposit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "-------------- \n CAN \n Deposit: " + deposit + ".\n Value: " + value + "\n-------------- \n";
    }

}
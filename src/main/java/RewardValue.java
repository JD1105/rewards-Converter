public class RewardValue {
    double cashValue,mileSvalue,cashValueInMiles=0.0035;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(int mileSvalue){
        this.mileSvalue=mileSvalue;
    }
    public double getMilesValue(){
        return cashValueInMiles*cashValue;
    }
    public double getCashValue(){
        return (mileSvalue/cashValueInMiles);
    }
}

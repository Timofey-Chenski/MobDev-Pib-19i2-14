import java.io.Serializable;

public abstract class Human implements Serializable
{


    int idNumber;
    int amountOfVisits;

    public void setAmountOfVisits(int amountOfVisits) {
        this.amountOfVisits = amountOfVisits;
    }
}

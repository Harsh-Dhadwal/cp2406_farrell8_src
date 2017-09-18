package PracExercises;

public class PetSold extends ItemSold{
    private boolean vaccinated, neutered, housebroken;

    public void setVaccinated(boolean isVaccinated){
        this.vaccinated = isVaccinated;
    }

    public void setNeutered(boolean isNeutered){
        this.neutered = isNeutered;
    }

    public void setHousebroken(boolean isHousebroken){
        this.housebroken = isHousebroken;
    }

    public String getVaccinated() {
        if (vaccinated){
            return "Yes";
        }else {
            return "No";
        }
    }

    public String getNeutered() {
        if (neutered){
            return "Yes";
        }else {
            return "No";
        }
    }

    public String getHousebroken() {
        if (housebroken){
            return "Yes";
        }else {
            return "No";
        }
    }
}

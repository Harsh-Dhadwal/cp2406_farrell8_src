package PracExercises;

class PhysicalNewspaperSubscription extends NewspaperSubscription{
    @Override
    void setAddress() {
        System.out.println("Error: address field can't be empty");
        super.rate = 0;
    }

    void setAddress(String address){
        super.address = address;
        super.rate = 15;
    }
}

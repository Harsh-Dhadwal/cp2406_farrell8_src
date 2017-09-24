package PracExercises;

class OnlineNewspaperSubscription extends NewspaperSubscription{

    @Override
    void setAddress() {
        System.out.println("Error: address field can't be empty");
        super.rate = 0;
    }

    void setAddress(String address){
        if (address.contains("@")){
            super.address = address;
            super.rate = 9;
        } else {
            System.out.println("Error: address field must Contain '@' symbol");
        }
    }
}

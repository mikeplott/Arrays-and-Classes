/**
 * Created by michaelplott on 9/12/16.
 */
public class Apartment {
    // represents an apartment by address if its a good neighborhood and if a resident would recommend someone to live there.
    String apartmentName;
    String street;
    String city;
    int zipCode;
    String state;
    int aptNumber;
    int floor;
    boolean isGoodNeighborhood;
    boolean wouldRecommend;


    Apartment(String newApartmentName, String newStreet, String newCity, int newZipcode, String newState, int newAptNumber,
              int newFloor, boolean newIsGoodNeighborhood, boolean newWouldRecommend) {
        setApartmentName(newApartmentName);
        setStreet(newStreet);
        setCity(newCity);
        setZipcode(newZipcode);
        setState(newState);
        setAptNumber(newAptNumber);
        setFloor(newFloor);
        setIsGoodNeighborhood(newIsGoodNeighborhood);
        setWouldRecommend(newWouldRecommend);
    }

    String getApartmentName() {
        return apartmentName;
    }

    void setApartmentName(String newApartmentName) {
        apartmentName = newApartmentName;
    }

    String getStreet() {
        return street;
    }

    void setStreet(String newStreet) {
        street = newStreet;
    }

    String getCity() {
        return city;
    }

    void setCity(String newCity) {
        city = newCity;
    }

    int getZipCode() {
        return zipCode;
    }

    void setZipcode(int newZipcode) {
        zipCode = newZipcode;
    }

    String getState() {
        return state;
    }

    void setState(String newState) {
        state = newState;
    }

    int getAptNumber() {
        return aptNumber;
    }

    void setAptNumber(int newAptNumber) {
        aptNumber = newAptNumber;
    }

    int getFloor() {
        return floor;
    }

    void setFloor(int newFloor) {
        floor = newFloor;
    }

    boolean isGoodNeighborhood() {
        return isGoodNeighborhood;
    }

    void setIsGoodNeighborhood(boolean newIsGoodNeighborhood) {
        if (newIsGoodNeighborhood = false) {
            wouldRecommend = false;
        } else {
            isGoodNeighborhood = newIsGoodNeighborhood;
        }
    }

    boolean isWouldRecommend() {
        return wouldRecommend;
    }

    void setWouldRecommend(boolean newWouldRecommend) {
        wouldRecommend = newWouldRecommend;
    }
}

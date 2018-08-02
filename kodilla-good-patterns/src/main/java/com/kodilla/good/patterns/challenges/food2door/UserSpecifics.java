package com.kodilla.good.patterns.challenges.food2door;

public class UserSpecifics {

   private String name;
   private String surname;
   private String deliveryAddress;
   private int phoneNumber;

   public UserSpecifics(String name, String surname, String deliveryAdress, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.deliveryAddress = deliveryAdress;
        this.phoneNumber = phoneNumber;
   }
   public String getName() { return name; }
   public String getSurname() {
            return surname;
        }
   public String getDeliveryAddress(){
            return deliveryAddress;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSpecifics that = (UserSpecifics) o;

        if (phoneNumber != that.phoneNumber) return false;
        if (!name.equals(that.name)) return false;
        if (!surname.equals(that.surname)) return false;
        return deliveryAddress.equals(that.deliveryAddress);
    }

    @Override
    public String toString() {
        return "UserSpecifics{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", deliveryAdress='" + deliveryAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

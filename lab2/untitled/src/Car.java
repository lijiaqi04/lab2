import java.util.Date;

public class Car {
    private String brand;
    private int year;
    private int seats;
    private long serialNumber;
    private boolean available;
    private long modelNumber;
    private String certificace;
    private String city;
    private String maufacturers;


    public String getMaufacturers() {
        return maufacturers;
    }

    public void setMaufacturers(String maufacturers) {
        this.maufacturers = maufacturers;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(long modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCertificace() {
        return certificace;
    }

    public void setCertificace(String certificaace) {
        this.certificace = certificaace;

    }

}

import java.util.ArrayList;
import java.util.Date;

public class CarHistory {

    Date time;
    private ArrayList<Car> history;
    public CarHistory(){
        this.history=new ArrayList<Car>();
        Car car_1=new Car();
        car_1.setCity("boston");
        car_1.setAvailable(true);
        car_1.setMaufacturers("233");
        car_1.setYear(2010);
        car_1.setSerialNumber(122423);
        car_1.setModelNumber(12314);
        car_1.setCertificace("2022-04-04");
        car_1.setSeats(4);
        car_1.setBrand("toyota");
        history.add(car_1);
        Car car_2=new Car();
        car_2.setCity("boston");
        car_2.setAvailable(true);
        car_2.setMaufacturers("233");
        car_2.setYear(2013);
        car_2.setSerialNumber(1224423);
        car_2.setModelNumber(124314);
        car_2.setCertificace("2023-04-04");
        car_2.setSeats(6);
        car_2.setBrand("GM");
        history.add(car_2);
        time = new Date();
    }
    public void setTime(){
        time = new Date();
        return;
    }
    public Date getTime() {
        return time;
    }
    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    public Car addNewCar(){
        Car newCar=new Car();
        history.add(newCar);
        return newCar;
    }
    public void deleteCar(int vs){
        history.remove(vs);
    }
}


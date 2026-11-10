
package watertank;

import java.util.ArrayList;


public class WaterLevelObservable {
    private ArrayList<WaterLevelObserver> observerList=new ArrayList<>();
    private int waterLevel;
    private String date;
    private String time;
    
    
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observerList.add(waterLevelObserver);
    }
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observerList.remove(waterLevelObserver);
    }
    public void setWaterLevel(int waterLevel, String date, String time){
        this.date = date;
        this.time = time;
        if(this.waterLevel != waterLevel){
            this.waterLevel=waterLevel;
            notifyObservers();
        }
    }
    public void notifyObservers(){
        for(WaterLevelObserver waterLevelObserver:observerList){
            waterLevelObserver.update(waterLevel, date, time);
        }
    }
}

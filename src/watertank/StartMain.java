
package watertank;


public class StartMain {
    public static void main(String[] args){
        WaterLevelObservable waterlevelObservable=new WaterLevelObservable();
        waterlevelObservable.addWaterLevelObserver(new Alarm());
        waterlevelObservable.addWaterLevelObserver(new Display());
        new WaterTank(waterlevelObservable).setVisible(true);
    }
}

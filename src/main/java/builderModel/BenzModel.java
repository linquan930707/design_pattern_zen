package builderModel;


public class BenzModel extends CarModel {

    //控制是否鸣笛的开光
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车关闭");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎");
    }
    @Override
    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isFlag){
        this.alarmFlag = isFlag;
    }
}

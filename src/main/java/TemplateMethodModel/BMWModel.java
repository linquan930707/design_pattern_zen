package TemplateMethodModel;

public class BMWModel extends CarModel {

    //控制是否鸣笛的开光
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马关闭");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎");
    }

    @Override
    protected boolean isAlarm(){
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isFlag){
        this.alarmFlag = isFlag;
    }
}

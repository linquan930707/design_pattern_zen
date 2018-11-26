package TemplateMethodModel;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    //决定执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
   //汽车模型启动
    protected abstract  void start();

    //关闭
    protected abstract void stop();

    //喇叭声音
    protected abstract void alarm();

    //引擎声音
    protected abstract void engineBoom();

    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                if(this.isAlarm()){
                    this.alarm();
                }
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }
    final public void setSequence(ArrayList<String> lst){
        this.sequence = lst;
    }
    protected boolean isAlarm(){
        return true;
    }


}

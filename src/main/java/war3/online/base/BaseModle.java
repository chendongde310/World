package war3.online.base;

/**
 * Created by chen on 2018/3/21.
 * 下午2:15
 * 基础物接口，所以基础物都必须实现这个接口
 */
public  class BaseModle {

    //开发属性
     String ID;
     String name;
     String describe;


    //物理属性
     double temperature; //温度
     State state ; //状态   固态／液态／气态


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public double getTemperature() {
        return temperature;
    }

    public State getState() {
        return state;
    }
}

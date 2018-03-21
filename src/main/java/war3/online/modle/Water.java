package war3.online.modle;

import war3.online.base.BaseModle;


/**
 * Created by chen on 2018/3/21.
 * 下午2:13
 */
public class Water extends BaseModle {

    int x;
    int y;
    int z;

    private Water(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Water createWater(int x, int y, int z) {
        return new Water(x, y, z);
    }





}

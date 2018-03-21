package war3.online.base;

import lombok.Builder;
import lombok.Data;

/**
 * Created by chen on 2018/3/21.
 * 下午2:27
 * 状态 固态／液态／气态
 */

public class State {

   public int defaultState;
   public int solidPoint ;   //固态转化点  低于这个值转化
   public int airPoint ;   //气态转化点   高于这个值转化

   public State(int defaultState, int solidPoint, int airPoint) {
      this.defaultState = defaultState;
      this.solidPoint = solidPoint;
      this.airPoint = airPoint;
   }
}

package war3.online;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import war3.online.modle.Water;


@SpringBootApplication
public class WorldApplication {

    public static void main(String[] args) {
        //SpringApplication.run(WorldApplication.class, args);


        test();
    }

    private static void test() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k <4; k++) {
                    Water.createWater(i, j, k);
                }
            }

        }


        System.out.print("");



    }
}

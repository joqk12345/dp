package builder.scene;

import builder.director.Director;

/**
 * ClientB
 *
 * @author joqk
 * @Date 2018 2018/1/20 23:06
 **/
public class ClientB {

    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 1000; i++) {
            director.getABenzModel().run();
        }
        //....
    }
}

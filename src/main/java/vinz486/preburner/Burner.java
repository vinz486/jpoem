package vinz486.preburner;

import vinz486.preburner.dagger.component.DaggerPreBurnerComponent;
import vinz486.preburner.preburner.PreBurner;

public class Burner {


    public static void main(String[] args) {

        PreBurner preBurner = DaggerPreBurnerComponent.create().getPreBurner();

        preBurner.burn();
    }
}

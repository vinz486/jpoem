package vinz486.preburner.dagger;

import dagger.Component;
import vinz486.preburner.preburner.PreBurner;

@Component
public interface PreBurnerComponent {

    PreBurner getPreBurner();
}

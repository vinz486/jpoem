package vinz486.preburner.dagger.component;

import dagger.Component;
import vinz486.preburner.Burner;
import vinz486.preburner.dagger.module.ParserModule;
import vinz486.preburner.preburner.PreBurner;

@Component(modules = ParserModule.class)
public interface PreBurnerComponent {

    PreBurner getPreBurner();

    void inject(Burner burner);
}

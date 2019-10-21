package vinz486.jpoem.dagger.component;

import dagger.Component;
import vinz486.jpoem.JPoem;
import vinz486.jpoem.dagger.module.ParserModule;
import vinz486.jpoem.poem.Poem;

@Component(modules = ParserModule.class)
public interface JPoemComponent {

    Poem getPoem();

    void inject(JPoem poem);
}

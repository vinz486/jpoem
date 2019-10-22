package vinz486.jpoem;

import vinz486.jpoem.dagger.component.DaggerJPoemComponent;
import vinz486.jpoem.poem.Poem;

public class JPoem {

    public static void main(String[] args) {

        Poem poem = DaggerJPoemComponent.create().getPoem();

        poem.burn();
    }
}

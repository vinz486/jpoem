package vinz486.jpoem.poem;

import vinz486.jpoem.parser.Parser;

import javax.inject.Inject;


public class Poem {

    @Inject
    Parser parser;

    @Inject
    public Poem() {

    }

    public void burn() {

        parser.parse();
    }
}

package vinz486.preburner.preburner;

import vinz486.preburner.parser.Parser;

import javax.inject.Inject;


public class PreBurner {

    @Inject
    Parser parser;

    @Inject
    public PreBurner() {

        burn();
    }

    public void burn() {

        parser.parse();
    }
}

package vinz486.jpoem.parser;

import com.reprezen.kaizen.oasparser.OpenApi3Parser;

import javax.inject.Inject;
import java.io.File;

public class SpecParser implements Parser {

    @Inject
    OpenApi3Parser openApi3Parser;

    @Inject
    public SpecParser() {

    }

    @Override
    public void parse() {

        try {
            openApi3Parser.parse(new File(""));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("parsing");
    }
}

package vinz486.preburner.parser;

import javax.inject.Inject;
import com.reprezen.kaizen.oasparser.model3.OpenApi3;

public class OpenApiParser implements Parser {

    @Inject
    OpenApi3Parser openApi3Parser;


    @Override
    public void parse() {

        openApi3Parser

        System.out.println("parsing");
    }
}

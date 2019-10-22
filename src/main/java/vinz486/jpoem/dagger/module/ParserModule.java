package vinz486.jpoem.dagger.module;

import com.reprezen.kaizen.oasparser.OpenApi3Parser;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import vinz486.jpoem.parser.SpecParser;
import vinz486.jpoem.parser.Parser;

@Module
public abstract class ParserModule {

    @Binds
    abstract Parser provideParser(SpecParser parser);

    @Provides
    static OpenApi3Parser provideOpenApi3Parser() {

        return new OpenApi3Parser();
    }
}

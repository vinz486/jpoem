package vinz486.jpoem.dagger.module;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import vinz486.jpoem.parser.OpenApiParser;
import vinz486.jpoem.parser.Parser;

@Module
public abstract class ParserModule {

    @Binds
    abstract Parser provideParser(OpenApiParser parser);

    @Provides
    static OpenApiParser provideOpenApiParser() {

        return new OpenApiParser();
    }
}

package vinz486.preburner.dagger.module;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import vinz486.preburner.parser.OpenApiParser;
import vinz486.preburner.parser.Parser;

@Module
public abstract class ParserModule {

    @Binds
    abstract Parser provideParser(OpenApiParser parser);

    @Provides
    static OpenApiParser provideOpenApiParser() {

        return new OpenApiParser();
    }
}

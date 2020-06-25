import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.logging.log4j.Level;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogListenerTest {

    @Test
    public void whenLogContainsOneErrorLogEntry_thenOneErrorIsReturned() throws Exception {
        String logLine = "2018-May-05 14:20:24 ERROR Bad thing happened";

        loggingLexer lexer = new loggingLexer(CharStreams.fromString(logLine));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        loggingParser parser = new loggingParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        LogListener logListener = new LogListener();
        walker.walk(logListener,parser.log());
        LogEntry entry = logListener.getEntries().get(0);

        assertThat(entry.getLevel(), is(Level.ERROR));
        assertThat(entry.getMessage(), is("Bad thing happened"));
        assertThat(entry.getTimeStamp(), is(LocalDateTime.of(2018,5,5,14,20,24)));
    }
}
import org.apache.logging.log4j.Level;

import java.time.format.DateTimeFormatter;
import java.util.Date.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LogListener extends loggingBaseListener {
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMATTER
            = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss", Locale.ENGLISH);
    private List<LogEntry> entries = new ArrayList<>();
    private LogEntry current;

    @Override
    public void enterEntry(loggingParser.EntryContext ctx) {
        this.current = new LogEntry();
    }

    @Override
    public void enterLevel(loggingParser.LevelContext ctx) {
        this.current.setLevel(Level.valueOf(ctx.getText()));
    }

    @Override
    public void enterTimestamp(loggingParser.TimestampContext ctx) {
        this.current.setTimeStamp(LocalDateTime.parse(ctx.getText(), DEFAULT_DATETIME_FORMATTER));
    }

    @Override
    public void enterMessage(loggingParser.MessageContext ctx) {
        this.current.setMessage(ctx.getText());
    }

    @Override
    public void exitEntry(loggingParser.EntryContext ctx) {
        this.entries.add(this.current);
    }

    public List<LogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<LogEntry> entries) {
        this.entries = entries;
    }
}

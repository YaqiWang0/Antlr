// Generated from logging.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link loggingParser}.
 */
public interface loggingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link loggingParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(loggingParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link loggingParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(loggingParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link loggingParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(loggingParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link loggingParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(loggingParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link loggingParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(loggingParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link loggingParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(loggingParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link loggingParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(loggingParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link loggingParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(loggingParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link loggingParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(loggingParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link loggingParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(loggingParser.MessageContext ctx);
}
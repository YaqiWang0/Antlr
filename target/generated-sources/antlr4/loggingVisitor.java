// Generated from logging.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link loggingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface loggingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link loggingParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(loggingParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link loggingParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(loggingParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link loggingParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(loggingParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link loggingParser#level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel(loggingParser.LevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link loggingParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(loggingParser.MessageContext ctx);
}
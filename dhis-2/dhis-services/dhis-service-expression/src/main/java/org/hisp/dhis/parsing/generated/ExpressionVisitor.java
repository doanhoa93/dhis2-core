// Generated from /Users/jim/Documents/dev/dhis2/dhis2-core/dhis-2/dhis-services/dhis-service-expression/src/main/resources/org/hisp/dhis/parsing/Expression.g4 by ANTLR 4.7.1
package org.hisp.dhis.parsing.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programIndicatorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIndicatorExpr(ExpressionParser.ProgramIndicatorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programIndicatorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIndicatorVariable(ExpressionParser.ProgramIndicatorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programIndicatorFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIndicatorFunction(ExpressionParser.ProgramIndicatorFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA0(ExpressionParser.A0Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a0_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA0_1(ExpressionParser.A0_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA1(ExpressionParser.A1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a1_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA1_2(ExpressionParser.A1_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a1_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA1_n(ExpressionParser.A1_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA2(ExpressionParser.A2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#a3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA3(ExpressionParser.A3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#dataElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataElement(ExpressionParser.DataElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#dataElementOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataElementOperand(ExpressionParser.DataElementOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programDataElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDataElement(ExpressionParser.ProgramDataElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programTrackedEntityAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramTrackedEntityAttribute(ExpressionParser.ProgramTrackedEntityAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIndicator(ExpressionParser.ProgramIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#orgUnitCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrgUnitCount(ExpressionParser.OrgUnitCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#reportingRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportingRate(ExpressionParser.ReportingRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ExpressionParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#days}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDays(ExpressionParser.DaysContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#dataElementId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataElementId(ExpressionParser.DataElementIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#dataElementOperandId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataElementOperandId(ExpressionParser.DataElementOperandIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programDataElementId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDataElementId(ExpressionParser.ProgramDataElementIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programTrackedEntityAttributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramTrackedEntityAttributeId(ExpressionParser.ProgramTrackedEntityAttributeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#programIndicatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIndicatorId(ExpressionParser.ProgramIndicatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#orgUnitCountId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrgUnitCountId(ExpressionParser.OrgUnitCountIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#reportingRateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReportingRateId(ExpressionParser.ReportingRateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#constantId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantId(ExpressionParser.ConstantIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ExpressionParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ExpressionParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ExpressionParser.BooleanLiteralContext ctx);
}
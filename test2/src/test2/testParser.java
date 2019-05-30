// Generated from test.g4 by ANTLR 4.5.3

        package test2;
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NEWLINE=18, LETTER=19, SPACED_LETTER=20;
	public static final int
		RULE_test = 0, RULE_statement = 1, RULE_ok = 2, RULE_expr = 3, RULE_multExpression = 4, 
		RULE_expression = 5, RULE_atom = 6;
	public static final String[] ruleNames = {
		"test", "statement", "ok", "expr", "multExpression", "expression", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "' Or '", "' OR '", "' or '", "'|'", "'*'", "' AND '", "' and '", 
		"' And '", "'&'", "'-'", "' NOT '", "' not '", "' Not '", "'!'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NEWLINE", "LETTER", "SPACED_LETTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public String memory = new String("");

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TestContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTest(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LETTER) | (1L << SPACED_LETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public OkContext ok;
		public OkContext ok() {
			return getRuleContext(OkContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(testParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((StatementContext)_localctx).ok = ok();
			setState(20);
			match(NEWLINE);
			 //System.out.println(((StatementContext)_localctx).ok.value); 
			                  memory = ((StatementContext)_localctx).ok.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OkContext extends ParserRuleContext {
		public String value;
		public ExprContext k;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterOk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitOk(this);
		}
	}

	public final OkContext ok() throws RecognitionException {
		OkContext _localctx = new OkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((OkContext)_localctx).k = expr();
			((OkContext)_localctx).value =  "SELECT `triple id` FROM triples WHERE ("+((OkContext)_localctx).k.value1+") OR ("+((OkContext)_localctx).k.value2+")";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String value1;
		public String value2;
		public MultExpressionContext me1;
		public MultExpressionContext me2;
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((ExprContext)_localctx).me1 = multExpression();
			((ExprContext)_localctx).value1 =  ((ExprContext)_localctx).me1.value1;
			                              ((ExprContext)_localctx).value2 =  ((ExprContext)_localctx).me1.value2;
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(29);
				((ExprContext)_localctx).me2 = multExpression();
				((ExprContext)_localctx).value1 =  _localctx.value1 +" OR "+((ExprContext)_localctx).me2.value1;
				      ((ExprContext)_localctx).value2 =  _localctx.value2 +" OR "+((ExprContext)_localctx).me2.value2;
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExpressionContext extends ParserRuleContext {
		public String value1;
		public String value2;
		public ExpressionContext a1;
		public ExpressionContext a2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((MultExpressionContext)_localctx).a1 = expression();
			((MultExpressionContext)_localctx).value1 =  ((MultExpressionContext)_localctx).a1.value1;((MultExpressionContext)_localctx).value2 =  ((MultExpressionContext)_localctx).a1.value2;
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(40);
				((MultExpressionContext)_localctx).a2 = expression();
				((MultExpressionContext)_localctx).value1 =  _localctx.value1+" AND "+((MultExpressionContext)_localctx).a2.value2;
				      ((MultExpressionContext)_localctx).value2 =  _localctx.value2+" AND "+((MultExpressionContext)_localctx).a2.value1;
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String value1;
		public String value2;
		public AtomContext ex1;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__15:
			case LETTER:
			case SPACED_LETTER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(48);
				((ExpressionContext)_localctx).ex1 = atom();
				((ExpressionContext)_localctx).value1 =  ((ExpressionContext)_localctx).ex1.value1;((ExpressionContext)_localctx).value2 =  ((ExpressionContext)_localctx).ex1.value2;
				}
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(51);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(52);
				((ExpressionContext)_localctx).ex1 = atom();
				((ExpressionContext)_localctx).value1 =  "(!"+((ExpressionContext)_localctx).ex1.value1+" AND !"+((ExpressionContext)_localctx).ex1.value2+")";((ExpressionContext)_localctx).value2 =  "(!"+((ExpressionContext)_localctx).ex1.value1+" AND !"+((ExpressionContext)_localctx).ex1.value2+")";
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public String value1;
		public String value2;
		public Token n1;
		public ExprContext expr;
		public TerminalNode LETTER() { return getToken(testParser.LETTER, 0); }
		public TerminalNode SPACED_LETTER() { return getToken(testParser.SPACED_LETTER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((AtomContext)_localctx).n1 = match(LETTER);
				((AtomContext)_localctx).value1 =  "(`object id` IN (SELECT id FROM objects WHERE name='"+(((AtomContext)_localctx).n1!=null?((AtomContext)_localctx).n1.getText():null)+"'))";
				                    ((AtomContext)_localctx).value2 =  "(`subject id` IN (SELECT id FROM objects WHERE name='"+(((AtomContext)_localctx).n1!=null?((AtomContext)_localctx).n1.getText():null)+"'))";
				}
				break;
			case SPACED_LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((AtomContext)_localctx).n1 = match(SPACED_LETTER);
				((AtomContext)_localctx).value1 =  "(`object id` IN (SELECT id FROM objects WHERE name="+(((AtomContext)_localctx).n1!=null?((AtomContext)_localctx).n1.getText():null)+"))";
				                    ((AtomContext)_localctx).value2 =  "(`subject id` IN (SELECT id FROM objects WHERE name="+(((AtomContext)_localctx).n1!=null?((AtomContext)_localctx).n1.getText():null)+"))";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__15);
				setState(62);
				((AtomContext)_localctx).expr = expr();
				setState(63);
				match(T__16);
				((AtomContext)_localctx).value1 = "("+((AtomContext)_localctx).expr.value1+")";
				                        ((AtomContext)_localctx).value2 = "("+((AtomContext)_localctx).expr.value2+")";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5#\n\5\f\5\16\5"+
		"&\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7:\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3"+
		"\b\2\2\t\2\4\6\b\n\f\16\2\5\3\2\3\7\3\2\b\f\3\2\r\21E\2\21\3\2\2\2\4\25"+
		"\3\2\2\2\6\31\3\2\2\2\b\34\3\2\2\2\n\'\3\2\2\2\f9\3\2\2\2\16D\3\2\2\2"+
		"\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2"+
		"\24\3\3\2\2\2\25\26\5\6\4\2\26\27\7\24\2\2\27\30\b\3\1\2\30\5\3\2\2\2"+
		"\31\32\5\b\5\2\32\33\b\4\1\2\33\7\3\2\2\2\34\35\5\n\6\2\35$\b\5\1\2\36"+
		"\37\t\2\2\2\37 \5\n\6\2 !\b\5\1\2!#\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%\t\3\2\2\2&$\3\2\2\2\'(\5\f\7\2(/\b\6\1\2)*\t\3\2\2"+
		"*+\5\f\7\2+,\b\6\1\2,.\3\2\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\13\3\2\2\2\61/\3\2\2\2\62\63\5\16\b\2\63\64\b\7\1\2\64:\3\2\2"+
		"\2\65\66\t\4\2\2\66\67\5\16\b\2\678\b\7\1\28:\3\2\2\29\62\3\2\2\29\65"+
		"\3\2\2\2:\r\3\2\2\2;<\7\25\2\2<E\b\b\1\2=>\7\26\2\2>E\b\b\1\2?@\7\22\2"+
		"\2@A\5\b\5\2AB\7\23\2\2BC\b\b\1\2CE\3\2\2\2D;\3\2\2\2D=\3\2\2\2D?\3\2"+
		"\2\2E\17\3\2\2\2\7\23$/9D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
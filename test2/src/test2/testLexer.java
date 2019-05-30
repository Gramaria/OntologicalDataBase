// Generated from test.g4 by ANTLR 4.5.3

        package test2;
	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NEWLINE=18, LETTER=19, SPACED_LETTER=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"NEWLINE", "LETTER", "SPACED_LETTER"
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


		public String memory = new String("");


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\5\23p\n\23\3\23\3\23"+
		"\3\24\6\24u\n\24\r\24\16\24v\3\25\3\25\6\25{\n\25\r\25\16\25|\3\25\3\25"+
		"\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26\3\2\4\6\2\62;C\\c|\u0412\u0451\7\2\""+
		"\"\62;C\\c|\u0412\u0451\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3"+
		"+\3\2\2\2\5-\3\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2"+
		"\17@\3\2\2\2\21F\3\2\2\2\23L\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2"+
		"\2\33\\\3\2\2\2\35b\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#l\3\2\2\2%o\3\2\2\2"+
		"\'t\3\2\2\2)x\3\2\2\2+,\7-\2\2,\4\3\2\2\2-.\7\"\2\2./\7Q\2\2/\60\7t\2"+
		"\2\60\61\7\"\2\2\61\6\3\2\2\2\62\63\7\"\2\2\63\64\7Q\2\2\64\65\7T\2\2"+
		"\65\66\7\"\2\2\66\b\3\2\2\2\678\7\"\2\289\7q\2\29:\7t\2\2:;\7\"\2\2;\n"+
		"\3\2\2\2<=\7~\2\2=\f\3\2\2\2>?\7,\2\2?\16\3\2\2\2@A\7\"\2\2AB\7C\2\2B"+
		"C\7P\2\2CD\7F\2\2DE\7\"\2\2E\20\3\2\2\2FG\7\"\2\2GH\7c\2\2HI\7p\2\2IJ"+
		"\7f\2\2JK\7\"\2\2K\22\3\2\2\2LM\7\"\2\2MN\7C\2\2NO\7p\2\2OP\7f\2\2PQ\7"+
		"\"\2\2Q\24\3\2\2\2RS\7(\2\2S\26\3\2\2\2TU\7/\2\2U\30\3\2\2\2VW\7\"\2\2"+
		"WX\7P\2\2XY\7Q\2\2YZ\7V\2\2Z[\7\"\2\2[\32\3\2\2\2\\]\7\"\2\2]^\7p\2\2"+
		"^_\7q\2\2_`\7v\2\2`a\7\"\2\2a\34\3\2\2\2bc\7\"\2\2cd\7P\2\2de\7q\2\2e"+
		"f\7v\2\2fg\7\"\2\2g\36\3\2\2\2hi\7#\2\2i \3\2\2\2jk\7*\2\2k\"\3\2\2\2"+
		"lm\7+\2\2m$\3\2\2\2np\7\17\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\f\2\2"+
		"r&\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w(\3\2\2\2"+
		"xz\7$\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\177\7$\2\2\177*\3\2\2\2\6\2ov|\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from jsonGrammar.g4 by ANTLR 4.7.1

    import java.util.Set;
	import java.util.HashSet;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, STRING=8, NUMBER=9, 
		TRUE=10, FALSE=11, NULL=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "STRING", "NUMBER", 
		"INTEGER", "FRAC", "EXP", "DIGITS", "E", "DIGIT", "DIGITNZ", "TRUE", "FALSE", 
		"NULL", "CHAR", "CTRL", "HEXDIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "':'", "'['", "']'", null, null, null, "'true'", 
		"'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WS", "STRING", "NUMBER", "TRUE", 
		"FALSE", "NULL"
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


	public jsonGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jsonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b=\n\b\r\b\16\b>\3\b\3\b\3\t"+
		"\3\t\7\tE\n\t\f\t\16\tH\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nP\n\n\5\nR\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\5\13_\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16h\n\16\r\16\16\16i\3\17\3\17\5\17n\n\17"+
		"\3\17\3\17\5\17r\n\17\5\17t\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\5\25\u008c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00a6\n\26\3\27\3\27\5\27\u00aa\n\27\2\2\30\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35\2\37\2!\2#\f%\r\'\16)\2+\2"+
		"-\2\3\2\6\5\2\13\f\17\17\"\"\4\2--//\5\2\"#%]_\0\4\2CHch\2\u00b6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9"+
		"\3\2\2\2\17<\3\2\2\2\21B\3\2\2\2\23K\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31"+
		"c\3\2\2\2\33g\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#y\3\2\2\2%~\3"+
		"\2\2\2\'\u0084\3\2\2\2)\u008b\3\2\2\2+\u00a5\3\2\2\2-\u00a9\3\2\2\2/\60"+
		"\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7.\2\2\64\b\3"+
		"\2\2\2\65\66\7<\2\2\66\n\3\2\2\2\678\7]\2\28\f\3\2\2\29:\7_\2\2:\16\3"+
		"\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b"+
		"\b\2\2A\20\3\2\2\2BF\7$\2\2CE\5)\25\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7$\2\2J\22\3\2\2\2KQ\5\25\13\2LR\5\31\r"+
		"\2MO\5\27\f\2NP\5\31\r\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QL\3\2\2\2QM\3\2"+
		"\2\2QR\3\2\2\2R\24\3\2\2\2S_\5\37\20\2TU\5!\21\2UV\5\33\16\2V_\3\2\2\2"+
		"W\\\7/\2\2X]\5\37\20\2YZ\5!\21\2Z[\5\33\16\2[]\3\2\2\2\\X\3\2\2\2\\Y\3"+
		"\2\2\2]_\3\2\2\2^S\3\2\2\2^T\3\2\2\2^W\3\2\2\2_\26\3\2\2\2`a\7\60\2\2"+
		"ab\5\33\16\2b\30\3\2\2\2cd\5\35\17\2de\5\33\16\2e\32\3\2\2\2fh\5\37\20"+
		"\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\34\3\2\2\2km\7g\2\2ln\t\3"+
		"\2\2ml\3\2\2\2mn\3\2\2\2nt\3\2\2\2oq\7G\2\2pr\t\3\2\2qp\3\2\2\2qr\3\2"+
		"\2\2rt\3\2\2\2sk\3\2\2\2so\3\2\2\2t\36\3\2\2\2uv\4\62;\2v \3\2\2\2wx\4"+
		"\63;\2x\"\3\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|}\7g\2\2}$\3\2\2\2~\177\7"+
		"h\2\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083"+
		"\7g\2\2\u0083&\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086\7w\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7n\2\2\u0088(\3\2\2\2\u0089\u008c\t\4\2\2\u008a\u008c"+
		"\5+\26\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c*\3\2\2\2\u008d"+
		"\u008e\7^\2\2\u008e\u00a6\7$\2\2\u008f\u0090\7^\2\2\u0090\u00a6\7^\2\2"+
		"\u0091\u0092\7^\2\2\u0092\u00a6\7\61\2\2\u0093\u0094\7^\2\2\u0094\u00a6"+
		"\7d\2\2\u0095\u0096\7^\2\2\u0096\u00a6\7h\2\2\u0097\u0098\7^\2\2\u0098"+
		"\u00a6\7p\2\2\u0099\u009a\7^\2\2\u009a\u00a6\7t\2\2\u009b\u009c\7^\2\2"+
		"\u009c\u00a6\7v\2\2\u009d\u009e\7^\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\5-\27\2\u00a1\u00a2\5-\27\2\u00a2\u00a3\5-\27\2\u00a3"+
		"\u00a4\5-\27\2\u00a4\u00a6\3\2\2\2\u00a5\u008d\3\2\2\2\u00a5\u008f\3\2"+
		"\2\2\u00a5\u0091\3\2\2\2\u00a5\u0093\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5"+
		"\u0097\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009d\3\2"+
		"\2\2\u00a6,\3\2\2\2\u00a7\u00aa\5\37\20\2\u00a8\u00aa\t\5\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa.\3\2\2\2\20\2>FOQ\\^imqs\u008b\u00a5"+
		"\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}

// Generated from jsonGrammar.g4 by ANTLR 4.7.1

    import java.util.Set;
	import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jsonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, STRING=8, NUMBER=9, 
		TRUE=10, FALSE=11, NULL=12;
	public static final int
		RULE_jsonToYaml = 0, RULE_object = 1, RULE_members = 2, RULE_pair = 3, 
		RULE_array = 4, RULE_elements = 5, RULE_value = 6;
	public static final String[] ruleNames = {
		"jsonToYaml", "object", "members", "pair", "array", "elements", "value"
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

	@Override
	public String getGrammarFileName() { return "jsonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jsonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonToYamlContext extends ParserRuleContext {
		public int numSpaces;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(jsonGrammarParser.EOF, 0); }
		public JsonToYamlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonToYaml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterJsonToYaml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitJsonToYaml(this);
		}
	}

	public final JsonToYamlContext jsonToYaml() throws RecognitionException {
		JsonToYamlContext _localctx = new JsonToYamlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jsonToYaml);

		        ((JsonToYamlContext)_localctx).numSpaces =  0;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			value(_localctx.numSpaces);
			setState(15);
			match(EOF);
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

	public static class ObjectContext extends ParserRuleContext {
		public int numSpaces;
		public Set<String> usedKeys = new HashSet<String>();
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObjectContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object(int numSpaces) throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 2, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__0);
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(18);
				match(T__1);
				 System.out.print("{}"); 
				}
				break;
			case STRING:
				{
				setState(20);
				members(_localctx.numSpaces + 1);
				setState(21);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MembersContext extends ParserRuleContext {
		public int numSpaces;
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MembersContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitMembers(this);
		}
	}

	public final MembersContext members(int numSpaces) throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 4, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			pair(_localctx.numSpaces);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(26);
				match(T__2);
				setState(27);
				members(_localctx.numSpaces);
				}
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

	public static class PairContext extends ParserRuleContext {
		public int numSpaces;
		public Token STRING;
		public TerminalNode STRING() { return getToken(jsonGrammarParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PairContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitPair(this);
		}
	}

	public final PairContext pair(int numSpaces) throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 6, RULE_pair);

				int tab = _localctx.numSpaces;
			
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.print("\n"); 
			setState(31);
			((PairContext)_localctx).STRING = match(STRING);

					String key;
					while(tab > 1){
						System.out.print(" ");
						tab--;
					}
					if (((((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null)).charAt(1)=='-' || ((((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null)).contains("\\n")) {
						key = (((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null);
					} else {
						key = ((((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null)).substring(1, ((((PairContext)_localctx).STRING!=null?((PairContext)_localctx).STRING.getText():null)).length() - 1);
					}
					System.out.print(key);
					if (((ObjectContext)getInvokingContext(1)).usedKeys.contains(key)) {
						throw new Error("Duplicated keys are not allowed: " + key);
					} else {
						((ObjectContext)getInvokingContext(1)).usedKeys.add(key);
					}
				
			setState(33);
			match(T__3);
			 System.out.print(": "); 
			setState(35);
			value(_localctx.numSpaces);
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

	public static class ArrayContext extends ParserRuleContext {
		public int numSpaces;
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArrayContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array(int numSpaces) throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 8, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__4);
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(38);
				match(T__5);
				System.out.print("[]");
				}
				break;
			case T__0:
			case T__4:
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NULL:
				{
				setState(40);
				elements(_localctx.numSpaces + 1);
				setState(41);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementsContext extends ParserRuleContext {
		public int numSpaces;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementsContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements(int numSpaces) throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 10, RULE_elements);

				int tab = _localctx.numSpaces;
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					System.out.print("\n");
					while(tab > 1){
						System.out.print(" ");
						tab--;
					}
					System.out.print("- ");
			 	
			setState(46);
			value(_localctx.numSpaces);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(47);
				match(T__2);
				setState(48);
				elements(_localctx.numSpaces);
				}
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

	public static class ValueContext extends ParserRuleContext {
		public int numSpaces;
		public Token STRING;
		public Token NUMBER;
		public TerminalNode STRING() { return getToken(jsonGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(jsonGrammarParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(jsonGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(jsonGrammarParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(jsonGrammarParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ValueContext(ParserRuleContext parent, int invokingState, int numSpaces) {
			super(parent, invokingState);
			this.numSpaces = numSpaces;
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jsonGrammarListener ) ((jsonGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value(int numSpaces) throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState(), numSpaces);
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((ValueContext)_localctx).STRING = match(STRING);

						if (((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)).charAt(1)=='-'||((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)).contains("\\n")) {				
							System.out.print((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null));
						} else {								  
							System.out.print(((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)).substring(1, ((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)).length() - 1));
						}
					
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				System.out.print((((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null));
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				object(_localctx.numSpaces);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				array(_localctx.numSpaces);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(TRUE);
				 System.out.print("true"); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(FALSE);
				 System.out.print("false"); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				match(NULL);
				 System.out.print(""); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\7\3\7\5\7\64\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bB\n\b\3\b\2\2\t\2\4\6\b\n\f"+
		"\16\2\2\2F\2\20\3\2\2\2\4\23\3\2\2\2\6\33\3\2\2\2\b \3\2\2\2\n\'\3\2\2"+
		"\2\f/\3\2\2\2\16A\3\2\2\2\20\21\5\16\b\2\21\22\7\2\2\3\22\3\3\2\2\2\23"+
		"\31\7\3\2\2\24\25\7\4\2\2\25\32\b\3\1\2\26\27\5\6\4\2\27\30\7\4\2\2\30"+
		"\32\3\2\2\2\31\24\3\2\2\2\31\26\3\2\2\2\32\5\3\2\2\2\33\36\5\b\5\2\34"+
		"\35\7\5\2\2\35\37\5\6\4\2\36\34\3\2\2\2\36\37\3\2\2\2\37\7\3\2\2\2 !\b"+
		"\5\1\2!\"\7\n\2\2\"#\b\5\1\2#$\7\6\2\2$%\b\5\1\2%&\5\16\b\2&\t\3\2\2\2"+
		"\'-\7\7\2\2()\7\b\2\2).\b\6\1\2*+\5\f\7\2+,\7\b\2\2,.\3\2\2\2-(\3\2\2"+
		"\2-*\3\2\2\2.\13\3\2\2\2/\60\b\7\1\2\60\63\5\16\b\2\61\62\7\5\2\2\62\64"+
		"\5\f\7\2\63\61\3\2\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65\66\7\n\2\2\66B\b"+
		"\b\1\2\678\7\13\2\28B\b\b\1\29B\5\4\3\2:B\5\n\6\2;<\7\f\2\2<B\b\b\1\2"+
		"=>\7\r\2\2>B\b\b\1\2?@\7\16\2\2@B\b\b\1\2A\65\3\2\2\2A\67\3\2\2\2A9\3"+
		"\2\2\2A:\3\2\2\2A;\3\2\2\2A=\3\2\2\2A?\3\2\2\2B\17\3\2\2\2\7\31\36-\63"+
		"A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}

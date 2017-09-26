import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOP=18, OP=19, NUM=20, DIGIT=21, BCONST=22, WS=23, INT=24, FOR=25, ELSE=26, 
		WH=27, IFF=28, PRINT=29, READ=30, VAR=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"BOP", "OP", "NUM", "DIGIT", "BCONST", "WS", "INT", "FOR", "ELSE", "WH", 
		"IFF", "PRINT", "READ", "VAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'||'", "'^'", 
		"'&&'", "'!'", "';'", "'++'", "'--'", "'='", "'{'", "'}'", null, null, 
		null, null, null, null, "'int'", "'for'", "'else'", "'while'", "'if'", 
		null, "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BOP", "OP", "NUM", "DIGIT", "BCONST", 
		"WS", "INT", "FOR", "ELSE", "WH", "IFF", "PRINT", "READ", "VAR"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23q\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24}\n\24"+
		"\3\25\5\25\u0080\n\25\3\25\6\25\u0083\n\25\r\25\16\25\u0084\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0092\n\27\3\30\6\30"+
		"\u0095\n\30\r\30\16\30\u0096\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u00bd\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00c6\n \f \16 \u00c9"+
		"\13 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\7\4\2>>@@\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\6\2"+
		"\62;C\\aac|\u00d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E"+
		"\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23"+
		"R\3\2\2\2\25T\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35^\3\2\2\2"+
		"\37a\3\2\2\2!c\3\2\2\2#e\3\2\2\2%p\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0086"+
		"\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61\u009a\3\2\2\2\63\u009e\3\2\2"+
		"\2\65\u00a2\3\2\2\2\67\u00a7\3\2\2\29\u00ad\3\2\2\2;\u00bc\3\2\2\2=\u00be"+
		"\3\2\2\2?\u00c3\3\2\2\2AB\7-\2\2B\4\3\2\2\2CD\7/\2\2D\6\3\2\2\2EF\7,\2"+
		"\2F\b\3\2\2\2GH\7\61\2\2H\n\3\2\2\2IJ\7\'\2\2J\f\3\2\2\2KL\7*\2\2L\16"+
		"\3\2\2\2MN\7+\2\2N\20\3\2\2\2OP\7~\2\2PQ\7~\2\2Q\22\3\2\2\2RS\7`\2\2S"+
		"\24\3\2\2\2TU\7(\2\2UV\7(\2\2V\26\3\2\2\2WX\7#\2\2X\30\3\2\2\2YZ\7=\2"+
		"\2Z\32\3\2\2\2[\\\7-\2\2\\]\7-\2\2]\34\3\2\2\2^_\7/\2\2_`\7/\2\2`\36\3"+
		"\2\2\2ab\7?\2\2b \3\2\2\2cd\7}\2\2d\"\3\2\2\2ef\7\177\2\2f$\3\2\2\2gh"+
		"\7?\2\2hq\7?\2\2ij\7#\2\2jq\7?\2\2kq\t\2\2\2lm\7>\2\2mq\7?\2\2no\7@\2"+
		"\2oq\7?\2\2pg\3\2\2\2pi\3\2\2\2pk\3\2\2\2pl\3\2\2\2pn\3\2\2\2q&\3\2\2"+
		"\2rs\7-\2\2s}\7?\2\2tu\7/\2\2u}\7?\2\2vw\7,\2\2w}\7?\2\2xy\7\61\2\2y}"+
		"\7?\2\2z{\7\'\2\2{}\7?\2\2|r\3\2\2\2|t\3\2\2\2|v\3\2\2\2|x\3\2\2\2|z\3"+
		"\2\2\2}(\3\2\2\2~\u0080\7/\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\u0083\5+\26\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085*\3\2\2\2\u0086\u0087\t\3\2\2"+
		"\u0087,\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7w\2"+
		"\2\u008b\u0092\7g\2\2\u008c\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7u\2\2\u0090\u0092\7g\2\2\u0091\u0088\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0092.\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\b\30\2\2\u0099\60\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\62\3\2\2\2\u009e\u009f\7h\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\64\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\66\3\2\2\2\u00a7"+
		"\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2"+
		"\2\u00af:\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00bd\7v\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bd\7p\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b5\3\2\2"+
		"\2\u00bd<\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7"+
		"c\2\2\u00c1\u00c2\7f\2\2\u00c2>\3\2\2\2\u00c3\u00c7\t\5\2\2\u00c4\u00c6"+
		"\t\6\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8@\3\2\2\2\u00c9\u00c7\3\2\2\2\13\2p|\177\u0084\u0091"+
		"\u0096\u00bc\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
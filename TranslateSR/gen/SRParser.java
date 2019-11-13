// Generated from C:/Users/sebas/Music/nuevo repo/Lenguajes-de-Programacion/TranslateSR/Grammar\SR.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Global=1, Int=2, Abs=3, Max=4, Min=5, Pred=6, Succ=7, Lb=8, Ub=9, Length=10, 
		Maxlength=11, Free=12, Sqrt=13, Log=14, Ceil=15, Floor=16, Round=17, Sin=18, 
		Cos=19, Tan=20, Asin=21, Acos=22, Atan=23, Random=24, Seed=25, Age=26, 
		Nap=27, Open=28, Flush=29, Close=30, Remove=31, Seek=32, Where=33, Getarg=34, 
		Write=35, Writes=36, If=37, Fi=38, P=39, V=40, Af=41, And=42, Any=43, 
		Begin=44, Body=45, Bool=46, By=47, Call=48, Cap=49, Char=50, Const=51, 
		Co=52, Create=53, Destroy=54, Downto=55, Do=56, Else=57, End=58, Enum=59, 
		Exit=60, Extend=61, External=62, Fa=63, File=64, Final=65, Forward=66, 
		High=67, Import=68, Initial=69, In=70, Low=71, Mod=72, New=73, Next=74, 
		Ni=75, Not=76, Oc=77, Od=78, On=79, Optype=80, Op=81, Or=82, Procedure=83, 
		Process=84, Proc=85, Ptr=86, Real=87, Read=88, Receive=89, Rec=90, Ref=91, 
		Reply=92, Resource=93, Res=94, Return=95, Returns=96, Sem=97, Send=98, 
		Separate=99, Skip=100, Suchthat=101, Stop=102, String=103, To=104, Type=105, 
		Union=106, Val=107, Var=108, Vm=109, Xor=110, Tk_num=111, Tk_incr=112, 
		Tk_decr=113, Tk_suma=114, Tk_exp=115, Tk_separa=116, TK_cor_izq=117, Tk_cor_der=118, 
		Tk_llave_izq=119, Tk_llave_der=120, Tk_flecha=121, Tk_mayor=122, Tk_menor=123, 
		Tk_mayor_igual=124, Tk_menor_igual=125, Tk_resta=126, Tk_mult=127, Tk_porce=128, 
		Tk_div=129, Tk_par_izq=130, Tk_par_der=131, Tk_swap=132, Tk_asign=133, 
		Tk_diferente=134, Tk_igual=135, Tk_punto=136, Tk_dos_puntos=137, Tk_coma=138, 
		Tk_ptocoma=139, Tk_string=140, Id=141, LINE_COMMENT=142, EOL=143, WS=144;
	public static final int
		RULE_s = 0, RULE_block = 1, RULE_list_declarations = 2, RULE_declarations = 3, 
		RULE_asign = 4, RULE_init_var = 5, RULE_init_const = 6, RULE_value = 7, 
		RULE_datatype = 8, RULE_expr = 9, RULE_bin_exp = 10, RULE_reserve_funct = 11, 
		RULE_control_struc = 12, RULE_for_all = 13, RULE_cuantificador = 14, RULE_iff = 15, 
		RULE_elsee = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "block", "list_declarations", "declarations", "asign", "init_var", 
			"init_const", "value", "datatype", "expr", "bin_exp", "reserve_funct", 
			"control_struc", "for_all", "cuantificador", "iff", "elsee"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'global'", "'int'", "'abs'", "'max'", "'min'", "'pred'", "'succ'", 
			"'lb'", "'ub'", "'length'", "'maxlength'", "'free'", "'sqrt'", "'log'", 
			"'ceil'", "'floor'", "'round'", "'sin'", "'cos'", "'tan'", "'asin'", 
			"'acos'", "'atan'", "'random'", "'seed'", "'age'", "'nap'", "'open'", 
			"'flush'", "'close'", "'remove'", "'seek'", "'where'", "'getarg'", "'write'", 
			"'writes'", "'if'", "'fi'", "'P'", "'V'", "'af'", "'and'", "'any'", "'begin'", 
			"'body'", "'bool'", "'by'", "'call'", "'cap'", "'char'", "'const'", "'co'", 
			"'create'", "'destroy'", "'downto'", "'do'", "'else'", "'end'", "'enum'", 
			"'exit'", "'extend'", "'external'", "'fa'", "'file'", "'final'", "'forward'", 
			"'high'", "'import'", "'initial'", "'in'", "'low'", "'mod'", "'new'", 
			"'next'", "'ni'", "'not'", "'oc'", "'od'", "'on'", "'optype'", "'op'", 
			"'or'", "'procedure'", "'process'", "'proc'", "'ptr'", "'real'", "'read'", 
			"'receive'", "'rec'", "'ref'", "'reply'", "'resource'", "'res'", "'return'", 
			"'returns'", "'sem'", "'send'", "'separate'", "'skip'", "'suchthat'", 
			"'stop'", "'string'", "'to'", "'type'", "'union'", "'Val'", "'var'", 
			"'vm'", "'xor'", null, "'++'", "'--'", "'+'", "'^'", "'[]'", "'['", "']'", 
			"'{'", "'}'", "'->'", "'>'", "'<'", "'>='", "'<='", "'-'", "'*'", "'%'", 
			"'/'", "'('", "')'", "':=:'", "':='", "'!='", "'='", "'.'", "':'", "','", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Global", "Int", "Abs", "Max", "Min", "Pred", "Succ", "Lb", "Ub", 
			"Length", "Maxlength", "Free", "Sqrt", "Log", "Ceil", "Floor", "Round", 
			"Sin", "Cos", "Tan", "Asin", "Acos", "Atan", "Random", "Seed", "Age", 
			"Nap", "Open", "Flush", "Close", "Remove", "Seek", "Where", "Getarg", 
			"Write", "Writes", "If", "Fi", "P", "V", "Af", "And", "Any", "Begin", 
			"Body", "Bool", "By", "Call", "Cap", "Char", "Const", "Co", "Create", 
			"Destroy", "Downto", "Do", "Else", "End", "Enum", "Exit", "Extend", "External", 
			"Fa", "File", "Final", "Forward", "High", "Import", "Initial", "In", 
			"Low", "Mod", "New", "Next", "Ni", "Not", "Oc", "Od", "On", "Optype", 
			"Op", "Or", "Procedure", "Process", "Proc", "Ptr", "Real", "Read", "Receive", 
			"Rec", "Ref", "Reply", "Resource", "Res", "Return", "Returns", "Sem", 
			"Send", "Separate", "Skip", "Suchthat", "Stop", "String", "To", "Type", 
			"Union", "Val", "Var", "Vm", "Xor", "Tk_num", "Tk_incr", "Tk_decr", "Tk_suma", 
			"Tk_exp", "Tk_separa", "TK_cor_izq", "Tk_cor_der", "Tk_llave_izq", "Tk_llave_der", 
			"Tk_flecha", "Tk_mayor", "Tk_menor", "Tk_mayor_igual", "Tk_menor_igual", 
			"Tk_resta", "Tk_mult", "Tk_porce", "Tk_div", "Tk_par_izq", "Tk_par_der", 
			"Tk_swap", "Tk_asign", "Tk_diferente", "Tk_igual", "Tk_punto", "Tk_dos_puntos", 
			"Tk_coma", "Tk_ptocoma", "Tk_string", "Id", "LINE_COMMENT", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List_declarationsContext list_declarations() {
			return getRuleContext(List_declarationsContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public TerminalNode End() { return getToken(SRParser.End, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			block();
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(35);
				list_declarations();
				}
				break;
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Abs) | (1L << Max) | (1L << Min) | (1L << Pred) | (1L << Succ) | (1L << Lb) | (1L << Ub) | (1L << Length) | (1L << Maxlength) | (1L << Free) | (1L << Sqrt) | (1L << Log) | (1L << Ceil) | (1L << Floor) | (1L << Round) | (1L << Sin) | (1L << Cos) | (1L << Tan) | (1L << Asin) | (1L << Acos) | (1L << Atan) | (1L << Random) | (1L << Seed) | (1L << Age) | (1L << Nap) | (1L << Open) | (1L << Flush) | (1L << Close) | (1L << Remove) | (1L << Seek) | (1L << Where) | (1L << Getarg) | (1L << Write) | (1L << Writes) | (1L << If) | (1L << Const) | (1L << Fa))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (High - 67)) | (1L << (Low - 67)) | (1L << (New - 67)) | (1L << (Read - 67)) | (1L << (Var - 67)) | (1L << (Tk_num - 67)) | (1L << (Tk_resta - 67)) | (1L << (Tk_par_izq - 67)))) != 0) || _la==Tk_string || _la==Id) {
				{
				{
				setState(38);
				declarations();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==End) {
				{
				setState(44);
				match(End);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(SRParser.Global, 0); }
		public TerminalNode Id() { return getToken(SRParser.Id, 0); }
		public TerminalNode Resource() { return getToken(SRParser.Resource, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Global:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(Global);
				setState(48);
				match(Id);
				}
				break;
			case Resource:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(Resource);
				setState(50);
				match(Id);
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

	public static class List_declarationsContext extends ParserRuleContext {
		public TerminalNode Tk_par_izq() { return getToken(SRParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(SRParser.Tk_par_der, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Tk_dos_puntos() { return getTokens(SRParser.Tk_dos_puntos); }
		public TerminalNode Tk_dos_puntos(int i) {
			return getToken(SRParser.Tk_dos_puntos, i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SRParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SRParser.Tk_coma, i);
		}
		public List_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterList_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitList_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitList_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_declarationsContext list_declarations() throws RecognitionException {
		List_declarationsContext _localctx = new List_declarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(Tk_par_izq);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (Tk_num - 111)) | (1L << (Tk_resta - 111)) | (1L << (Tk_string - 111)) | (1L << (Id - 111)))) != 0)) {
				{
				{
				setState(54);
				value();
				setState(55);
				match(Tk_dos_puntos);
				setState(56);
				datatype();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_coma) {
					{
					setState(57);
					match(Tk_coma);
					}
				}

				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(Tk_par_der);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<AsignContext> asign() {
			return getRuleContexts(AsignContext.class);
		}
		public AsignContext asign(int i) {
			return getRuleContext(AsignContext.class,i);
		}
		public List<Init_varContext> init_var() {
			return getRuleContexts(Init_varContext.class);
		}
		public Init_varContext init_var(int i) {
			return getRuleContext(Init_varContext.class,i);
		}
		public List<Init_constContext> init_const() {
			return getRuleContexts(Init_constContext.class);
		}
		public Init_constContext init_const(int i) {
			return getRuleContext(Init_constContext.class,i);
		}
		public List<Control_strucContext> control_struc() {
			return getRuleContexts(Control_strucContext.class);
		}
		public Control_strucContext control_struc(int i) {
			return getRuleContext(Control_strucContext.class,i);
		}
		public List<Reserve_functContext> reserve_funct() {
			return getRuleContexts(Reserve_functContext.class);
		}
		public Reserve_functContext reserve_funct(int i) {
			return getRuleContext(Reserve_functContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			int _alt;
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						asign();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(72);
						init_var();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(75); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						init_const();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						control_struc();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(85); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						reserve_funct();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(92);
						expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(95); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class AsignContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(SRParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(SRParser.Id, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Tk_asign() { return getToken(SRParser.Tk_asign, 0); }
		public TerminalNode Tk_suma() { return getToken(SRParser.Tk_suma, 0); }
		public TerminalNode Tk_resta() { return getToken(SRParser.Tk_resta, 0); }
		public TerminalNode Tk_mult() { return getToken(SRParser.Tk_mult, 0); }
		public TerminalNode Tk_div() { return getToken(SRParser.Tk_div, 0); }
		public TerminalNode Tk_swap() { return getToken(SRParser.Tk_swap, 0); }
		public TerminalNode Tk_diferente() { return getToken(SRParser.Tk_diferente, 0); }
		public List<TerminalNode> Tk_llave_der() { return getTokens(SRParser.Tk_llave_der); }
		public TerminalNode Tk_llave_der(int i) {
			return getToken(SRParser.Tk_llave_der, i);
		}
		public List<TerminalNode> Tk_llave_izq() { return getTokens(SRParser.Tk_llave_izq); }
		public TerminalNode Tk_llave_izq(int i) {
			return getToken(SRParser.Tk_llave_izq, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignContext asign() throws RecognitionException {
		AsignContext _localctx = new AsignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Id);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_llave_der) {
				{
				setState(100);
				match(Tk_llave_der);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(101);
					match(Id);
					}
					break;
				case 2:
					{
					setState(102);
					value();
					}
					break;
				}
				setState(105);
				match(Tk_llave_izq);
				setState(106);
				match(Tk_llave_der);
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(107);
					match(Id);
					}
					break;
				case 2:
					{
					setState(108);
					value();
					}
					break;
				}
				setState(111);
				match(Tk_llave_izq);
				}
			}

			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_asign:
				{
				setState(114);
				match(Tk_asign);
				}
				break;
			case Tk_suma:
				{
				setState(115);
				match(Tk_suma);
				setState(116);
				match(Tk_asign);
				}
				break;
			case Tk_resta:
				{
				setState(117);
				match(Tk_resta);
				setState(118);
				match(Tk_asign);
				}
				break;
			case Tk_mult:
				{
				setState(119);
				match(Tk_mult);
				setState(120);
				match(Tk_asign);
				}
				break;
			case Tk_div:
				{
				setState(121);
				match(Tk_div);
				setState(122);
				match(Tk_asign);
				}
				break;
			case Tk_swap:
				{
				setState(123);
				match(Tk_swap);
				}
				break;
			case Tk_diferente:
				{
				setState(124);
				match(Tk_diferente);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			expr();
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

	public static class Init_varContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(SRParser.Var, 0); }
		public TerminalNode Tk_dos_puntos() { return getToken(SRParser.Tk_dos_puntos, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(SRParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(SRParser.Id, i);
		}
		public List<TerminalNode> Tk_llave_der() { return getTokens(SRParser.Tk_llave_der); }
		public TerminalNode Tk_llave_der(int i) {
			return getToken(SRParser.Tk_llave_der, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Tk_llave_izq() { return getTokens(SRParser.Tk_llave_izq); }
		public TerminalNode Tk_llave_izq(int i) {
			return getToken(SRParser.Tk_llave_izq, i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(SRParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(SRParser.Tk_coma, i);
		}
		public Init_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInit_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInit_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInit_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_varContext init_var() throws RecognitionException {
		Init_varContext _localctx = new Init_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Var);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Id) {
				{
				{
				setState(130);
				match(Id);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_llave_der) {
					{
					setState(131);
					match(Tk_llave_der);
					setState(132);
					value();
					setState(133);
					match(Tk_llave_izq);
					setState(134);
					match(Tk_llave_der);
					setState(135);
					value();
					setState(136);
					match(Tk_llave_izq);
					}
				}

				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Tk_coma) {
					{
					setState(140);
					match(Tk_coma);
					}
				}

				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(Tk_dos_puntos);
			setState(149);
			datatype();
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

	public static class Init_constContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(SRParser.Const, 0); }
		public TerminalNode Id() { return getToken(SRParser.Id, 0); }
		public TerminalNode Tk_asign() { return getToken(SRParser.Tk_asign, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Init_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterInit_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitInit_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitInit_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_constContext init_const() throws RecognitionException {
		Init_constContext _localctx = new Init_constContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(Const);
			setState(152);
			match(Id);
			setState(153);
			match(Tk_asign);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(154);
				value();
				}
				break;
			case 2:
				{
				setState(155);
				declarations();
				}
				break;
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
		public TerminalNode Tk_num() { return getToken(SRParser.Tk_num, 0); }
		public TerminalNode Tk_string() { return getToken(SRParser.Tk_string, 0); }
		public TerminalNode Tk_resta() { return getToken(SRParser.Tk_resta, 0); }
		public TerminalNode Id() { return getToken(SRParser.Id, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_num:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(Tk_num);
				}
				break;
			case Tk_string:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(Tk_string);
				}
				break;
			case Tk_resta:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(Tk_resta);
				setState(161);
				match(Tk_num);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(Id);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(SRParser.Real, 0); }
		public TerminalNode Int() { return getToken(SRParser.Int, 0); }
		public TerminalNode Enum() { return getToken(SRParser.Enum, 0); }
		public TerminalNode Bool() { return getToken(SRParser.Bool, 0); }
		public TerminalNode Ptr() { return getToken(SRParser.Ptr, 0); }
		public TerminalNode Cap() { return getToken(SRParser.Cap, 0); }
		public TerminalNode String() { return getToken(SRParser.String, 0); }
		public TerminalNode TK_cor_izq() { return getToken(SRParser.TK_cor_izq, 0); }
		public TerminalNode Tk_cor_der() { return getToken(SRParser.Tk_cor_der, 0); }
		public TerminalNode Tk_num() { return getToken(SRParser.Tk_num, 0); }
		public TerminalNode Tk_mult() { return getToken(SRParser.Tk_mult, 0); }
		public TerminalNode Char() { return getToken(SRParser.Char, 0); }
		public TerminalNode Id() { return getToken(SRParser.Id, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datatype);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(Real);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(Int);
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(Enum);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(Bool);
				}
				break;
			case Ptr:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(Ptr);
				}
				break;
			case Cap:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(Cap);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(String);
				setState(172);
				match(TK_cor_izq);
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==Tk_num || _la==Tk_mult) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				match(Tk_cor_der);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(Char);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(Id);
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

	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Tk_par_izq() { return getToken(SRParser.Tk_par_izq, 0); }
		public Bin_expContext bin_exp() {
			return getRuleContext(Bin_expContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_par_izq) {
				{
				setState(179);
				match(Tk_par_izq);
				}
			}

			setState(182);
			value();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(183);
				bin_exp();
				}
				break;
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

	public static class Bin_expContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Tk_menor() { return getToken(SRParser.Tk_menor, 0); }
		public TerminalNode Tk_menor_igual() { return getToken(SRParser.Tk_menor_igual, 0); }
		public TerminalNode Tk_mayor() { return getToken(SRParser.Tk_mayor, 0); }
		public TerminalNode Tk_mayor_igual() { return getToken(SRParser.Tk_mayor_igual, 0); }
		public TerminalNode Tk_igual() { return getToken(SRParser.Tk_igual, 0); }
		public TerminalNode Tk_punto() { return getToken(SRParser.Tk_punto, 0); }
		public TerminalNode Tk_coma() { return getToken(SRParser.Tk_coma, 0); }
		public TerminalNode Tk_suma() { return getToken(SRParser.Tk_suma, 0); }
		public TerminalNode Tk_resta() { return getToken(SRParser.Tk_resta, 0); }
		public TerminalNode Tk_div() { return getToken(SRParser.Tk_div, 0); }
		public TerminalNode Tk_mult() { return getToken(SRParser.Tk_mult, 0); }
		public TerminalNode Tk_incr() { return getToken(SRParser.Tk_incr, 0); }
		public TerminalNode Tk_decr() { return getToken(SRParser.Tk_decr, 0); }
		public TerminalNode Tk_par_der() { return getToken(SRParser.Tk_par_der, 0); }
		public Bin_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterBin_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitBin_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitBin_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_expContext bin_exp() throws RecognitionException {
		Bin_expContext _localctx = new Bin_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bin_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (Tk_incr - 112)) | (1L << (Tk_decr - 112)) | (1L << (Tk_suma - 112)) | (1L << (Tk_mayor - 112)) | (1L << (Tk_menor - 112)) | (1L << (Tk_mayor_igual - 112)) | (1L << (Tk_menor_igual - 112)) | (1L << (Tk_resta - 112)) | (1L << (Tk_mult - 112)) | (1L << (Tk_div - 112)) | (1L << (Tk_igual - 112)) | (1L << (Tk_punto - 112)) | (1L << (Tk_coma - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			expr();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(188);
				match(Tk_par_der);
				}
				break;
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

	public static class Reserve_functContext extends ParserRuleContext {
		public TerminalNode Tk_par_izq() { return getToken(SRParser.Tk_par_izq, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(SRParser.Tk_par_der, 0); }
		public TerminalNode Abs() { return getToken(SRParser.Abs, 0); }
		public TerminalNode Max() { return getToken(SRParser.Max, 0); }
		public TerminalNode Min() { return getToken(SRParser.Min, 0); }
		public TerminalNode Pred() { return getToken(SRParser.Pred, 0); }
		public TerminalNode Succ() { return getToken(SRParser.Succ, 0); }
		public TerminalNode Low() { return getToken(SRParser.Low, 0); }
		public TerminalNode High() { return getToken(SRParser.High, 0); }
		public TerminalNode Lb() { return getToken(SRParser.Lb, 0); }
		public TerminalNode Ub() { return getToken(SRParser.Ub, 0); }
		public TerminalNode Length() { return getToken(SRParser.Length, 0); }
		public TerminalNode Maxlength() { return getToken(SRParser.Maxlength, 0); }
		public TerminalNode New() { return getToken(SRParser.New, 0); }
		public TerminalNode Free() { return getToken(SRParser.Free, 0); }
		public TerminalNode Sqrt() { return getToken(SRParser.Sqrt, 0); }
		public TerminalNode Log() { return getToken(SRParser.Log, 0); }
		public TerminalNode Ceil() { return getToken(SRParser.Ceil, 0); }
		public TerminalNode Floor() { return getToken(SRParser.Floor, 0); }
		public TerminalNode Round() { return getToken(SRParser.Round, 0); }
		public TerminalNode Sin() { return getToken(SRParser.Sin, 0); }
		public TerminalNode Cos() { return getToken(SRParser.Cos, 0); }
		public TerminalNode Tan() { return getToken(SRParser.Tan, 0); }
		public TerminalNode Asin() { return getToken(SRParser.Asin, 0); }
		public TerminalNode Acos() { return getToken(SRParser.Acos, 0); }
		public TerminalNode Atan() { return getToken(SRParser.Atan, 0); }
		public TerminalNode Random() { return getToken(SRParser.Random, 0); }
		public TerminalNode Seed() { return getToken(SRParser.Seed, 0); }
		public TerminalNode Age() { return getToken(SRParser.Age, 0); }
		public TerminalNode Nap() { return getToken(SRParser.Nap, 0); }
		public TerminalNode Open() { return getToken(SRParser.Open, 0); }
		public TerminalNode Flush() { return getToken(SRParser.Flush, 0); }
		public TerminalNode Close() { return getToken(SRParser.Close, 0); }
		public TerminalNode Remove() { return getToken(SRParser.Remove, 0); }
		public TerminalNode Seek() { return getToken(SRParser.Seek, 0); }
		public TerminalNode Where() { return getToken(SRParser.Where, 0); }
		public TerminalNode Read() { return getToken(SRParser.Read, 0); }
		public TerminalNode Write() { return getToken(SRParser.Write, 0); }
		public TerminalNode Writes() { return getToken(SRParser.Writes, 0); }
		public TerminalNode Getarg() { return getToken(SRParser.Getarg, 0); }
		public Reserve_functContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserve_funct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterReserve_funct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitReserve_funct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitReserve_funct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reserve_functContext reserve_funct() throws RecognitionException {
		Reserve_functContext _localctx = new Reserve_functContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reserve_funct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Abs) | (1L << Max) | (1L << Min) | (1L << Pred) | (1L << Succ) | (1L << Lb) | (1L << Ub) | (1L << Length) | (1L << Maxlength) | (1L << Free) | (1L << Sqrt) | (1L << Log) | (1L << Ceil) | (1L << Floor) | (1L << Round) | (1L << Sin) | (1L << Cos) | (1L << Tan) | (1L << Asin) | (1L << Acos) | (1L << Atan) | (1L << Random) | (1L << Seed) | (1L << Age) | (1L << Nap) | (1L << Open) | (1L << Flush) | (1L << Close) | (1L << Remove) | (1L << Seek) | (1L << Where) | (1L << Getarg) | (1L << Write) | (1L << Writes))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (High - 67)) | (1L << (Low - 67)) | (1L << (New - 67)) | (1L << (Read - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
			match(Tk_par_izq);
			setState(193);
			declarations();
			setState(194);
			match(Tk_par_der);
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

	public static class Control_strucContext extends ParserRuleContext {
		public For_allContext for_all() {
			return getRuleContext(For_allContext.class,0);
		}
		public IffContext iff() {
			return getRuleContext(IffContext.class,0);
		}
		public Control_strucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_struc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterControl_struc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitControl_struc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitControl_struc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_strucContext control_struc() throws RecognitionException {
		Control_strucContext _localctx = new Control_strucContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_control_struc);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Fa:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				for_all();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				iff();
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

	public static class For_allContext extends ParserRuleContext {
		public TerminalNode Fa() { return getToken(SRParser.Fa, 0); }
		public CuantificadorContext cuantificador() {
			return getRuleContext(CuantificadorContext.class,0);
		}
		public TerminalNode Tk_flecha() { return getToken(SRParser.Tk_flecha, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode Af() { return getToken(SRParser.Af, 0); }
		public For_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterFor_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitFor_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitFor_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_allContext for_all() throws RecognitionException {
		For_allContext _localctx = new For_allContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Fa);
			setState(201);
			cuantificador();
			setState(202);
			match(Tk_flecha);
			setState(203);
			declarations();
			setState(204);
			match(Af);
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

	public static class CuantificadorContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SRParser.Id, 0); }
		public TerminalNode Tk_asign() { return getToken(SRParser.Tk_asign, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode To() { return getToken(SRParser.To, 0); }
		public TerminalNode Downto() { return getToken(SRParser.Downto, 0); }
		public TerminalNode By() { return getToken(SRParser.By, 0); }
		public TerminalNode Suchthat() { return getToken(SRParser.Suchthat, 0); }
		public CuantificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuantificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterCuantificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitCuantificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitCuantificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuantificadorContext cuantificador() throws RecognitionException {
		CuantificadorContext _localctx = new CuantificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cuantificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Id);
			setState(207);
			match(Tk_asign);
			setState(208);
			expr();
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==Downto || _la==To) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			expr();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(211);
				match(By);
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Suchthat) {
				{
				setState(214);
				match(Suchthat);
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

	public static class IffContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SRParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Tk_flecha() { return getToken(SRParser.Tk_flecha, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode Fi() { return getToken(SRParser.Fi, 0); }
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public IffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IffContext iff() throws RecognitionException {
		IffContext _localctx = new IffContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(If);
			setState(218);
			expr();
			setState(219);
			match(Tk_flecha);
			setState(220);
			declarations();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tk_separa) {
				{
				setState(221);
				elsee();
				}
			}

			setState(224);
			match(Fi);
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

	public static class ElseeContext extends ParserRuleContext {
		public TerminalNode Tk_separa() { return getToken(SRParser.Tk_separa, 0); }
		public TerminalNode Tk_flecha() { return getToken(SRParser.Tk_flecha, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode Else() { return getToken(SRParser.Else, 0); }
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).enterElsee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SRListener ) ((SRListener)listener).exitElsee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SRVisitor ) return ((SRVisitor<? extends T>)visitor).visitElsee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elsee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Tk_separa);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(227);
				match(Else);
				}
			}

			setState(230);
			match(Tk_flecha);
			setState(231);
			declarations();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0092\u00ec\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\5\2\60\n\2\3\3\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\3\4\3\4\3\5\6\5G\n\5\r\5\16\5H\3\5\6\5L\n\5\r\5\16\5M\3\5\6\5Q\n\5"+
		"\r\5\16\5R\3\5\6\5V\n\5\r\5\16\5W\3\5\6\5[\n\5\r\5\16\5\\\3\5\6\5`\n\5"+
		"\r\5\16\5a\5\5d\n\5\3\6\3\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\5\6p\n\6"+
		"\3\6\5\6s\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7\3\7\5\7\u0090"+
		"\n\7\7\7\u0092\n\7\f\7\16\7\u0095\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u009f\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\5\13\u00b7\n\13\3\13\3\13"+
		"\5\13\u00bb\n\13\3\f\3\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00d7\n\20\3\20\5\20\u00da\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00e1\n\21\3\21\3\21\3\22\3\22\5\22\u00e7\n\22\3\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2qq\u0081"+
		"\u0081\7\2rt|\u0081\u0083\u0083\u0089\u008a\u008c\u008c\7\2\5&EEIIKKZ"+
		"Z\4\299jj\2\u010b\2$\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bc\3\2\2\2\ne\3"+
		"\2\2\2\f\u0083\3\2\2\2\16\u0099\3\2\2\2\20\u00a5\3\2\2\2\22\u00b3\3\2"+
		"\2\2\24\u00b6\3\2\2\2\26\u00bc\3\2\2\2\30\u00c1\3\2\2\2\32\u00c8\3\2\2"+
		"\2\34\u00ca\3\2\2\2\36\u00d0\3\2\2\2 \u00db\3\2\2\2\"\u00e4\3\2\2\2$&"+
		"\5\4\3\2%\'\5\6\4\2&%\3\2\2\2&\'\3\2\2\2\'+\3\2\2\2(*\5\b\5\2)(\3\2\2"+
		"\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\60\7<\2\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\7\3\2\2\62\66\7\u008f\2\2\63\64\7"+
		"_\2\2\64\66\7\u008f\2\2\65\61\3\2\2\2\65\63\3\2\2\2\66\5\3\2\2\2\67@\7"+
		"\u0084\2\289\5\20\t\29:\7\u008b\2\2:<\5\22\n\2;=\7\u008c\2\2<;\3\2\2\2"+
		"<=\3\2\2\2=?\3\2\2\2>8\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"B@\3\2\2\2CD\7\u0085\2\2D\7\3\2\2\2EG\5\n\6\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2Id\3\2\2\2JL\5\f\7\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2Nd\3\2\2\2OQ\5\16\b\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2Sd"+
		"\3\2\2\2TV\5\32\16\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xd\3\2\2\2"+
		"Y[\5\30\r\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2\2\2^`\5\24"+
		"\13\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2cF\3\2\2\2cK\3"+
		"\2\2\2cP\3\2\2\2cU\3\2\2\2cZ\3\2\2\2c_\3\2\2\2d\t\3\2\2\2er\7\u008f\2"+
		"\2fi\7z\2\2gj\7\u008f\2\2hj\5\20\t\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7"+
		"y\2\2lo\7z\2\2mp\7\u008f\2\2np\5\20\t\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2"+
		"qs\7y\2\2rf\3\2\2\2rs\3\2\2\2s\177\3\2\2\2t\u0080\7\u0087\2\2uv\7t\2\2"+
		"v\u0080\7\u0087\2\2wx\7\u0080\2\2x\u0080\7\u0087\2\2yz\7\u0081\2\2z\u0080"+
		"\7\u0087\2\2{|\7\u0083\2\2|\u0080\7\u0087\2\2}\u0080\7\u0086\2\2~\u0080"+
		"\7\u0088\2\2\177t\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177{"+
		"\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5\24"+
		"\13\2\u0082\13\3\2\2\2\u0083\u0093\7n\2\2\u0084\u008c\7\u008f\2\2\u0085"+
		"\u0086\7z\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7y\2\2\u0088\u0089\7z\2"+
		"\2\u0089\u008a\5\20\t\2\u008a\u008b\7y\2\2\u008b\u008d\3\2\2\2\u008c\u0085"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\7\u008c\2"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0084"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\u008b\2\2\u0097\u0098"+
		"\5\22\n\2\u0098\r\3\2\2\2\u0099\u009a\7\65\2\2\u009a\u009b\7\u008f\2\2"+
		"\u009b\u009e\7\u0087\2\2\u009c\u009f\5\20\t\2\u009d\u009f\5\b\5\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a6\7q\2\2"+
		"\u00a1\u00a6\7\u008e\2\2\u00a2\u00a3\7\u0080\2\2\u00a3\u00a6\7q\2\2\u00a4"+
		"\u00a6\7\u008f\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00b4\7Y\2\2\u00a8"+
		"\u00b4\7\4\2\2\u00a9\u00b4\7=\2\2\u00aa\u00b4\7\60\2\2\u00ab\u00b4\7X"+
		"\2\2\u00ac\u00b4\7\63\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b0\t\2\2\2\u00b0\u00b4\7x\2\2\u00b1\u00b4\7\64\2\2\u00b2\u00b4\7\u008f"+
		"\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3"+
		"\u00aa\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b7"+
		"\7\u0084\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2"+
		"\2\u00b8\u00ba\5\20\t\2\u00b9\u00bb\5\26\f\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\25\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00bf\5\24\13"+
		"\2\u00be\u00c0\7\u0085\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00c2\t\4\2\2\u00c2\u00c3\7\u0084\2\2\u00c3\u00c4\5"+
		"\b\5\2\u00c4\u00c5\7\u0085\2\2\u00c5\31\3\2\2\2\u00c6\u00c9\5\34\17\2"+
		"\u00c7\u00c9\5 \21\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\33"+
		"\3\2\2\2\u00ca\u00cb\7A\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\7{\2\2\u00cd"+
		"\u00ce\5\b\5\2\u00ce\u00cf\7+\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\u008f"+
		"\2\2\u00d1\u00d2\7\u0087\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4\t\5\2\2"+
		"\u00d4\u00d6\5\24\13\2\u00d5\u00d7\7\61\2\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\7g\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd"+
		"\5\24\13\2\u00dd\u00de\7{\2\2\u00de\u00e0\5\b\5\2\u00df\u00e1\5\"\22\2"+
		"\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\7(\2\2\u00e3!\3\2\2\2\u00e4\u00e6\7v\2\2\u00e5\u00e7\7;\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7{\2\2\u00e9"+
		"\u00ea\5\b\5\2\u00ea#\3\2\2\2!&+/\65<@HMRW\\acior\177\u008c\u008f\u0093"+
		"\u009e\u00a5\u00b3\u00b6\u00ba\u00bf\u00c8\u00d6\u00d9\u00e0\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
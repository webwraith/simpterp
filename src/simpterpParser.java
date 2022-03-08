// Generated from F:/Dropbox/src/uni/year_2/CE204/simpterp/src\simpterp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpterpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Vardef=2, Funcdef=3, Definer=4, Bodystart=5, Op=6, Relop=7, OpBody=8, 
		ClBody=9, True=10, False=11, Pass=12, If=13, Do=14, While=15, Num=16, 
		ID=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stmt_body = 1, RULE_stmts = 2, RULE_statement = 3, 
		RULE_assignment_stmt = 4, RULE_do_loop = 5, RULE_while_loop = 6, RULE_if_stmt = 7, 
		RULE_conditional = 8, RULE_expr = 9, RULE_call = 10, RULE_arg_list = 11, 
		RULE_funcdef = 12, RULE_funcbody = 13, RULE_vardecl = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt_body", "stmts", "statement", "assignment_stmt", "do_loop", 
			"while_loop", "if_stmt", "conditional", "expr", "call", "arg_list", "funcdef", 
			"funcbody", "vardecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'@'", "'#'", "':'", "'->'", null, null, "'{'", "'}'", "'true'", 
			"'false'", "'pass'", "'if'", "'do'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Vardef", "Funcdef", "Definer", "Bodystart", "Op", "Relop", 
			"OpBody", "ClBody", "True", "False", "Pass", "If", "Do", "While", "Num", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "simpterp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpterpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			stmts();
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

	public static class Stmt_bodyContext extends ParserRuleContext {
		public TerminalNode OpBody() { return getToken(simpterpParser.OpBody, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ClBody() { return getToken(simpterpParser.ClBody, 0); }
		public Stmt_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitStmt_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_bodyContext stmt_body() throws RecognitionException {
		Stmt_bodyContext _localctx = new Stmt_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(OpBody);
			setState(33);
			stmts();
			setState(34);
			match(ClBody);
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Vardef) | (1L << Funcdef) | (1L << Op) | (1L << True) | (1L << False) | (1L << Pass) | (1L << If) | (1L << Do) | (1L << While) | (1L << Num) | (1L << ID))) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Vardef:
				case Op:
				case True:
				case False:
				case Pass:
				case If:
				case Do:
				case While:
				case Num:
				case ID:
					{
					setState(36);
					statement();
					}
					break;
				case Funcdef:
					{
					setState(37);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public TerminalNode Pass() { return getToken(simpterpParser.Pass, 0); }
		public Do_loopContext do_loop() {
			return getRuleContext(Do_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				vardecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				assignment_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(Pass);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				do_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				while_loop();
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpterpParser.ID, 0); }
		public TerminalNode Definer() { return getToken(simpterpParser.Definer, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(Definer);
			setState(54);
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

	public static class Do_loopContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(simpterpParser.Do, 0); }
		public TerminalNode Bodystart() { return getToken(simpterpParser.Bodystart, 0); }
		public Stmt_bodyContext stmt_body() {
			return getRuleContext(Stmt_bodyContext.class,0);
		}
		public TerminalNode While() { return getToken(simpterpParser.While, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Do_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitDo_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_loopContext do_loop() throws RecognitionException {
		Do_loopContext _localctx = new Do_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_do_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Do);
			setState(57);
			match(Bodystart);
			setState(58);
			stmt_body();
			setState(59);
			match(While);
			setState(60);
			conditional();
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(simpterpParser.While, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode Bodystart() { return getToken(simpterpParser.Bodystart, 0); }
		public Stmt_bodyContext stmt_body() {
			return getRuleContext(Stmt_bodyContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(While);
			setState(63);
			conditional();
			setState(64);
			match(Bodystart);
			setState(65);
			stmt_body();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(simpterpParser.If, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode Bodystart() { return getToken(simpterpParser.Bodystart, 0); }
		public Stmt_bodyContext stmt_body() {
			return getRuleContext(Stmt_bodyContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(If);
			setState(68);
			conditional();
			setState(69);
			match(Bodystart);
			setState(70);
			stmt_body();
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Relop() { return getToken(simpterpParser.Relop, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			expr();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Relop) {
				{
				setState(73);
				match(Relop);
				setState(74);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> Num() { return getTokens(simpterpParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(simpterpParser.Num, i);
		}
		public List<TerminalNode> True() { return getTokens(simpterpParser.True); }
		public TerminalNode True(int i) {
			return getToken(simpterpParser.True, i);
		}
		public List<TerminalNode> False() { return getTokens(simpterpParser.False); }
		public TerminalNode False(int i) {
			return getToken(simpterpParser.False, i);
		}
		public List<TerminalNode> Op() { return getTokens(simpterpParser.Op); }
		public TerminalNode Op(int i) {
			return getToken(simpterpParser.Op, i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(82);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Num:
						{
						setState(77);
						match(Num);
						}
						break;
					case True:
						{
						setState(78);
						match(True);
						}
						break;
					case False:
						{
						setState(79);
						match(False);
						}
						break;
					case Op:
						{
						setState(80);
						match(Op);
						}
						break;
					case ID:
						{
						setState(81);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpterpParser.ID, 0); }
		public TerminalNode Definer() { return getToken(simpterpParser.Definer, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(Definer);
			setState(88);
			arg_list();
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

	public static class Arg_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(simpterpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(simpterpParser.ID, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(91);
					match(T__0);
					setState(92);
					match(ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode Funcdef() { return getToken(simpterpParser.Funcdef, 0); }
		public TerminalNode ID() { return getToken(simpterpParser.ID, 0); }
		public TerminalNode Bodystart() { return getToken(simpterpParser.Bodystart, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Funcdef);
			setState(101);
			match(ID);
			setState(102);
			match(Bodystart);
			setState(103);
			funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(105);
				statement();
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

	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode Vardef() { return getToken(simpterpParser.Vardef, 0); }
		public TerminalNode ID() { return getToken(simpterpParser.ID, 0); }
		public TerminalNode Definer() { return getToken(simpterpParser.Definer, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpterpVisitor ) return ((simpterpVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(Vardef);
			setState(109);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Definer) {
				{
				setState(110);
				match(Definer);
				setState(111);
				expr();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\13\3\13\3\13\6\13U\n\13\r"+
		"\13\16\13V\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\5\re\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\5\17m\n\17\3\20\3\20\3\20\3\20\5\20s"+
		"\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2w\2 \3\2"+
		"\2\2\4\"\3\2\2\2\6*\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f:\3\2\2\2\16@\3"+
		"\2\2\2\20E\3\2\2\2\22J\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30d\3\2\2\2\32"+
		"f\3\2\2\2\34l\3\2\2\2\36n\3\2\2\2 !\5\6\4\2!\3\3\2\2\2\"#\7\n\2\2#$\5"+
		"\6\4\2$%\7\13\2\2%\5\3\2\2\2&)\5\b\5\2\')\5\32\16\2(&\3\2\2\2(\'\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2-\65\5\24\13\2.\65"+
		"\5\20\t\2/\65\5\36\20\2\60\65\5\n\6\2\61\65\7\16\2\2\62\65\5\f\7\2\63"+
		"\65\5\16\b\2\64-\3\2\2\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3"+
		"\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66\67\7\23\2\2\678\7\6"+
		"\2\289\5\24\13\29\13\3\2\2\2:;\7\20\2\2;<\7\7\2\2<=\5\4\3\2=>\7\21\2\2"+
		">?\5\22\n\2?\r\3\2\2\2@A\7\21\2\2AB\5\22\n\2BC\7\7\2\2CD\5\4\3\2D\17\3"+
		"\2\2\2EF\7\17\2\2FG\5\22\n\2GH\7\7\2\2HI\5\4\3\2I\21\3\2\2\2JM\5\24\13"+
		"\2KL\7\t\2\2LN\5\24\13\2MK\3\2\2\2MN\3\2\2\2N\23\3\2\2\2OU\7\22\2\2PU"+
		"\7\f\2\2QU\7\r\2\2RU\7\b\2\2SU\5\26\f\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2"+
		"TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\25\3\2\2\2XY\7\23"+
		"\2\2YZ\7\6\2\2Z[\5\30\r\2[\27\3\2\2\2\\a\7\23\2\2]^\7\3\2\2^`\7\23\2\2"+
		"_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2\2"+
		"\2de\3\2\2\2e\31\3\2\2\2fg\7\5\2\2gh\7\23\2\2hi\7\7\2\2ij\5\34\17\2j\33"+
		"\3\2\2\2km\5\b\5\2lk\3\2\2\2lm\3\2\2\2m\35\3\2\2\2no\7\4\2\2or\7\23\2"+
		"\2pq\7\6\2\2qs\5\24\13\2rp\3\2\2\2rs\3\2\2\2s\37\3\2\2\2\f(*\64MTVadl"+
		"r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
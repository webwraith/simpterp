grammar simpterp;

prog: stmts;

stmt_body: OpBody stmts ClBody;

stmts: (statement|funcdef)*;

statement:
expr
| if_stmt
| vardecl
| assignment_stmt
| Pass
| do_loop
| while_loop;

assignment_stmt: ID Definer expr;

do_loop: Do Bodystart stmt_body While conditional;

while_loop: While conditional Bodystart stmt_body;

if_stmt: If conditional Bodystart stmt_body;

conditional: expr (Relop expr)?;

expr: (Num|True|False|Op|ID|call)+;

call: ID Definer arg_list;

arg_list: (ID (',' ID)*)?;

// '#add:a,b -> ...'
funcdef: Funcdef ID Bodystart funcbody;

funcbody: (statement)?;

// '@var : 21'
vardecl: Vardef ID (Definer expr)?;

Vardef: '@';
Funcdef: '#';
Definer: ':';
Bodystart: '->';
Op: ('*'|'/'|'+'|'-'|'^');
Relop: ('<'|'>'|'<='|'>='|'!='|'==');
OpBody: '{';
ClBody: '}';

True: 'true';
False: 'false';
Pass: 'pass';
If: 'if';
Do: 'do';
While: 'while';

Num:
[0-9]+;
ID:
[_a-zA-Z][_a-zA-Z0-1]*;

WS:
[ \t\n\r]+ ->skip;
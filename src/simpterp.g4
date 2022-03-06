grammar simpterp;

prog: stmt_body;

stmt_body: (statement|classdef|funcdef)*;

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

conditional: // TODO
;

expr:
(Num|Op|call)+;

// the function call, NOT the function definition
call: ID Definer arg_list;

arg_list: (ID (',' ID)*)?;

// '#add:a,b -> ...'
funcdef: Funcdef ID Bodystart funcbody;

funcbody: (statement)?;

// '~car:vehicle -> ...'
classdef: Classdef ID (Definer ID)? Bodystart classbody;

classbody: (vardecl|funcdef)*;

// '@var : 21'
vardecl: Vardef ID (Definer expr)?;

Classdef: '~';
Vardef: '@';
Funcdef: '#';
Definer: ':';
Bodystart: '->';
Op: ('*'|'/'|'+'|'-'|'^');
Relop: ('<'|'>'|'<='|'>='|'!='|'==');

True: 'true';
False: 'false';
Pass: 'pass';
If: 'if';
Do: 'do';
While: 'while';

Num:
[0-9]+;
ID:
[_a-zA-Z][_a-zA-Z0-1];
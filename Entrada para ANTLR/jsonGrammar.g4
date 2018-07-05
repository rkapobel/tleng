grammar jsonGrammar;

@header {
    import java.util.Set;
	import java.util.HashSet;
}

jsonToYaml returns [int numSpaces] 
	@init {
        $numSpaces = 0;
    } : 
	value[$numSpaces] EOF;

object[int numSpaces] 	
	locals [
		Set<String> usedKeys = new HashSet<String>()
	] : 
	'{' ('}' { System.out.print("{}"); } | members[$numSpaces + 1] '}');

members[int numSpaces] : 
	pair[$numSpaces] (',' members[$numSpaces])?;

pair[int numSpaces]
	@init {
		int tab = $numSpaces;
	} : 
	{ System.out.print("\n"); } 
	STRING {
		String key;
		while(tab > 1){
			System.out.print(" ");
			tab--;
		}
		if (($STRING.text).charAt(1)=='-' || ($STRING.text).contains("\\n")) {
			key = $STRING.text;
		} else {
			key = ($STRING.text).substring(1, ($STRING.text).length() - 1);
		}
		System.out.print(key);
		if ($object::usedKeys.contains(key)) {
			throw new Error("Duplicated keys are not allowed: " + key);
		} else {
			$object::usedKeys.add(key);
		}
	} 
	':' { System.out.print(": "); } 
	value[$numSpaces];

array[int numSpaces] :	
	'[' (']' {System.out.print("[]");}|elements[$numSpaces + 1] ']');

elements[int numSpaces]
	@init {
		int tab = $numSpaces;
	} : { 
		System.out.print("\n");
		while(tab > 1){
			System.out.print(" ");
			tab--;
		}
		System.out.print("- ");
 	} 
	value[$numSpaces] (',' elements[$numSpaces])?;

value[int numSpaces] : 
	STRING {
		if (($STRING.text).charAt(1)=='-'||($STRING.text).contains("\\n")) {				
			System.out.print($STRING.text);
		} else {								  
			System.out.print(($STRING.text).substring(1, ($STRING.text).length() - 1));
		}
	} 
	| NUMBER {System.out.print($NUMBER.text);} 
	| object[$numSpaces] 
	| array[$numSpaces] 
	| TRUE { System.out.print("true"); } 
	| FALSE { System.out.print("false"); } 
	| NULL { System.out.print(""); };

/*
 * Lexer Rules
 */

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

STRING		: '"' (CHAR)* '"';	

NUMBER		: INTEGER (EXP | FRAC (EXP)?)?;

fragment INTEGER: DIGIT | DIGITNZ  DIGITS | '-' (DIGIT | DIGITNZ  DIGITS);

fragment FRAC	: '.' DIGITS;

fragment EXP	: E DIGITS;

fragment DIGITS	: DIGIT+;

fragment E	: 'e' ('+' |'-')? | 'E' ('+' | '-')? ;

fragment DIGIT 	: '0'..'9';
fragment DIGITNZ: '1'..'9';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

fragment CHAR : '\u0020'..'\u0021' | '\u0023'..'\u002F' | '\u003A'..'\u005B' | '\u005D'..'\uFFFE'| '\u0030'..'\u0039' | CTRL;

fragment CTRL
  :  '\\"'                                     
  |  '\\\\'                                    
  |  '\\/'                                     
  |  '\\b'                                     
  |  '\\f'                                     
  |  '\\n'                                      
  |  '\\r'                                     
  |  '\\t'                                     
  |  '\\u'  HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT     
  ;

fragment HEXDIGIT: (DIGIT | 'a'..'f' | 'A'..'F');

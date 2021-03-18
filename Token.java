// This class models a token, which has two parts:
// 1) the token itself (e.g., "id" or "+")
// 2) the token's lexeme (e.g., "foo")

public class Token {

    private String token;       //holds token string
    private String lexeme;      //holes lexeme string

    /**
     * setters
     * @param token
     * @param lexeme
     */
    public Token(String token, String lexeme) {
	this.token=token;
	this.lexeme=lexeme;
    }

    /**
     * setter. this is cool, never seen this done this way before
     * @param token
     */
    public Token(String token) {
	this(token,token);
    }

    /**
     * getters
     */
    public String tok() { return token; } 
    public String lex() { return lexeme; }

    /**
     * comparison method
     * @param t
     * @return
     */
    public boolean equals(Token t) {
	return token.equals(t.token);
    }

    /**
     * overrwrites inherited toostring
     * @return string
     */
    public String toString() {
	return "<"+tok()+","+lex()+">";
    }

}

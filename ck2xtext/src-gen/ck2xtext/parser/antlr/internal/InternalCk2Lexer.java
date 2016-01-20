package ck2xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCk2Lexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID_PART=11;
    public static final int RULE_NON_ASCII_LOW=10;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=8;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=4;
    public static final int RULE_NON_ASCII_CAP=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCk2Lexer() {;} 
    public InternalCk2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCk2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCk2.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:11:7: ( '.' )
            // InternalCk2.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:12:7: ( '-' )
            // InternalCk2.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:13:7: ( '+' )
            // InternalCk2.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:14:7: ( '{' )
            // InternalCk2.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:15:7: ( '}' )
            // InternalCk2.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:16:7: ( '=' )
            // InternalCk2.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:17:7: ( '[' )
            // InternalCk2.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:18:7: ( ']' )
            // InternalCk2.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCk2.g:1156:21: ( '0' .. '9' )
            // InternalCk2.g:1156:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1158:11: ( ( 'yes' | 'no' ) )
            // InternalCk2.g:1158:13: ( 'yes' | 'no' )
            {
            // InternalCk2.g:1158:13: ( 'yes' | 'no' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='y') ) {
                alt1=1;
            }
            else if ( (LA1_0=='n') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCk2.g:1158:14: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 2 :
                    // InternalCk2.g:1158:20: 'no'
                    {
                    match("no"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1160:10: ( ( RULE_DIGIT )+ )
            // InternalCk2.g:1160:12: ( RULE_DIGIT )+
            {
            // InternalCk2.g:1160:12: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCk2.g:1160:12: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_NON_ASCII_CAP"
    public final void mRULE_NON_ASCII_CAP() throws RecognitionException {
        try {
            // InternalCk2.g:1162:29: ( ( '\\u00C0' | '\\u00C1' | '\\u00C2' | '\\u00C3' | '\\u00C4' | '\\u00C5' | '\\u00C6' | '\\u00C7' | '\\u00C8' | '\\u00C9' | '\\u00CA' | '\\u00CB' | '\\u00CC' | '\\u00CD' | '\\u00CE' | '\\u00CF' | '\\u00D0' | '\\u00D1' | '\\u00D2' | '\\u00D3' | '\\u00D4' | '\\u00D5' | '\\u00D6' | '\\u00D8' | '\\u0160' | '\\u00D9' | '\\u00DA' | '\\u00DB' | '\\u00DC' | '\\u00DD' | '\\u0178' | '\\u00DE' | '\\u00DF' | '\\u0152' ) )
            // InternalCk2.g:1162:31: ( '\\u00C0' | '\\u00C1' | '\\u00C2' | '\\u00C3' | '\\u00C4' | '\\u00C5' | '\\u00C6' | '\\u00C7' | '\\u00C8' | '\\u00C9' | '\\u00CA' | '\\u00CB' | '\\u00CC' | '\\u00CD' | '\\u00CE' | '\\u00CF' | '\\u00D0' | '\\u00D1' | '\\u00D2' | '\\u00D3' | '\\u00D4' | '\\u00D5' | '\\u00D6' | '\\u00D8' | '\\u0160' | '\\u00D9' | '\\u00DA' | '\\u00DB' | '\\u00DC' | '\\u00DD' | '\\u0178' | '\\u00DE' | '\\u00DF' | '\\u0152' )
            {
            if ( (input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00DF')||input.LA(1)=='\u0152'||input.LA(1)=='\u0160'||input.LA(1)=='\u0178' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NON_ASCII_CAP"

    // $ANTLR start "RULE_NON_ASCII_LOW"
    public final void mRULE_NON_ASCII_LOW() throws RecognitionException {
        try {
            // InternalCk2.g:1164:29: ( ( '\\u00E0' | '\\u00E1' | '\\u00E2' | '\\u00E3' | '\\u00E4' | '\\u00E5' | '\\u00E6' | '\\u00E7' | '\\u00E8' | '\\u00E9' | '\\u00EA' | '\\u00EB' | '\\u00EC' | '\\u00ED' | '\\u00EE' | '\\u00EF' | '\\u00F0' | '\\u00F1' | '\\u00F2' | '\\u00F3' | '\\u00F4' | '\\u00F5' | '\\u00F6' | '\\u00F8' | '\\u0161' | '\\u00F9' | '\\u00FA' | '\\u00FB' | '\\u00FC' | '\\u00FD' | '\\u00FF' | '\\u017E' | '\\u00FE' | '\\u0153' ) )
            // InternalCk2.g:1164:31: ( '\\u00E0' | '\\u00E1' | '\\u00E2' | '\\u00E3' | '\\u00E4' | '\\u00E5' | '\\u00E6' | '\\u00E7' | '\\u00E8' | '\\u00E9' | '\\u00EA' | '\\u00EB' | '\\u00EC' | '\\u00ED' | '\\u00EE' | '\\u00EF' | '\\u00F0' | '\\u00F1' | '\\u00F2' | '\\u00F3' | '\\u00F4' | '\\u00F5' | '\\u00F6' | '\\u00F8' | '\\u0161' | '\\u00F9' | '\\u00FA' | '\\u00FB' | '\\u00FC' | '\\u00FD' | '\\u00FF' | '\\u017E' | '\\u00FE' | '\\u0153' )
            {
            if ( (input.LA(1)>='\u00E0' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF')||input.LA(1)=='\u0153'||input.LA(1)=='\u0161'||input.LA(1)=='\u017E' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NON_ASCII_LOW"

    // $ANTLR start "RULE_ID_PART"
    public final void mRULE_ID_PART() throws RecognitionException {
        try {
            // InternalCk2.g:1166:23: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NON_ASCII_LOW | RULE_NON_ASCII_CAP | '<' ) )
            // InternalCk2.g:1166:25: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NON_ASCII_LOW | RULE_NON_ASCII_CAP | '<' )
            {
            if ( input.LA(1)=='<'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF')||(input.LA(1)>='\u0152' && input.LA(1)<='\u0153')||(input.LA(1)>='\u0160' && input.LA(1)<='\u0161')||input.LA(1)=='\u0178'||input.LA(1)=='\u017E' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_PART"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1168:9: ( ( '^' )? RULE_ID_PART ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )* )
            // InternalCk2.g:1168:11: ( '^' )? RULE_ID_PART ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )*
            {
            // InternalCk2.g:1168:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCk2.g:1168:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mRULE_ID_PART(); 
            // InternalCk2.g:1168:29: ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\''||(LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<=':')||LA4_0=='<'||LA4_0=='>'||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u00FF')||(LA4_0>='\u0152' && LA4_0<='\u0153')||(LA4_0>='\u0160' && LA4_0<='\u0161')||LA4_0=='\u0178'||LA4_0=='\u017E'||LA4_0=='\u2019') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCk2.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF')||(input.LA(1)>='\u0152' && input.LA(1)<='\u0153')||(input.LA(1)>='\u0160' && input.LA(1)<='\u0161')||input.LA(1)=='\u0178'||input.LA(1)=='\u017E'||input.LA(1)=='\u2019' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1170:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalCk2.g:1170:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalCk2.g:1170:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCk2.g:1170:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalCk2.g:1170:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1172:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCk2.g:1172:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalCk2.g:1172:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCk2.g:1172:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCk2.g:1172:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCk2.g:1172:40: ( '\\r' )? '\\n'
                    {
                    // InternalCk2.g:1172:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCk2.g:1172:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1174:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCk2.g:1174:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCk2.g:1174:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalCk2.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_BOOL | RULE_INT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS )
        int alt10=14;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalCk2.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalCk2.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalCk2.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalCk2.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalCk2.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalCk2.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalCk2.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalCk2.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalCk2.g:1:58: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 10 :
                // InternalCk2.g:1:68: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // InternalCk2.g:1:77: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalCk2.g:1:85: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalCk2.g:1:97: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // InternalCk2.g:1:113: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\11\uffff\2\14\5\uffff\1\14\2\23\1\uffff";
    static final String DFA10_eofS =
        "\24\uffff";
    static final String DFA10_minS =
        "\1\11\10\uffff\1\145\1\157\5\uffff\1\163\2\47\1\uffff";
    static final String DFA10_maxS =
        "\1\u017e\10\uffff\1\145\1\157\5\uffff\1\163\2\u2019\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\12\1\13\1\14\1\15\1\16\3\uffff\1\11";
    static final String DFA10_specialS =
        "\24\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\15\1\16\7\uffff\1\3\1\uffff\1\2\1\1\1\uffff\12\13\2\uffff\1\14\1\6\3\uffff\32\14\1\7\1\uffff\1\10\1\14\2\uffff\15\14\1\12\12\14\1\11\1\14\1\4\1\uffff\1\5\102\uffff\27\14\1\uffff\37\14\1\uffff\10\14\122\uffff\2\14\14\uffff\2\14\26\uffff\1\14\5\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\22",
            "\1\14\5\uffff\2\14\1\uffff\13\14\1\uffff\1\14\1\uffff\1\14\2\uffff\32\14\4\uffff\1\14\1\uffff\32\14\105\uffff\27\14\1\uffff\37\14\1\uffff\10\14\122\uffff\2\14\14\uffff\2\14\26\uffff\1\14\5\uffff\1\14\u1e9a\uffff\1\14",
            "\1\14\5\uffff\2\14\1\uffff\13\14\1\uffff\1\14\1\uffff\1\14\2\uffff\32\14\4\uffff\1\14\1\uffff\32\14\105\uffff\27\14\1\uffff\37\14\1\uffff\10\14\122\uffff\2\14\14\uffff\2\14\26\uffff\1\14\5\uffff\1\14\u1e9a\uffff\1\14",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_BOOL | RULE_INT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}
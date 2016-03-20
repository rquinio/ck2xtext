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
    public static final int RULE_HEX=8;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID_PART=12;
    public static final int RULE_NON_ASCII_LOW=11;
    public static final int RULE_ID=5;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=9;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int RULE_NON_ASCII_CAP=10;
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

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:14:7: ( 'f' )
            // InternalCk2.g:14:9: 'f'
            {
            match('f'); 

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
            // InternalCk2.g:15:7: ( '{' )
            // InternalCk2.g:15:9: '{'
            {
            match('{'); 

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
            // InternalCk2.g:16:7: ( '}' )
            // InternalCk2.g:16:9: '}'
            {
            match('}'); 

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
            // InternalCk2.g:17:7: ( '=' )
            // InternalCk2.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:18:7: ( '[' )
            // InternalCk2.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:19:7: ( ']' )
            // InternalCk2.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCk2.g:1338:21: ( '0' .. '9' )
            // InternalCk2.g:1338:23: '0' .. '9'
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
            // InternalCk2.g:1340:11: ( ( 'yes' | 'no' ) )
            // InternalCk2.g:1340:13: ( 'yes' | 'no' )
            {
            // InternalCk2.g:1340:13: ( 'yes' | 'no' )
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
                    // InternalCk2.g:1340:14: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 2 :
                    // InternalCk2.g:1340:20: 'no'
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

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1342:10: ( '0x' ( RULE_DIGIT | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' )+ )
            // InternalCk2.g:1342:12: '0x' ( RULE_DIGIT | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' )+
            {
            match("0x"); 

            // InternalCk2.g:1342:17: ( RULE_DIGIT | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCk2.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCk2.g:1344:10: ( ( RULE_DIGIT )+ )
            // InternalCk2.g:1344:12: ( RULE_DIGIT )+
            {
            // InternalCk2.g:1344:12: ( RULE_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCk2.g:1344:12: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalCk2.g:1346:29: ( ( '\\u00C0' | '\\u00C1' | '\\u00C2' | '\\u00C3' | '\\u00C4' | '\\u00C5' | '\\u00C6' | '\\u00C7' | '\\u00C8' | '\\u00C9' | '\\u00CA' | '\\u00CB' | '\\u00CC' | '\\u00CD' | '\\u00CE' | '\\u00CF' | '\\u00D0' | '\\u00D1' | '\\u00D2' | '\\u00D3' | '\\u00D4' | '\\u00D5' | '\\u00D6' | '\\u00D8' | '\\u0160' | '\\u00D9' | '\\u00DA' | '\\u00DB' | '\\u00DC' | '\\u00DD' | '\\u0178' | '\\u00DE' | '\\u00DF' | '\\u0152' ) )
            // InternalCk2.g:1346:31: ( '\\u00C0' | '\\u00C1' | '\\u00C2' | '\\u00C3' | '\\u00C4' | '\\u00C5' | '\\u00C6' | '\\u00C7' | '\\u00C8' | '\\u00C9' | '\\u00CA' | '\\u00CB' | '\\u00CC' | '\\u00CD' | '\\u00CE' | '\\u00CF' | '\\u00D0' | '\\u00D1' | '\\u00D2' | '\\u00D3' | '\\u00D4' | '\\u00D5' | '\\u00D6' | '\\u00D8' | '\\u0160' | '\\u00D9' | '\\u00DA' | '\\u00DB' | '\\u00DC' | '\\u00DD' | '\\u0178' | '\\u00DE' | '\\u00DF' | '\\u0152' )
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
            // InternalCk2.g:1348:29: ( ( '\\u00E0' | '\\u00E1' | '\\u00E2' | '\\u00E3' | '\\u00E4' | '\\u00E5' | '\\u00E6' | '\\u00E7' | '\\u00E8' | '\\u00E9' | '\\u00EA' | '\\u00EB' | '\\u00EC' | '\\u00ED' | '\\u00EE' | '\\u00EF' | '\\u00F0' | '\\u00F1' | '\\u00F2' | '\\u00F3' | '\\u00F4' | '\\u00F5' | '\\u00F6' | '\\u00F8' | '\\u0161' | '\\u00F9' | '\\u00FA' | '\\u00FB' | '\\u00FC' | '\\u00FD' | '\\u00FF' | '\\u017E' | '\\u00FE' | '\\u0153' ) )
            // InternalCk2.g:1348:31: ( '\\u00E0' | '\\u00E1' | '\\u00E2' | '\\u00E3' | '\\u00E4' | '\\u00E5' | '\\u00E6' | '\\u00E7' | '\\u00E8' | '\\u00E9' | '\\u00EA' | '\\u00EB' | '\\u00EC' | '\\u00ED' | '\\u00EE' | '\\u00EF' | '\\u00F0' | '\\u00F1' | '\\u00F2' | '\\u00F3' | '\\u00F4' | '\\u00F5' | '\\u00F6' | '\\u00F8' | '\\u0161' | '\\u00F9' | '\\u00FA' | '\\u00FB' | '\\u00FC' | '\\u00FD' | '\\u00FF' | '\\u017E' | '\\u00FE' | '\\u0153' )
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
            // InternalCk2.g:1350:23: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NON_ASCII_LOW | RULE_NON_ASCII_CAP | '<' ) )
            // InternalCk2.g:1350:25: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_NON_ASCII_LOW | RULE_NON_ASCII_CAP | '<' )
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
            // InternalCk2.g:1352:9: ( ( '^' )? RULE_ID_PART ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )* )
            // InternalCk2.g:1352:11: ( '^' )? RULE_ID_PART ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )*
            {
            // InternalCk2.g:1352:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCk2.g:1352:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mRULE_ID_PART(); 
            // InternalCk2.g:1352:29: ( RULE_ID_PART | RULE_DIGIT | '_' | '-' | '\\'' | '\\u2019' | ':' | '.' | '>' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\''||(LA5_0>='-' && LA5_0<='.')||(LA5_0>='0' && LA5_0<=':')||LA5_0=='<'||LA5_0=='>'||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')||(LA5_0>='\u00C0' && LA5_0<='\u00D6')||(LA5_0>='\u00D8' && LA5_0<='\u00F6')||(LA5_0>='\u00F8' && LA5_0<='\u00FF')||(LA5_0>='\u0152' && LA5_0<='\u0153')||(LA5_0>='\u0160' && LA5_0<='\u0161')||LA5_0=='\u0178'||LA5_0=='\u017E'||LA5_0=='\u2019') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalCk2.g:1354:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalCk2.g:1354:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalCk2.g:1354:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCk2.g:1354:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalCk2.g:1354:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop6;
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
            // InternalCk2.g:1356:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCk2.g:1356:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalCk2.g:1356:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCk2.g:1356:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalCk2.g:1356:39: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCk2.g:1356:40: ( '\\r' )? '\\n'
                    {
                    // InternalCk2.g:1356:40: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCk2.g:1356:40: '\\r'
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
            // InternalCk2.g:1358:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCk2.g:1358:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCk2.g:1358:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
        // InternalCk2.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_BOOL | RULE_HEX | RULE_INT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS )
        int alt11=16;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalCk2.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalCk2.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalCk2.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalCk2.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalCk2.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalCk2.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalCk2.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalCk2.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalCk2.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalCk2.g:1:64: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 11 :
                // InternalCk2.g:1:74: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 12 :
                // InternalCk2.g:1:83: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalCk2.g:1:92: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalCk2.g:1:100: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalCk2.g:1:112: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalCk2.g:1:128: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\4\uffff\1\22\5\uffff\2\16\1\15\6\uffff\1\16\1\27\1\uffff\1\27\1\uffff";
    static final String DFA11_eofS =
        "\30\uffff";
    static final String DFA11_minS =
        "\1\11\3\uffff\1\47\5\uffff\1\145\1\157\1\170\6\uffff\1\163\1\47\1\uffff\1\47\1\uffff";
    static final String DFA11_maxS =
        "\1\u017e\3\uffff\1\u2019\5\uffff\1\145\1\157\1\170\6\uffff\1\163\1\u2019\1\uffff\1\u2019\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\3\uffff\1\14\1\15\1\16\1\17\1\20\1\4\2\uffff\1\13\1\uffff\1\12";
    static final String DFA11_specialS =
        "\30\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\21\2\uffff\1\21\22\uffff\1\21\1\uffff\1\17\1\20\7\uffff\1\3\1\uffff\1\2\1\1\1\uffff\1\14\11\15\2\uffff\1\16\1\7\3\uffff\32\16\1\10\1\uffff\1\11\1\16\2\uffff\5\16\1\4\7\16\1\13\12\16\1\12\1\16\1\5\1\uffff\1\6\102\uffff\27\16\1\uffff\37\16\1\uffff\10\16\122\uffff\2\16\14\uffff\2\16\26\uffff\1\16\5\uffff\1\16",
            "",
            "",
            "",
            "\1\16\5\uffff\2\16\1\uffff\13\16\1\uffff\1\16\1\uffff\1\16\2\uffff\32\16\4\uffff\1\16\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16\122\uffff\2\16\14\uffff\2\16\26\uffff\1\16\5\uffff\1\16\u1e9a\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\16\5\uffff\2\16\1\uffff\13\16\1\uffff\1\16\1\uffff\1\16\2\uffff\32\16\4\uffff\1\16\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16\122\uffff\2\16\14\uffff\2\16\26\uffff\1\16\5\uffff\1\16\u1e9a\uffff\1\16",
            "",
            "\1\16\5\uffff\2\16\1\uffff\13\16\1\uffff\1\16\1\uffff\1\16\2\uffff\32\16\4\uffff\1\16\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16\122\uffff\2\16\14\uffff\2\16\26\uffff\1\16\5\uffff\1\16\u1e9a\uffff\1\16",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_BOOL | RULE_HEX | RULE_INT | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}
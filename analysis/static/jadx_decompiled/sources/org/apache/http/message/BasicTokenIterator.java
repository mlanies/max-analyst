package org.apache.http.message;

import defpackage.rh4;
import defpackage.zr6;
import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;

@Deprecated
/* loaded from: classes2.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos;

    public BasicTokenIterator(HeaderIterator headerIterator) {
        if (headerIterator == null) {
            throw new IllegalArgumentException("Header iterator must not be null.");
        }
        this.headerIt = headerIterator;
        this.searchPos = findNext(-1);
    }

    public String createToken(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public int findNext(int i) throws ParseException {
        int iFindTokenSeparator;
        if (i >= 0) {
            iFindTokenSeparator = findTokenSeparator(i);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            iFindTokenSeparator = 0;
        }
        int iFindTokenStart = findTokenStart(iFindTokenSeparator);
        if (iFindTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int iFindTokenEnd = findTokenEnd(iFindTokenStart);
        this.currentToken = createToken(this.currentHeader, iFindTokenStart, iFindTokenEnd);
        return iFindTokenEnd;
    }

    public int findTokenEnd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Token start position must not be negative: "));
        }
        int length = this.currentHeader.length();
        do {
            i++;
            if (i >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i)));
        return i;
    }

    public int findTokenSeparator(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Search position must not be negative: "));
        }
        int length = this.currentHeader.length();
        boolean z = false;
        while (!z && i < length) {
            char cCharAt = this.currentHeader.charAt(i);
            if (isTokenSeparator(cCharAt)) {
                z = true;
            } else {
                if (!isWhitespace(cCharAt)) {
                    if (isTokenChar(cCharAt)) {
                        StringBuilder sbN = rh4.n(i, "Tokens without separator (pos ", "): ");
                        sbN.append(this.currentHeader);
                        throw new ParseException(sbN.toString());
                    }
                    StringBuilder sbN2 = rh4.n(i, "Invalid character after token (pos ", "): ");
                    sbN2.append(this.currentHeader);
                    throw new ParseException(sbN2.toString());
                }
                i++;
            }
        }
        return i;
    }

    public int findTokenStart(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "Search position must not be negative: "));
        }
        boolean z = false;
        while (!z) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z && i < length) {
                char cCharAt = this.currentHeader.charAt(i);
                if (isTokenSeparator(cCharAt) || isWhitespace(cCharAt)) {
                    i++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(i))) {
                        StringBuilder sbN = rh4.n(i, "Invalid character before token (pos ", "): ");
                        sbN.append(this.currentHeader);
                        throw new ParseException(sbN.toString());
                    }
                    z = true;
                }
            }
            if (!z) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    i = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c) {
        return HTTP_SEPARATORS.indexOf(c) >= 0;
    }

    public boolean isTokenChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return (Character.isISOControl(c) || isHttpSeparator(c)) ? false : true;
    }

    public boolean isTokenSeparator(char c) {
        return c == ',';
    }

    public boolean isWhitespace(char c) {
        return c == '\t' || Character.isSpaceChar(c);
    }

    @Override // java.util.Iterator
    public final Object next() throws ParseException, NoSuchElementException {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() throws ParseException, NoSuchElementException {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}

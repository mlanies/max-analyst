package org.apache.http.impl.io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public abstract class AbstractMessageParser implements HttpMessageParser {
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private final SessionInputBuffer sessionBuffer;

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        if (sessionInputBuffer == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (httpParams == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.sessionBuffer = sessionInputBuffer;
        this.maxHeaderCount = httpParams.getIntParameter("http.connection.max-header-count", -1);
        this.maxLineLen = httpParams.getIntParameter("http.connection.max-line-length", -1);
        this.lineParser = lineParser == null ? BasicLineParser.DEFAULT : lineParser;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        r9 = new org.apache.http.Header[r0.size()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r6 >= r0.size()) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        r9[r6] = r12.parseHeader((org.apache.http.util.CharArrayBuffer) r0.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        throw new org.apache.http.ProtocolException(r9.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.http.Header[] parseHeaders(org.apache.http.io.SessionInputBuffer r9, int r10, int r11, org.apache.http.message.LineParser r12) throws org.apache.http.HttpException, java.io.IOException {
        /*
            if (r9 == 0) goto Lb0
            if (r12 != 0) goto L6
            org.apache.http.message.BasicLineParser r12 = org.apache.http.message.BasicLineParser.DEFAULT
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        Le:
            if (r2 != 0) goto L18
            org.apache.http.util.CharArrayBuffer r2 = new org.apache.http.util.CharArrayBuffer
            r4 = 64
            r2.<init>(r4)
            goto L1b
        L18:
            r2.clear()
        L1b:
            int r4 = r9.readLine(r2)
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L89
            int r4 = r2.length()
            r5 = 1
            if (r4 >= r5) goto L2b
            goto L89
        L2b:
            char r4 = r2.charAt(r6)
            r7 = 9
            r8 = 32
            if (r4 == r8) goto L3b
            char r4 = r2.charAt(r6)
            if (r4 != r7) goto L73
        L3b:
            if (r3 == 0) goto L73
        L3d:
            int r4 = r2.length()
            if (r6 >= r4) goto L4f
            char r4 = r2.charAt(r6)
            if (r4 == r8) goto L4c
            if (r4 == r7) goto L4c
            goto L4f
        L4c:
            int r6 = r6 + 1
            goto L3d
        L4f:
            if (r11 <= 0) goto L67
            int r4 = r3.length()
            int r4 = r4 + r5
            int r5 = r2.length()
            int r5 = r5 + r4
            int r5 = r5 - r6
            if (r5 > r11) goto L5f
            goto L67
        L5f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Maximum line length limit exceeded"
            r9.<init>(r10)
            throw r9
        L67:
            r3.append(r8)
            int r4 = r2.length()
            int r4 = r4 - r6
            r3.append(r2, r6, r4)
            goto L78
        L73:
            r0.add(r2)
            r3 = r2
            r2 = r1
        L78:
            if (r10 <= 0) goto Le
            int r4 = r0.size()
            if (r4 >= r10) goto L81
            goto Le
        L81:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Maximum header count exceeded"
            r9.<init>(r10)
            throw r9
        L89:
            int r9 = r0.size()
            org.apache.http.Header[] r9 = new org.apache.http.Header[r9]
        L8f:
            int r10 = r0.size()
            if (r6 >= r10) goto Laf
            java.lang.Object r10 = r0.get(r6)
            org.apache.http.util.CharArrayBuffer r10 = (org.apache.http.util.CharArrayBuffer) r10
            org.apache.http.Header r10 = r12.parseHeader(r10)     // Catch: org.apache.http.ParseException -> La4
            r9[r6] = r10     // Catch: org.apache.http.ParseException -> La4
            int r6 = r6 + 1
            goto L8f
        La4:
            r9 = move-exception
            org.apache.http.ProtocolException r10 = new org.apache.http.ProtocolException
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r9)
            throw r10
        Laf:
            return r9
        Lb0:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Session input buffer may not be null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.io.AbstractMessageParser.parseHeaders(org.apache.http.io.SessionInputBuffer, int, int, org.apache.http.message.LineParser):org.apache.http.Header[]");
    }

    @Override // org.apache.http.io.HttpMessageParser
    public HttpMessage parse() throws HttpException, IOException {
        try {
            HttpMessage head = parseHead(this.sessionBuffer);
            head.setHeaders(parseHeaders(this.sessionBuffer, this.maxHeaderCount, this.maxLineLen, this.lineParser));
            return head;
        } catch (ParseException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    public abstract HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws HttpException, ParseException, IOException;
}

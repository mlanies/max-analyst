package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: classes2.dex */
public class BasicRequestLine implements RequestLine, Cloneable {
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        }
        if (protocolVersion == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
        this.method = str;
        this.uri = str2;
        this.protoversion = protocolVersion;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.RequestLine
    public String getMethod() {
        return this.method;
    }

    @Override // org.apache.http.RequestLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    @Override // org.apache.http.RequestLine
    public String getUri() {
        return this.uri;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatRequestLine((CharArrayBuffer) null, this).toString();
    }
}

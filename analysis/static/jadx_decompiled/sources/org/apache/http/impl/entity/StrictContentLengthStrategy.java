package org.apache.http.impl.entity;

import defpackage.wg0;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: classes2.dex */
public class StrictContentLengthStrategy implements ContentLengthStrategy {
    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        if (httpMessage == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        Header firstHeader = httpMessage.getFirstHeader(HTTP.TRANSFER_ENCODING);
        Header firstHeader2 = httpMessage.getFirstHeader(HTTP.CONTENT_LEN);
        if (firstHeader == null) {
            if (firstHeader2 == null) {
                return -1L;
            }
            String value = firstHeader2.getValue();
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(wg0.i("Invalid content length: ", value));
            }
        }
        String value2 = firstHeader.getValue();
        if (!HTTP.CHUNK_CODING.equalsIgnoreCase(value2)) {
            if (HTTP.IDENTITY_CODING.equalsIgnoreCase(value2)) {
                return -1L;
            }
            throw new ProtocolException(wg0.i("Unsupported transfer encoding: ", value2));
        }
        if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
            return -2L;
        }
        throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
    }
}

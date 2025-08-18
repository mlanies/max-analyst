package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;

@Deprecated
/* loaded from: classes2.dex */
public final class EntityUtils {
    private EntityUtils() {
    }

    public static String getContentCharSet(HttpEntity httpEntity) throws ParseException {
        NameValuePair parameterByName;
        if (httpEntity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        if (httpEntity.getContentType() != null) {
            HeaderElement[] elements = httpEntity.getContentType().getElements();
            if (elements.length > 0 && (parameterByName = elements[0].getParameterByName("charset")) != null) {
                return parameterByName.getValue();
            }
        }
        return null;
    }

    public static byte[] toByteArray(HttpEntity httpEntity) throws IllegalStateException, IOException {
        if (httpEntity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return new byte[0];
        }
        if (httpEntity.getContentLength() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int contentLength = (int) httpEntity.getContentLength();
        if (contentLength < 0) {
            contentLength = 4096;
        }
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = content.read(bArr);
                if (i == -1) {
                    content.close();
                    return byteArrayBuffer.toByteArray();
                }
                byteArrayBuffer.append(bArr, 0, i);
            }
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    public static String toString(HttpEntity httpEntity, String str) throws IllegalStateException, ParseException, IOException {
        if (httpEntity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return "";
        }
        if (httpEntity.getContentLength() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int contentLength = (int) httpEntity.getContentLength();
        if (contentLength < 0) {
            contentLength = 4096;
        }
        String contentCharSet = getContentCharSet(httpEntity);
        if (contentCharSet != null) {
            str = contentCharSet;
        }
        if (str == null) {
            str = "ISO-8859-1";
        }
        InputStreamReader inputStreamReader = new InputStreamReader(content, str);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength);
        try {
            char[] cArr = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    inputStreamReader.close();
                    return charArrayBuffer.toString();
                }
                charArrayBuffer.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    public static String toString(HttpEntity httpEntity) throws ParseException, IOException {
        return toString(httpEntity, null);
    }
}

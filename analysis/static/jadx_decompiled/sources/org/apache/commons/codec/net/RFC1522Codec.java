package org.apache.commons.codec.net;

import defpackage.zr6;
import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

@Deprecated
/* loaded from: classes2.dex */
abstract class RFC1522Codec {
    public String decodeText(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("=?") || !str.endsWith("?=")) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int iIndexOf = str.indexOf("?", 2);
        if (iIndexOf == -1 || iIndexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String strSubstring = str.substring(2, iIndexOf);
        if (strSubstring.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf("?", i);
        if (iIndexOf2 == -1 || iIndexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        if (!getEncoding().equalsIgnoreCase(strSubstring2)) {
            throw new DecoderException(zr6.i("This codec cannot decode ", strSubstring2, " encoded content"));
        }
        int i2 = iIndexOf2 + 1;
        return new String(doDecoding(str.substring(i2, str.indexOf("?", i2)).getBytes("US-ASCII")), strSubstring);
    }

    public abstract byte[] doDecoding(byte[] bArr) throws DecoderException;

    public abstract byte[] doEncoding(byte[] bArr) throws EncoderException;

    public String encodeText(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("=?");
        stringBuffer.append(str2);
        stringBuffer.append('?');
        stringBuffer.append(getEncoding());
        stringBuffer.append('?');
        stringBuffer.append(new String(doEncoding(str.getBytes(str2)), "US-ASCII"));
        stringBuffer.append("?=");
        return stringBuffer.toString();
    }

    public abstract String getEncoding();
}

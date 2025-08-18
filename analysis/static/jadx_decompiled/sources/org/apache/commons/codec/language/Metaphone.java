package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: classes2.dex */
public class Metaphone implements StringEncoder {
    private String vowels = "AEIOU";
    private String frontv = "EIY";
    private String varson = "CSPTG";
    private int maxCodeLen = 4;

    private boolean isLastChar(int i, int i2) {
        return i2 + 1 == i;
    }

    private boolean isNextChar(StringBuffer stringBuffer, int i, char c) {
        return i >= 0 && i < stringBuffer.length() - 1 && stringBuffer.charAt(i + 1) == c;
    }

    private boolean isPreviousChar(StringBuffer stringBuffer, int i, char c) {
        return i > 0 && i < stringBuffer.length() && stringBuffer.charAt(i - 1) == c;
    }

    private boolean isVowel(StringBuffer stringBuffer, int i) {
        return this.vowels.indexOf(stringBuffer.charAt(i)) >= 0;
    }

    private boolean regionMatch(StringBuffer stringBuffer, int i, String str) {
        if (i < 0 || (str.length() + i) - 1 >= stringBuffer.length()) {
            return false;
        }
        return stringBuffer.substring(i, str.length() + i).equals(str);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return metaphone((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isMetaphoneEqual(String str, String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String metaphone(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.Metaphone.metaphone(java.lang.String):java.lang.String");
    }

    public void setMaxCodeLen(int i) {
        this.maxCodeLen = i;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return metaphone(str);
    }
}

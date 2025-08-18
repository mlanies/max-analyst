package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ss6 extends nd7 {
    public static final Pattern m = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder k = b52.c.newDecoder();
    public final CharsetDecoder l = b52.b.newDecoder();

    @Override // defpackage.nd7
    public final f99 n(k99 k99Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.l;
        CharsetDecoder charsetDecoder2 = this.k;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new f99(new ws6(null, null, bArr));
        }
        Matcher matcher = m.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strT = lz7.T(strGroup);
                strT.getClass();
                if (strT.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strT.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new f99(new ws6(str, str2, bArr));
    }
}

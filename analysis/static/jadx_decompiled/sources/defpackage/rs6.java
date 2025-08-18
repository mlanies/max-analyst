package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rs6 extends j47 {
    public static final Pattern y0 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder w0;
    public final CharsetDecoder x0;

    public rs6() {
        super(17);
        this.w0 = b52.c.newDecoder();
        this.x0 = b52.b.newDecoder();
    }

    @Override // defpackage.j47
    public final e99 w(j99 j99Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.x0;
        CharsetDecoder charsetDecoder2 = this.w0;
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
            return new e99(new vs6(null, null, bArr));
        }
        Matcher matcher = y0.matcher(string);
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
        return new e99(new vs6(str, str2, bArr));
    }
}

package defpackage;

import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class mq6 {
    static {
        new aw0(BasicHeaderValueFormatter.UNSAFE_CHARS.getBytes(a52.a)).b = BasicHeaderValueFormatter.UNSAFE_CHARS;
        new aw0("\t ,=".getBytes(a52.a)).b = "\t ,=";
    }

    public static final boolean a(yic yicVar) {
        if (tpa.f(yicVar.a.c, HttpHead.METHOD_NAME)) {
            return false;
        }
        int i = yicVar.o;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && naf.j(yicVar) == -1) {
            String strA = yicVar.Y.a(HTTP.TRANSFER_ENCODING);
            if (strA == null) {
                strA = null;
            }
            if (!HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Type inference failed for: r23v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.kj6 r35, defpackage.vq6 r36, defpackage.cj6 r37) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq6.b(kj6, vq6, cj6):void");
    }
}

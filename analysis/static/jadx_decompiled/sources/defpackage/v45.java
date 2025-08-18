package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class v45 {
    public df4 a;
    public gb0 b;
    public int c;
    public int d;
    public int e;
    public xnc f;
    public final g8c g;
    public final y9 h;
    public final b8c i;
    public final dp3 j;

    public v45(g8c g8cVar, y9 y9Var, b8c b8cVar) {
        dp3 dp3Var = dp3.c;
        this.g = g8cVar;
        this.h = y9Var;
        this.i = b8cVar;
        this.j = dp3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f8c a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v45.a(int, int, int, int, boolean, boolean):f8c");
    }

    public final void b(IOException iOException) {
        this.f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == 8) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.e++;
        }
    }
}

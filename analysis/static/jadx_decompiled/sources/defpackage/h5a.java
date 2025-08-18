package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class h5a {
    public static final vc0 a = new vc0();
    public static final wc0 b = new wc0();

    public static nj0 a(m5a m5aVar) {
        if (m5aVar instanceof j5a) {
            return a;
        }
        if (m5aVar instanceof l5a) {
            return b;
        }
        if (m5aVar.equals(k5a.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wv6 b(String str, m5a m5aVar, int i) {
        if ((i & 2) != 0) {
            m5aVar = j5a.a;
        }
        Uri uriD = fp3.d(str);
        if (uriD == null) {
            uriD = Uri.EMPTY;
        }
        xv6 xv6VarD = xv6.d(uriD);
        xv6VarD.g = uv6.b;
        xv6VarD.l = a(m5aVar);
        xv6VarD.k = a9b.c;
        return xv6VarD.a();
    }
}

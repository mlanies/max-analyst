package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class wzc implements xzc {
    public final String[] a;
    public final p82 b;
    public final b0d c;

    public wzc(String[] strArr, p82 p82Var, b0d b0dVar) {
        this.a = strArr;
        this.b = p82Var;
        this.c = b0dVar;
    }

    @Override // defpackage.xzc
    public final List a(String str) {
        b0d b0dVar = this.c;
        p82 p82Var = this.b;
        p82Var.getClass();
        e52 e52Var = (e52) p82Var.e0(null, new b82(p82Var, 2));
        nz4 nz4Var = nz4.a;
        if (e52Var == null) {
            return nz4Var;
        }
        try {
            if (b0dVar.f(e52Var, str)) {
                return Collections.singletonList(b0dVar.a(e52Var, str));
            }
            for (String str2 : this.a) {
                if (b0dVar.h(str2, str)) {
                    return Collections.singletonList(b0dVar.a(e52Var, str2));
                }
            }
            return nz4Var;
        } catch (Throwable th) {
            hm9.l0(wzc.class.getName(), "fail to search saved messages chat", th);
            return nz4Var;
        }
    }
}

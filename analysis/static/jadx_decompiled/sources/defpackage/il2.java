package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public final class il2 {
    public final mn5 a;
    public final pk b;
    public String c = null;
    public int d = 0;
    public final ContextScope e;
    public final ArrayList f;
    public fl2 g;
    public boolean h;
    public long i;
    public long j;
    public int k;

    public il2(xk1 xk1Var, pk pkVar) {
        this.a = xk1Var;
        this.b = pkVar;
        hde hdeVarA = f46.a();
        jd4 jd4Var = ql4.a;
        this.e = j1e.a(hdeVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
        this.f = new ArrayList();
        this.h = true;
    }

    public final void a() {
        this.i = 0L;
        this.k = 0;
        this.d = 0;
        this.f.clear();
        this.j = 0L;
        this.c = null;
        this.h = true;
    }
}

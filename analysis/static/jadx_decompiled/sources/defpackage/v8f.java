package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class v8f implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ w8f o;

    public v8f(w8f w8fVar, String str, int i, long j) {
        this.o = w8fVar;
        this.a = str;
        this.b = i;
        this.c = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        w8f w8fVar = this.o;
        zkc zkcVar = w8fVar.c;
        ilc ilcVar = w8fVar.a;
        q36 q36VarF = zkcVar.f();
        String str = this.a;
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        q36VarF.j(2, au1.s(this.b));
        q36VarF.j(3, this.c);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                zkcVar.t(q36VarF);
                return null;
            } finally {
                ilcVar.l();
            }
        } catch (Throwable th) {
            zkcVar.t(q36VarF);
            throw th;
        }
    }
}

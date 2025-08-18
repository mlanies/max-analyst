package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class pef implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ qef Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ mqb b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public pef(qef qefVar, String str, mqb mqbVar, float f, float f2, boolean z) {
        this.Y = qefVar;
        this.a = str;
        this.b = mqbVar;
        this.c = f;
        this.o = f2;
        this.X = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        qef qefVar = this.Y;
        zkc zkcVar = qefVar.c;
        ilc ilcVar = qefVar.a;
        q36 q36VarF = zkcVar.f();
        String str = this.a;
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        q36VarF.j(2, this.b.b);
        q36VarF.h(3, this.c);
        q36VarF.h(4, this.o);
        q36VarF.j(5, this.X ? 1L : 0L);
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

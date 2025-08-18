package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class xkc implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ alc o;

    public xkc(alc alcVar, String str, String str2, String str3) {
        this.o = alcVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        alc alcVar = this.o;
        p19 p19Var = alcVar.i;
        ilc ilcVar = alcVar.a;
        q36 q36VarF = p19Var.f();
        String str = this.a;
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        String str2 = this.b;
        if (str2 == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            q36VarF.W(3);
        } else {
            q36VarF.f(3, str3);
        }
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                p19Var.t(q36VarF);
                return e5f.a;
            } finally {
                ilcVar.l();
            }
        } catch (Throwable th) {
            p19Var.t(q36VarF);
            throw th;
        }
    }
}

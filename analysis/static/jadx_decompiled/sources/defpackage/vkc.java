package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class vkc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ alc b;

    public /* synthetic */ vkc(alc alcVar, int i) {
        this.a = i;
        this.b = alcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                alc alcVar = this.b;
                zkc zkcVar = alcVar.d;
                ilcVar = alcVar.a;
                q36 q36VarF = zkcVar.f();
                try {
                    ilcVar.c();
                    try {
                        q36VarF.n();
                        ilcVar.r();
                        zkcVar.t(q36VarF);
                        return e5f.a;
                    } finally {
                    }
                } catch (Throwable th) {
                    zkcVar.t(q36VarF);
                    throw th;
                }
            default:
                alc alcVar2 = this.b;
                zkc zkcVar2 = alcVar2.h;
                ilcVar = alcVar2.a;
                q36 q36VarF2 = zkcVar2.f();
                try {
                    ilcVar.c();
                    try {
                        q36VarF2.n();
                        ilcVar.r();
                        zkcVar2.t(q36VarF2);
                        return e5f.a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    zkcVar2.t(q36VarF2);
                    throw th2;
                }
        }
    }
}

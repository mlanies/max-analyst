package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class wkc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ alc c;

    public /* synthetic */ wkc(alc alcVar, String str, int i) {
        this.a = i;
        this.c = alcVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                alc alcVar = this.c;
                zkc zkcVar = alcVar.e;
                ilcVar = alcVar.a;
                q36 q36VarF = zkcVar.f();
                String str = this.b;
                if (str == null) {
                    q36VarF.W(1);
                } else {
                    q36VarF.f(1, str);
                }
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
                alc alcVar2 = this.c;
                zkc zkcVar2 = alcVar2.g;
                ilcVar = alcVar2.a;
                q36 q36VarF2 = zkcVar2.f();
                String str2 = this.b;
                if (str2 == null) {
                    q36VarF2.W(1);
                } else {
                    q36VarF2.f(1, str2);
                }
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

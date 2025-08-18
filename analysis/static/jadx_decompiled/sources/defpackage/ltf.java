package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ltf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ puf b;
    public final /* synthetic */ mtf c;

    public /* synthetic */ ltf(mtf mtfVar, puf pufVar, int i) {
        this.a = i;
        this.c = mtfVar;
        this.b = pufVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                mtf mtfVar = this.c;
                ilcVar = mtfVar.a;
                ilcVar.c();
                try {
                    mtfVar.b.C(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
            default:
                mtf mtfVar2 = this.c;
                ilcVar = mtfVar2.a;
                ilcVar.c();
                try {
                    mtfVar2.c.B(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
        }
    }
}

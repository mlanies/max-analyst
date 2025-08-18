package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c9c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ d9c c;

    public /* synthetic */ c9c(d9c d9cVar, List list, int i) {
        this.a = i;
        this.c = d9cVar;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                d9c d9cVar = this.c;
                ilcVar = d9cVar.a;
                ilcVar.c();
                try {
                    d9cVar.b.B(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return null;
                } finally {
                }
            default:
                d9c d9cVar2 = this.c;
                ilcVar = d9cVar2.a;
                ilcVar.c();
                try {
                    d9cVar2.c.C(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return null;
                } finally {
                }
        }
    }
}

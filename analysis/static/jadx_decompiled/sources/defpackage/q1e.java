package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q1e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ s1e c;

    public /* synthetic */ q1e(s1e s1eVar, List list, int i) {
        this.a = i;
        this.c = s1eVar;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                StringBuilder sbL = au1.l("DELETE FROM events WHERE id in (");
                List<Long> list = this.b;
                a14.c(sbL, list.size());
                sbL.append(")");
                String string = sbL.toString();
                s1e s1eVar = this.c;
                q36 q36VarD = s1eVar.a.d(string);
                int i = 1;
                for (Long l : list) {
                    if (l == null) {
                        q36VarD.W(i);
                    } else {
                        q36VarD.j(i, l.longValue());
                    }
                    i++;
                }
                ilcVar = s1eVar.a;
                ilcVar.c();
                try {
                    q36VarD.n();
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
            default:
                s1e s1eVar2 = this.c;
                ilcVar = s1eVar2.a;
                ilcVar.c();
                try {
                    s1eVar2.b.B(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
        }
    }
}

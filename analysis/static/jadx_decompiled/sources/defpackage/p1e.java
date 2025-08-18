package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p1e implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s1e c;

    public p1e(s1e s1eVar, List list, int i) {
        this.c = s1eVar;
        this.a = list;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder sbL = au1.l("UPDATE events SET status = ? WHERE id in (");
        List<Long> list = this.a;
        a14.c(sbL, list.size());
        sbL.append(")");
        String string = sbL.toString();
        s1e s1eVar = this.c;
        q36 q36VarD = s1eVar.a.d(string);
        q36VarD.j(1, zr6.d(this.b));
        int i = 2;
        for (Long l : list) {
            if (l == null) {
                q36VarD.W(i);
            } else {
                q36VarD.j(i, l.longValue());
            }
            i++;
        }
        ilc ilcVar = s1eVar.a;
        ilcVar.c();
        try {
            q36VarD.n();
            ilcVar.r();
            ilcVar.l();
            return e5f.a;
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }
}

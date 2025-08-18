package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class nd5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ od5 c;

    public /* synthetic */ nd5(od5 od5Var, List list, int i) {
        this.a = i;
        this.c = od5Var;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                od5 od5Var = this.c;
                ilcVar = od5Var.a;
                ilcVar.c();
                try {
                    od5Var.b.B(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return null;
                } finally {
                }
            default:
                StringBuilder sbL = au1.l("DELETE FROM favorite_stickers WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                a14.c(sbL, list == null ? 1 : list.size());
                sbL.append(")");
                String string = sbL.toString();
                od5 od5Var2 = this.c;
                q36 q36VarD = od5Var2.a.d(string);
                if (list == null) {
                    q36VarD.W(1);
                } else {
                    for (Long l : list) {
                        if (l == null) {
                            q36VarD.W(i);
                        } else {
                            q36VarD.j(i, l.longValue());
                        }
                        i++;
                    }
                }
                ilcVar = od5Var2.a;
                ilcVar.c();
                try {
                    q36VarD.n();
                    ilcVar.r();
                    ilcVar.l();
                    return null;
                } finally {
                }
        }
    }
}

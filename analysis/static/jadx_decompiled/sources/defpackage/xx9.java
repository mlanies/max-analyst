package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class xx9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ yx9 c;

    public /* synthetic */ xx9(yx9 yx9Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = yx9Var;
        this.b = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                yx9 yx9Var = this.c;
                ilcVar = yx9Var.a;
                ilcVar.c();
                try {
                    yx9Var.b.B(this.b);
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
            default:
                StringBuilder sbL = au1.l("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||message_id in (");
                List<String> list = this.b;
                a14.c(sbL, list.size());
                sbL.append(")");
                String string = sbL.toString();
                yx9 yx9Var2 = this.c;
                q36 q36VarD = yx9Var2.a.d(string);
                int i = 1;
                for (String str : list) {
                    if (str == null) {
                        q36VarD.W(i);
                    } else {
                        q36VarD.f(i, str);
                    }
                    i++;
                }
                ilcVar = yx9Var2.a;
                ilcVar.c();
                try {
                    Integer numValueOf = Integer.valueOf(q36VarD.n());
                    ilcVar.r();
                    return numValueOf;
                } finally {
                }
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class u9c implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9c b;
    public final /* synthetic */ List c;

    public /* synthetic */ u9c(x9c x9cVar, List list, int i) {
        this.a = i;
        this.b = x9cVar;
        this.c = list;
    }

    @Override // defpackage.f6
    public final void run() {
        x10 x10Var;
        List<h9c> list = this.c;
        x9c x9cVar = this.b;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (h9c h9cVar : list) {
                    int iOrdinal = h9cVar.a.ordinal();
                    Long lValueOf = null;
                    if (iOrdinal == 2) {
                        j3e j3eVar = h9cVar instanceof j3e ? (j3e) h9cVar : null;
                        if (j3eVar != null) {
                            lValueOf = Long.valueOf(j3eVar.c);
                        }
                    } else if (iOrdinal == 3) {
                        vc6 vc6Var = h9cVar instanceof vc6 ? (vc6) h9cVar : null;
                        if (vc6Var != null && (x10Var = vc6Var.c) != null) {
                            lValueOf = Long.valueOf(x10Var.s0);
                        }
                    }
                    if (lValueOf != null) {
                        arrayList.add(lValueOf);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((k4a) ((pk) x9cVar.d.getValue())).f(6, nd7.j(arrayList));
                    break;
                }
                break;
            default:
                int i = x9c.g;
                ((k4a) ((pk) x9cVar.d.getValue())).f(6, nd7.j(list));
                break;
        }
    }
}

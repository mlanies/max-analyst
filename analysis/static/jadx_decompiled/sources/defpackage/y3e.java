package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class y3e implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4e b;
    public final /* synthetic */ List c;

    public /* synthetic */ y3e(a4e a4eVar, List list, int i) {
        this.a = i;
        this.b = a4eVar;
        this.c = list;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        List list = this.c;
        a4e a4eVar = this.b;
        int i = 0;
        int i2 = this.a;
        List list2 = (List) obj;
        a4eVar.getClass();
        switch (i2) {
            case 0:
                if (list2.isEmpty()) {
                    return iqd.g(list);
                }
                wq5 wq5VarA = wq5.a(iqd.g(list), a4eVar.d(list2));
                hm9.j0(Integer.MAX_VALUE, "maxConcurrency");
                return new ar5(new lr5(wq5VarA), new t66(new ArrayList(list2.size() + list.size())), new m2e(1));
            default:
                return new uqd(new ty9(qy9.j(list), new z72(25, list2), 1).v(), new y3e(a4eVar, list2, i), 0);
        }
    }
}

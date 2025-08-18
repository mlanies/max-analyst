package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class l2e implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;
    public final /* synthetic */ List c;

    public /* synthetic */ l2e(o2e o2eVar, List list, int i) {
        this.a = i;
        this.b = o2eVar;
        this.c = list;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        List list = this.c;
        o2e o2eVar = this.b;
        int i = 1;
        int i2 = this.a;
        List list2 = (List) obj;
        o2eVar.getClass();
        switch (i2) {
            case 0:
                return new uqd(new ty9(qy9.j(list), new z72(23, list2), 1).v(), new l2e(o2eVar, list2, i), 0);
            default:
                if (list2.isEmpty()) {
                    return iqd.g(list);
                }
                wq5 wq5VarA = wq5.a(iqd.g(list), o2eVar.d(list2));
                hm9.j0(Integer.MAX_VALUE, "maxConcurrency");
                return new ar5(new lr5(wq5VarA), new t66(new ArrayList()), new m2e(1));
        }
    }
}

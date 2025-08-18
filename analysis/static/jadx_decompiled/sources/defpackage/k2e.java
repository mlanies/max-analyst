package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class k2e implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;

    public /* synthetic */ k2e(o2e o2eVar, int i) {
        this.a = i;
        this.b = o2eVar;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        this.b.e((List) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        o2e o2eVar = this.b;
        int i = 2;
        int i2 = this.a;
        List<h9c> list = (List) obj;
        o2eVar.getClass();
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (h9c h9cVar : list) {
                    if (h9cVar instanceof j3e) {
                        arrayList.add(Long.valueOf(((j3e) h9cVar).c));
                    }
                }
                ArrayList arrayListC = o2eVar.c(arrayList);
                if (!arrayListC.isEmpty()) {
                    o2eVar.d(arrayListC).e();
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    l.getClass();
                    d2e d2eVar = (d2e) o2eVar.a.get(l);
                    if (d2eVar != null) {
                        arrayList2.add(d2eVar);
                    }
                }
                return arrayList2;
            default:
                hm9.m("o2e", "loadNetworkStickersSingle: ids=%s", list);
                uqd uqdVarH = ((k4a) ((pk) o2eVar.f.get())).K(new au(2, nd7.j(list)), o2eVar.g).h(new gd1(12, eu.class)).h(new m2e(2)).h(new m2e(3));
                fme fmeVar = (fme) o2eVar.i.get();
                fmeVar.getClass();
                return new rqd(uqdVarH.j(new dme(fmeVar, 2, 0)), new k2e(o2eVar, i), 2);
        }
    }
}

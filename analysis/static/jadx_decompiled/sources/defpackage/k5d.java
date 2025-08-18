package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class k5d implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                kv0 kv0Var = (kv0) this.c;
                tpa.H((y07) obj, (String) this.b, kv0Var.a, kv0Var.b, true);
                return e5f.a;
            case 1:
                c9d c9dVar = (c9d) this.b;
                kec kecVar = (kec) this.c;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    pk pkVarA = c9dVar.a();
                    boolean z2 = c9dVar.b;
                    k4a k4aVar = (k4a) pkVarA;
                    k4aVar.getClass();
                    if (!list.isEmpty()) {
                        ArrayList arrayListI0 = x53.I0(list, 100, 100);
                        int size = arrayListI0.size();
                        long[] jArr = new long[size];
                        for (int i = 0; i < size; i++) {
                            jArr[i] = k4a.v(k4aVar, new bs7(((p7b) k4aVar.y()).a.o(), (List) arrayListI0.get(i), false, z2));
                        }
                    }
                    kecVar.a = list.size() + kecVar.a;
                    String str = c9dVar.o;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str, zr6.h(list.size(), "sending events entries count="), null);
                    }
                }
                return e5f.a;
            case 2:
                li5 li5Var = new li5((String) this.b);
                sld sldVar = (sld) this.c;
                return new ne7(sldVar.a, li5Var, sldVar.c, null);
            case 3:
                uj3 uj3Var = (uj3) obj;
                int iOrdinal = ((ltd) this.b).b.ordinal();
                boolean zE = true;
                if (iOrdinal != 0 && iOrdinal == 1) {
                    zE = ((e52) this.c).E(uj3Var.n());
                }
                return Boolean.valueOf(zE);
            case 4:
                uj3 uj3Var2 = (uj3) obj;
                if (((Set) this.b).contains(Long.valueOf(uj3Var2.n()))) {
                    if (!uj3Var2.t()) {
                        ((q40) this.c).getClass();
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                dk2 dk2Var = (dk2) obj;
                wm3 wm3Var = dk2Var.a;
                String strC = bre.c(wm3Var.w0);
                ArrayList arrayList = new ArrayList();
                List list2 = dk2Var.a.X;
                qi8 qi8Var = (qi8) this.c;
                qi8Var.getClass();
                qi8.n(arrayList, list2);
                return ((bdb) qi8Var.b).b(wm3Var.a, arrayList, strC, (String) this.b, wm3Var.d(kk0.c), iz7.l(dk2Var.b), ((y4d) ((je7) qi8Var.X).getValue()).a(wm3Var.a));
            case 6:
                return new v2f(obj, (m56) this.b, (m56) this.c);
            default:
                tpa.L((j10) obj, (d20) this.b, ((hyc) ((q33) ((k6f) this.c).c.getValue())).n());
                return e5f.a;
        }
    }

    public /* synthetic */ k5d(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }
}

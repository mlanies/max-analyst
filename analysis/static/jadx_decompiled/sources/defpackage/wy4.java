package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wy4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ az4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy4(az4 az4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = az4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wy4 wy4Var = (wy4) n((a3f) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wy4Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wy4 wy4Var = new wy4(this.Y, continuation);
        wy4Var.X = obj;
        return wy4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        q0e q0eVar;
        long j;
        long j2;
        ph phVar;
        Object next;
        boolean z = true;
        od2.a0(obj);
        a3f a3fVar = (a3f) this.X;
        List list = (List) a3fVar.a;
        List list2 = (List) a3fVar.b;
        List list3 = (List) a3fVar.c;
        az4 az4Var = this.Y;
        bc7[] bc7VarArr = az4.v0;
        az4Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            i = 0;
            qx4 qx4VarQ = null;
            if (!it.hasNext()) {
                break;
            }
            h9c h9cVar = (h9c) it.next();
            t9c t9cVar = h9cVar.a;
            if (t9cVar == t9c.EMOJI && (h9cVar instanceof by4)) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (tpa.f(((qx4) next).c, ((by4) h9cVar).c)) {
                        break;
                    }
                }
                qx4 qx4Var = (qx4) next;
                if (qx4Var != null) {
                    qx4VarQ = new qx4(ow4.X.a, -qx4Var.b, qx4Var.c, qx4Var.o, qx4Var.X, qx4Var.Y);
                }
            } else if (t9cVar == t9c.ANIMOJI && (phVar = (ph) ((gj) az4Var.X.getValue()).i(h9cVar.b).getValue()) != null) {
                qx4VarQ = az4Var.q(list, phVar, ow4.X.a, 0);
            }
            if (qx4VarQ != null) {
                arrayList.add(qx4VarQ);
            }
        }
        String name = this.Y.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, rh4.h("Load emoji. Finish. emojis:", list.size(), list2.size(), ", recent:"), null);
        }
        az4 az4Var2 = this.Y;
        az4Var2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer numValueOf = Integer.valueOf(((qx4) obj2).a);
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            q0eVar = az4Var2.Y;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list4 = (List) entry.getValue();
            ob6 ob6Var = ow4.o;
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            ob6Var.getClass();
            ow4 ow4VarL = ob6.l(iIntValue2);
            int iIntValue3 = ((Number) entry.getKey()).intValue();
            arrayList3.add(new d02(iIntValue, list4, !(arrayList.isEmpty() && list3.isEmpty() && ((yy4) q0eVar.getValue()).a == Integer.MIN_VALUE) ? ((yy4) q0eVar.getValue()).a != ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() != ow4.Y.a, ow4VarL, null, null, null, iIntValue3 == ow4.X.a ? Long.MIN_VALUE : (-9223372036854775807L) + iIntValue3, 496));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        if (!list3.isEmpty()) {
            int i2 = 0;
            for (Object obj3 : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    y53.R();
                    throw null;
                }
                lj ljVar = (lj) obj3;
                boolean zIsEmpty = arrayList.isEmpty() ^ z;
                ArrayList arrayList5 = new ArrayList();
                int i4 = ow4.Z.a + i2;
                int size = ljVar.d.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList5.add(az4Var2.q(list, (ph) ljVar.d.get(i5), i4, i5));
                }
                ow4 ow4Var = ow4.Z;
                iqe iqeVar = new iqe(ljVar.a);
                if (i4 == ow4.X.a) {
                    j2 = Long.MIN_VALUE;
                    j = -9223372036854775807L;
                } else {
                    j = -9223372036854775807L;
                    j2 = i4 - Long.MAX_VALUE;
                }
                arrayList4.add(0, new d02(i4, arrayList5, zIsEmpty || ((yy4) q0eVar.getValue()).a != Integer.MIN_VALUE ? ((yy4) q0eVar.getValue()).a == i4 : i2 == 0, ow4Var, ljVar.b, ljVar.c, iqeVar, j2, 384));
                i = 0;
                i2 = i3;
                z = true;
            }
        }
        int i6 = i;
        if (!arrayList.isEmpty()) {
            int i7 = ow4.X.a;
            ow4.o.getClass();
            arrayList4.add(i6, new d02(i7, arrayList, (((yy4) q0eVar.getValue()).a != Integer.MIN_VALUE ? 1 : i6) ^ 1, ob6.l(i7), null, null, null, Long.MIN_VALUE, 496));
        }
        kl7 kl7VarL = j1e.l();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            d02 d02Var = (d02) it4.next();
            kl7VarL.add(d02Var);
            kl7VarL.addAll(d02Var.b);
        }
        this.Y.t0.m(null, new xy4(arrayList4, j1e.d(kl7VarL)));
        return e5f.a;
    }
}

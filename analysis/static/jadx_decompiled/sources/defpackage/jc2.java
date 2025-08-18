package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jc2 {
    public final p82 a;
    public final au8 b;
    public final m7b c;
    public final s8g d;
    public final cea e;
    public final av0 f;
    public final eoe g;
    public final ztc h;

    public jc2(p82 p82Var, au8 au8Var, m7b m7bVar, s8g s8gVar, cea ceaVar, av0 av0Var, eoe eoeVar, ztc ztcVar) {
        this.a = p82Var;
        this.b = au8Var;
        this.c = m7bVar;
        this.d = s8gVar;
        this.e = ceaVar;
        this.f = av0Var;
        this.g = eoeVar;
        this.h = ztcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public final void a(long j, long j2, final long j3, final int i, final long j4, final int i2, final long j5, dc2 dc2Var, final mg4 mg4Var) {
        ?? arrayList;
        List list;
        p82 p82Var;
        List list2;
        int i3 = 0;
        hm9.m("jc2", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s", Long.valueOf(j2), nu0.G(Long.valueOf(j3)), Integer.valueOf(i), Long.valueOf(j4), Integer.valueOf(i2), Long.valueOf(j5), Integer.valueOf(dc2Var.c.size()), mg4Var.name());
        p82 p82Var2 = this.a;
        e52 e52VarC = p82Var2.C(j2);
        if (e52VarC == null) {
            return;
        }
        k92 k92Var = e52VarC.b;
        hm9.m("jc2", "onChatHistory, chat create time = %s", nu0.G(Long.valueOf(k92Var.f)));
        int iOrdinal = mg4Var.ordinal();
        m7b m7bVar = this.c;
        List<fs8> list3 = dc2Var.c;
        long j6 = e52VarC.a;
        if (iOrdinal == 0) {
            if (list3.isEmpty()) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (fs8 fs8Var : list3) {
                    List list4 = list3;
                    p82 p82Var3 = p82Var2;
                    if (fs8Var.b >= k92Var.f) {
                        arrayList.add(fs8Var);
                    }
                    list3 = list4;
                    p82Var2 = p82Var3;
                }
            }
            list = list3;
            p82Var = p82Var2;
            List listEmptyList = arrayList.isEmpty() ? Collections.emptyList() : nd7.p(arrayList, new z72(3, this.g.h(0L, iua.u0)));
            if (listEmptyList.size() > 0) {
                if (!listEmptyList.isEmpty()) {
                    this.b.g(j6, ((p7b) m7bVar).a.t(), listEmptyList);
                }
                s9d s9dVar = new s9d(j6);
                s8g s8gVar = this.d;
                s8gVar.a(s9dVar);
                s8gVar.a(new s9d(j6, mg4Var));
                p7b p7bVar = (p7b) m7bVar;
                boolean zO = e52VarC.O(p7bVar.a, p7bVar.c);
                long j7 = k92Var.a;
                if (zO) {
                    hm9.m("jc2", "onChatHistory: %d is globally muted", Long.valueOf(j7));
                } else {
                    this.e.f(j7);
                }
            }
            list2 = listEmptyList;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Unexpected value: " + mg4Var);
            }
            saf safVar = new saf(buc.s0, mg4.DELAYED);
            List listA = list3.isEmpty() ? list3 : safVar.a(list3, new rpc(13, safVar), new w8c(21), null, new ic2(this, j2, i3), null);
            if (!listA.isEmpty()) {
                this.b.g(j6, ((p7b) m7bVar).a.t(), listA);
            }
            list2 = listA;
            list = list3;
            p82Var = p82Var2;
        }
        final long j8 = e52VarC.a;
        final p82 p82Var4 = p82Var;
        final List list5 = list2;
        List list6 = list;
        List list7 = list2;
        p82Var.h(j8, false, new qj3() { // from class: q72
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
            @Override // defpackage.qj3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 313
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.q72.accept(java.lang.Object):void");
            }
        });
        int size = list7.size();
        av0 av0Var = this.f;
        if (size <= 0) {
            av0Var.c(new ec2(j, e52VarC.a, j3, j3, list6.size(), mg4Var, nz4.a));
            return;
        }
        long j9 = ((fs8) list7.get(0)).b;
        long j10 = ((fs8) list7.get(list7.size() - 1)).b;
        int size2 = list7.size();
        ArrayList arrayList2 = new ArrayList(z53.S(list7, 10));
        Iterator it = list7.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((fs8) it.next()).a));
        }
        av0Var.c(new ec2(j, e52VarC.a, j9, j10, size2, mg4Var, arrayList2));
    }
}

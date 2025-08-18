package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qu extends ol implements lme {
    public final long X;
    public final int Y;
    public final /* synthetic */ int o = 0;

    public qu(int i, long j, long j2) {
        super(j);
        this.Y = i;
        this.X = j2;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        int i = 1;
        switch (this.o) {
            case 0:
                ru ruVar = (ru) gleVar;
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                tu tuVar = (tu) plVar.s.getValue();
                int i2 = this.Y;
                tuVar.getClass();
                if (i2 == 0) {
                    i2 = 2;
                }
                ArrayList arrayList = new ArrayList();
                List listEmptyList = Collections.emptyList();
                if (!ruVar.o.isEmpty()) {
                    List<q0d> list = ruVar.o;
                    vxc vxcVar = tuVar.f;
                    ArrayList arrayList2 = new ArrayList();
                    for (q0d q0dVar : list) {
                        sp3 sp3Var = q0dVar.a;
                        if (sp3Var == sp3.Y) {
                            arrayList2.add(new r5e(q0dVar.b, q0dVar.d));
                        } else if (sp3Var == sp3.Z) {
                            arrayList2.add(new d4e(q0dVar.g, q0dVar.b, q0dVar.e));
                        } else if (sp3Var == sp3.s0) {
                            ArrayList arrayListK = iz7.k(q0dVar.k);
                            arrayListK.addAll(iz7.p(q0dVar.l, vxcVar));
                            arrayList2.add(new y9c(q0dVar.b, arrayListK));
                        } else {
                            hm9.p("iz7", "Unknown section " + q0dVar, null);
                        }
                    }
                    o2e o2eVar = tuVar.a;
                    o2eVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        r0d r0dVar = (r0d) it.next();
                        int iS = au1.s(r0dVar.a);
                        if (iS == 1) {
                            arrayList3.addAll(o2eVar.c(((r5e) r0dVar).c));
                        } else if (iS == 3) {
                            arrayList3.addAll(o2eVar.c((List) new e0a(new e0a(new ty9(qy9.j(((y9c) r0dVar).c), new m2e(5), 1), new gd1(12, j3e.class), 3), new m2e(6), 3).v().e()));
                        }
                    }
                    arrayList.addAll(arrayList3);
                    listEmptyList = arrayList2;
                }
                if (!listEmptyList.isEmpty()) {
                    o2e o2eVar2 = tuVar.a;
                    synchronized (o2eVar2) {
                        o2eVar2.h(listEmptyList);
                        o2eVar2.g(listEmptyList);
                        cqc.a(new j2e(o2eVar2, 0), o2eVar2.h, null, new p4c(29), null);
                    }
                }
                if (i2 == 2) {
                    ((p7b) tuVar.b).a.l("user.stickersLastSync", Long.valueOf(ruVar.c));
                } else if (i2 == 5 || i2 == 4) {
                    hm9.m("tu", "onAssetsUpdate: set favorites sync=%d", Long.valueOf(ruVar.c));
                    ((p7b) tuVar.b).a.l("user.favoritesLastSync", Long.valueOf(ruVar.c));
                    sc5 sc5Var = tuVar.d;
                    List<q0d> list2 = ruVar.o;
                    sc5Var.getClass();
                    for (q0d q0dVar2 : list2) {
                        if ("FAVORITE_STICKER_SETS".equals(q0dVar2.b)) {
                            long j = q0dVar2.g;
                            Long lValueOf = Long.valueOf(j);
                            long j2 = q0dVar2.j;
                            Long lValueOf2 = Long.valueOf(j2);
                            List list3 = q0dVar2.e;
                            hm9.m("sc5", "onAssetsUpdate: sets=%s, marker=%d, updateTime=%d", list3, lValueOf, lValueOf2);
                            sc5Var.g(j2);
                            za3 za3VarK = new qa3(sc5Var.b(), 2, new z72(9, list3)).k((ztc) sc5Var.o.getValue());
                            iq1 iq1Var = new iq1(new nc5(1), 0, new fa4(i));
                            za3VarK.i(iq1Var);
                            sc5Var.t0.a(iq1Var);
                            if (j != 0) {
                                sc5Var.c(j);
                            }
                        }
                    }
                    md5 md5Var = tuVar.e;
                    List<q0d> list4 = ruVar.o;
                    md5Var.getClass();
                    for (q0d q0dVar3 : list4) {
                        if ("FAVORITE_STICKERS".equals(q0dVar3.b)) {
                            long j3 = q0dVar3.g;
                            Long lValueOf3 = Long.valueOf(j3);
                            long j4 = q0dVar3.j;
                            Long lValueOf4 = Long.valueOf(j4);
                            List list5 = q0dVar3.d;
                            hm9.m("md5", "onAssetsUpdate: stickers=%s, marker=%d, updateTime=%d", list5, lValueOf3, lValueOf4);
                            md5Var.f(j4);
                            za3 za3VarK2 = new qa3(((hc5) md5Var.a.get()).a(), 2, new z72(6, list5)).k((ztc) md5Var.c.get());
                            iq1 iq1Var2 = new iq1(new z72(15, list5), 0, new ic5(2, list5));
                            za3VarK2.i(iq1Var2);
                            md5Var.h.a(iq1Var2);
                            if (j3 != 0) {
                                md5Var.b(j3);
                            }
                        }
                    }
                } else if (i2 == 10) {
                    gj gjVar = tuVar.g;
                    List list6 = ruVar.o;
                    Map map = ruVar.s0;
                    ((hyc) gjVar.c).l("user.reactionsLastSync", Long.valueOf(ruVar.c));
                    gjVar.l.o1(gjVar, gj.p[1], j47.T(gjVar.j, null, vx3.b, new zi(gjVar, list6, map, null), 1));
                }
                if (!ruVar.X.isEmpty()) {
                    for (Map.Entry entry : ruVar.X.entrySet()) {
                        o2e o2eVar3 = tuVar.a;
                        Long l = (Long) entry.getKey();
                        l.getClass();
                        d2e d2eVar = (d2e) o2eVar3.a.get(l);
                        if (d2eVar == null || d2eVar.X < ((Long) entry.getValue()).longValue()) {
                            arrayList.add((Long) entry.getKey());
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    nd7.O(arrayList);
                    Iterator it2 = nd7.T(arrayList).iterator();
                    while (it2.hasNext()) {
                        tuVar.c.c(2, (List) it2.next());
                    }
                }
                Map map2 = ruVar.Y;
                if (!map2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    List list7 = (List) tuVar.d.s0.A();
                    if (nd7.D(list7)) {
                        arrayList4.addAll(map2.keySet());
                    } else {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            Long l2 = (Long) entry2.getKey();
                            Iterator it3 = list7.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    m3e m3eVar = (m3e) it3.next();
                                    if (m3eVar.a == l2.longValue()) {
                                        if (m3eVar.f >= ((Long) entry2.getValue()).longValue()) {
                                            break;
                                        }
                                    }
                                } else {
                                    arrayList4.add(l2);
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        tuVar.c.c(3, arrayList4);
                    }
                }
                pl plVar2 = this.c;
                (plVar2 != null ? plVar2 : null).b().c(new su(this.a, 0));
                return;
            default:
                up3 up3Var = (up3) gleVar;
                l().c(new vp3(this.a, up3Var.c, up3Var.o, up3Var.X));
                return;
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                plVar.b().c(new oi0(this.a, pkeVar));
                break;
            default:
                if (pkeVar instanceof gke) {
                    l().c(new oi0(this.a, pkeVar));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                return new au(this.Y, this.X);
            default:
                return new tq2(this.X, this.Y);
        }
    }

    public qu(long j, long j2, int i) {
        super(j);
        this.X = j2;
        this.Y = i;
    }
}

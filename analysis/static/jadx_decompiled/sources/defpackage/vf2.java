package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ru.ok.messages.media.attaches.ActAttachesView;

/* loaded from: classes2.dex */
public final /* synthetic */ class vf2 implements qj3, grd {
    public final /* synthetic */ zf2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vf2(zf2 zf2Var, boolean z) {
        this.a = zf2Var;
        this.b = z;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws Resources.NotFoundException {
        wf2 wf2VarE;
        d92 d92Var;
        p82 p82Var;
        List list = (List) obj;
        zf2 zf2Var = this.a;
        zf2Var.getClass();
        hm9.n("zf2", "onLoad: count " + list.size());
        boolean z = this.b;
        if (z) {
            zf2Var.k = true;
            zf2Var.d.clear();
            zf2Var.e.clear();
        }
        ArrayList arrayListA = zf2Var.a(list, false);
        for (yf2 yf2Var : zf2Var.o) {
            if (yf2Var != null) {
                ((ActAttachesView) yf2Var).m0(arrayListA);
            }
        }
        long j = zf2Var.a;
        p82 p82Var2 = zf2Var.q;
        e52 e52VarC = p82Var2.C(j);
        if (e52VarC != null) {
            k92 k92Var = e52VarC.b;
            ArrayList arrayListD = k92Var.n.d(mg4.REGULAR);
            Set set = zf2Var.g;
            if (!p82.L(k92Var, set) || (d92Var = p82.I(k92Var, set).a) == null) {
                d92Var = null;
            }
            if (d92Var == null) {
                d92 d92Var2 = (d92) hm9.w(arrayListD).b;
                if (d92Var2 != null) {
                    p82Var2.h(j, false, new u00(p82Var2, set, d92Var2, 3));
                }
            } else {
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    d92 d92Var3 = (d92) it.next();
                    d92 d92VarA = d92Var.c().a();
                    long j2 = d92Var3.a;
                    boolean zK = hm9.K(j2, d92VarA);
                    long j3 = d92Var3.b;
                    if (zK) {
                        p82Var = p82Var2;
                        if (j3 > d92VarA.b) {
                            l7 l7VarC = d92VarA.c();
                            l7VarC.b(j3);
                            d92VarA = l7VarC.a();
                        }
                    } else {
                        p82Var = p82Var2;
                    }
                    if (hm9.K(j3, d92VarA) && j2 < d92VarA.a) {
                        l7 l7VarC2 = d92VarA.c();
                        if (j2 == -1) {
                            hm9.l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        l7VarC2.b = j2;
                        d92VarA = l7VarC2.a();
                    }
                    if (d92VarA.a != d92Var.a || d92VarA.b != d92Var.b) {
                        p82Var2 = p82Var;
                        p82Var2.h(j, false, new u00(p82Var2, set, d92VarA, 3));
                        break;
                    }
                    p82Var2 = p82Var;
                }
            }
        }
        if (!z) {
            zf2Var.b(true);
            return;
        }
        e52 e52VarC2 = p82Var2.C(j);
        if (e52VarC2 == null || !e52VarC2.b.g() || (wf2VarE = zf2Var.e(false)) == null) {
            return;
        }
        zf2Var.f(wf2VarE);
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        zf2 zf2Var = this.a;
        zf2Var.getClass();
        List listEmptyList = Collections.emptyList();
        e52 e52VarC = zf2Var.q.C(zf2Var.a);
        if (e52VarC != null) {
            au8 au8Var = zf2Var.r;
            boolean z = this.b;
            ge2 ge2Var = zf2Var.s;
            if (z) {
                ge2Var.getClass();
                listEmptyList = ge2Var.f.b(((k24) au8Var.a).c.l(zf2Var.a, Long.MAX_VALUE, zf2Var.f, null, true));
            } else {
                long j = zf2Var.b;
                long j2 = 0;
                if (j > 0) {
                    cu8 cu8VarQ = au8Var.q(j);
                    if (cu8VarQ != null) {
                        j2 = cu8VarQ.o;
                    }
                } else {
                    es8 es8Var = e52VarC.c;
                    j2 = es8Var == null ? Long.MAX_VALUE : es8Var.a.o;
                }
                ge2Var.getClass();
                long j3 = zf2Var.a;
                vlc vlcVar = ((k24) au8Var.a).c;
                Set set = zf2Var.f;
                ArrayList arrayListL = vlcVar.l(j3, j2, set, 40, true);
                ArrayList arrayListL2 = ((k24) au8Var.a).c.l(j3, j2, set, 40, false);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(arrayListL);
                arrayList.addAll(arrayListL2);
                TreeSet treeSet = new TreeSet(new v00(11));
                treeSet.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(treeSet);
                Collections.sort(arrayList, new v00(12));
                listEmptyList = !arrayList.isEmpty() ? ge2Var.f.b(arrayList) : Collections.emptyList();
            }
        }
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            zf2Var.t.e(((es8) it.next()).a);
        }
        nqdVar.a(listEmptyList);
    }
}

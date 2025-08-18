package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public class wp3 extends ol implements lme {
    public final long X;
    public final Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp3(int i, long j, long j2, Object obj) {
        super(j);
        this.o = i;
        this.X = j2;
        this.Y = obj;
    }

    private final void v(gle gleVar) {
    }

    public void e(gle gleVar) {
        switch (this.o) {
            case 0:
                xp3 xp3Var = (xp3) gleVar;
                if (this.X > 0) {
                    Map map = xp3Var.c;
                    pl plVar = this.c;
                    if (plVar == null) {
                        plVar = null;
                    }
                    map.put(Long.valueOf(((hyc) ((q33) plVar.e.getValue())).t()), s7b.c);
                }
                pl plVar2 = this.c;
                ((w7b) (plVar2 != null ? plVar2 : null).N.getValue()).h(xp3Var.o, iz7.n(xp3Var.c));
                p82 p82VarM = m();
                Map map2 = xp3Var.c;
                p82VarM.getClass();
                hm9.n("p82", "invalidateChatsContacts, contactsIds.size() = " + new ArrayList(map2.keySet()).size());
                for (e52 e52Var : p82VarM.E(p82.I)) {
                    ArrayList arrayListJ = e52Var.j();
                    ArrayList arrayList = new ArrayList(arrayListJ.size());
                    Iterator it = arrayListJ.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(Long.valueOf(((uj3) it.next()).n()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!Collections.disjoint(r0, arrayList)) {
                        e52Var.o0((el3) p82VarM.r.get());
                    }
                }
                return;
            case 1:
                e((xe9) gleVar);
                return;
            default:
                return;
        }
    }

    public void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pkeVar));
                break;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                plVar.b().c(new ze9(this.a, pkeVar, this.X, (List) this.Y));
                break;
            default:
                l().c(new oi0(this.a, pkeVar));
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                tq2 tq2Var = new tq2((sla) null, 9);
                long[] jArr = (long[]) this.Y;
                if (jArr != null) {
                    tq2Var.h("contactIds", jArr);
                }
                long j = this.X;
                if (j > 0) {
                    tq2Var.i(j, "sync");
                }
                return tq2Var;
            case 1:
                return new tq2(this.X, (List) this.Y);
            default:
                long j2 = this.X;
                if (j2 == 0) {
                    return null;
                }
                b10 b10Var = (b10) this.Y;
                String str = b10Var != null ? b10Var.a : null;
                rf9 rf9Var = new rf9(null);
                rf9Var.i(j2, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    rf9Var.p("type", str);
                }
                return rf9Var;
        }
    }

    /* renamed from: u */
    public void e(xe9 xe9Var) {
        e52 e52Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (fs8 fs8Var : xe9Var.o) {
            if (fs8Var.X != wx8.c) {
                arrayList2.add(fs8Var);
                arrayList.add(Long.valueOf(fs8Var.a));
            }
        }
        if (!arrayList2.isEmpty()) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            e52 e52VarZ = plVar.c().z(xe9Var.c);
            if (e52VarZ != null) {
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                au8 au8VarD = plVar2.d();
                List list = xe9Var.o;
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                au8VarD.g(e52VarZ.a, ((p7b) ((m7b) plVar3.c.getValue())).a.t(), list);
            }
            e52Var = e52VarZ;
        } else {
            e52Var = null;
        }
        pl plVar4 = this.c;
        if (plVar4 == null) {
            plVar4 = null;
        }
        plVar4.b().c(new af9(this.a, this.X, arrayList, xe9Var.o, (List) this.Y));
        if (e52Var != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                fs8 fs8Var2 = (fs8) it.next();
                pl plVar5 = this.c;
                if (plVar5 == null) {
                    plVar5 = null;
                }
                cu8 cu8VarJ = plVar5.d().j(e52Var.a, fs8Var2.a);
                if (cu8VarJ != null) {
                    pl plVar6 = this.c;
                    if (plVar6 == null) {
                        plVar6 = null;
                    }
                    plVar6.b().c(new l6f(e52Var.a, cu8VarJ.b, 0));
                }
            }
        }
        pl plVar7 = this.c;
        r9d.y((s8g) (plVar7 != null ? plVar7 : null).g.getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp3(long j, long[] jArr, long j2) {
        super(j);
        this.o = 0;
        this.Y = jArr;
        this.X = j2;
    }
}

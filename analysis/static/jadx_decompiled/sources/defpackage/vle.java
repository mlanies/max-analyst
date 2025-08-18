package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class vle implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vle(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.f6
    public final void run() throws Throwable {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                vs9 vs9Var = (vs9) ((s7d) ((wle) obj2).i.getValue()).m.getValue();
                ((y7d) vs9Var.b.getValue()).getClass();
                us9 us9Var = (us9) obj;
                hm9.m("vs9", "reactions, onNotifReactionsChanged, %s", us9Var);
                lx8 lx8Var = (lx8) vs9Var.a.getValue();
                List<cx8> list = us9Var.Y;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (cx8 cx8Var : list) {
                    arrayList.add(new hx8(((jx8) vs9Var.c.getValue()).d(cx8Var.a), cx8Var.b));
                }
                e52 e52Var = (e52) ((jz2) ((iy2) lx8Var.b.getValue())).n(us9Var.c).a.getValue();
                if (e52Var != null) {
                    au8 au8VarB = lx8Var.b();
                    long j = e52Var.a;
                    long j2 = us9Var.o;
                    cu8 cu8VarJ = au8VarB.j(j, j2);
                    if (cu8VarJ != null) {
                        if (cu8VarJ.v0 != vx8.DELETED) {
                            ix8 ix8Var = cu8VarJ.S0;
                            ix8 ix8Var2 = new ix8(arrayList, us9Var.X, ix8Var != null ? ix8Var.c : null);
                            Set setA = lx8.a(ix8Var, ix8Var2);
                            boolean z = !tpa.f(ix8Var2, ix8Var);
                            hm9.m("lx8", "reactions, NOTIF_REACTIONS_CHANGED, reactionsDiff = %s", setA);
                            lx8Var.b().h(Collections.singletonMap(Long.valueOf(j2), ix8Var2));
                            lx8Var.d(Long.valueOf(j), cu8VarJ, setA, z);
                            lx8Var.g(Long.valueOf(j), cu8VarJ, setA, true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                as9 as9Var = (as9) ((s7d) ((wle) obj2).i.getValue()).l.getValue();
                yr9 yr9Var = (yr9) obj;
                ((p7b) as9Var.a()).a.l("user.draftsLastSync", Long.valueOf(yr9Var.X));
                if (((p7b) as9Var.a()).b.u()) {
                    bc7 bc7Var = as9.d[2];
                    ((gn4) as9Var.c.get()).a(Long.valueOf(yr9Var.c), Long.valueOf(yr9Var.o), yr9Var.Y);
                    break;
                } else {
                    hm9.n(as9.e, "onNotifDraft: Drafts sync disabled");
                    break;
                }
            case 2:
                xr9 xr9Var = (xr9) ((s7d) ((wle) obj2).i.getValue()).a.getValue();
                xr9Var.getClass();
                StringBuilder sb = new StringBuilder("onNotifDebug, response = ");
                s44 s44Var = (s44) obj;
                sb.append(s44Var);
                hm9.n(xr9.e, sb.toString());
                fm5 fm5Var = s44Var.c;
                if (tpa.f(fm5Var, fm5.f)) {
                    ((cba) xr9Var.a).c(new HandledException("onNotifDebug"), true);
                    break;
                } else if (tpa.f(fm5Var, fm5.g)) {
                    bc7[] bc7VarArr = xr9.d;
                    bc7 bc7Var2 = bc7VarArr[0];
                    ((k24) ((c34) xr9Var.b.get())).e.a();
                    bc7 bc7Var3 = bc7VarArr[1];
                    ((jva) ((bva) xr9Var.c.get())).c();
                    break;
                }
                break;
            case 3:
                wr1 wr1Var = (wr1) ((kr1) ((wle) obj2).n.getValue());
                j47.T(wr1Var.a, ((w9a) ((kke) wr1Var.r.getValue())).c().getImmediate(), null, new sr1((yg1) obj, wr1Var, null), 2);
                break;
            case 4:
                ts9 ts9Var = (ts9) ((s7d) ((wle) obj2).i.getValue()).g.getValue();
                ts9Var.getClass();
                ss9 ss9Var = (ss9) obj;
                hm9.m(ts9.d, "onNotifMsgDeleteRange: %s", ss9Var);
                bc7[] bc7VarArr2 = ts9.c;
                bc7 bc7Var4 = bc7VarArr2[0];
                rm4 rm4Var = ts9Var.a;
                ((p82) rm4Var.get()).c0(Collections.singletonList(ss9Var.c));
                bc7 bc7Var5 = bc7VarArr2[0];
                e52 e52VarZ = ((p82) rm4Var.get()).z(ss9Var.c.a);
                if (e52VarZ != null) {
                    bc7 bc7Var6 = bc7VarArr2[1];
                    ((au8) ts9Var.b.get()).b(e52VarZ.a, ss9Var.o, ss9Var.X);
                    bc7 bc7Var7 = bc7VarArr2[0];
                    ((p82) rm4Var.get()).w(e52VarZ.a);
                    break;
                }
                break;
            case 5:
                c7f c7fVar = (c7f) obj2;
                c7fVar.getClass();
                StringBuilder sb2 = new StringBuilder("onDisposeUpload: data=");
                d7f d7fVar = (d7f) obj;
                sb2.append(d7fVar);
                hm9.k("c7f", sb2.toString());
                c7fVar.c(d7fVar);
                break;
            default:
                wef wefVar = (wef) obj2;
                wefVar.getClass();
                lef lefVar = (lef) obj;
                hm9.m("wef", "onDispose: conversionData = %s", lefVar);
                wefVar.a(lefVar);
                break;
        }
    }
}

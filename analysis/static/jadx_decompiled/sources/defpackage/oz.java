package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class oz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final nz b;
    public final rm4 c;

    public oz(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7, rm4 rm4Var8) {
        this.b = new nz(rm4Var2, rm4Var3, rm4Var4, rm4Var5, rm4Var6, rm4Var8, rm4Var7);
        this.c = rm4Var;
    }

    public final die a(l20 l20Var) {
        Object xvaVar;
        Object qf5Var;
        m20 m20Var = new m20();
        m20Var.a(l20Var);
        k8g k8gVarC = m20Var.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < k8gVarC.i(); i++) {
            l20 l20VarH = k8gVarC.h(i);
            String str = l20VarH.r;
            lz lzVar = (lz) this.a.get(str);
            if (lzVar == null || lzVar.b) {
                nz nzVar = this.b;
                nzVar.getClass();
                g20 g20Var = l20VarH.a;
                int i2 = g20Var == null ? -1 : mz.$EnumSwitchMapping$0[g20Var.ordinal()];
                rm4 rm4Var = nzVar.b;
                if (i2 != 1) {
                    bc7[] bc7VarArr = nz.h;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            bc7 bc7Var = bc7VarArr[0];
                            pk pkVar = (pk) nzVar.c.get();
                            bc7 bc7Var2 = bc7VarArr[2];
                            rf5 rf5Var = (rf5) nzVar.e.get();
                            bc7 bc7Var3 = bc7VarArr[3];
                            qf5Var = new qf5(l20VarH, pkVar, rf5Var, (av0) nzVar.f.get());
                        } else if (i2 == 4) {
                            bc7 bc7Var4 = bc7VarArr[2];
                            rf5 rf5Var2 = (rf5) nzVar.e.get();
                            bc7 bc7Var5 = bc7VarArr[3];
                            qf5Var = new w20(l20VarH, rf5Var2, (av0) nzVar.f.get());
                        } else if (i2 != 5) {
                            xvaVar = null;
                        } else {
                            khe kheVar = new khe(new es3(4, nzVar.a));
                            khe kheVar2 = new khe(new es3(4, rm4Var));
                            bc7 bc7Var6 = bc7VarArr[4];
                            qf5Var = new h2e(l20VarH, kheVar, kheVar2, (zi5) nzVar.g.get());
                        }
                        xvaVar = qf5Var;
                    } else {
                        bc7 bc7Var7 = bc7VarArr[0];
                        pk pkVar2 = (pk) nzVar.c.get();
                        bc7 bc7Var8 = bc7VarArr[1];
                        q33 q33Var = (q33) nzVar.d.get();
                        bc7 bc7Var9 = bc7VarArr[2];
                        rf5 rf5Var3 = (rf5) nzVar.e.get();
                        bc7 bc7Var10 = bc7VarArr[3];
                        xvaVar = new ycf(l20VarH, pkVar2, q33Var, rf5Var3, (av0) nzVar.f.get());
                    }
                } else {
                    xvaVar = new xva(l20VarH, new khe(new es3(4, rm4Var)));
                }
                if (xvaVar != null) {
                    this.a.put(str, xvaVar);
                    arrayList2.add(xvaVar);
                    arrayList.add(str);
                }
            } else {
                arrayList2.add(lzVar);
                arrayList.add(str);
            }
        }
        return new die(this.c, arrayList2, arrayList);
    }
}

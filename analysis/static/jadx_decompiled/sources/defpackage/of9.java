package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class of9 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;

    public of9(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        this.g = je7Var7;
        this.h = je7Var8;
        this.i = je7Var9;
        this.j = je7Var10;
    }

    public final void a(long j, long j2, fs8 fs8Var) {
        au8 au8Var = (au8) this.a.getValue();
        long j3 = fs8Var.Y;
        vlc vlcVar = ((k24) au8Var.a).c;
        ru8 ru8VarH = vlcVar.d().h(j, j3);
        cu8 cu8VarB = ru8VarH != null ? vlcVar.b(ru8VarH) : null;
        if (cu8VarB == null) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, "MsgSendLogic", zr6.k(au1.k(fs8Var.Y, "message cid=", " for chatId="), j, " not found!"), null);
                return;
            }
            return;
        }
        if (cu8VarB.c == 0) {
            vlc vlcVar2 = ((k24) ((c34) this.b.getValue())).c;
            oz7 oz7Var = iu8.b;
            vlcVar2.o(fs8Var, j, false, null);
            ((au8) this.a.getValue()).w(cu8VarB, iz7.g(fs8Var.s0, (vxc) this.c.getValue()));
            au8 au8Var2 = (au8) this.a.getValue();
            long j4 = fs8Var.Y;
            vlc vlcVar3 = ((k24) au8Var2.a).c;
            ru8 ru8VarH2 = vlcVar3.d().h(j, j4);
            cu8VarB = ru8VarH2 != null ? vlcVar3.b(ru8VarH2) : null;
        }
        if (cu8VarB == null) {
            return;
        }
        e52 e52VarS = ((p82) this.e.getValue()).S(cu8VarB.t0, j2, cu8VarB);
        ((t6b) this.d.getValue()).b(e52VarS, cu8VarB);
        if (e52VarS != null) {
            if (e52VarS.b.m == 0) {
                ((p7c) this.j.getValue()).b(e52VarS);
            }
            if (((ri4) this.f.getValue()).d()) {
                ArrayList arrayListJ = e52VarS.j();
                pk pkVar = (pk) this.h.getValue();
                ArrayList arrayList = new ArrayList(z53.S(arrayListJ, 10));
                Iterator it = arrayListJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((uj3) it.next()).n()));
                }
                ((k4a) pkVar).u(arrayList);
            }
            ((av0) this.g.getValue()).c(new l6f(e52VarS.a, cu8VarB.b, 0));
            es8 es8Var = e52VarS.c;
            if (es8Var != null && es8Var.a.b == cu8VarB.b) {
                ((av0) this.g.getValue()).c(new vz2(Collections.singletonList(Long.valueOf(e52VarS.a)), false, false, null, null, 124));
            }
        }
        k8g k8gVar = cu8VarB.z0;
        if (k8gVar == null || k8gVar.i() <= 0) {
            return;
        }
        for (l20 l20Var : (List) k8gVar.a) {
            x10 x10Var = l20Var.b;
            if (x10Var != null && x10Var.X) {
                if (l20Var.s.length() > 0) {
                    String str = l20Var.s;
                    int i = pag.d;
                    if (!str.endsWith(".mp4")) {
                    }
                }
                one oneVar = new one();
                oneVar.a = cu8VarB.b;
                oneVar.b = l20Var.r;
                x10 x10Var2 = l20Var.b;
                oneVar.e = x10Var2.s0;
                oneVar.g = x10Var2.t0;
                ((rf5) this.i.getValue()).a(new pne(oneVar));
            }
        }
    }
}

package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zfc {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public zfc(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public static void a(zfc zfcVar, long j) {
        e52 e52VarH;
        p82 p82Var = (p82) zfcVar.a.getValue();
        p82Var.getClass();
        hm9.n("p82", "removeChatInternal, chatId = " + j);
        e52 e52VarC = p82Var.C(j);
        e52 e52Var = null;
        if (e52VarC == null) {
            e52VarH = null;
        } else {
            sna snaVar = (sna) p82Var.v.get();
            k92 k92Var = e52VarC.b;
            long j2 = k92Var.a;
            snaVar.getClass();
            sna.a(j2);
            i92 i92Var = (e52VarC.I() || !e52VarC.T()) ? i92.X : i92.c;
            ((s8g) p82Var.w.get()).a(new j8d(j, k92Var.k, true));
            e52VarH = p82Var.h(j, false, new f9(p82Var, 18, i92Var));
        }
        if (e52VarH != null) {
            p82Var.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), true));
            List listSingletonList = Collections.singletonList(Long.valueOf(j));
            o82 o82Var = p82Var.G;
            if (o82Var != null) {
                o82Var.b(listSingletonList);
            }
            je7 je7Var = p82Var.C;
            if (je7Var.getValue() != null) {
                ta2 ta2Var = (ta2) je7Var.getValue();
                long j3 = e52VarH.b.a;
                zb2 zb2Var = (zb2) ta2Var;
                zb2Var.getClass();
                j47.T(zb2Var.Z, null, null, new mb2(zb2Var, j3, null), 3);
            }
            e52Var = e52VarH;
        }
        if (e52Var != null) {
            rs9 rs9Var = (rs9) zfcVar.d.getValue();
            cea ceaVar = (cea) zfcVar.c.getValue();
            rs9Var.getClass();
            rs9.a(e52Var, ceaVar);
        }
    }
}

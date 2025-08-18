package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zu8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public zu8(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
    }

    public static es8 a(zu8 zu8Var, cu8 cu8Var) {
        zu8Var.getClass();
        cu8 cu8Var2 = cu8Var.C0;
        bw8 bw8Var = cu8Var2 != null ? new bw8(cu8Var.A0, cu8Var.B0, a(zu8Var, cu8Var2), cu8Var.D0, cu8Var.E0, cu8Var.J0, cu8Var.K0) : null;
        cu8 cu8Var3 = cu8Var.L0;
        return new es8(cu8Var, ((el3) zu8Var.a.getValue()).i(cu8Var.Y, true), bw8Var, cu8Var3 != null ? a(zu8Var, cu8Var3) : null, ((t6b) zu8Var.b.getValue()).c(cu8Var), (sw8) zu8Var.c.getValue(), (zx8) zu8Var.d.getValue(), (lr2) zu8Var.e.getValue(), 0);
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (cu8) it.next()));
        }
        return arrayList2;
    }
}

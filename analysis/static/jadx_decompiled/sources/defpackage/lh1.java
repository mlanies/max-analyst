package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lh1 extends pnf {
    public boolean A0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final String b;
    public final boolean c;
    public final List o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final q0e w0;
    public final w7c x0;
    public final w7c y0;
    public final s35 z0;

    public lh1(String str, boolean z, List list) {
        je7 je7Var = yi1.a;
        khe kheVarD = zi1.a.getAccessor().d(ida.class);
        je7 je7VarC = yi1.c();
        this.b = str;
        this.c = z;
        this.o = list;
        this.X = kheVarD;
        this.Y = je7VarC;
        q0e q0eVarA = r0e.a(new jh1(null, k37.a, null));
        this.Z = q0eVarA;
        q0e q0eVarA2 = r0e.a(new eqe(b8a.n0));
        this.s0 = q0eVarA2;
        this.t0 = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(r());
        this.u0 = q0eVarA3;
        this.v0 = new w7c(q0eVarA3);
        q0e q0eVarA4 = r0e.a(nz4.a);
        this.w0 = q0eVarA4;
        this.x0 = new w7c(q0eVarA4);
        qw qwVar = new qw(q0eVarA, 23);
        Boolean bool = Boolean.FALSE;
        this.y0 = od2.X(qwVar, this.a, wld.a, bool);
        this.z0 = new s35(0);
    }

    public static ArrayList q(boolean z) {
        List listM;
        if (z) {
            y4c.b.getClass();
            listM = y53.M(y4c.s0, y4c.t0, y4c.u0, y4c.v0, y4c.w0, y4c.x0);
        } else {
            y4c.b.getClass();
            listM = y53.M(y4c.c, y4c.o, y4c.X, y4c.Y, y4c.Z, y4c.x0);
        }
        ArrayList arrayList = new ArrayList(z53.S(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(f8.C((y4c) it.next(), false));
        }
        return arrayList;
    }

    public final List r() {
        Integer num = ((jh1) this.Z.getValue()).a;
        boolean z = false;
        boolean z2 = num == null;
        s4c s4cVar = z2 ? s4c.b : s4c.a;
        int i = y7a.z0;
        int i2 = y7a.y0;
        int i3 = y7a.x0;
        je7 je7Var = this.X;
        v4c v4cVar = new v4c(i, s4cVar, ((ida) je7Var.getValue()).j.e("😍"), z2 || (num != null && num.intValue() == i));
        v4c v4cVar2 = new v4c(i2, s4cVar, ((ida) je7Var.getValue()).j.e("😐"), z2 || (num != null && num.intValue() == i2));
        CharSequence charSequenceE = ((ida) je7Var.getValue()).j.e("😡");
        if (z2 || (num != null && num.intValue() == i3)) {
            z = true;
        }
        return y53.M(v4cVar, v4cVar2, new v4c(i3, s4cVar, charSequenceE, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh1.s(java.lang.String, boolean):void");
    }
}

package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class y4d {
    public final LinkedHashMap a;

    public y4d(w4d w4dVar, o67 o67Var, p94 p94Var) {
        xq9 xq9Var = xq9.a;
        nx3 nx3Var = o67Var.a;
        nx3Var.plus(xq9Var);
        this.a = new LinkedHashMap();
        uh uhVar = new uh(w4dVar, 25, xlc.a(0, "SELECT * FROM selected_mentions"));
        mn5 mn5VarX = od2.x(od2.F(new mqc(new cy3((ilc) w4dVar.b, new String[]{"selected_mentions"}, uhVar, null)), nx3Var));
        nx3 nx3Var2 = p94Var.a;
        od2.L(new zn5(od2.F(mn5VarX, nx3Var2), new x4d(this, null), 5), j1e.a(nx3Var2));
    }

    public final int a(long j) {
        int i;
        v4d v4dVar = (v4d) this.a.get(Long.valueOf(j));
        if (v4dVar == null || (i = v4dVar.b) == 0) {
            return 1;
        }
        return i;
    }
}

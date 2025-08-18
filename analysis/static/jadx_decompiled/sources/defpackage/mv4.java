package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class mv4 {
    public final zw6 a;
    public final boolean b;

    public mv4(lv4 lv4Var, lv4... lv4VarArr) {
        ww6 ww6Var = new ww6(4);
        ww6Var.a(lv4Var);
        ww6Var.b(lv4VarArr);
        this(ww6Var.j());
    }

    public mv4(List list) {
        fm9.f(!list.isEmpty());
        this.a = zw6.j(list);
        this.b = false;
    }
}

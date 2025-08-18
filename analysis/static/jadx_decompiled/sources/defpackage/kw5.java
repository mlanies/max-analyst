package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class kw5 extends p04 {
    public static final nd2 A0 = new nd2(11);
    public final uu3 w0;
    public final b x0;
    public final jw5 y0;
    public List z0;

    public kw5(uu3 uu3Var, b bVar, jw5 jw5Var) {
        super(uu3Var, 0);
        this.w0 = uu3Var;
        this.x0 = bVar;
        this.y0 = jw5Var;
        this.z0 = nz4.a;
    }

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        if (zncVar.n()) {
            return;
        }
        Widget widgetE = this.y0.e(((av5) this.z0.get(i)).a, this.x0);
        widgetE.setTargetController(this.w0);
        widgetE.setRetainViewMode(tu3.b);
        zncVar.R(new coc(widgetE, null, null, null, false, -1));
    }

    public final void M(List list) {
        if (this.z0.isEmpty() && (!list.isEmpty())) {
            this.z0 = list;
            p(0, list.size());
        } else {
            wj4 wj4VarE = lz7.e(new b81(1, this.z0, list));
            this.z0 = list;
            wj4VarE.a(new y8(this));
        }
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.z0.size();
    }

    @Override // defpackage.p04, defpackage.hdc
    public final long k(int i) {
        av5 av5Var = (av5) x53.j0(i, this.z0);
        return (av5Var != null ? av5Var.a : null) != null ? r0.hashCode() : 0;
    }
}

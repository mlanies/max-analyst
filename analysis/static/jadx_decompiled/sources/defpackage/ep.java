package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ep extends lle {
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;

    public ep(Context context, je7 je7Var, je7 je7Var2, v7g v7gVar, p84 p84Var, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9) {
        super(context, p84Var, je7Var2, je7Var4, je7Var5, je7Var6, je7Var7);
        this.k = je7Var8;
        this.l = je7Var;
        this.m = tu0.r(2, new bp(context, this, p84Var, v7gVar, je7Var9));
        this.n = tu0.r(2, new cp(context, this, p84Var, 0));
        tu0.r(2, new cp(context, this, p84Var, 1));
        this.o = tu0.r(2, new cp(p84Var, this, context));
        tu0.r(2, new cp(context, this, p84Var, 3));
    }

    @Override // defpackage.lle
    public final boolean b() {
        if (jv9.a(a().j(false).b)) {
            return false;
        }
        je7 je7Var = this.l;
        z7d z7dVar = ((p7b) je7Var.getValue()).b;
        z7dVar.getClass();
        int iQ = (int) z7dVar.q(PmsKey.f102pushalerttimeout, 604800);
        if (iQ <= 0) {
            return false;
        }
        return System.currentTimeMillis() - ((p7b) je7Var.getValue()).a.g.getLong("app.last.push.alert.time", 0L) > ((long) (iQ * 1000));
    }
}

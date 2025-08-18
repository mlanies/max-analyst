package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class q6g extends p6g {
    public v27 m;

    public q6g(x6g x6gVar, WindowInsets windowInsets) {
        super(x6gVar, windowInsets);
        this.m = null;
    }

    @Override // defpackage.v6g
    public x6g b() {
        return x6g.f(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.v6g
    public x6g c() {
        return x6g.f(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.v6g
    public final v27 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = v27.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.v6g
    public boolean m() {
        return this.c.isConsumed();
    }
}

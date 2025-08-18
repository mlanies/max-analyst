package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class u6g extends s6g {
    public static final x6g q = x6g.f(null, WindowInsets.CONSUMED);

    public u6g(x6g x6gVar, WindowInsets windowInsets) {
        super(x6gVar, windowInsets);
    }

    @Override // defpackage.p6g, defpackage.v6g
    public final void d(View view) {
    }

    @Override // defpackage.p6g, defpackage.v6g
    public v27 f(int i) {
        return v27.c(this.c.getInsets(w6g.a(i)));
    }

    @Override // defpackage.p6g, defpackage.v6g
    public boolean o(int i) {
        return this.c.isVisible(w6g.a(i));
    }
}

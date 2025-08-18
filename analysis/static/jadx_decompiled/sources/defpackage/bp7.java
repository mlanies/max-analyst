package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class bp7 implements cq4 {
    @Override // defpackage.cq4
    public final Drawable a(l43 l43Var) {
        t84 t84Var = l43Var instanceof t84 ? (t84) l43Var : null;
        if (t84Var != null) {
            return t84Var.J();
        }
        return null;
    }

    @Override // defpackage.cq4
    public final boolean b(l43 l43Var) {
        return l43Var instanceof t84;
    }
}

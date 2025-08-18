package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ise extends hqd {
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        wre wreVar = (wre) ol7Var;
        zre zreVar = (zre) this.a;
        zreVar.setThemeName(wreVar.b);
        Drawable drawable = wreVar.o;
        if (drawable != null) {
            zreVar.setBackgroundPattern(drawable);
        }
    }
}

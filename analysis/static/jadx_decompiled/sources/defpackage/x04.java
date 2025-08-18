package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class x04 extends p18 {
    public final RectF v;

    public x04(gjd gjdVar, RectF rectF) {
        super(gjdVar);
        this.v = rectF;
    }

    @Override // defpackage.p18, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        y04 y04Var = new y04(this);
        y04Var.invalidateSelf();
        return y04Var;
    }

    public x04(x04 x04Var) {
        super(x04Var);
        this.v = x04Var.v;
    }
}

package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class py1 extends ote {
    public final oy1 X;
    public boolean Y;
    public final Typeface o;

    public py1(oy1 oy1Var, Typeface typeface) {
        super(18);
        this.o = typeface;
        this.X = oy1Var;
    }

    @Override // defpackage.ote
    public final void J(int i) {
        if (this.Y) {
            return;
        }
        this.X.q(this.o);
    }

    @Override // defpackage.ote
    public final void K(Typeface typeface, boolean z) {
        if (this.Y) {
            return;
        }
        this.X.q(typeface);
    }
}

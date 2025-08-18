package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class nwd extends Drawable.ConstantState {
    public final nx4 a;
    public int b;
    public final int c = 0;
    public final int d = 0;
    public final nw4 e;

    public nwd(nx4 nx4Var, int i, nw4 nw4Var) {
        this.a = nx4Var;
        this.b = i;
        this.e = nw4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwd)) {
            return false;
        }
        nwd nwdVar = (nwd) obj;
        return tpa.f(this.a, nwdVar.a) && this.b == nwdVar.b && this.c == nwdVar.c && this.d == nwdVar.d && tpa.f(this.e, nwdVar.e);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new mwd(this);
    }

    public final String toString() {
        return "SpriteEmojiDrawableState(location=" + this.a + ", size=" + this.b + ", paddingHorizontal=" + this.c + ", paddingVertical=" + this.d + ", bitmapResolver=" + this.e + ")";
    }
}

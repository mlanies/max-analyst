package defpackage;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class yge {
    public final GradientDrawable a;
    public final GradientDrawable b;
    public final GradientDrawable c;
    public final GradientDrawable d;

    public yge(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, GradientDrawable gradientDrawable4) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        this.d = gradientDrawable4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yge)) {
            return false;
        }
        yge ygeVar = (yge) obj;
        return tpa.f(this.a, ygeVar.a) && tpa.f(this.b, ygeVar.b) && tpa.f(this.c, ygeVar.c) && tpa.f(this.d, ygeVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StateDrawable(enabledChecked=" + this.a + ", enabledUnchecked=" + this.b + ", disabledChecked=" + this.c + ", disabledUnchecked=" + this.d + ")";
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes.dex */
public final class er {
    public final List a;
    public final List b;
    public final Drawable c;

    public er(List list, List list2, Drawable drawable) {
        this.a = list;
        this.b = list2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        return tpa.f(this.a, erVar.a) && tpa.f(this.b, erVar.b) && tpa.f(this.c, erVar.c);
    }

    public final int hashCode() {
        int iG = k7d.g(this.b, this.a.hashCode() * 31, 31);
        Drawable drawable = this.c;
        return iG + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "State(themes=" + this.a + ", modes=" + this.b + ", currentThemeDrawable=" + this.c + ")";
    }
}

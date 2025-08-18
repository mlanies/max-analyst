package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final class jee {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public jee(Surface surface, int i, int i2, int i3) {
        fm9.e("orientationDegrees must be 0, 90, 180, or 270", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jee)) {
            return false;
        }
        jee jeeVar = (jee) obj;
        return this.b == jeeVar.b && this.c == jeeVar.c && this.d == jeeVar.d && this.a.equals(jeeVar.a);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}

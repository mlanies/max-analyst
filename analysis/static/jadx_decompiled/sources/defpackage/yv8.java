package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class yv8 implements zv8 {
    public final Layout a;

    public yv8(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv8) && tpa.f(this.a, ((yv8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Simple(bodyLayout=" + this.a + ")";
    }
}

package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class bg8 {
    public final Bundle a;
    public wg8 b;

    public bg8(wg8 wg8Var, boolean z) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = wg8Var;
        bundle.putBundle("selector", wg8Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            wg8 wg8Var = null;
            if (bundle != null) {
                wg8Var = new wg8(null, bundle);
            } else {
                wg8 wg8Var2 = wg8.c;
            }
            this.b = wg8Var;
            if (wg8Var == null) {
                this.b = wg8.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg8)) {
            return false;
        }
        bg8 bg8Var = (bg8) obj;
        a();
        wg8 wg8Var = this.b;
        bg8Var.a();
        return wg8Var.equals(bg8Var.b) && b() == bg8Var.b();
    }

    public final int hashCode() {
        a();
        return (b() ? 1 : 0) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.b.a();
        return au1.j(sb, !r2.b.contains(null), " }");
    }
}

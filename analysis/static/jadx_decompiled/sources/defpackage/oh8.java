package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oh8 {
    public final vi8 a;
    public final int b;
    public final int c;
    public final nh8 d;
    public final Bundle e;

    public oh8(vi8 vi8Var, int i, int i2, boolean z, nh8 nh8Var, Bundle bundle) {
        this.a = vi8Var;
        this.b = i;
        this.c = i2;
        this.d = nh8Var;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oh8)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        oh8 oh8Var = (oh8) obj;
        nh8 nh8Var = this.d;
        return (nh8Var == null && oh8Var.d == null) ? this.a.equals(oh8Var.a) : oaf.a(nh8Var, oh8Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        vi8 vi8Var = this.a;
        sb.append(vi8Var.a.a);
        sb.append(", uid=");
        return zr6.j(sb, vi8Var.a.c, "}");
    }
}

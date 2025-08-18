package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class c8 {
    public final int a;
    public final int b;
    public final Intent c;

    public c8(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return this.a == c8Var.a && this.b == c8Var.b && tpa.f(this.c, c8Var.c);
    }

    public final int hashCode() {
        int iE = k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return iE + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResult(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ")";
    }
}

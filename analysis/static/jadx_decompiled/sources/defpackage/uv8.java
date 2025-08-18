package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class uv8 implements vv8 {
    public final long a;
    public final Layout b;
    public final Layout c;

    public uv8(long j, Layout layout, Layout layout2) {
        this.a = j;
        this.b = layout;
        this.c = layout2;
    }

    @Override // defpackage.vv8
    public final Layout a() {
        return this.b;
    }

    @Override // defpackage.vv8
    public final Layout b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv8)) {
            return false;
        }
        uv8 uv8Var = (uv8) obj;
        return this.a == uv8Var.a && tpa.f(this.b, uv8Var.b) && tpa.f(this.c, uv8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", bodyLayout=" + this.b + ", forwardedTitleLayout=" + this.c + ")";
    }
}

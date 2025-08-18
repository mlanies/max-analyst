package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class gg2 extends pg2 {
    public final Intent b;
    public final Uri c;

    public gg2(Intent intent, Uri uri) {
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg2)) {
            return false;
        }
        gg2 gg2Var = (gg2) obj;
        return tpa.f(this.b, gg2Var.b) && tpa.f(this.c, gg2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}

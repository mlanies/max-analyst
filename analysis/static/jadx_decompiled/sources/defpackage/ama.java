package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class ama extends cma {
    public final Intent a;
    public final Uri b;

    public ama(Intent intent, Uri uri) {
        this.a = intent;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ama)) {
            return false;
        }
        ama amaVar = (ama) obj;
        return tpa.f(this.a, amaVar.a) && tpa.f(this.b, amaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.a + ", uri=" + this.b + ")";
    }
}

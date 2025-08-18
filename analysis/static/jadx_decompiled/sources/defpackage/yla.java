package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class yla extends wm9 {
    public final Intent b;
    public final Uri c;

    public yla(Intent intent, Uri uri) {
        super(e5f.a);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yla)) {
            return false;
        }
        yla ylaVar = (yla) obj;
        return tpa.f(this.b, ylaVar.b) && tpa.f(this.c, ylaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}

package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class ygd extends ka1 {
    public final Intent b;

    public ygd(Intent intent) {
        super(14);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygd) && tpa.f(this.b, ((ygd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}

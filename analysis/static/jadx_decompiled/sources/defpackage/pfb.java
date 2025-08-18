package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class pfb extends ka1 {
    public final Intent b;

    public pfb(Intent intent) {
        super(9);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfb) && tpa.f(this.b, ((pfb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}

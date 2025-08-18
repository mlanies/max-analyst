package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class or2 extends ka1 {
    public final Intent b;

    public or2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or2) && tpa.f(this.b, ((or2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropPhoto(data=" + this.b + ")";
    }
}

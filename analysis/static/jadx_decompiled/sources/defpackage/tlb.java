package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class tlb extends amb {
    public final Intent a;

    public tlb(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlb) && tpa.f(this.a, ((tlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.a + ")";
    }
}

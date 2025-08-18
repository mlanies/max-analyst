package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class sr2 extends ka1 {
    public final Intent b;

    public sr2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr2) && tpa.f(this.b, ((sr2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PickPhotoFromCamera(data=" + this.b + ")";
    }
}

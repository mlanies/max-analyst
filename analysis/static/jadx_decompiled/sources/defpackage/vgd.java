package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class vgd extends ka1 {
    public final Intent b;

    public vgd(Intent intent) {
        super(14);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgd) && tpa.f(this.b, ((vgd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}

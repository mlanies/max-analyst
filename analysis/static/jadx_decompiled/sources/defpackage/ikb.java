package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class ikb extends ka1 {
    public final Intent b;

    public ikb(Intent intent) {
        super(11);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikb) && tpa.f(this.b, ((ikb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}

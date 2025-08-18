package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class dd0 implements ed0 {
    public final Intent a;

    public dd0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd0) && tpa.f(this.a, ((dd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CropAvatarScreenIntentReady(intent=" + this.a + ")";
    }
}

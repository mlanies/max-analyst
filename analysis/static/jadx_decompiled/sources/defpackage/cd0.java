package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class cd0 implements ed0 {
    public final Intent a;

    public cd0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd0) && tpa.f(this.a, ((cd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}

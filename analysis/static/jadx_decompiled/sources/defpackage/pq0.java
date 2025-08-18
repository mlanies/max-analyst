package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pq0 implements Serializable {
    public final boolean a;
    public final boolean b;

    public pq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        return "{hasBots=" + this.a + ", suspendedBot=" + this.b + "}";
    }
}

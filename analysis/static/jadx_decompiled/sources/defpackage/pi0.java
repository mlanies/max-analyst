package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class pi0 implements Serializable {
    public final long a;

    public pi0() {
        this(Long.MIN_VALUE);
    }

    public String toString() {
        return z7b.i(new StringBuilder("BaseEvent{requestId="), this.a, '}');
    }

    public pi0(long j) {
        this.a = j;
    }
}

package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class tag {
    public final z99 a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public tag(long j, z99 z99Var) {
        this.a = z99Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tag.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((tag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

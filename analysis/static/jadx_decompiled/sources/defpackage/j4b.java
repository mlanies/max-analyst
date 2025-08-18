package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j4b {
    public final String a;
    public final h4b b;
    public final Object c;

    static {
        if (oaf.a < 31) {
            new j4b("");
        } else {
            new j4b(h4b.b, "");
        }
    }

    public j4b(String str) {
        fm9.k(oaf.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4b)) {
            return false;
        }
        j4b j4bVar = (j4b) obj;
        return Objects.equals(this.a, j4bVar.a) && Objects.equals(this.b, j4bVar.b) && Objects.equals(this.c, j4bVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public j4b(LogSessionId logSessionId, String str) {
        this(new h4b(logSessionId), str);
    }

    public j4b(h4b h4bVar, String str) {
        this.b = h4bVar;
        this.a = str;
        this.c = new Object();
    }
}

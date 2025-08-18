package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class a73 {
    public final List a;

    public a73(List list) {
        this.a = list;
    }

    public final String a(Context context) {
        return x53.n0(this.a, "\n", null, null, new nd0(context, 2), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a73) && tpa.f(this.a, ((a73) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CombinedError(errors=" + this.a + ")";
    }
}

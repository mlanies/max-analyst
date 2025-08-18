package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class had {
    public final gad a;

    public had(int i, ArrayList arrayList, Executor executor, rv1 rv1Var) {
        this.a = new gad(i, arrayList, executor, rv1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof had)) {
            return false;
        }
        return this.a.equals(((had) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}

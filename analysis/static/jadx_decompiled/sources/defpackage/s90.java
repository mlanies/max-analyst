package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s90 extends fl0 {
    public final List a;

    public s90(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fl0)) {
            return false;
        }
        return this.a.equals(((s90) ((fl0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return au1.i(new StringBuilder("BatchedLogRequest{logRequests="), this.a, "}");
    }
}

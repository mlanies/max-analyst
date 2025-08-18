package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class xgc implements Serializable {
    public final List a;

    public xgc(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgc) && tpa.f(this.a, ((xgc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyKeyboard(buttonAttaches=" + this.a + ")";
    }
}

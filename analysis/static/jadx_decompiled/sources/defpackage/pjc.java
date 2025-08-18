package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class pjc implements Serializable {
    public final Object a;

    public /* synthetic */ pjc(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof njc) {
            return ((njc) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjc) {
            return tpa.f(this.a, ((pjc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof njc) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}

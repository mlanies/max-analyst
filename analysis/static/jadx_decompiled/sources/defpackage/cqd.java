package defpackage;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class cqd implements Provider {
    public final Object a;

    public cqd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqd) && tpa.f(this.a, ((cqd) obj).a);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ')';
    }
}

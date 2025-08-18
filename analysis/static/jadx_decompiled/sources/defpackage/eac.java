package defpackage;

/* loaded from: classes2.dex */
public final class eac implements iac {
    public final bac a;
    public final boolean b;

    public eac(bac bacVar, boolean z) {
        this.a = bacVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eac)) {
            return false;
        }
        eac eacVar = (eac) obj;
        return this.a == eacVar.a && this.b == eacVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTyping(type=" + this.a + ", isTyping=" + this.b + ")";
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class odb {
    public final boolean a;
    public final boolean b;

    public odb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static odb a(odb odbVar, boolean z) {
        boolean z2 = odbVar.b;
        odbVar.getClass();
        return new odb(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odb)) {
            return false;
        }
        odb odbVar = (odb) obj;
        return this.a == odbVar.a && this.b == odbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(isChecked=" + this.a + ", isEnabled=" + this.b + ")";
    }
}

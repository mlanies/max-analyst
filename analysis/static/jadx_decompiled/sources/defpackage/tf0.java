package defpackage;

/* loaded from: classes2.dex */
public final class tf0 {
    public final boolean a;
    public final boolean b;

    public tf0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf0)) {
            return false;
        }
        tf0 tf0Var = (tf0) obj;
        return this.a == tf0Var.a && this.b == tf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SignalingConfig(dcReportNetworkStatEnabled=" + this.a + ", producerCommandV3=" + this.b + ")";
    }
}

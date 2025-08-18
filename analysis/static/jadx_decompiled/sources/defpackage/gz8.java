package defpackage;

/* loaded from: classes2.dex */
public final class gz8 implements kz8 {
    public final cz5 a;

    public gz8(cz5 cz5Var) {
        this.a = cz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz8) && tpa.f(this.a, ((gz8) obj).a);
    }

    public final int hashCode() {
        cz5 cz5Var = this.a;
        if (cz5Var == null) {
            return 0;
        }
        return cz5Var.hashCode();
    }

    public final String toString() {
        return "OnMessageSend(forwardMessagesSendData=" + this.a + ")";
    }
}

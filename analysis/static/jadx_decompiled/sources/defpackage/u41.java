package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class u41 {
    public final fp1 a;
    public final bff b;

    public u41(fp1 fp1Var, bff bffVar) {
        this.a = fp1Var;
        this.b = bffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u41.class != obj.getClass()) {
            return false;
        }
        u41 u41Var = (u41) obj;
        return this.a.equals(u41Var.a) && this.b.equals(u41Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}

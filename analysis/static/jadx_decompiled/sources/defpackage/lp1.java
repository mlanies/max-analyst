package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class lp1 {
    public final long a;
    public final bg1 b;

    public lp1(bg1 bg1Var, long j) {
        this.a = j;
        this.b = bg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lp1.class != obj.getClass()) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return this.a == lp1Var.a && Objects.equals(this.b, lp1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}

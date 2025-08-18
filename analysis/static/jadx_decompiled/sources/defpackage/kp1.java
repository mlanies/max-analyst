package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class kp1 {
    public final lp1 a;
    public final o61 b;

    public kp1(lp1 lp1Var, o61 o61Var) {
        this.a = lp1Var;
        this.b = o61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kp1.class != obj.getClass()) {
            return false;
        }
        kp1 kp1Var = (kp1) obj;
        return this.a.equals(kp1Var.a) && Objects.equals(this.b, kp1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}

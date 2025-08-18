package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class fp1 {
    public final olf a;
    public final bg1 b;
    public final cd9 c;

    public fp1(adb adbVar) {
        this.a = (olf) adbVar.b;
        this.b = (bg1) adbVar.a;
        this.c = (cd9) adbVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fp1.class != obj.getClass()) {
            return false;
        }
        fp1 fp1Var = (fp1) obj;
        return this.a == fp1Var.a && this.b.equals(fp1Var.b) && Objects.equals(this.c, fp1Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}

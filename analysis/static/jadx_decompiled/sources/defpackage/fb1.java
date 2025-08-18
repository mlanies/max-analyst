package defpackage;

/* loaded from: classes.dex */
public final class fb1 extends gb1 {
    public final haf a;

    public fb1(haf hafVar) {
        this.a = hafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb1) && tpa.f(this.a, ((fb1) obj).a);
    }

    public final int hashCode() {
        haf hafVar = this.a;
        if (hafVar == null) {
            return 0;
        }
        return hafVar.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}

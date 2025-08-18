package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* loaded from: classes.dex */
public final class z31 {
    public final Conversation a;
    public final j1e b;
    public final boolean c;
    public final boolean d;

    public z31(Conversation conversation, j1e j1eVar, boolean z, boolean z2) {
        this.a = conversation;
        this.b = j1eVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z31)) {
            return false;
        }
        z31 z31Var = (z31) obj;
        return tpa.f(this.a, z31Var.a) && tpa.f(this.b, z31Var.b) && this.c == z31Var.c && this.d == z31Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Result(conversation=" + this.a + ", callTarget=" + this.b + ", isNewCall=" + this.c + ", isIncoming=" + this.d + ")";
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class w71 implements y71 {
    public final b41 a;

    public w71(b41 b41Var) {
        this.a = b41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w71) && tpa.f(this.a, ((w71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateJoinLinkEvent(event=" + this.a + ")";
    }
}

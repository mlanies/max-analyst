package defpackage;

/* loaded from: classes2.dex */
public final class o17 extends wm9 {
    public final afc b;

    public o17(afc afcVar) {
        super(e5f.a);
        this.b = afcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o17) && tpa.f(this.b, ((o17) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class sm8 extends hm9 {
    public final jqe o;
    public final float p;

    public sm8(jqe jqeVar, float f) {
        this.o = jqeVar;
        this.p = f;
    }

    @Override // defpackage.hm9
    public final jqe C() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm8)) {
            return false;
        }
        sm8 sm8Var = (sm8) obj;
        return tpa.f(this.o, sm8Var.o) && Float.compare(this.p, sm8Var.p) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.p) + (this.o.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(downloadText=" + this.o + ", progress=" + this.p + ")";
    }
}

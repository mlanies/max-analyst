package defpackage;

/* loaded from: classes2.dex */
public final class e02 implements f02 {
    public final int X;
    public final long Y;
    public final long a;
    public final w3e b;
    public final jqe c;
    public final Integer o;

    public e02(long j, w3e w3eVar) {
        this.a = j;
        this.b = w3eVar;
        this.c = w3eVar.b;
        this.o = w3eVar.o;
        this.X = w3eVar.t0;
        this.Y = w3eVar.u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e02)) {
            return false;
        }
        e02 e02Var = (e02) obj;
        return this.a == e02Var.a && tpa.f(this.b, e02Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Y;
    }

    @Override // defpackage.f02
    public final jqe getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.X;
    }

    @Override // defpackage.f02
    public final boolean r() {
        return this.b.Y == 1;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }
}

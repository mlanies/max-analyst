package defpackage;

/* loaded from: classes2.dex */
public final class yib extends cjb {
    public final int a;
    public final vfd b;
    public final boolean c;
    public final int o;

    public yib(int i, vfd vfdVar, boolean z, int i2) {
        this.a = i;
        this.b = vfdVar;
        this.c = z;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yib)) {
            return false;
        }
        yib yibVar = (yib) obj;
        return this.a == yibVar.a && tpa.f(this.b, yibVar.b) && this.c == yibVar.c && lz7.i(this.o, yibVar.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + ms2.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        return "InviteActionItem(actionId=" + this.a + ", model=" + this.b + ", isEnabled=" + this.c + ", itemViewType=" + lz7.U(this.o) + ")";
    }
}

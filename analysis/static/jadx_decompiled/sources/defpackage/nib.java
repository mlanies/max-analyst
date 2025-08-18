package defpackage;

/* loaded from: classes2.dex */
public final class nib extends bjb {
    public final int a;
    public final int b;
    public final int c;

    public nib(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nib)) {
            return false;
        }
        nib nibVar = (nib) obj;
        return this.a == nibVar.a && lz7.i(this.b, nibVar.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 64;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    public final String toString() {
        return "Admins(count=" + this.a + ", itemViewType=" + lz7.U(this.b) + ")";
    }
}

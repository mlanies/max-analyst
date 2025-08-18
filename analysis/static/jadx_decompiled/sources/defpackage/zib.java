package defpackage;

/* loaded from: classes2.dex */
public final class zib extends bjb {
    public final int a;

    public zib(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zib) {
            return this.a == ((zib) obj).a && lz7.i(-2147483520, -2147483520);
        }
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 128;
    }

    public final int hashCode() {
        return Integer.hashCode(-2147483520) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return -2147483520;
    }

    public final String toString() {
        return "ParticipantsCount(count=" + this.a + ", itemViewType=" + lz7.U(-2147483520) + ")";
    }
}

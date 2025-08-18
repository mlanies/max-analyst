package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mw6 extends m1 implements lw6 {
    @Override // defpackage.uaf
    public final int e() {
        return 6;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uafVar = (uaf) obj;
        int iE = ((n1) uafVar).e();
        if (iE == 0) {
            throw null;
        }
        if (iE != 6) {
            return false;
        }
        boolean z = uafVar instanceof mw6;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((mw6) uafVar).a);
        }
        byte[] bArr2 = ((m1) uafVar.o()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.n1, defpackage.uaf
    public final lw6 o() {
        return this;
    }

    @Override // defpackage.n1
    /* renamed from: s */
    public final lw6 o() {
        return this;
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qx6 extends m1 implements px6 {
    @Override // defpackage.uaf
    public final int e() {
        return 5;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        n1 n1Var = (n1) ((uaf) obj);
        if (n1Var.e() != 5) {
            return false;
        }
        boolean z = n1Var instanceof qx6;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((qx6) n1Var).a);
        }
        byte[] bArr2 = ((m1) n1Var.m()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.n1, defpackage.uaf
    public final px6 m() {
        return this;
    }

    @Override // defpackage.n1, defpackage.rx6
    /* renamed from: p */
    public final px6 m() {
        return this;
    }
}

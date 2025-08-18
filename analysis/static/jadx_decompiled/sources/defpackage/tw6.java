package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class tw6 extends n1 implements uaf {
    public final byte a;
    public final byte[] b;

    public tw6(byte b, byte[] bArr) {
        this.a = b;
        this.b = bArr;
    }

    @Override // defpackage.uaf
    public final String a() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    @Override // defpackage.uaf
    public final int e() {
        return 9;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
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
        if (iE != 9) {
            return false;
        }
        tw6 tw6VarN = uafVar.n();
        return this.a == tw6VarN.a && Arrays.equals(this.b, tw6VarN.b);
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b : this.b) {
            i = (i * 31) + b;
        }
        return i;
    }

    @Override // defpackage.n1, defpackage.uaf
    public final tw6 n() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.n1
    /* renamed from: u */
    public final tw6 n() {
        return this;
    }
}

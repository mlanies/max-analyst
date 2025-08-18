package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class xob extends qw8 {
    public static volatile xob[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public vob[] e;

    public xob() {
        if (vob.c == null) {
            synchronized (y37.b) {
                try {
                    if (vob.c == null) {
                        vob.c = new vob[0];
                    }
                } finally {
                }
            }
        }
        this.e = vob.c;
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int iF = i != 0 ? y43.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            iF += y43.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            iF += y43.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            iF += y43.e(4);
        }
        vob[] vobVarArr = this.e;
        if (vobVarArr != null && vobVarArr.length > 0) {
            while (true) {
                vob[] vobVarArr2 = this.e;
                if (i2 >= vobVarArr2.length) {
                    break;
                }
                vob vobVar = vobVarArr2[i2];
                if (vobVar != null) {
                    iF = y43.i(5, vobVar) + iF;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = x43Var.p();
            } else if (iS == 16) {
                int iP = x43Var.p();
                if (iP == 0) {
                    this.b = iP;
                }
            } else if (iS == 24) {
                this.c = x43Var.p();
            } else if (iS == 37) {
                this.d = x43Var.i();
            } else if (iS == 42) {
                int iW = nd7.w(x43Var, 42);
                vob[] vobVarArr = this.e;
                int length = vobVarArr == null ? 0 : vobVarArr.length;
                int i = iW + length;
                vob[] vobVarArr2 = new vob[i];
                if (length != 0) {
                    System.arraycopy(vobVarArr, 0, vobVarArr2, 0, length);
                }
                while (length < i - 1) {
                    vob vobVar = new vob();
                    vobVarArr2[length] = vobVar;
                    x43Var.j(vobVar);
                    x43Var.s();
                    length++;
                }
                vob vobVar2 = new vob();
                vobVarArr2[length] = vobVar2;
                x43Var.j(vobVar2);
                this.e = vobVarArr2;
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        int i = this.a;
        if (i != 0) {
            y43Var.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            y43Var.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            y43Var.w(3, i3);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            y43Var.v(4, this.d);
        }
        vob[] vobVarArr = this.e;
        if (vobVarArr == null || vobVarArr.length <= 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            vob[] vobVarArr2 = this.e;
            if (i4 >= vobVarArr2.length) {
                return;
            }
            vob vobVar = vobVarArr2[i4];
            if (vobVar != null) {
                y43Var.y(5, vobVar);
            }
            i4++;
        }
    }
}

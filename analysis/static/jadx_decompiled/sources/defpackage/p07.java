package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class p07 extends qw8 {
    public o07[] a;

    public p07() {
        if (o07.f == null) {
            synchronized (y37.b) {
                try {
                    if (o07.f == null) {
                        o07.f = new o07[0];
                    }
                } finally {
                }
            }
        }
        this.a = o07.f;
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        o07[] o07VarArr = this.a;
        int i = 0;
        if (o07VarArr == null || o07VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            o07[] o07VarArr2 = this.a;
            if (i >= o07VarArr2.length) {
                return i2;
            }
            o07 o07Var = o07VarArr2[i];
            if (o07Var != null) {
                i2 = y43.i(1, o07Var) + i2;
            }
            i++;
        }
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                int iW = nd7.w(x43Var, 10);
                o07[] o07VarArr = this.a;
                int length = o07VarArr == null ? 0 : o07VarArr.length;
                int i = iW + length;
                o07[] o07VarArr2 = new o07[i];
                if (length != 0) {
                    System.arraycopy(o07VarArr, 0, o07VarArr2, 0, length);
                }
                while (length < i - 1) {
                    o07 o07Var = new o07();
                    o07VarArr2[length] = o07Var;
                    x43Var.j(o07Var);
                    x43Var.s();
                    length++;
                }
                o07 o07Var2 = new o07();
                o07VarArr2[length] = o07Var2;
                x43Var.j(o07Var2);
                this.a = o07VarArr2;
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        o07[] o07VarArr = this.a;
        if (o07VarArr == null || o07VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            o07[] o07VarArr2 = this.a;
            if (i >= o07VarArr2.length) {
                return;
            }
            o07 o07Var = o07VarArr2[i];
            if (o07Var != null) {
                y43Var.y(1, o07Var);
            }
            i++;
        }
    }
}

package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class wob extends qw8 {
    public xob[] a;
    public tob[] b;
    public zob c;
    public boolean d;

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i;
        xob[] xobVarArr = this.a;
        int i2 = 0;
        if (xobVarArr != null && xobVarArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                xob[] xobVarArr2 = this.a;
                if (i3 >= xobVarArr2.length) {
                    break;
                }
                xob xobVar = xobVarArr2[i3];
                if (xobVar != null) {
                    i += y43.i(1, xobVar);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        tob[] tobVarArr = this.b;
        if (tobVarArr != null && tobVarArr.length > 0) {
            while (true) {
                tob[] tobVarArr2 = this.b;
                if (i2 >= tobVarArr2.length) {
                    break;
                }
                tob tobVar = tobVarArr2[i2];
                if (tobVar != null) {
                    i = y43.i(2, tobVar) + i;
                }
                i2++;
            }
        }
        zob zobVar = this.c;
        if (zobVar != null) {
            i += y43.i(3, zobVar);
        }
        return this.d ? i + y43.a(4) : i;
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
                xob[] xobVarArr = this.a;
                int length = xobVarArr == null ? 0 : xobVarArr.length;
                int i = iW + length;
                xob[] xobVarArr2 = new xob[i];
                if (length != 0) {
                    System.arraycopy(xobVarArr, 0, xobVarArr2, 0, length);
                }
                while (length < i - 1) {
                    xob xobVar = new xob();
                    xobVarArr2[length] = xobVar;
                    x43Var.j(xobVar);
                    x43Var.s();
                    length++;
                }
                xob xobVar2 = new xob();
                xobVarArr2[length] = xobVar2;
                x43Var.j(xobVar2);
                this.a = xobVarArr2;
            } else if (iS == 18) {
                int iW2 = nd7.w(x43Var, 18);
                tob[] tobVarArr = this.b;
                int length2 = tobVarArr == null ? 0 : tobVarArr.length;
                int i2 = iW2 + length2;
                tob[] tobVarArr2 = new tob[i2];
                if (length2 != 0) {
                    System.arraycopy(tobVarArr, 0, tobVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    tob tobVar = new tob();
                    tobVarArr2[length2] = tobVar;
                    x43Var.j(tobVar);
                    x43Var.s();
                    length2++;
                }
                tob tobVar2 = new tob();
                tobVarArr2[length2] = tobVar2;
                x43Var.j(tobVar2);
                this.b = tobVarArr2;
            } else if (iS == 26) {
                if (this.c == null) {
                    this.c = new zob();
                }
                x43Var.j(this.c);
            } else if (iS == 32) {
                this.d = x43Var.f();
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        xob[] xobVarArr = this.a;
        int i = 0;
        if (xobVarArr != null && xobVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                xob[] xobVarArr2 = this.a;
                if (i2 >= xobVarArr2.length) {
                    break;
                }
                xob xobVar = xobVarArr2[i2];
                if (xobVar != null) {
                    y43Var.y(1, xobVar);
                }
                i2++;
            }
        }
        tob[] tobVarArr = this.b;
        if (tobVarArr != null && tobVarArr.length > 0) {
            while (true) {
                tob[] tobVarArr2 = this.b;
                if (i >= tobVarArr2.length) {
                    break;
                }
                tob tobVar = tobVarArr2[i];
                if (tobVar != null) {
                    y43Var.y(2, tobVar);
                }
                i++;
            }
        }
        zob zobVar = this.c;
        if (zobVar != null) {
            y43Var.y(3, zobVar);
        }
        boolean z = this.d;
        if (z) {
            y43Var.r(4, z);
        }
    }
}

package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class cpb extends qw8 {
    public static volatile cpb[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public zw5 d = null;

    public cpb() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            iF += y43.f(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            iF += y43.f(3, i3);
        }
        zw5 zw5Var = this.d;
        return zw5Var != null ? iF + y43.i(4, zw5Var) : iF;
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
                this.b = x43Var.p();
            } else if (iS == 24) {
                this.c = x43Var.p();
            } else if (iS == 34) {
                if (this.d == null) {
                    this.d = new zw5(3);
                }
                x43Var.j(this.d);
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
        zw5 zw5Var = this.d;
        if (zw5Var != null) {
            y43Var.y(4, zw5Var);
        }
    }
}

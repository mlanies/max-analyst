package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q07 extends qw8 {
    public static volatile q07[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = nd7.g;

    public q07() {
        this.cachedSize = -1;
    }

    public static q07[] a() {
        if (e == null) {
            synchronized (y37.b) {
                try {
                    if (e == null) {
                        e = new q07[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            iF += y43.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            iF += y43.n(3, i3);
        }
        return !Arrays.equals(this.d, nd7.g) ? iF + y43.b(4, this.d) : iF;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                int iP = x43Var.p();
                if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                    this.a = iP;
                }
            } else if (iS == 16) {
                this.b = x43Var.p();
            } else if (iS == 24) {
                this.c = x43Var.p();
            } else if (iS == 34) {
                this.d = x43Var.g();
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
            y43Var.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            y43Var.G(3, i3);
        }
        if (Arrays.equals(this.d, nd7.g)) {
            return;
        }
        y43Var.s(4, this.d);
    }
}

package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class tob extends qw8 {
    public static volatile tob[] c;
    public int a = 0;
    public int b = 0;

    public tob() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        return i2 != 0 ? iF + y43.f(2, i2) : iF;
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
                if (iP == 0) {
                    this.a = iP;
                }
            } else if (iS == 16) {
                this.b = x43Var.p();
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
    }
}

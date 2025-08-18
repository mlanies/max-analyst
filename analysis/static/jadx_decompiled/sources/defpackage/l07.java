package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l07 extends qw8 {
    public int a = 0;
    public byte[] b = nd7.g;

    public l07() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int iN = i != 0 ? y43.n(1, i) : 0;
        return !Arrays.equals(this.b, nd7.g) ? iN + y43.b(2, this.b) : iN;
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
            } else if (iS == 18) {
                this.b = x43Var.g();
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
            y43Var.G(1, i);
        }
        if (Arrays.equals(this.b, nd7.g)) {
            return;
        }
        y43Var.s(2, this.b);
    }
}

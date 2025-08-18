package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k07 extends qw8 {
    public byte[] a = nd7.g;

    public k07() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        if (Arrays.equals(this.a, nd7.g)) {
            return 0;
        }
        return y43.b(1, this.a);
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = x43Var.g();
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (Arrays.equals(this.a, nd7.g)) {
            return;
        }
        y43Var.s(1, this.a);
    }
}

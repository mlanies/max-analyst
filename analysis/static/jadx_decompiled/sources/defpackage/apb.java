package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class apb extends qw8 {
    public float a;
    public float b;
    public int c;
    public boolean d;

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int iE = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            iE += y43.e(2);
        }
        int i = this.c;
        if (i != 0) {
            iE += y43.f(3, i);
        }
        return this.d ? iE + y43.a(4) : iE;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 13) {
                this.a = x43Var.i();
            } else if (iS == 21) {
                this.b = x43Var.i();
            } else if (iS == 24) {
                this.c = x43Var.p();
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
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            y43Var.v(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            y43Var.v(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            y43Var.w(3, i);
        }
        boolean z = this.d;
        if (z) {
            y43Var.r(4, z);
        }
    }
}

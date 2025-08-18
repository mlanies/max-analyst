package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class zob extends qw8 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public zob() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int iE = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            iE += y43.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            iE += y43.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f) ? iE + y43.e(4) : iE;
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
            } else if (iS == 29) {
                this.c = x43Var.i();
            } else if (iS == 37) {
                this.d = x43Var.i();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            y43Var.v(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            y43Var.v(4, this.d);
        }
    }
}

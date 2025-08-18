package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class uob extends qw8 {
    public zob a;
    public float b;
    public float[] c;

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        zob zobVar = this.a;
        int i = zobVar != null ? y43.i(1, zobVar) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            i += y43.e(2);
        }
        float[] fArr = this.c;
        return (fArr == null || fArr.length <= 0) ? i : (fArr.length * 4) + i + fArr.length;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                if (this.a == null) {
                    this.a = new zob();
                }
                x43Var.j(this.a);
            } else if (iS == 21) {
                this.b = x43Var.i();
            } else if (iS == 26) {
                int iP = x43Var.p();
                int iE = x43Var.e(iP);
                int i = iP / 4;
                float[] fArr = this.c;
                int length = fArr == null ? 0 : fArr.length;
                int i2 = i + length;
                float[] fArr2 = new float[i2];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i2) {
                    fArr2[length] = x43Var.i();
                    length++;
                }
                this.c = fArr2;
                x43Var.d(iE);
            } else if (iS == 29) {
                int iW = nd7.w(x43Var, 29);
                float[] fArr3 = this.c;
                int length2 = fArr3 == null ? 0 : fArr3.length;
                int i3 = iW + length2;
                float[] fArr4 = new float[i3];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i3 - 1) {
                    fArr4[length2] = x43Var.i();
                    x43Var.s();
                    length2++;
                }
                fArr4[length2] = x43Var.i();
                this.c = fArr4;
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        zob zobVar = this.a;
        if (zobVar != null) {
            y43Var.y(1, zobVar);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            y43Var.v(2, this.b);
        }
        float[] fArr = this.c;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            float[] fArr2 = this.c;
            if (i >= fArr2.length) {
                return;
            }
            y43Var.v(3, fArr2[i]);
            i++;
        }
    }
}

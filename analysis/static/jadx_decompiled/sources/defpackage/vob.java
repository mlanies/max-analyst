package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class vob extends qw8 {
    public static volatile vob[] c;
    public int a = 0;
    public float[] b = nd7.e;

    public vob() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = this.a;
        int iF = i != 0 ? y43.f(1, i) : 0;
        float[] fArr = this.b;
        return (fArr == null || fArr.length <= 0) ? iF : (fArr.length * 4) + iF + fArr.length;
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
                if (iP == 0 || iP == 1) {
                    this.a = iP;
                }
            } else if (iS == 18) {
                int iP2 = x43Var.p();
                int iE = x43Var.e(iP2);
                int i = iP2 / 4;
                float[] fArr = this.b;
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
                this.b = fArr2;
                x43Var.d(iE);
            } else if (iS == 21) {
                int iW = nd7.w(x43Var, 21);
                float[] fArr3 = this.b;
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
                this.b = fArr4;
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
        float[] fArr = this.b;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.b;
            if (i2 >= fArr2.length) {
                return;
            }
            y43Var.v(2, fArr2[i2]);
            i2++;
        }
    }
}

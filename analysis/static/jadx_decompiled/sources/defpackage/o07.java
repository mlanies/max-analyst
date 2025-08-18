package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class o07 extends qw8 {
    public static volatile o07[] f;
    public String a = "";
    public String b = "";
    public int c = 0;
    public zw5 d = null;
    public q07[] e = q07.a();

    public o07() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int i = 0;
        int iL = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += y43.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            iL += y43.n(3, i2);
        }
        zw5 zw5Var = this.d;
        if (zw5Var != null) {
            iL += y43.i(4, zw5Var);
        }
        q07[] q07VarArr = this.e;
        if (q07VarArr != null && q07VarArr.length > 0) {
            while (true) {
                q07[] q07VarArr2 = this.e;
                if (i >= q07VarArr2.length) {
                    break;
                }
                q07 q07Var = q07VarArr2[i];
                if (q07Var != null) {
                    iL = y43.i(17, q07Var) + iL;
                }
                i++;
            }
        }
        return iL;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                this.a = x43Var.r();
            } else if (iS == 18) {
                this.b = x43Var.r();
            } else if (iS == 24) {
                this.c = x43Var.p();
            } else if (iS == 34) {
                if (this.d == null) {
                    this.d = new zw5(1);
                }
                x43Var.j(this.d);
            } else if (iS == 138) {
                int iW = nd7.w(x43Var, 138);
                q07[] q07VarArr = this.e;
                int length = q07VarArr == null ? 0 : q07VarArr.length;
                int i = iW + length;
                q07[] q07VarArr2 = new q07[i];
                if (length != 0) {
                    System.arraycopy(q07VarArr, 0, q07VarArr2, 0, length);
                }
                while (length < i - 1) {
                    q07 q07Var = new q07();
                    q07VarArr2[length] = q07Var;
                    x43Var.j(q07Var);
                    x43Var.s();
                    length++;
                }
                q07 q07Var2 = new q07();
                q07VarArr2[length] = q07Var2;
                x43Var.j(q07Var2);
                this.e = q07VarArr2;
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        if (!this.a.equals("")) {
            y43Var.E(1, this.a);
        }
        if (!this.b.equals("")) {
            y43Var.E(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            y43Var.G(3, i);
        }
        zw5 zw5Var = this.d;
        if (zw5Var != null) {
            y43Var.y(4, zw5Var);
        }
        q07[] q07VarArr = this.e;
        if (q07VarArr == null || q07VarArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            q07[] q07VarArr2 = this.e;
            if (i2 >= q07VarArr2.length) {
                return;
            }
            q07 q07Var = q07VarArr2[i2];
            if (q07Var != null) {
                y43Var.y(17, q07Var);
            }
            i2++;
        }
    }
}

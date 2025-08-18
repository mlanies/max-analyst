package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class n07 extends qw8 {
    public m07[] a;

    public n07() {
        if (m07.u == null) {
            synchronized (y37.b) {
                try {
                    if (m07.u == null) {
                        m07.u = new m07[0];
                    }
                } finally {
                }
            }
        }
        this.a = m07.u;
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        m07[] m07VarArr = this.a;
        int i = 0;
        if (m07VarArr == null || m07VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            m07[] m07VarArr2 = this.a;
            if (i >= m07VarArr2.length) {
                return i2;
            }
            m07 m07Var = m07VarArr2[i];
            if (m07Var != null) {
                i2 = y43.i(1, m07Var) + i2;
            }
            i++;
        }
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 10) {
                int iW = nd7.w(x43Var, 10);
                m07[] m07VarArr = this.a;
                int length = m07VarArr == null ? 0 : m07VarArr.length;
                int i = iW + length;
                m07[] m07VarArr2 = new m07[i];
                if (length != 0) {
                    System.arraycopy(m07VarArr, 0, m07VarArr2, 0, length);
                }
                while (length < i - 1) {
                    m07 m07Var = new m07();
                    m07VarArr2[length] = m07Var;
                    x43Var.j(m07Var);
                    x43Var.s();
                    length++;
                }
                m07 m07Var2 = new m07();
                m07VarArr2[length] = m07Var2;
                x43Var.j(m07Var2);
                this.a = m07VarArr2;
            } else if (!x43Var.u(iS)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        m07[] m07VarArr = this.a;
        if (m07VarArr == null || m07VarArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            m07[] m07VarArr2 = this.a;
            if (i >= m07VarArr2.length) {
                return;
            }
            m07 m07Var = m07VarArr2[i];
            if (m07Var != null) {
                y43Var.y(1, m07Var);
            }
            i++;
        }
    }
}

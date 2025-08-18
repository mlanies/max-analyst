package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Arrays;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class m07 extends qw8 {
    public static volatile m07[] u;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = "";
    public byte[] o = nd7.g;
    public String p = "";
    public q07[] q = q07.a();
    public long r = 0;
    public String s = "";
    public boolean t = false;

    public m07() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        long j = this.a;
        int i = 0;
        int iH = j != 0 ? y43.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += y43.l(3, this.c);
        }
        if (!this.d.equals("")) {
            iH += y43.l(4, this.d);
        }
        if (!this.e.equals("")) {
            iH += y43.l(5, this.e);
        }
        long j2 = this.f;
        if (j2 != 0) {
            iH += y43.k(j2) + y43.m(6);
        }
        int i2 = this.g;
        if (i2 != 0) {
            iH += y43.f(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            iH += y43.f(8, i3);
        }
        if (this.i) {
            iH += y43.a(9);
        }
        if (this.j) {
            iH += y43.a(10);
        }
        if (this.k) {
            iH += y43.a(11);
        }
        long j3 = this.l;
        if (j3 != 0) {
            iH += y43.k(j3) + y43.m(12);
        }
        long j4 = this.m;
        if (j4 != 0) {
            iH += y43.h(13, j4);
        }
        if (!this.n.equals("")) {
            iH += y43.l(14, this.n);
        }
        if (!Arrays.equals(this.o, nd7.g)) {
            iH += y43.b(15, this.o);
        }
        if (!this.p.equals("")) {
            iH += y43.l(16, this.p);
        }
        q07[] q07VarArr = this.q;
        if (q07VarArr != null && q07VarArr.length > 0) {
            while (true) {
                q07[] q07VarArr2 = this.q;
                if (i >= q07VarArr2.length) {
                    break;
                }
                q07 q07Var = q07VarArr2[i];
                if (q07Var != null) {
                    iH = y43.i(17, q07Var) + iH;
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            iH += y43.h(18, j5);
        }
        if (!this.s.equals("")) {
            iH += y43.l(19, this.s);
        }
        return this.t ? iH + y43.a(20) : iH;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            switch (iS) {
                case 0:
                    break;
                case 8:
                    this.a = x43Var.q();
                    break;
                case 18:
                    this.b = x43Var.r();
                    break;
                case 26:
                    this.c = x43Var.r();
                    break;
                case 34:
                    this.d = x43Var.r();
                    break;
                case 42:
                    this.e = x43Var.r();
                    break;
                case 48:
                    this.f = x43Var.q();
                    break;
                case 56:
                    this.g = x43Var.p();
                    break;
                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                    this.h = x43Var.p();
                    break;
                case 72:
                    this.i = x43Var.f();
                    break;
                case 80:
                    this.j = x43Var.f();
                    break;
                case 88:
                    this.k = x43Var.f();
                    break;
                case 96:
                    this.l = x43Var.q();
                    break;
                case 104:
                    this.m = x43Var.q();
                    break;
                case 114:
                    this.n = x43Var.r();
                    break;
                case 122:
                    this.o = x43Var.g();
                    break;
                case 130:
                    this.p = x43Var.r();
                    break;
                case 138:
                    int iW = nd7.w(x43Var, 138);
                    q07[] q07VarArr = this.q;
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
                    this.q = q07VarArr2;
                    break;
                case 144:
                    this.r = x43Var.q();
                    break;
                case 154:
                    this.s = x43Var.r();
                    break;
                case 160:
                    this.t = x43Var.f();
                    break;
                default:
                    if (!x43Var.u(iS)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // defpackage.qw8
    public final void writeTo(y43 y43Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        long j = this.a;
        if (j != 0) {
            y43Var.x(1, j);
        }
        if (!this.b.equals("")) {
            y43Var.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43Var.E(3, this.c);
        }
        if (!this.d.equals("")) {
            y43Var.E(4, this.d);
        }
        if (!this.e.equals("")) {
            y43Var.E(5, this.e);
        }
        long j2 = this.f;
        int i = 0;
        if (j2 != 0) {
            y43Var.F(6, 0);
            y43Var.D(j2);
        }
        int i2 = this.g;
        if (i2 != 0) {
            y43Var.w(7, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            y43Var.w(8, i3);
        }
        boolean z = this.i;
        if (z) {
            y43Var.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            y43Var.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            y43Var.r(11, z3);
        }
        long j3 = this.l;
        if (j3 != 0) {
            y43Var.F(12, 0);
            y43Var.D(j3);
        }
        long j4 = this.m;
        if (j4 != 0) {
            y43Var.x(13, j4);
        }
        if (!this.n.equals("")) {
            y43Var.E(14, this.n);
        }
        if (!Arrays.equals(this.o, nd7.g)) {
            y43Var.s(15, this.o);
        }
        if (!this.p.equals("")) {
            y43Var.E(16, this.p);
        }
        q07[] q07VarArr = this.q;
        if (q07VarArr != null && q07VarArr.length > 0) {
            while (true) {
                q07[] q07VarArr2 = this.q;
                if (i >= q07VarArr2.length) {
                    break;
                }
                q07 q07Var = q07VarArr2[i];
                if (q07Var != null) {
                    y43Var.y(17, q07Var);
                }
                i++;
            }
        }
        long j5 = this.r;
        if (j5 != 0) {
            y43Var.x(18, j5);
        }
        if (!this.s.equals("")) {
            y43Var.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            y43Var.r(20, z4);
        }
    }
}

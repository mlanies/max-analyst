package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class ax5 extends qw8 {
    public static volatile ax5[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public ax5() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        long j = this.a;
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
        long j2 = this.e;
        if (j2 != 0) {
            iH += y43.h(5, j2);
        }
        if (!this.f.equals("")) {
            iH += y43.l(6, this.f);
        }
        if (!this.g.equals("")) {
            iH += y43.l(7, this.g);
        }
        return !this.h.equals("") ? iH + y43.l(8, this.h) : iH;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            if (iS == 0) {
                break;
            }
            if (iS == 8) {
                this.a = x43Var.q();
            } else if (iS == 18) {
                this.b = x43Var.r();
            } else if (iS == 26) {
                this.c = x43Var.r();
            } else if (iS == 34) {
                this.d = x43Var.r();
            } else if (iS == 40) {
                this.e = x43Var.q();
            } else if (iS == 50) {
                this.f = x43Var.r();
            } else if (iS == 58) {
                this.g = x43Var.r();
            } else if (iS == 66) {
                this.h = x43Var.r();
            } else if (!x43Var.u(iS)) {
                break;
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
        long j2 = this.e;
        if (j2 != 0) {
            y43Var.x(5, j2);
        }
        if (!this.f.equals("")) {
            y43Var.E(6, this.f);
        }
        if (!this.g.equals("")) {
            y43Var.E(7, this.g);
        }
        if (this.h.equals("")) {
            return;
        }
        y43Var.E(8, this.h);
    }
}

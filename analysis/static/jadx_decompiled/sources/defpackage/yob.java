package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes2.dex */
public final class yob extends qw8 {
    public String a;
    public String b;
    public String c;
    public uob d;
    public String e;
    public wob f;

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int iL = !this.a.equals("") ? y43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            iL += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iL += y43.l(3, this.c);
        }
        uob uobVar = this.d;
        if (uobVar != null) {
            iL += y43.i(4, uobVar);
        }
        if (!this.e.equals("")) {
            iL += y43.l(5, this.e);
        }
        wob wobVar = this.f;
        return wobVar != null ? iL + y43.i(6, wobVar) : iL;
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
            } else if (iS == 26) {
                this.c = x43Var.r();
            } else if (iS == 34) {
                if (this.d == null) {
                    uob uobVar = new uob();
                    uobVar.a = null;
                    uobVar.b = 0.0f;
                    uobVar.c = nd7.e;
                    uobVar.cachedSize = -1;
                    this.d = uobVar;
                }
                x43Var.j(this.d);
            } else if (iS == 42) {
                this.e = x43Var.r();
            } else if (iS == 50) {
                if (this.f == null) {
                    wob wobVar = new wob();
                    if (xob.f == null) {
                        synchronized (y37.b) {
                            try {
                                if (xob.f == null) {
                                    xob.f = new xob[0];
                                }
                            } finally {
                            }
                        }
                    }
                    wobVar.a = xob.f;
                    if (tob.c == null) {
                        synchronized (y37.b) {
                            try {
                                if (tob.c == null) {
                                    tob.c = new tob[0];
                                }
                            } finally {
                            }
                        }
                    }
                    wobVar.b = tob.c;
                    wobVar.c = null;
                    wobVar.d = false;
                    wobVar.cachedSize = -1;
                    this.f = wobVar;
                }
                x43Var.j(this.f);
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
        if (!this.c.equals("")) {
            y43Var.E(3, this.c);
        }
        uob uobVar = this.d;
        if (uobVar != null) {
            y43Var.y(4, uobVar);
        }
        if (!this.e.equals("")) {
            y43Var.E(5, this.e);
        }
        wob wobVar = this.f;
        if (wobVar != null) {
            y43Var.y(6, wobVar);
        }
    }
}

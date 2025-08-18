package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class bpb extends qw8 {
    public static volatile bpb[] o;
    public long a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public long g = 0;
    public String h = "";
    public int i = 0;
    public int[] j = nd7.c;
    public String k = "";
    public apb l = null;
    public yob m = null;
    public Protos.Attaches.Attach n = null;

    public bpb() {
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int[] iArr;
        long j = this.a;
        int i = 0;
        int iH = j != 0 ? y43.h(1, j) : 0;
        if (!this.b.equals("")) {
            iH += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            iH += y43.l(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            iH += y43.f(4, i2);
        }
        long j2 = this.e;
        if (j2 != 0) {
            iH += y43.h(5, j2);
        }
        if (!this.f.equals("")) {
            iH += y43.l(6, this.f);
        }
        long j3 = this.g;
        if (j3 != 0) {
            iH += y43.h(7, j3);
        }
        if (!this.h.equals("")) {
            iH += y43.l(8, this.h);
        }
        int i3 = this.i;
        if (i3 != 0) {
            iH += y43.f(9, i3);
        }
        int[] iArr2 = this.j;
        if (iArr2 != null && iArr2.length > 0) {
            int iG = 0;
            while (true) {
                iArr = this.j;
                if (i >= iArr.length) {
                    break;
                }
                iG += y43.g(iArr[i]);
                i++;
            }
            iH = iH + iG + iArr.length;
        }
        if (!this.k.equals("")) {
            iH += y43.l(12, this.k);
        }
        apb apbVar = this.l;
        if (apbVar != null) {
            iH += y43.i(13, apbVar);
        }
        yob yobVar = this.m;
        if (yobVar != null) {
            iH += y43.i(14, yobVar);
        }
        Protos.Attaches.Attach attach = this.n;
        return attach != null ? iH + y43.i(15, attach) : iH;
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
                case 32:
                    this.d = x43Var.p();
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    this.e = x43Var.q();
                    break;
                case 50:
                    this.f = x43Var.r();
                    break;
                case 56:
                    this.g = x43Var.q();
                    break;
                case 66:
                    this.h = x43Var.r();
                    break;
                case 72:
                    this.i = x43Var.p();
                    break;
                case 88:
                    int iW = nd7.w(x43Var, 88);
                    int[] iArr = this.j;
                    int length = iArr == null ? 0 : iArr.length;
                    int i = iW + length;
                    int[] iArr2 = new int[i];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i - 1) {
                        iArr2[length] = x43Var.p();
                        x43Var.s();
                        length++;
                    }
                    iArr2[length] = x43Var.p();
                    this.j = iArr2;
                    break;
                case 90:
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.p();
                        i2++;
                    }
                    x43Var.t(iC);
                    int[] iArr3 = this.j;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i3 = i2 + length2;
                    int[] iArr4 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        iArr4[length2] = x43Var.p();
                        length2++;
                    }
                    this.j = iArr4;
                    x43Var.d(iE);
                    break;
                case 98:
                    this.k = x43Var.r();
                    break;
                case 106:
                    if (this.l == null) {
                        apb apbVar = new apb();
                        apbVar.a = 0.0f;
                        apbVar.b = 0.0f;
                        apbVar.c = 0;
                        apbVar.d = false;
                        apbVar.cachedSize = -1;
                        this.l = apbVar;
                    }
                    x43Var.j(this.l);
                    break;
                case 114:
                    if (this.m == null) {
                        yob yobVar = new yob();
                        yobVar.a = "";
                        yobVar.b = "";
                        yobVar.c = "";
                        yobVar.d = null;
                        yobVar.e = "";
                        yobVar.f = null;
                        yobVar.cachedSize = -1;
                        this.m = yobVar;
                    }
                    x43Var.j(this.m);
                    break;
                case 122:
                    if (this.n == null) {
                        this.n = new Protos.Attaches.Attach();
                    }
                    x43Var.j(this.n);
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
        int i = this.d;
        if (i != 0) {
            y43Var.w(4, i);
        }
        long j2 = this.e;
        if (j2 != 0) {
            y43Var.x(5, j2);
        }
        if (!this.f.equals("")) {
            y43Var.E(6, this.f);
        }
        long j3 = this.g;
        if (j3 != 0) {
            y43Var.x(7, j3);
        }
        if (!this.h.equals("")) {
            y43Var.E(8, this.h);
        }
        int i2 = this.i;
        if (i2 != 0) {
            y43Var.w(9, i2);
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.j;
                if (i3 >= iArr2.length) {
                    break;
                }
                y43Var.w(11, iArr2[i3]);
                i3++;
            }
        }
        if (!this.k.equals("")) {
            y43Var.E(12, this.k);
        }
        apb apbVar = this.l;
        if (apbVar != null) {
            y43Var.y(13, apbVar);
        }
        yob yobVar = this.m;
        if (yobVar != null) {
            y43Var.y(14, yobVar);
        }
        Protos.Attaches.Attach attach = this.n;
        if (attach != null) {
            y43Var.y(15, attach);
        }
    }
}

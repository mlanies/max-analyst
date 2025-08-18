package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class dpb extends qw8 {
    public bpb[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public cpb[] f;
    public Protos.Attaches g;
    public long h;
    public Protos.MessageElements i;
    public boolean j;
    public long k;

    public dpb() {
        if (bpb.o == null) {
            synchronized (y37.b) {
                try {
                    if (bpb.o == null) {
                        bpb.o = new bpb[0];
                    }
                } finally {
                }
            }
        }
        this.a = bpb.o;
        this.b = "";
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        if (cpb.e == null) {
            synchronized (y37.b) {
                try {
                    if (cpb.e == null) {
                        cpb.e = new cpb[0];
                    }
                } finally {
                }
            }
        }
        this.f = cpb.e;
        this.g = null;
        this.h = 0L;
        this.i = null;
        this.j = false;
        this.k = 0L;
        this.cachedSize = -1;
    }

    @Override // defpackage.qw8
    public final int computeSerializedSize() {
        int iA;
        bpb[] bpbVarArr = this.a;
        int i = 0;
        if (bpbVarArr != null && bpbVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                bpb[] bpbVarArr2 = this.a;
                if (i2 >= bpbVarArr2.length) {
                    break;
                }
                bpb bpbVar = bpbVarArr2[i2];
                if (bpbVar != null) {
                    iA += y43.i(1, bpbVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        if (!this.b.equals("")) {
            iA += y43.l(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            iA += y43.h(3, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            iA += y43.h(4, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            iA += y43.h(5, j3);
        }
        cpb[] cpbVarArr = this.f;
        if (cpbVarArr != null && cpbVarArr.length > 0) {
            while (true) {
                cpb[] cpbVarArr2 = this.f;
                if (i >= cpbVarArr2.length) {
                    break;
                }
                cpb cpbVar = cpbVarArr2[i];
                if (cpbVar != null) {
                    iA = y43.i(6, cpbVar) + iA;
                }
                i++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            iA += y43.i(7, attaches);
        }
        long j4 = this.h;
        if (j4 != 0) {
            iA += y43.h(8, j4);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            iA += y43.i(9, messageElements);
        }
        if (this.j) {
            iA += y43.a(10);
        }
        long j5 = this.k;
        return j5 != 0 ? iA + y43.h(11, j5) : iA;
    }

    @Override // defpackage.qw8
    public final qw8 mergeFrom(x43 x43Var) throws InvalidProtocolBufferNanoException {
        while (true) {
            int iS = x43Var.s();
            switch (iS) {
                case 0:
                    break;
                case 10:
                    int iW = nd7.w(x43Var, 10);
                    bpb[] bpbVarArr = this.a;
                    int length = bpbVarArr == null ? 0 : bpbVarArr.length;
                    int i = iW + length;
                    bpb[] bpbVarArr2 = new bpb[i];
                    if (length != 0) {
                        System.arraycopy(bpbVarArr, 0, bpbVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bpb bpbVar = new bpb();
                        bpbVarArr2[length] = bpbVar;
                        x43Var.j(bpbVar);
                        x43Var.s();
                        length++;
                    }
                    bpb bpbVar2 = new bpb();
                    bpbVarArr2[length] = bpbVar2;
                    x43Var.j(bpbVar2);
                    this.a = bpbVarArr2;
                    break;
                case 18:
                    this.b = x43Var.r();
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    this.c = x43Var.q();
                    break;
                case 32:
                    this.d = x43Var.q();
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    this.e = x43Var.q();
                    break;
                case 50:
                    int iW2 = nd7.w(x43Var, 50);
                    cpb[] cpbVarArr = this.f;
                    int length2 = cpbVarArr == null ? 0 : cpbVarArr.length;
                    int i2 = iW2 + length2;
                    cpb[] cpbVarArr2 = new cpb[i2];
                    if (length2 != 0) {
                        System.arraycopy(cpbVarArr, 0, cpbVarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        cpb cpbVar = new cpb();
                        cpbVarArr2[length2] = cpbVar;
                        x43Var.j(cpbVar);
                        x43Var.s();
                        length2++;
                    }
                    cpb cpbVar2 = new cpb();
                    cpbVarArr2[length2] = cpbVar2;
                    x43Var.j(cpbVar2);
                    this.f = cpbVarArr2;
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new Protos.Attaches();
                    }
                    x43Var.j(this.g);
                    break;
                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                    this.h = x43Var.q();
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new Protos.MessageElements();
                    }
                    x43Var.j(this.i);
                    break;
                case 80:
                    this.j = x43Var.f();
                    break;
                case 88:
                    this.k = x43Var.q();
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
        bpb[] bpbVarArr = this.a;
        int i = 0;
        if (bpbVarArr != null && bpbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                bpb[] bpbVarArr2 = this.a;
                if (i2 >= bpbVarArr2.length) {
                    break;
                }
                bpb bpbVar = bpbVarArr2[i2];
                if (bpbVar != null) {
                    y43Var.y(1, bpbVar);
                }
                i2++;
            }
        }
        if (!this.b.equals("")) {
            y43Var.E(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            y43Var.x(3, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            y43Var.x(4, j2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            y43Var.x(5, j3);
        }
        cpb[] cpbVarArr = this.f;
        if (cpbVarArr != null && cpbVarArr.length > 0) {
            while (true) {
                cpb[] cpbVarArr2 = this.f;
                if (i >= cpbVarArr2.length) {
                    break;
                }
                cpb cpbVar = cpbVarArr2[i];
                if (cpbVar != null) {
                    y43Var.y(6, cpbVar);
                }
                i++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            y43Var.y(7, attaches);
        }
        long j4 = this.h;
        if (j4 != 0) {
            y43Var.x(8, j4);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            y43Var.y(9, messageElements);
        }
        boolean z = this.j;
        if (z) {
            y43Var.r(10, z);
        }
        long j5 = this.k;
        if (j5 != 0) {
            y43Var.x(11, j5);
        }
    }
}

package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class be7 implements cw4 {
    public final String a;
    public final yaf b;
    public final s02 c;
    public xze d;
    public String e;
    public oy5 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public be7(String str) {
        this.a = str;
        yaf yafVar = new yaf(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.b = yafVar;
        byte[] bArr = yafVar.a;
        this.c = new s02(bArr, bArr.length, 1, (byte) 0);
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.cw4
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // defpackage.cw4
    public final void f(yaf yafVar) throws ParserException {
        int i;
        boolean zH;
        np8.g(this.d);
        while (yafVar.c() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    yaf yafVar2 = this.b;
                    s02 s02Var = this.c;
                    if (i2 == 2) {
                        int iV = ((this.j & (-225)) << 8) | yafVar.v();
                        this.i = iV;
                        if (iV > yafVar2.a.length) {
                            yafVar2.E(iV);
                            byte[] bArr = yafVar2.a;
                            s02Var.getClass();
                            s02Var.o(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(yafVar.c(), this.i - this.h);
                        yafVar.g(this.h, s02Var.b, iMin);
                        int i3 = this.h + iMin;
                        this.h = i3;
                        if (i3 == this.i) {
                            s02Var.q(0);
                            if (s02Var.h()) {
                                if (this.l) {
                                }
                                this.g = 0;
                            } else {
                                this.l = true;
                                int i4 = s02Var.i(1);
                                int i5 = i4 == 1 ? s02Var.i(1) : 0;
                                this.m = i5;
                                if (i5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 1) {
                                    s02Var.i((s02Var.i(2) + 1) * 8);
                                }
                                if (!s02Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.n = s02Var.i(6);
                                int i6 = s02Var.i(4);
                                int i7 = s02Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = s02Var.g();
                                    int iB = s02Var.b();
                                    e eVarJ = z7.J(s02Var, true);
                                    this.u = eVarJ.c;
                                    this.r = eVarJ.a;
                                    this.t = eVarJ.b;
                                    int iB2 = iB - s02Var.b();
                                    s02Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    s02Var.j(iB2, bArr2);
                                    my5 my5Var = new my5();
                                    my5Var.a = this.e;
                                    my5Var.k = "audio/mp4a-latm";
                                    my5Var.h = this.u;
                                    my5Var.x = this.t;
                                    my5Var.y = this.r;
                                    my5Var.m = Collections.singletonList(bArr2);
                                    my5Var.c = this.a;
                                    oy5 oy5Var = new oy5(my5Var);
                                    if (!oy5Var.equals(this.f)) {
                                        this.f = oy5Var;
                                        this.s = 1024000000 / oy5Var.K0;
                                        this.d.d(oy5Var);
                                    }
                                } else {
                                    int iB3 = s02Var.b();
                                    e eVarJ2 = z7.J(s02Var, true);
                                    this.u = eVarJ2.c;
                                    this.r = eVarJ2.a;
                                    this.t = eVarJ2.b;
                                    s02Var.t(s02Var.i((s02Var.i(2) + 1) * 8) - (iB3 - s02Var.b()));
                                }
                                int i8 = s02Var.i(3);
                                this.o = i8;
                                if (i8 == 0) {
                                    s02Var.t(8);
                                } else if (i8 == 1) {
                                    s02Var.t(9);
                                } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                                    s02Var.t(6);
                                } else {
                                    if (i8 != 6 && i8 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    s02Var.t(1);
                                }
                                boolean zH2 = s02Var.h();
                                this.p = zH2;
                                this.q = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.q = s02Var.i((s02Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = s02Var.h();
                                            this.q = (this.q << 8) + s02Var.i(8);
                                        } while (zH);
                                    }
                                }
                                if (s02Var.h()) {
                                    s02Var.t(8);
                                }
                            }
                            if (this.m != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i9 = 0;
                            do {
                                i = s02Var.i(8);
                                i9 += i;
                            } while (i == 255);
                            int iG2 = s02Var.g();
                            if ((iG2 & 7) == 0) {
                                yafVar2.H(iG2 >> 3);
                            } else {
                                s02Var.j(i9 * 8, yafVar2.a);
                                yafVar2.H(0);
                            }
                            this.d.c(i9, yafVar2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.b(j, 1, i9, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                s02Var.t((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iV2 = yafVar.v();
                    if ((iV2 & 224) == 224) {
                        this.j = iV2;
                        this.g = 2;
                    } else if (iV2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (yafVar.v() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // defpackage.cw4
    public final void h() {
    }

    @Override // defpackage.cw4
    public final void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.d = oa5Var.B(l3fVar.e, 1);
        l3fVar.b();
        this.e = l3fVar.f;
    }
}

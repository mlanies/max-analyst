package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class ce7 implements dw4 {
    public final String a;
    public final int b;
    public final wpa c;
    public final s02 d;
    public yze e;
    public String f;
    public qy5 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public ce7(String str, int i) {
        this.a = str;
        this.b = i;
        wpa wpaVar = new wpa(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.c = wpaVar;
        byte[] bArr = wpaVar.a;
        this.d = new s02(bArr, bArr.length, 2, (byte) 0);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.dw4
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.dw4
    public final void d(wpa wpaVar) throws ParserException {
        int i;
        int i2;
        boolean zH;
        fm9.l(this.e);
        while (wpaVar.a() > 0) {
            int i3 = this.h;
            if (i3 != 0) {
                if (i3 != 1) {
                    wpa wpaVar2 = this.c;
                    s02 s02Var = this.d;
                    if (i3 == 2) {
                        int iU = ((this.k & (-225)) << 8) | wpaVar.u();
                        this.j = iU;
                        if (iU > wpaVar2.a.length) {
                            wpaVar2.D(iU);
                            byte[] bArr = wpaVar2.a;
                            s02Var.getClass();
                            s02Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(wpaVar.a(), this.j - this.i);
                        wpaVar.e(this.i, s02Var.b, iMin);
                        int i4 = this.i + iMin;
                        this.i = i4;
                        if (i4 == this.j) {
                            s02Var.q(0);
                            if (s02Var.h()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int i5 = s02Var.i(1);
                                int i6 = i5 == 1 ? s02Var.i(1) : 0;
                                this.n = i6;
                                if (i6 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i5 == 1) {
                                    s02Var.i((s02Var.i(2) + 1) * 8);
                                }
                                if (!s02Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = s02Var.i(6);
                                int i7 = s02Var.i(4);
                                int i8 = s02Var.i(3);
                                if (i7 != 0 || i8 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i5 == 0) {
                                    int iG = s02Var.g();
                                    int iB = s02Var.b();
                                    e eVarS = kp.s(s02Var, true);
                                    this.v = eVarS.c;
                                    this.s = eVarS.a;
                                    this.u = eVarS.b;
                                    int iB2 = iB - s02Var.b();
                                    s02Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    s02Var.j(iB2, bArr2);
                                    ny5 ny5Var = new ny5();
                                    ny5Var.a = this.f;
                                    ny5Var.m = ia9.l("audio/mp4a-latm");
                                    ny5Var.i = this.v;
                                    ny5Var.A = this.u;
                                    ny5Var.B = this.s;
                                    ny5Var.p = Collections.singletonList(bArr2);
                                    ny5Var.d = this.a;
                                    ny5Var.f = this.b;
                                    qy5 qy5Var = new qy5(ny5Var);
                                    if (!qy5Var.equals(this.g)) {
                                        this.g = qy5Var;
                                        this.t = 1024000000 / qy5Var.C;
                                        this.e.e(qy5Var);
                                    }
                                } else {
                                    int iB3 = s02Var.b();
                                    e eVarS2 = kp.s(s02Var, true);
                                    this.v = eVarS2.c;
                                    this.s = eVarS2.a;
                                    this.u = eVarS2.b;
                                    s02Var.t(s02Var.i((s02Var.i(2) + 1) * 8) - (iB3 - s02Var.b()));
                                }
                                int i9 = s02Var.i(3);
                                this.p = i9;
                                if (i9 == 0) {
                                    s02Var.t(8);
                                } else if (i9 == 1) {
                                    s02Var.t(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    s02Var.t(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    s02Var.t(1);
                                }
                                boolean zH2 = s02Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i5 == 1) {
                                        this.r = s02Var.i((s02Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = s02Var.h();
                                            this.r = (this.r << 8) + s02Var.i(8);
                                        } while (zH);
                                    }
                                }
                                if (s02Var.h()) {
                                    s02Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = s02Var.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = s02Var.g();
                            if ((iG2 & 7) == 0) {
                                wpaVar2.G(iG2 >> 3);
                                i2 = 0;
                            } else {
                                s02Var.j(i10 * 8, wpaVar2.a);
                                i2 = 0;
                                wpaVar2.G(0);
                            }
                            this.e.b(wpaVar2, i10, i2);
                            fm9.k(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i10, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                s02Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = wpaVar.u();
                    if ((iU2 & 224) == 224) {
                        this.k = iU2;
                        this.h = 2;
                    } else if (iU2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (wpaVar.u() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.dw4
    public final void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.e = pa5Var.mo6B(l3fVar.e, 1);
        l3fVar.b();
        this.f = l3fVar.f;
    }
}

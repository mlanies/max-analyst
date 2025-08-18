package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m2a {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public m2a(vbg vbgVar, xag xagVar) {
        this.a = 2;
        this.f = vbgVar;
        this.b = xagVar.c;
        this.d |= (xagVar.a & 4) != 0;
        if ((xagVar.a & 4) != 0) {
            this.e = new ByteArrayOutputStream(600000);
        } else {
            this.e = new ByteArrayOutputStream(34000);
        }
        while (true) {
            ByteBuffer byteBuffer = xagVar.e;
            int iMin = Math.min(byteBuffer.remaining(), ((vbg) this.f).c.length);
            if (iMin == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((vbg) this.f).c, 0, iMin);
                ((ByteArrayOutputStream) this.e).write(((vbg) this.f).c, 0, iMin);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                int i4 = 0;
                this.c = 0;
                do {
                    int i5 = this.c;
                    int i6 = i + i5;
                    n2a n2aVar = (n2a) this.e;
                    if (i6 < n2aVar.c) {
                        int[] iArr = n2aVar.f;
                        this.c = i5 + 1;
                        i2 = iArr[i5 + i];
                        i4 += i2;
                    }
                    return i4;
                } while (i2 == 255);
                return i4;
            default:
                int i7 = 0;
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    n2a n2aVar2 = (n2a) this.e;
                    if (i9 < n2aVar2.c) {
                        int[] iArr2 = n2aVar2.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i8 + i];
                        i7 += i3;
                    }
                    return i7;
                } while (i3 == 255);
                return i7;
        }
    }

    public boolean b(ra4 ra4Var) {
        int i;
        np8.f(ra4Var != null);
        boolean z = this.d;
        yaf yafVar = (yaf) this.f;
        if (z) {
            this.d = false;
            yafVar.E(0);
        }
        while (!this.d) {
            int i2 = this.b;
            n2a n2aVar = (n2a) this.e;
            if (i2 < 0) {
                if (n2aVar.c(ra4Var, -1L) && n2aVar.a(ra4Var, true)) {
                    int iA = n2aVar.d;
                    if ((n2aVar.a & 1) == 1 && yafVar.c == 0) {
                        iA += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        ra4Var.z(iA);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.b);
            int i3 = this.b + this.c;
            if (iA2 > 0) {
                yafVar.d(yafVar.c + iA2);
                try {
                    ra4Var.h(yafVar.a, yafVar.c, iA2, false);
                    yafVar.G(yafVar.c + iA2);
                    this.d = n2aVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == n2aVar.c) {
                i3 = -1;
            }
            this.b = i3;
        }
        return true;
    }

    public boolean c(sa4 sa4Var) {
        int i;
        fm9.k(sa4Var != null);
        boolean z = this.d;
        wpa wpaVar = (wpa) this.f;
        if (z) {
            this.d = false;
            wpaVar.D(0);
        }
        while (!this.d) {
            int i2 = this.b;
            n2a n2aVar = (n2a) this.e;
            if (i2 < 0) {
                if (n2aVar.d(sa4Var, -1L) && n2aVar.b(sa4Var, true)) {
                    int iA = n2aVar.d;
                    if ((n2aVar.a & 1) == 1 && wpaVar.c == 0) {
                        iA += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        sa4Var.z(iA);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.b);
            int i3 = this.b + this.c;
            if (iA2 > 0) {
                wpaVar.b(wpaVar.c + iA2);
                try {
                    sa4Var.h(wpaVar.a, wpaVar.c, iA2, false);
                    wpaVar.F(wpaVar.c + iA2);
                    this.d = n2aVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == n2aVar.c) {
                i3 = -1;
            }
            this.b = i3;
        }
        return true;
    }

    public m2a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new n2a(1);
                this.f = new wpa(0, new byte[65025]);
                this.b = -1;
                break;
            default:
                this.e = new n2a(0);
                this.f = new yaf(0, new byte[65025]);
                this.b = -1;
                break;
        }
    }
}

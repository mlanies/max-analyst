package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class py {
    public final /* synthetic */ int a = 1;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public py(yaf yafVar, yaf yafVar2, boolean z) throws ParserException {
        this.j = yafVar;
        this.i = yafVar2;
        this.f = z;
        yafVar2.H(12);
        this.b = yafVar2.y();
        yafVar.H(12);
        this.h = yafVar.y();
        dy7.k("first_chunk must be 1", yafVar.h() == 1);
        this.c = -1;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                int i = this.c + 1;
                this.c = i;
                if (i != this.b) {
                    boolean z = this.f;
                    yaf yafVar = (yaf) this.i;
                    this.e = z ? yafVar.z() : yafVar.w();
                    if (this.c == this.g) {
                        yaf yafVar2 = (yaf) this.j;
                        this.d = yafVar2.y();
                        yafVar2.I(4);
                        int i2 = this.h - 1;
                        this.h = i2;
                        this.g = i2 > 0 ? yafVar2.y() - 1 : -1;
                        break;
                    }
                }
                break;
            default:
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 != this.b) {
                    boolean z2 = this.f;
                    wpa wpaVar = (wpa) this.i;
                    this.e = z2 ? wpaVar.z() : wpaVar.w();
                    if (this.c == this.g) {
                        wpa wpaVar2 = (wpa) this.j;
                        this.d = wpaVar2.y();
                        wpaVar2.H(4);
                        int i4 = this.h - 1;
                        this.h = i4;
                        this.g = i4 > 0 ? wpaVar2.y() - 1 : -1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public py(wpa wpaVar, wpa wpaVar2, boolean z) throws androidx.media3.common.ParserException {
        this.j = wpaVar;
        this.i = wpaVar2;
        this.f = z;
        wpaVar2.G(12);
        this.b = wpaVar2.y();
        wpaVar.G(12);
        this.h = wpaVar.y();
        lz7.f("first_chunk must be 1", wpaVar.g() == 1);
        this.c = -1;
    }
}

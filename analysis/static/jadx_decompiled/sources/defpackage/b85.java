package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class b85 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public b85(a3b a3bVar) {
        this.f = a3bVar;
    }

    public void a() {
        this.c = this.d ? ((ga7) this.f).h() : ((ga7) this.f).m();
    }

    public void b(View view, int i) {
        if (this.d) {
            this.c = ((ga7) this.f).o() + ((ga7) this.f).c(view);
        } else {
            this.c = ((ga7) this.f).f(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int iO = ((ga7) this.f).o();
        if (iO >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (!this.d) {
            int iF = ((ga7) this.f).f(view);
            int iM = iF - ((ga7) this.f).m();
            this.c = iF;
            if (iM > 0) {
                int iH = (((ga7) this.f).h() - Math.min(0, (((ga7) this.f).h() - iO) - ((ga7) this.f).c(view))) - (((ga7) this.f).d(view) + iF);
                if (iH < 0) {
                    this.c -= Math.min(iM, -iH);
                    return;
                }
                return;
            }
            return;
        }
        int iH2 = (((ga7) this.f).h() - iO) - ((ga7) this.f).c(view);
        this.c = ((ga7) this.f).h() - iH2;
        if (iH2 > 0) {
            int iD = this.c - ((ga7) this.f).d(view);
            int iM2 = ((ga7) this.f).m();
            int iMin = iD - (Math.min(((ga7) this.f).f(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(iH2, -iMin) + this.c;
            }
        }
    }

    public void d(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void e() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public b85() {
        e();
    }
}

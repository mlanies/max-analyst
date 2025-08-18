package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class bna extends ga7 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bna(a aVar, int i) {
        super(aVar);
        this.d = i;
    }

    @Override // defpackage.ga7
    public final int c(View view) {
        switch (this.d) {
            case 0:
                pdc pdcVar = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.E(view) + ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin;
            default:
                pdc pdcVar2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.z(view) + ((ViewGroup.MarginLayoutParams) pdcVar2).bottomMargin;
        }
    }

    @Override // defpackage.ga7
    public final int d(View view) {
        switch (this.d) {
            case 0:
                pdc pdcVar = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin + ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin;
            default:
                pdc pdcVar2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + ((ViewGroup.MarginLayoutParams) pdcVar2).topMargin + ((ViewGroup.MarginLayoutParams) pdcVar2).bottomMargin;
        }
    }

    @Override // defpackage.ga7
    public final int e(View view) {
        switch (this.d) {
            case 0:
                pdc pdcVar = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + ((ViewGroup.MarginLayoutParams) pdcVar).topMargin + ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin;
            default:
                pdc pdcVar2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + ((ViewGroup.MarginLayoutParams) pdcVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pdcVar2).rightMargin;
        }
    }

    @Override // defpackage.ga7
    public final int f(View view) {
        switch (this.d) {
            case 0:
                pdc pdcVar = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.B(view) - ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin;
            default:
                pdc pdcVar2 = (pdc) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.F(view) - ((ViewGroup.MarginLayoutParams) pdcVar2).topMargin;
        }
    }

    @Override // defpackage.ga7
    public final int g() {
        switch (this.d) {
            case 0:
                return ((a) this.b).n;
            default:
                return ((a) this.b).o;
        }
    }

    @Override // defpackage.ga7
    public final int h() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return aVar.n - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return aVar2.o - aVar2.I();
        }
    }

    @Override // defpackage.ga7
    public final int i() {
        switch (this.d) {
            case 0:
                return ((a) this.b).K();
            default:
                return ((a) this.b).I();
        }
    }

    @Override // defpackage.ga7
    public final int j() {
        switch (this.d) {
            case 0:
                return ((a) this.b).l;
            default:
                return ((a) this.b).m;
        }
    }

    @Override // defpackage.ga7
    public final int k() {
        switch (this.d) {
            case 0:
                return ((a) this.b).m;
            default:
                return ((a) this.b).l;
        }
    }

    @Override // defpackage.ga7
    public final int m() {
        switch (this.d) {
            case 0:
                return ((a) this.b).J();
            default:
                return ((a) this.b).L();
        }
    }

    @Override // defpackage.ga7
    public final int n() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return (aVar.n - aVar.J()) - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return (aVar2.o - aVar2.L()) - aVar2.I();
        }
    }

    @Override // defpackage.ga7
    public final int p(View view) {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                Rect rect = (Rect) this.c;
                aVar.P(rect, view);
                return rect.right;
            default:
                a aVar2 = (a) this.b;
                Rect rect2 = (Rect) this.c;
                aVar2.P(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.ga7
    public final int q(View view) {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                Rect rect = (Rect) this.c;
                aVar.P(rect, view);
                return rect.left;
            default:
                a aVar2 = (a) this.b;
                Rect rect2 = (Rect) this.c;
                aVar2.P(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.ga7
    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((a) this.b).T(i);
                break;
            default:
                ((a) this.b).U(i);
                break;
        }
    }
}

package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public class g34 extends rdc {
    public RecyclerView a;
    public Scroller b;
    public final hud c = new hud(this);
    public final /* synthetic */ int d;
    public bna e;
    public bna f;

    public g34(int i) {
        this.d = i;
    }

    public static int e(View view, ga7 ga7Var) {
        return ((ga7Var.d(view) / 2) + ga7Var.f(view)) - ((ga7Var.n() / 2) + ga7Var.m());
    }

    public static View g(a aVar, ga7 ga7Var) {
        int iW = aVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iN = (ga7Var.n() / 2) + ga7Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = aVar.v(i2);
            int iAbs = Math.abs(((ga7Var.d(viewV) / 2) + ga7Var.f(viewV)) - iN);
            if (iAbs < i) {
                view = viewV;
                i = iAbs;
            }
        }
        return view;
    }

    public static View h(a aVar, ga7 ga7Var) {
        int iW = aVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iN = (ga7Var.n() / 2) + ga7Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = aVar.v(i2);
            int iAbs = Math.abs(((ga7Var.d(viewV) / 2) + ga7Var.f(viewV)) - iN);
            if (iAbs < i) {
                view = viewV;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        hud hudVar = this.c;
        if (recyclerView2 != null) {
            recyclerView2.s0(hudVar);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.m(hudVar);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            o();
        }
    }

    public final int[] b(a aVar, View view) {
        switch (this.d) {
            case 0:
                int[] iArr = new int[2];
                if (aVar.e()) {
                    ga7 ga7VarK = k(aVar);
                    iArr[0] = ((ga7VarK.d(view) / 2) + ga7VarK.f(view)) - ((ga7VarK.n() / 2) + ga7VarK.m());
                } else {
                    iArr[0] = 0;
                }
                if (aVar.f()) {
                    ga7 ga7VarM = m(aVar);
                    iArr[1] = ((ga7VarM.d(view) / 2) + ga7VarM.f(view)) - ((ga7VarM.n() / 2) + ga7VarM.m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (aVar.e()) {
                    iArr2[0] = e(view, l(aVar));
                } else {
                    iArr2[0] = 0;
                }
                if (aVar.f()) {
                    iArr2[1] = e(view, n(aVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public yh7 c(a aVar) {
        switch (this.d) {
            case 1:
                if (aVar instanceof ydc) {
                    return new vz1(this, this.a.getContext(), 1);
                }
                return null;
            default:
                return d(aVar);
        }
    }

    public final yh7 d(a aVar) {
        if (aVar instanceof ydc) {
            return new vz1(this, this.a.getContext(), 2);
        }
        return null;
    }

    public int f(a aVar, ga7 ga7Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iW = aVar.w();
        float f = 1.0f;
        if (iW != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iW; i5++) {
                View viewV = aVar.v(i5);
                int iM = a.M(viewV);
                if (iM != -1) {
                    if (iM < i4) {
                        view = viewV;
                        i4 = iM;
                    }
                    if (iM > i3) {
                        view2 = viewV;
                        i3 = iM;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(ga7Var.c(view), ga7Var.c(view2)) - Math.min(ga7Var.f(view), ga7Var.f(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    public View i(a aVar) {
        switch (this.d) {
            case 0:
                if (aVar instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aVar;
                    if (linearLayoutManager.T0() == 0 || linearLayoutManager.X0() == linearLayoutManager.G() - 1) {
                        return null;
                    }
                }
                if (aVar.f()) {
                    return g(aVar, m(aVar));
                }
                if (aVar.e()) {
                    return g(aVar, k(aVar));
                }
                return null;
            default:
                if (aVar.f()) {
                    return h(aVar, n(aVar));
                }
                if (aVar.e()) {
                    return h(aVar, l(aVar));
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(a aVar, int i, int i2) {
        int iG;
        View viewI;
        int iM;
        int i3;
        PointF pointFA;
        int iF;
        int iF2;
        PointF pointFA2;
        switch (this.d) {
            case 0:
                if (!(aVar instanceof ydc) || (iG = aVar.G()) == 0 || (viewI = i(aVar)) == null || (iM = a.M(viewI)) == -1 || (pointFA = ((ydc) aVar).a(iG - 1)) == null) {
                    return -1;
                }
                if (aVar.e()) {
                    iF = f(aVar, k(aVar), i, 0);
                    if (pointFA.x < 0.0f) {
                        iF = -iF;
                    }
                } else {
                    iF = 0;
                }
                if (aVar.f()) {
                    iF2 = f(aVar, m(aVar), 0, i2);
                    if (pointFA.y < 0.0f) {
                        iF2 = -iF2;
                    }
                } else {
                    iF2 = 0;
                }
                if (aVar.f()) {
                    iF = iF2;
                }
                if (iF == 0) {
                    return -1;
                }
                int i4 = iM + iF;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= iG ? i3 : i5;
            default:
                int iG2 = aVar.G();
                if (iG2 == 0) {
                    return -1;
                }
                View view = null;
                ga7 ga7VarN = aVar.f() ? n(aVar) : aVar.e() ? l(aVar) : null;
                if (ga7VarN == null) {
                    return -1;
                }
                int iW = aVar.w();
                boolean z = false;
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i8 = 0; i8 < iW; i8++) {
                    View viewV = aVar.v(i8);
                    if (viewV != null) {
                        int iE = e(viewV, ga7VarN);
                        if (iE <= 0 && iE > i7) {
                            view2 = viewV;
                            i7 = iE;
                        }
                        if (iE >= 0 && iE < i6) {
                            view = viewV;
                            i6 = iE;
                        }
                    }
                }
                boolean z2 = !aVar.e() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return a.M(view);
                }
                if (!z2 && view2 != null) {
                    return a.M(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int iM2 = a.M(view);
                int iG3 = aVar.G();
                if ((aVar instanceof ydc) && (pointFA2 = ((ydc) aVar).a(iG3 - 1)) != null && (pointFA2.x < 0.0f || pointFA2.y < 0.0f)) {
                    z = true;
                }
                int i9 = iM2 + (z == z2 ? -1 : 1);
                if (i9 < 0 || i9 >= iG2) {
                    return -1;
                }
                return i9;
        }
    }

    public ga7 k(a aVar) {
        bna bnaVar = this.f;
        if (bnaVar == null || ((a) bnaVar.b) != aVar) {
            this.f = new bna(aVar, 0);
        }
        return this.f;
    }

    public ga7 l(a aVar) {
        bna bnaVar = this.f;
        if (bnaVar == null || ((a) bnaVar.b) != aVar) {
            this.f = new bna(aVar, 0);
        }
        return this.f;
    }

    public ga7 m(a aVar) {
        bna bnaVar = this.e;
        if (bnaVar == null || ((a) bnaVar.b) != aVar) {
            this.e = new bna(aVar, 1);
        }
        return this.e;
    }

    public ga7 n(a aVar) {
        bna bnaVar = this.e;
        if (bnaVar == null || ((a) bnaVar.b) != aVar) {
            this.e = new bna(aVar, 1);
        }
        return this.e;
    }

    public final void o() {
        a layoutManager;
        View viewI;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewI = i(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewI);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.A0(i, iArrB[1], false);
    }
}

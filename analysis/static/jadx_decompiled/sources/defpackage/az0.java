package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class az0 extends hqd {
    public final /* synthetic */ int F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az0(View view, int i) {
        super(view);
        this.F0 = i;
    }

    private final void F(ol7 ol7Var) {
    }

    private final void G(ol7 ol7Var) {
    }

    private final void H(ol7 ol7Var) {
    }

    private final void I(ol7 ol7Var) {
    }

    private final void J(ol7 ol7Var) {
    }

    private final void K(ol7 ol7Var) {
    }

    private final void L(ol7 ol7Var) {
    }

    private final void M(ol7 ol7Var) {
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        switch (this.F0) {
            case 0:
                if (ol7Var instanceof g01) {
                    View view = this.a;
                    ((TextView) view).setText(((g01) ol7Var).a.b(((TextView) view).getContext()));
                    break;
                }
                break;
            case 1:
                if (ol7Var instanceof f01) {
                    View view2 = this.a;
                    ((TextView) view2).setText(((f01) ol7Var).a.b(((TextView) view2).getContext()));
                    break;
                }
                break;
            case 2:
                ((h71) this.a).setOpponents(((qd1) ol7Var).b);
                break;
            case 4:
                break;
            case 5:
                E((sd1) ol7Var);
                break;
            case 6:
                View view3 = this.a;
                fy2 fy2Var = (fy2) view3;
                if (fy2Var.b == null) {
                    ey2 ey2Var = new ey2();
                    fy2Var.c.c(ey2Var);
                    fy2Var.b = ey2Var;
                }
                view3.requestLayout();
                view3.invalidate();
                break;
            case 7:
                EmptySearchView emptySearchView = (EmptySearchView) this.a;
                emptySearchView.setTitle(yoc.d0);
                emptySearchView.setDescription(yoc.c0);
                emptySearchView.setIsButtonVisible(false);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (ol7Var instanceof b1d) {
                    View view4 = this.a;
                    ((TextView) view4).setText(((b1d) ol7Var).a.b(((TextView) view4).getContext()));
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                if (ol7Var instanceof u0d) {
                    View view5 = this.a;
                    ((TextView) view5).setText(((u0d) ol7Var).a.b(((TextView) view5).getContext()));
                    break;
                }
                break;
            case 16:
                if (ol7Var instanceof j1d) {
                    View view6 = this.a;
                    ((TextView) view6).setText(((j1d) ol7Var).a.b(((TextView) view6).getContext()));
                    break;
                }
                break;
            case 19:
                if (ol7Var instanceof t0d) {
                    View view7 = this.a;
                    ((TextView) view7).setText(((t0d) ol7Var).a.b(((TextView) view7).getContext()));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hqd
    public void B(ol7 ol7Var, Object obj) {
        switch (this.F0) {
            case 2:
                qd1 qd1Var = (qd1) ol7Var;
                pd1 pd1Var = obj instanceof pd1 ? (pd1) obj : null;
                View view = this.a;
                if (pd1Var == null) {
                    ((h71) view).setOpponents(qd1Var.b);
                    break;
                } else if (((BitSet) pd1Var.b).get(0)) {
                    ((h71) view).setOpponents(qd1Var.b);
                    break;
                }
                break;
            case 5:
                sd1 sd1Var = (sd1) ol7Var;
                rd1 rd1Var = obj instanceof rd1 ? (rd1) obj : null;
                if (rd1Var == null) {
                    E(sd1Var);
                    break;
                } else {
                    BitSet bitSet = (BitSet) rd1Var.b;
                    boolean z = bitSet.get(0);
                    View view2 = this.a;
                    if (z) {
                        ak1 ak1Var = sd1Var.c;
                        view2.setVisibility(ak1Var.a() ? 0 : 8);
                        yl1 yl1Var = (yl1) view2;
                        boolean z2 = yl1Var.H0;
                        boolean z3 = ak1Var.e;
                        if (z2 != z3) {
                            yl1Var.H0 = z3;
                            yl1Var.I0.setEndView(new ffd(z3, true));
                        }
                    }
                    if (bitSet.get(1)) {
                        ((yl1) view2).setTitle(sd1Var.b);
                        break;
                    }
                }
                break;
            default:
                super.B(ol7Var, obj);
                break;
        }
    }

    @Override // defpackage.hqd
    public void D() {
        switch (this.F0) {
            case 6:
                fy2 fy2Var = (fy2) this.a;
                ey2 ey2Var = fy2Var.b;
                if (ey2Var != null) {
                    fy2Var.c.f(ey2Var);
                }
                fy2Var.b = null;
                break;
        }
    }

    public void E(sd1 sd1Var) {
        ak1 ak1Var = sd1Var.c;
        int i = ak1Var.a() ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        yl1 yl1Var = (yl1) view;
        boolean z = yl1Var.H0;
        boolean z2 = ak1Var.e;
        if (z != z2) {
            yl1Var.H0 = z2;
            yl1Var.I0.setEndView(new ffd(z2, true));
        }
        yl1Var.setTitle(sd1Var.b);
    }
}

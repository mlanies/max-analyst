package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class e6b extends nd7 {
    public int k;
    public final /* synthetic */ f6b l;

    public e6b(f6b f6bVar) {
        this.l = f6bVar;
    }

    @Override // defpackage.nd7
    public final void J(View view, int i, int i2) {
        float f;
        int i3;
        f6b f6bVar = this.l;
        f6bVar.getHalfExpandedViewHelper().a(i2);
        z5b callback = f6bVar.getCallback();
        if (callback == null) {
            return;
        }
        if (f6bVar.t0.a == 2 && f6bVar.getScrollState() == d6b.a) {
            int iE = callback.e();
            if (f6bVar.getStackFromBottom()) {
                int i4 = this.k;
                f = i2 - i4;
                i3 = iE - i4;
            } else {
                int i5 = this.k;
                f = i5 - i2;
                i3 = i5 - iE;
            }
            f6bVar.setBackgroundAlpha(1 - Math.abs(f / i3));
            if (f6bVar.getStackFromBottom() && i2 >= iE) {
                callback.h();
            }
            if (!f6bVar.getStackFromBottom() && i2 <= iE) {
                callback.h();
            }
        }
        callback.m(i2);
    }

    @Override // defpackage.nd7
    public final void K(View view, float f, float f2) {
        d6b scrollState;
        this.k = view.getTop();
        f6b f6bVar = this.l;
        z5b callback = f6bVar.getCallback();
        if (callback == null) {
            return;
        }
        double d = f2;
        if (Math.abs(d) > 200.0d) {
            if (Math.abs(d) < 8000.0d) {
                int iB = callback.b();
                if (iB == 0) {
                    throw null;
                }
                int i = a6b.$EnumSwitchMapping$0[au1.s(iB)];
                if (i == 1) {
                    scrollState = f6bVar.getStackFromBottom() ? this.k < callback.c() ? f2 > 0.0f ? d6b.b : d6b.c : f2 > 0.0f ? d6b.a : d6b.b : this.k > callback.c() ? f2 < 0.0f ? d6b.b : d6b.c : f2 < 0.0f ? d6b.a : d6b.b;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    scrollState = f6bVar.getScrollState();
                }
            } else {
                scrollState = f6bVar.getStackFromBottom() ? f2 > 0.0f ? d6b.a : d6b.c : f2 < 0.0f ? d6b.a : d6b.c;
            }
        } else if (f6bVar.getStackFromBottom()) {
            if (this.k < callback.c() / 2) {
                scrollState = d6b.c;
            } else {
                scrollState = this.k > ((callback.e() - callback.c()) / 2) + callback.c() ? d6b.a : d6b.b;
            }
        } else if (this.k > callback.c() / 2) {
            scrollState = d6b.c;
        } else {
            scrollState = this.k < ((callback.e() - callback.c()) / 2) + callback.c() ? d6b.a : d6b.b;
        }
        f6bVar.setScrollState(callback.g(f6bVar.getScrollState(), scrollState));
        if (this.k == f6bVar.getScrollStateOffset() && f6bVar.getScrollState() == d6b.a) {
            callback.h();
            f6bVar.setBackgroundAlpha(0.0f);
        } else {
            f6bVar.t0.n(view.getLeft(), f6bVar.getScrollStateOffset());
            callback.l(f6bVar.getScrollState());
            f6bVar.invalidate();
        }
    }

    @Override // defpackage.nd7
    public final boolean W(View view, int i) {
        f6b f6bVar = this.l;
        z5b callback = f6bVar.getCallback();
        return view == (callback != null ? callback.f() : null) && f6bVar.o;
    }

    @Override // defpackage.nd7
    public final int g(View view, int i) {
        int iE;
        Integer numValueOf;
        int iA;
        f6b f6bVar = this.l;
        Integer numValueOf2 = null;
        if (f6bVar.getStackFromBottom()) {
            z5b callback = f6bVar.getCallback();
            if (callback != null) {
                iE = callback.a();
                numValueOf = Integer.valueOf(iE);
            }
            numValueOf = null;
        } else {
            z5b callback2 = f6bVar.getCallback();
            if (callback2 != null) {
                iE = callback2.e();
                numValueOf = Integer.valueOf(iE);
            }
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        boolean stackFromBottom = f6bVar.getStackFromBottom();
        z5b callback3 = f6bVar.getCallback();
        if (stackFromBottom) {
            if (callback3 != null) {
                iA = callback3.e();
                numValueOf2 = Integer.valueOf(iA);
            }
        } else if (callback3 != null) {
            iA = callback3.a();
            numValueOf2 = Integer.valueOf(iA);
        }
        return ote.e(i, iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    @Override // defpackage.nd7
    public final int v(int i) {
        Object njcVar;
        View viewF;
        f6b f6bVar = this.l;
        try {
            z5b callback = f6bVar.getCallback();
            njcVar = (callback == null || (viewF = callback.f()) == null) ? null : Integer.valueOf(f6bVar.indexOfChild(viewF));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p("PopupLayout", "getOrderedChildIndex fail, issue ONEME-9645", thA);
        }
        Integer num = (Integer) (njcVar instanceof njc ? null : njcVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.nd7
    public final int y(View view) {
        return view.getHeight();
    }
}

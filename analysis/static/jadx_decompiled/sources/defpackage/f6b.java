package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class f6b extends FrameLayout {
    public static final /* synthetic */ int w0 = 0;
    public z5b a;
    public d6b b;
    public boolean c;
    public boolean o;
    public ValueAnimator s0;
    public final dnf t0;
    public final je7 u0;
    public int v0;

    public f6b(Context context) {
        super(context, null);
        this.b = d6b.a;
        this.c = true;
        this.t0 = new dnf(getContext(), this, new e6b(this));
        this.u0 = tu0.r(3, new x5b(this, 2));
        this.v0 = -1;
        tu0.K(this, 300L, new xx5(26, this));
    }

    public static void a(f6b f6bVar, float f) {
        f6bVar.setBackgroundAlpha(f);
    }

    public static void b(f6b f6bVar, float f) {
        f6bVar.setBackgroundAlpha(f);
    }

    public static void c(f6b f6bVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1 - f2;
        }
        if (f > f2) {
            f6bVar.setBackgroundAlpha(1 - f);
        }
    }

    public static void d(f6b f6bVar, a66 a66Var, float f, ValueAnimator valueAnimator) {
        z5b z5bVar = f6bVar.a;
        if (z5bVar == null) {
            return;
        }
        z5bVar.f().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - z5bVar.f().getTop());
        f6bVar.getHalfExpandedViewHelper().a(z5bVar.f().getTop());
        z5bVar.m(z5bVar.f().getTop());
        a66Var.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w5b getHalfExpandedViewHelper() {
        return (w5b) this.u0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollStateOffset() {
        int iOrdinal = this.b.ordinal();
        Integer numValueOf = null;
        if (iOrdinal == 0) {
            z5b z5bVar = this.a;
            if (z5bVar != null) {
                numValueOf = Integer.valueOf(z5bVar.e());
            }
        } else if (iOrdinal == 1) {
            z5b z5bVar2 = this.a;
            if (z5bVar2 != null) {
                numValueOf = Integer.valueOf(z5bVar2.c());
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z5b z5bVar3 = this.a;
            if (z5bVar3 != null) {
                numValueOf = Integer.valueOf(z5bVar3.a());
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View viewF;
        z5b z5bVar = this.a;
        if (z5bVar == null || (viewF = z5bVar.f()) == null) {
            return 0;
        }
        return viewF.getHeight();
    }

    public static /* synthetic */ void i(f6b f6bVar, int i, x5b x5bVar, x5b x5bVar2, a66 a66Var, int i2) {
        k56 s4aVar = x5bVar;
        if ((i2 & 2) != 0) {
            s4aVar = new s4a(28);
        }
        k56 s4aVar2 = x5bVar2;
        if ((i2 & 4) != 0) {
            s4aVar2 = new s4a(28);
        }
        f6bVar.h(i, s4aVar, s4aVar2, a66Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (ote.d(f, 0.0f, 1.0f) * 255));
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.t0.f()) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final z5b getCallback() {
        return this.a;
    }

    public final d6b getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i, k56 k56Var, k56 k56Var2, a66 a66Var) {
        View viewF;
        ValueAnimator valueAnimator = this.s0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.s0;
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        z5b z5bVar = this.a;
        if (z5bVar == null || (viewF = z5bVar.f()) == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewF.getTop(), i);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new jf(this, a66Var, animatedFraction, 1));
        valueAnimatorOfInt.addListener(new sg(k56Var2, this, k56Var, 1));
        valueAnimatorOfInt.start();
        this.s0 = valueAnimatorOfInt;
    }

    public final void j(boolean z) {
        View viewF;
        this.b = d6b.a;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            z5b z5bVar = this.a;
            if (z5bVar != null) {
                z5bVar.i();
            }
            if (z) {
                i(this, scrollStateOffset, new x5b(this, 1), null, new y5b(this, 1), 4);
            } else {
                z5b z5bVar2 = this.a;
                if (z5bVar2 != null && (viewF = z5bVar2.f()) != null) {
                    viewF.offsetTopAndBottom(scrollStateOffset);
                }
                z5b z5bVar3 = this.a;
                if (z5bVar3 != null) {
                    z5bVar3.h();
                }
                setBackgroundAlpha(0.0f);
            }
        }
        invalidate();
    }

    public final void k() {
        this.b = d6b.c;
        if (getViewDragHeight() > 0) {
            i(this, getScrollStateOffset(), null, new x5b(this, 0), new y5b(this, 0), 2);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 2
            if (r0 != r1) goto L1b
            z5b r0 = r3.a
            if (r0 == 0) goto L1b
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.n(r1, r2)
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r3.o = r1
            dnf r3 = r3.t0     // Catch: java.lang.Throwable -> L29
            boolean r3 = r3.o(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r3 = move-exception
            njc r4 = new njc
            r4.<init>(r3)
            r3 = r4
        L30:
            java.lang.Throwable r4 = defpackage.pjc.a(r3)
            if (r4 == 0) goto L3d
            java.lang.String r0 = "PopupLayout"
            java.lang.String r1 = "onInterceptTouchEvent fail, issue ONEME-9645"
            defpackage.hm9.p(r0, r1, r4)
        L3d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r3 instanceof defpackage.njc
            if (r0 == 0) goto L44
            r3 = r4
        L44:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewF;
        z5b z5bVar = this.a;
        if (z5bVar == null || (viewF = z5bVar.f()) == null) {
            return;
        }
        int scrollStateOffset = (this.s0 == null && this.t0.a == 0) ? getScrollStateOffset() : viewF.getTop();
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup.LayoutParams layoutParams = viewF.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i5 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        viewF.offsetTopAndBottom(i5);
        w5b halfExpandedViewHelper = getHalfExpandedViewHelper();
        halfExpandedViewHelper.b = 0;
        halfExpandedViewHelper.a(i5);
        if (this.v0 != viewF.getMeasuredHeight()) {
            this.v0 = viewF.getMeasuredHeight();
            if (this.s0 != null) {
                int iOrdinal = this.b.ordinal();
                if (iOrdinal == 0) {
                    j(true);
                } else if (iOrdinal == 1) {
                    setHalfScreen(null);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c6b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c6b c6bVar = (c6b) parcelable;
        super.onRestoreInstanceState(c6bVar.getSuperState());
        d6b d6bVar = (d6b) d6b.X.get(c6bVar.a);
        this.b = d6bVar;
        this.c = c6bVar.b;
        int iOrdinal = d6bVar.ordinal();
        if (iOrdinal == 0) {
            j(false);
        } else if (iOrdinal == 1) {
            setHalfScreen(null);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            k();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new c6b(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object njcVar;
        dnf dnfVar = this.t0;
        if (dnfVar.r == null) {
            super.onTouchEvent(motionEvent);
        }
        this.o = true;
        try {
            dnfVar.i(motionEvent);
            njcVar = Boolean.TRUE;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p("PopupLayout", "onTouchEvent fail, issue ONEME-9645", thA);
        }
        Boolean bool = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = bool;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        dnf dnfVar = this.t0;
        int i = dnfVar.a;
        if (i == 2 || i == 1) {
            return;
        }
        dnfVar.a();
        if (dnfVar.a == 2) {
            OverScroller overScroller = dnfVar.p;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            dnfVar.q.J(dnfVar.r, currX, currY);
        }
        dnfVar.m(0);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == d6b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(z5b z5bVar) {
        this.a = z5bVar;
    }

    public final void setHalfScreen(a66 a66Var) {
        this.b = d6b.b;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (a66Var == null) {
                a66Var = new y5b(this, 2);
            }
            h(scrollStateOffset, new s4a(28), new x5b(this, 3), a66Var);
        } else if (this.b == d6b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(d6b d6bVar) {
        this.b = d6bVar;
    }

    public final void setStackFromBottom(boolean z) {
        this.c = z;
    }
}

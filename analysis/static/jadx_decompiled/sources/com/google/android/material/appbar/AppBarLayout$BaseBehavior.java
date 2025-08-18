package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.am;
import defpackage.bm;
import defpackage.bof;
import defpackage.dm;
import defpackage.fm;
import defpackage.in9;
import defpackage.og;
import defpackage.rw3;
import defpackage.umf;
import defpackage.wi3;
import defpackage.z;
import defpackage.z04;
import defpackage.zl;
import defpackage.zmf;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T extends fm> extends bof {
    public wi3 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;
    public int j;
    public int k;
    public ValueAnimator l;
    public bm m;
    public WeakReference n;

    public AppBarLayout$BaseBehavior() {
        this.f = -1;
        this.h = -1;
    }

    public static View A(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        appBarLayout$BaseBehavior.getClass();
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (((rw3) childAt.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public static View C(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt instanceof in9) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(androidx.coordinatorlayout.widget.CoordinatorLayout r8, defpackage.fm r9, int r10, int r11, boolean r12) {
        /*
            r0 = 1
            int r1 = java.lang.Math.abs(r10)
            int r2 = r9.getChildCount()
            r3 = 0
            r4 = r3
        Lb:
            r5 = 0
            if (r4 >= r2) goto L21
            android.view.View r6 = r9.getChildAt(r4)
            int r7 = r6.getTop()
            if (r1 < r7) goto L1f
            int r7 = r6.getBottom()
            if (r1 > r7) goto L1f
            goto L22
        L1f:
            int r4 = r4 + r0
            goto Lb
        L21:
            r6 = r5
        L22:
            if (r6 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            dm r1 = (defpackage.dm) r1
            int r1 = r1.a
            r2 = r1 & 1
            if (r2 == 0) goto L5d
            java.util.WeakHashMap r2 = defpackage.zmf.a
            int r2 = r6.getMinimumHeight()
            if (r11 <= 0) goto L4b
            r11 = r1 & 12
            if (r11 == 0) goto L4b
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L5d
        L49:
            r10 = r0
            goto L5e
        L4b:
            r11 = r1 & 2
            if (r11 == 0) goto L5d
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L5d
            goto L49
        L5d:
            r10 = r3
        L5e:
            boolean r11 = r9.z0
            if (r11 == 0) goto L6a
            android.view.View r10 = C(r8)
            boolean r10 = r9.h(r10)
        L6a:
            boolean r10 = r9.g(r10)
            if (r12 != 0) goto Lad
            if (r10 == 0) goto Ld4
            die r8 = r8.b
            java.lang.Object r8 = r8.b
            qpd r8 = (defpackage.qpd) r8
            java.lang.Object r8 = r8.get(r9)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L81
            goto L86
        L81:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
        L86:
            if (r5 != 0) goto L8c
            java.util.List r5 = java.util.Collections.emptyList()
        L8c:
            int r8 = r5.size()
        L90:
            if (r3 >= r8) goto Ld4
            java.lang.Object r10 = r5.get(r3)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            rw3 r10 = (defpackage.rw3) r10
            ow3 r10 = r10.a
            boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            if (r11 == 0) goto Lab
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior) r10
            int r8 = r10.f
            if (r8 == 0) goto Ld4
            goto Lad
        Lab:
            int r3 = r3 + r0
            goto L90
        Lad:
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            if (r8 == 0) goto Lba
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            r8.jumpToCurrentState()
        Lba:
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            if (r8 == 0) goto Lc7
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            r8.jumpToCurrentState()
        Lc7:
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            if (r8 == 0) goto Ld4
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            r8.jumpToCurrentState()
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.M(androidx.coordinatorlayout.widget.CoordinatorLayout, fm, int, int, boolean):void");
    }

    public final void B(CoordinatorLayout coordinatorLayout, fm fmVar, int i) {
        int iAbs = Math.abs(D() - i);
        float fAbs = Math.abs(0.0f);
        int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / fmVar.getHeight()) + 1.0f) * 150.0f);
        int iD = D();
        if (iD == i) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.l.cancel();
            return;
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.l = valueAnimator3;
            valueAnimator3.setInterpolator(og.e);
            this.l.addUpdateListener(new zl(this, coordinatorLayout, fmVar, 0));
        } else {
            valueAnimator2.cancel();
        }
        this.l.setDuration(Math.min(iRound, 600));
        this.l.setIntValues(iD, i);
        this.l.start();
    }

    public final int D() {
        return x() + this.j;
    }

    @Override // defpackage.ow3
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void o(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int downNestedPreScrollRange;
        if (i2 != 0) {
            if (i2 < 0) {
                i4 = -fmVar.getTotalScrollRange();
                downNestedPreScrollRange = fmVar.getDownNestedPreScrollRange() + i4;
            } else {
                i4 = -fmVar.getUpNestedPreScrollRange();
                downNestedPreScrollRange = 0;
            }
            int i5 = i4;
            int i6 = downNestedPreScrollRange;
            if (i5 != i6) {
                iArr[1] = J(coordinatorLayout, fmVar, D() - i2, i5, i6);
            }
        }
        if (fmVar.z0) {
            fmVar.g(fmVar.h(view));
        }
    }

    @Override // defpackage.ow3
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            iArr[1] = J(coordinatorLayout, fmVar, D() - i4, -fmVar.getDownNestedScrollRange(), 0);
        }
        if (i4 == 0) {
            WeakHashMap weakHashMap = zmf.a;
            if (umf.a(coordinatorLayout) != null) {
                return;
            }
            zmf.j(coordinatorLayout, new am(this, fmVar, coordinatorLayout));
        }
    }

    @Override // defpackage.ow3
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean u(CoordinatorLayout coordinatorLayout, fm fmVar, View view, View view2, int i, int i2) {
        ValueAnimator valueAnimator;
        boolean z = (i & 2) != 0 && (fmVar.z0 || (fmVar.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= fmVar.getHeight()));
        if (z && (valueAnimator = this.l) != null) {
            valueAnimator.cancel();
        }
        this.n = null;
        this.k = i2;
        return z;
    }

    @Override // defpackage.ow3
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void v(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i) {
        if (this.k == 0 || i == 1) {
            L(coordinatorLayout, fmVar);
            if (fmVar.z0) {
                fmVar.g(fmVar.h(view));
            }
        }
        this.n = new WeakReference(view);
    }

    public final bm I(Parcelable parcelable, fm fmVar) {
        int iX = x();
        int childCount = fmVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = fmVar.getChildAt(i);
            int bottom = childAt.getBottom() + iX;
            if (childAt.getTop() + iX <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = z.b;
                }
                bm bmVar = new bm(parcelable);
                boolean z = iX == 0;
                bmVar.o = z;
                bmVar.c = !z && (-iX) >= fmVar.getTotalScrollRange();
                bmVar.X = i;
                WeakHashMap weakHashMap = zmf.a;
                bmVar.Z = bottom == fmVar.getTopInset() + childAt.getMinimumHeight();
                bmVar.Y = bottom / childAt.getHeight();
                return bmVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(androidx.coordinatorlayout.widget.CoordinatorLayout r17, android.view.View r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.J(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
    }

    public final void K(CoordinatorLayout coordinatorLayout, View view, int i) {
        J(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final void L(CoordinatorLayout coordinatorLayout, fm fmVar) {
        int paddingTop = fmVar.getPaddingTop() + fmVar.getTopInset();
        int iD = D() - paddingTop;
        int childCount = fmVar.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = fmVar.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            dm dmVar = (dm) childAt.getLayoutParams();
            if ((dmVar.a & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) dmVar).topMargin;
                bottom += ((LinearLayout.LayoutParams) dmVar).bottomMargin;
            }
            int i2 = -iD;
            if (top <= i2 && bottom >= i2) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            View childAt2 = fmVar.getChildAt(i);
            dm dmVar2 = (dm) childAt2.getLayoutParams();
            int i3 = dmVar2.a;
            if ((i3 & 17) == 17) {
                int topInset = -childAt2.getTop();
                int minimumHeight = -childAt2.getBottom();
                if (i == 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (fmVar.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= fmVar.getTopInset();
                    }
                }
                if ((i3 & 2) == 2) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    minimumHeight += childAt2.getMinimumHeight();
                } else if ((i3 & 5) == 5) {
                    WeakHashMap weakHashMap3 = zmf.a;
                    int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                    if (iD < minimumHeight2) {
                        topInset = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if ((i3 & 32) == 32) {
                    topInset += ((LinearLayout.LayoutParams) dmVar2).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) dmVar2).bottomMargin;
                }
                if (iD < (minimumHeight + topInset) / 2) {
                    topInset = minimumHeight;
                }
                B(coordinatorLayout, fmVar, z04.p(topInset + paddingTop, -fmVar.getTotalScrollRange(), 0));
            }
        }
    }

    @Override // defpackage.ow3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.g) > this.h) {
                this.g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference weakReference = this.n;
            boolean z = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.h(view, x, y2);
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    @Override // defpackage.bof, defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int iRound;
        fm fmVar = (fm) view;
        super.l(coordinatorLayout, fmVar, i);
        int pendingAction = fmVar.getPendingAction();
        bm bmVar = this.m;
        if (bmVar == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i2 = -fmVar.getUpNestedPreScrollRange();
                    if (z) {
                        B(coordinatorLayout, fmVar, i2);
                    } else {
                        K(coordinatorLayout, fmVar, i2);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        B(coordinatorLayout, fmVar, 0);
                    } else {
                        K(coordinatorLayout, fmVar, 0);
                    }
                }
            }
        } else if (bmVar.c) {
            K(coordinatorLayout, fmVar, -fmVar.getTotalScrollRange());
        } else if (bmVar.o) {
            K(coordinatorLayout, fmVar, 0);
        } else {
            View childAt = fmVar.getChildAt(bmVar.X);
            int i3 = -childAt.getBottom();
            if (this.m.Z) {
                WeakHashMap weakHashMap = zmf.a;
                iRound = fmVar.getTopInset() + childAt.getMinimumHeight() + i3;
            } else {
                iRound = Math.round(childAt.getHeight() * this.m.Y) + i3;
            }
            K(coordinatorLayout, fmVar, iRound);
        }
        fmVar.t0 = 0;
        this.m = null;
        z(z04.p(x(), -fmVar.getTotalScrollRange(), 0));
        M(coordinatorLayout, fmVar, x(), 0, true);
        fmVar.e(x());
        WeakHashMap weakHashMap2 = zmf.a;
        if (umf.a(coordinatorLayout) == null) {
            zmf.j(coordinatorLayout, new am(this, fmVar, coordinatorLayout));
        }
        return true;
    }

    @Override // defpackage.ow3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        fm fmVar = (fm) view;
        if (((ViewGroup.MarginLayoutParams) ((rw3) fmVar.getLayoutParams())).height != -2) {
            return false;
        }
        coordinatorLayout.q(fmVar, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // defpackage.ow3
    public final void r(View view, Parcelable parcelable) {
        if (parcelable instanceof bm) {
            this.m = (bm) parcelable;
        } else {
            this.m = null;
        }
    }

    @Override // defpackage.ow3
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        bm bmVarI = I(absSavedState, (fm) view);
        return bmVarI == null ? absSavedState : bmVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.ow3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout r23, android.view.View r24, android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f = -1;
        this.h = -1;
    }
}

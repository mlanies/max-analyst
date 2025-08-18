package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f77 extends ndc implements qdc {
    public int B0;
    public RecyclerView C0;
    public VelocityTracker E0;
    public ArrayList F0;
    public ArrayList G0;
    public fd7 I0;
    public d77 J0;
    public Rect L0;
    public long M0;
    public float X;
    public float Y;
    public float Z;
    public float o;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public final e77 x0;
    public int z0;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public dec c = null;
    public int w0 = -1;
    public int y0 = 0;
    public final ArrayList A0 = new ArrayList();
    public final q57 D0 = new q57(1, this);
    public View H0 = null;
    public final k71 K0 = new k71(1, this);

    public f77(e77 e77Var) {
        this.x0 = e77Var;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.qdc
    public final void b(View view) {
        r(view);
        dec decVarT = this.C0.T(view);
        if (decVarT == null) {
            return;
        }
        dec decVar = this.c;
        if (decVar != null && decVarT == decVar) {
            s(null, 0);
            return;
        }
        m(decVarT, false);
        if (this.a.remove(decVarT.a)) {
            this.x0.a(this.C0, decVarT);
        }
    }

    @Override // defpackage.qdc
    public final void d(View view) {
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        rect.setEmpty();
    }

    @Override // defpackage.ndc
    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        dec decVar = this.c;
        ArrayList arrayList = this.A0;
        int i = this.y0;
        e77 e77Var = this.x0;
        e77Var.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            b77 b77Var = (b77) arrayList.get(i2);
            float f4 = b77Var.a;
            float f5 = b77Var.c;
            dec decVar2 = b77Var.e;
            if (f4 == f5) {
                b77Var.i = decVar2.a.getTranslationX();
            } else {
                b77Var.i = z7b.f(f5, f4, b77Var.m, f4);
            }
            float f6 = b77Var.b;
            float f7 = b77Var.d;
            if (f6 == f7) {
                b77Var.j = decVar2.a.getTranslationY();
            } else {
                b77Var.j = z7b.f(f7, f6, b77Var.m, f6);
            }
            int iSave = canvas.save();
            e77Var.h(canvas, recyclerView, b77Var.e, b77Var.i, b77Var.j, b77Var.f, false);
            canvas.restoreToCount(iSave);
            i2++;
            arrayList = arrayList;
        }
        if (decVar != null) {
            int iSave2 = canvas.save();
            e77Var.h(canvas, recyclerView, decVar, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        dec decVar = this.c;
        ArrayList arrayList = this.A0;
        this.x0.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b77 b77Var = (b77) arrayList.get(i);
            int iSave = canvas.save();
            View view = b77Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (decVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            b77 b77Var2 = (b77) arrayList.get(i2);
            boolean z2 = b77Var2.l;
            if (z2 && !b77Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.C0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        k71 k71Var = this.K0;
        if (recyclerView2 != null) {
            recyclerView2.p0(this);
            this.C0.r0(k71Var);
            this.C0.q0(this);
            ArrayList arrayList = this.A0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b77 b77Var = (b77) arrayList.get(0);
                b77Var.g.cancel();
                this.x0.a(this.C0, b77Var.e);
            }
            arrayList.clear();
            this.H0 = null;
            VelocityTracker velocityTracker = this.E0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.E0 = null;
            }
            d77 d77Var = this.J0;
            if (d77Var != null) {
                d77Var.a = false;
                this.J0 = null;
            }
            if (this.I0 != null) {
                this.I0 = null;
            }
        }
        this.C0 = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.Y = resources.getDimension(rtb.item_touch_helper_swipe_escape_velocity);
            this.Z = resources.getDimension(rtb.item_touch_helper_swipe_escape_max_velocity);
            this.B0 = ViewConfiguration.get(this.C0.getContext()).getScaledTouchSlop();
            this.C0.j(this);
            this.C0.l(k71Var);
            this.C0.k(this);
            this.J0 = new d77(this);
            this.I0 = new fd7(this.C0.getContext(), this.J0);
        }
    }

    public final int j(dec decVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.s0 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.E0;
        e77 e77Var = this.x0;
        if (velocityTracker != null && this.w0 > -1) {
            float f = this.Z;
            e77Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.E0.getXVelocity(this.w0);
            float yVelocity = this.E0.getYVelocity(this.w0);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= e77Var.d(this.Y) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fE = e77Var.e() * this.C0.getWidth();
        if ((i & i2) == 0 || Math.abs(this.s0) <= fE) {
            return 0;
        }
        return i2;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        View viewN;
        if (this.c == null && i == 2 && this.y0 != 2) {
            e77 e77Var = this.x0;
            if (e77Var.g() && this.C0.getScrollState() != 1) {
                a layoutManager = this.C0.getLayoutManager();
                int i3 = this.w0;
                dec decVarT = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.o;
                    float y = motionEvent.getY(iFindPointerIndex) - this.X;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.B0;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.e()) && ((fAbs2 <= fAbs || !layoutManager.f()) && (viewN = n(motionEvent)) != null))) {
                        decVarT = this.C0.T(viewN);
                    }
                }
                if (decVarT == null) {
                    return;
                }
                RecyclerView recyclerView = this.C0;
                int i4 = e77Var.b;
                int i5 = e77Var.c;
                int i6 = (i5 << 16) | (i4 << 8) | i4 | i5;
                WeakHashMap weakHashMap = zmf.a;
                int iB = (e77.b(i6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iB == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.o;
                float f3 = y2 - this.X;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.B0;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iB & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iB & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iB & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iB & 2) == 0) {
                            return;
                        }
                    }
                    this.t0 = 0.0f;
                    this.s0 = 0.0f;
                    this.w0 = motionEvent.getPointerId(0);
                    s(decVarT, 1);
                }
            }
        }
    }

    public final int l(dec decVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.t0 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.E0;
        e77 e77Var = this.x0;
        if (velocityTracker != null && this.w0 > -1) {
            float f = this.Z;
            e77Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.E0.getXVelocity(this.w0);
            float yVelocity = this.E0.getYVelocity(this.w0);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= e77Var.d(this.Y) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fE = e77Var.e() * this.C0.getHeight();
        if ((i & i2) == 0 || Math.abs(this.t0) <= fE) {
            return 0;
        }
        return i2;
    }

    public final void m(dec decVar, boolean z) {
        ArrayList arrayList = this.A0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b77 b77Var = (b77) arrayList.get(size);
            if (b77Var.e == decVar) {
                b77Var.k |= z;
                if (!b77Var.l) {
                    b77Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        dec decVar = this.c;
        if (decVar != null) {
            float f = this.u0 + this.s0;
            float f2 = this.v0 + this.t0;
            View view = decVar.a;
            if (p(view, x, y, f, f2)) {
                return view;
            }
        }
        ArrayList arrayList = this.A0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b77 b77Var = (b77) arrayList.get(size);
            View view2 = b77Var.e.a;
            if (p(view2, x, y, b77Var.i, b77Var.j)) {
                return view2;
            }
        }
        return this.C0.H(x, y);
    }

    public final void o(float[] fArr) {
        if ((this.z0 & 12) != 0) {
            fArr[0] = (this.u0 + this.s0) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.z0 & 3) != 0) {
            fArr[1] = (this.v0 + this.t0) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void q(dec decVar) {
        int i;
        int i2;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int iAbs4;
        a aVar;
        int i3;
        int i4;
        int i5;
        char c;
        if (!this.C0.isLayoutRequested() && this.y0 == 2) {
            e77 e77Var = this.x0;
            e77Var.getClass();
            int i6 = (int) (this.u0 + this.s0);
            int i7 = (int) (this.v0 + this.t0);
            float fAbs = Math.abs(i7 - decVar.a.getTop());
            View view = decVar.a;
            if (fAbs >= view.getHeight() * 0.5f || Math.abs(i6 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.F0;
                if (arrayList == null) {
                    this.F0 = new ArrayList();
                    this.G0 = new ArrayList();
                } else {
                    arrayList.clear();
                    this.G0.clear();
                }
                int iRound = Math.round(this.u0 + this.s0);
                int iRound2 = Math.round(this.v0 + this.t0);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i8 = (iRound + width) / 2;
                int i9 = (iRound2 + height) / 2;
                a layoutManager = this.C0.getLayoutManager();
                int iW = layoutManager.w();
                int i10 = 0;
                while (i10 < iW) {
                    View viewV = layoutManager.v(i10);
                    if (viewV == view) {
                        i3 = iRound;
                        i4 = iRound2;
                        i5 = width;
                        aVar = layoutManager;
                    } else {
                        aVar = layoutManager;
                        if (viewV.getBottom() < iRound2 || viewV.getTop() > height || viewV.getRight() < iRound || viewV.getLeft() > width) {
                            i3 = iRound;
                            i4 = iRound2;
                            i5 = width;
                        } else {
                            dec decVarT = this.C0.T(viewV);
                            c = 2;
                            int iAbs5 = Math.abs(i8 - ((viewV.getRight() + viewV.getLeft()) / 2));
                            int iAbs6 = Math.abs(i9 - ((viewV.getBottom() + viewV.getTop()) / 2));
                            int i11 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            i3 = iRound;
                            int size = this.F0.size();
                            i4 = iRound2;
                            i5 = width;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < size) {
                                int i14 = size;
                                if (i11 <= ((Integer) this.G0.get(i12)).intValue()) {
                                    break;
                                }
                                i13++;
                                i12++;
                                size = i14;
                            }
                            this.F0.add(i13, decVarT);
                            this.G0.add(i13, Integer.valueOf(i11));
                            i10++;
                            layoutManager = aVar;
                            iRound = i3;
                            iRound2 = i4;
                            width = i5;
                        }
                    }
                    c = 2;
                    i10++;
                    layoutManager = aVar;
                    iRound = i3;
                    iRound2 = i4;
                    width = i5;
                }
                ArrayList arrayList2 = this.F0;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i6;
                int height2 = view.getHeight() + i7;
                int left2 = i6 - view.getLeft();
                int top2 = i7 - view.getTop();
                int size2 = arrayList2.size();
                dec decVar2 = null;
                int i15 = -1;
                int i16 = 0;
                while (i16 < size2) {
                    dec decVar3 = (dec) arrayList2.get(i16);
                    ArrayList arrayList3 = arrayList2;
                    if (left2 > 0) {
                        int right = decVar3.a.getRight() - width2;
                        i = width2;
                        if (right < 0) {
                            i2 = size2;
                            if (decVar3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                                i15 = iAbs4;
                                decVar2 = decVar3;
                            }
                        }
                        if (left2 < 0 && (left = decVar3.a.getLeft() - i6) > 0 && decVar3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                            i15 = iAbs3;
                            decVar2 = decVar3;
                        }
                        if (top2 < 0 && (top = decVar3.a.getTop() - i7) > 0 && decVar3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                            i15 = iAbs2;
                            decVar2 = decVar3;
                        }
                        if (top2 <= 0 && (bottom = decVar3.a.getBottom() - height2) < 0 && decVar3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                            i15 = iAbs;
                            decVar2 = decVar3;
                        }
                        i16++;
                        arrayList2 = arrayList3;
                        width2 = i;
                        size2 = i2;
                    } else {
                        i = width2;
                    }
                    i2 = size2;
                    if (left2 < 0) {
                        i15 = iAbs3;
                        decVar2 = decVar3;
                    }
                    if (top2 < 0) {
                        i15 = iAbs2;
                        decVar2 = decVar3;
                    }
                    if (top2 <= 0) {
                    }
                    i16++;
                    arrayList2 = arrayList3;
                    width2 = i;
                    size2 = i2;
                }
                if (decVar2 == null) {
                    this.F0.clear();
                    this.G0.clear();
                    return;
                }
                int iG = decVar2.g();
                decVar.g();
                if (e77Var.i(decVar, decVar2)) {
                    RecyclerView recyclerView = this.C0;
                    a layoutManager2 = recyclerView.getLayoutManager();
                    boolean z = layoutManager2 instanceof LinearLayoutManager;
                    View view2 = decVar2.a;
                    if (!z) {
                        if (layoutManager2.e()) {
                            if (a.B(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.x0(iG);
                            }
                            if (a.E(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.x0(iG);
                            }
                        }
                        if (layoutManager2.f()) {
                            if (a.F(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.x0(iG);
                            }
                            if (a.z(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.x0(iG);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.R0();
                    linearLayoutManager.l1();
                    int iM = a.M(view);
                    int iM2 = a.M(view2);
                    char c2 = iM < iM2 ? (char) 1 : (char) 65535;
                    if (linearLayoutManager.u) {
                        if (c2 == 1) {
                            linearLayoutManager.n1(iM2, linearLayoutManager.r.h() - (linearLayoutManager.r.d(view) + linearLayoutManager.r.f(view2)));
                            return;
                        } else {
                            linearLayoutManager.n1(iM2, linearLayoutManager.r.h() - linearLayoutManager.r.c(view2));
                            return;
                        }
                    }
                    if (c2 == 65535) {
                        linearLayoutManager.n1(iM2, linearLayoutManager.r.f(view2));
                    } else {
                        linearLayoutManager.n1(iM2, linearLayoutManager.r.c(view2) - linearLayoutManager.r.d(view));
                    }
                }
            }
        }
    }

    public final void r(View view) {
        if (view == this.H0) {
            this.H0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.dec r23, int r24) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f77.s(dec, int):void");
    }

    public final void t(dec decVar) {
        e77 e77Var = this.x0;
        RecyclerView recyclerView = this.C0;
        int i = e77Var.b;
        int i2 = e77Var.c;
        int i3 = i | i2;
        int i4 = (i2 << 16) | (i << 8) | i3;
        WeakHashMap weakHashMap = zmf.a;
        if ((e77.b(i4, recyclerView.getLayoutDirection()) & 16711680) == 0 || decVar.a.getParent() != this.C0) {
            return;
        }
        VelocityTracker velocityTracker = this.E0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.E0 = VelocityTracker.obtain();
        this.t0 = 0.0f;
        this.s0 = 0.0f;
        s(decVar, 2);
    }

    public final void u(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.o;
        this.s0 = f;
        this.t0 = y - this.X;
        if ((i & 4) == 0) {
            this.s0 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.s0 = Math.min(0.0f, this.s0);
        }
        if ((i & 1) == 0) {
            this.t0 = Math.max(0.0f, this.t0);
        }
        if ((i & 2) == 0) {
            this.t0 = Math.min(0.0f, this.t0);
        }
    }
}

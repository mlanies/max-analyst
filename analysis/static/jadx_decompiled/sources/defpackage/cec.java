package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class cec implements Runnable {
    public boolean X;
    public boolean Y;
    public final /* synthetic */ RecyclerView Z;
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator o;

    public cec(RecyclerView recyclerView) {
        this.Z = recyclerView;
        c77 c77Var = RecyclerView.T1;
        this.o = c77Var;
        this.X = false;
        this.Y = false;
        this.c = new OverScroller(recyclerView.getContext(), c77Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.Z;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.o;
        c77 c77Var = RecyclerView.T1;
        if (interpolator != c77Var) {
            this.o = c77Var;
            this.c = new OverScroller(recyclerView.getContext(), c77Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.X) {
            this.Y = true;
            return;
        }
        RecyclerView recyclerView = this.Z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = zmf.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.Z;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.T1;
        }
        if (this.o != interpolator) {
            this.o = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.Z;
        if (recyclerView.B0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.Y = false;
        this.X = true;
        recyclerView.s();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iR = RecyclerView.r(i5, recyclerView.W0, recyclerView.Y0, recyclerView.getWidth());
            int iR2 = RecyclerView.r(i6, recyclerView.X0, recyclerView.Z0, recyclerView.getHeight());
            int[] iArr = recyclerView.E1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zY = recyclerView.y(iR, iR2, 1, iArr, null);
            int[] iArr2 = recyclerView.E1;
            if (zY) {
                iR -= iArr2[0];
                iR2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.q(iR, iR2);
            }
            if (recyclerView.A0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.w0(iR, iR2, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = iR - i7;
                int i10 = iR2 - i8;
                yh7 yh7Var = recyclerView.B0.e;
                if (yh7Var != null && !yh7Var.d && yh7Var.e) {
                    int iB = recyclerView.s1.b();
                    if (iB == 0) {
                        yh7Var.l();
                    } else if (yh7Var.a >= iB) {
                        yh7Var.a = iB - 1;
                        yh7Var.i(i7, i8);
                    } else {
                        yh7Var.i(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = iR;
                i2 = iR2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.D0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.z(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.A(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            yh7 yh7Var2 = recyclerView.B0.e;
            if ((yh7Var2 == null || !yh7Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.C();
                        if (recyclerView.W0.isFinished()) {
                            recyclerView.W0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.D();
                        if (recyclerView.Y0.isFinished()) {
                            recyclerView.Y0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.X0.isFinished()) {
                            recyclerView.X0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.Z0.isFinished()) {
                            recyclerView.Z0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = zmf.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.R1) {
                    b23 b23Var = recyclerView.r1;
                    int[] iArr4 = b23Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    b23Var.d = 0;
                }
            } else {
                b();
                ca6 ca6Var = recyclerView.q1;
                if (ca6Var != null) {
                    ca6Var.a(recyclerView, i4, i11);
                }
            }
        }
        yh7 yh7Var3 = recyclerView.B0.e;
        if (yh7Var3 != null && yh7Var3.d) {
            yh7Var3.i(0, 0);
        }
        this.X = false;
        if (!this.Y) {
            recyclerView.setScrollState(0);
            recyclerView.a(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = zmf.a;
            recyclerView.postOnAnimation(this);
        }
    }
}

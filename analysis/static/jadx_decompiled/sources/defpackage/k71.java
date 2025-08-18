package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k71 implements sdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(boolean z) {
    }

    private final void d(MotionEvent motionEvent) {
    }

    @Override // defpackage.sdc
    public final void a(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                f77 f77Var = (f77) this.b;
                ((GestureDetector) f77Var.I0.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = f77Var.E0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (f77Var.w0 != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(f77Var.w0);
                    if (iFindPointerIndex >= 0) {
                        f77Var.k(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    dec decVar = f77Var.c;
                    if (decVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    f77Var.u(f77Var.z0, iFindPointerIndex, motionEvent);
                                    f77Var.q(decVar);
                                    RecyclerView recyclerView = f77Var.C0;
                                    q57 q57Var = f77Var.D0;
                                    recyclerView.removeCallbacks(q57Var);
                                    q57Var.run();
                                    f77Var.C0.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = f77Var.E0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == f77Var.w0) {
                                    f77Var.w0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    f77Var.u(f77Var.z0, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        f77Var.s(null, 0);
                        f77Var.w0 = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.sdc
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        switch (this.a) {
            case 0:
                if (recyclerView.H(motionEvent.getX(), motionEvent.getY()) == null) {
                    ((m71) this.b).N0.onTouchEvent(motionEvent);
                    break;
                }
                break;
            default:
                f77 f77Var = (f77) this.b;
                ((GestureDetector) f77Var.I0.a).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                b77 b77Var = null;
                if (actionMasked == 0) {
                    f77Var.w0 = motionEvent.getPointerId(0);
                    f77Var.o = motionEvent.getX();
                    f77Var.X = motionEvent.getY();
                    VelocityTracker velocityTracker = f77Var.E0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    f77Var.E0 = VelocityTracker.obtain();
                    if (f77Var.c == null) {
                        ArrayList arrayList = f77Var.A0;
                        if (!arrayList.isEmpty()) {
                            View viewN = f77Var.n(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    b77 b77Var2 = (b77) arrayList.get(size);
                                    if (b77Var2.e.a == viewN) {
                                        b77Var = b77Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (b77Var != null) {
                            f77Var.o -= b77Var.i;
                            f77Var.X -= b77Var.j;
                            dec decVar = b77Var.e;
                            f77Var.m(decVar, true);
                            if (f77Var.a.remove(decVar.a)) {
                                f77Var.x0.a(f77Var.C0, decVar);
                            }
                            f77Var.s(decVar, b77Var.f);
                            f77Var.u(f77Var.z0, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    f77Var.w0 = -1;
                    f77Var.s(null, 0);
                } else {
                    int i = f77Var.w0;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        f77Var.k(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = f77Var.E0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (f77Var.c == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.sdc
    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (z) {
                    ((f77) this.b).s(null, 0);
                    break;
                }
                break;
        }
    }
}

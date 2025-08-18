package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class h8e extends ndc {
    public final RecyclerView X;
    public final hdc b;
    public final i8e c;
    public final ty2 o;
    public f8e u0;
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final boolean Y = true;
    public final Rect Z = new Rect();
    public final Rect s0 = new Rect();
    public final gaa t0 = new gaa(17);
    public final AtomicBoolean v0 = new AtomicBoolean(true);
    public final e8e w0 = new e8e(this, 0);

    public h8e(RecyclerView recyclerView, hdc hdcVar, i8e i8eVar) {
        this.b = hdcVar;
        boolean z = hdcVar instanceof i8e;
        this.c = i8eVar;
        ty2 ty2Var = new ty2();
        ty2Var.o = new SparseArray();
        ty2Var.X = new SparseArray();
        ty2Var.Y = new SparseArray();
        ty2Var.a = recyclerView;
        ty2Var.b = hdcVar;
        ty2Var.c = i8eVar;
        jdc d8eVar = new d8e(ty2Var, 0, recyclerView);
        hdcVar.z(d8eVar);
        ty2Var.Z = d8eVar;
        this.o = ty2Var;
        this.X = recyclerView;
        f8e f8eVar = new f8e(this, recyclerView, 0);
        hdcVar.z(f8eVar);
        this.u0 = f8eVar;
    }

    public static final void i(h8e h8eVar) {
        h8eVar.a.clear();
        if (h8eVar.v0.compareAndSet(true, false)) {
            e8e e8eVar = h8eVar.w0;
            RecyclerView recyclerView = h8eVar.X;
            kp.x(recyclerView, e8eVar);
            recyclerView.post(new e8e(h8eVar, 1));
        }
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        boolean zK = k(iR);
        gaa gaaVar = this.t0;
        if (zK) {
            ty2 ty2Var = this.o;
            if (ty2Var.j(iR) != null) {
                c8e c8eVarK = ty2Var.k(iR);
                int i = c8eVarK.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = c8eVarK.a.getMeasuredHeight() + rect.top;
                gaaVar.E(rect, view, recyclerView);
                return;
            }
        }
        gaaVar.E(rect, view, recyclerView);
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        hdc hdcVar = this.b;
        int iJ = hdcVar.j();
        if (childCount <= 0 || iJ <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int iR = RecyclerView.R(childAt);
            if (iR != -1) {
                ty2 ty2Var = this.o;
                if (ty2Var.j(iR) == null) {
                    continue;
                } else {
                    boolean zK = k(iR);
                    gaa gaaVar = this.t0;
                    Rect rect = this.Z;
                    gaaVar.v(rect, childAt, iR);
                    boolean z = rect.top <= 0 && rect.bottom > 0;
                    if (zK || z) {
                        c8e c8eVarK = ty2Var.k(iR);
                        boolean z2 = z && this.Y;
                        int measuredHeight = ty2Var.k(iR).a.getMeasuredHeight();
                        gaaVar.v(rect, childAt, iR);
                        Rect rect2 = this.s0;
                        gaaVar.x(rect2, childAt, iR);
                        if (z2) {
                            if (iR >= hdcVar.j() - 1 || !k(iR + 1)) {
                                this.c.getClass();
                                if (!zK || rect2.top < 0) {
                                    rect2.offsetTo(rect2.left, 0);
                                }
                            } else {
                                int i3 = rect.bottom;
                                if (measuredHeight > i3) {
                                    rect2.offsetTo(rect2.left, i3 - measuredHeight);
                                } else {
                                    rect2.offsetTo(rect2.left, 0);
                                }
                            }
                        }
                        float f = rect2.top;
                        int iSave = canvas.save();
                        canvas.translate(0.0f, f);
                        try {
                            View view = c8eVarK.a;
                            if (c54.K(view)) {
                                canvas.translate((canvas.getWidth() - view.getMeasuredWidth()) - c8eVarK.b, 0.0f);
                            } else {
                                canvas.translate(c8eVarK.b, 0.0f);
                            }
                            view.draw(canvas);
                        } finally {
                            canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
            i = i2;
        }
    }

    public final void j() {
        ty2 ty2Var = this.o;
        ((SparseArray) ty2Var.X).clear();
        ((SparseArray) ty2Var.o).clear();
        ((SparseArray) ty2Var.Y).clear();
    }

    public final boolean k(int i) {
        Object objJ;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        ty2 ty2Var = this.o;
        Object objJ2 = ty2Var.j(i);
        boolean z = false;
        if (objJ2 != null && (i <= 0 || (objJ = ty2Var.j(i - 1)) == null || !objJ2.equals(objJ))) {
            z = true;
        }
        sparseBooleanArray.put(i, z);
        return z;
    }
}

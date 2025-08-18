package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class nz7 extends ndc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ nz7(yh9 yh9Var, yh9 yh9Var2, yh9 yh9Var3, int i) {
        this.a = i;
        this.b = yh9Var;
        this.c = yh9Var2;
        this.o = yh9Var3;
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        hdc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.l(i));
        }
        return null;
    }

    @Override // defpackage.ndc
    public void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                dec decVarT = recyclerView.T(view);
                if (decVarT != null && (i = decVarT.Y) != 0) {
                    int i3 = 536870911 & i;
                    yh9 yh9Var = (yh9) this.b;
                    rect.left = yh9Var.c(i3);
                    rect.right = yh9Var.c(i3);
                    if (!dy7.C(i)) {
                        if (decVarT.h() != 0 && !dy7.B(i)) {
                            rect.top = ((yh9) this.c).c(i3);
                        }
                        if (decVarT.h() != zdcVar.b() - 1 && !dy7.A(i)) {
                            rect.bottom = ((yh9) this.o).c(i3);
                            break;
                        }
                    }
                }
                break;
            case 1:
                dec decVarT2 = recyclerView.T(view);
                if (decVarT2 != null && (i2 = decVarT2.Y) != 0) {
                    int i4 = 536870911 & i2;
                    yh9 yh9Var2 = (yh9) this.b;
                    rect.left = yh9Var2.c(i4);
                    rect.right = yh9Var2.c(i4);
                    if ((1073741824 & i2) == 0) {
                        if (decVarT2.h() != 0 && (Integer.MIN_VALUE & i2) == 0) {
                            rect.top = ((yh9) this.c).c(i4);
                        }
                        if (decVarT2.h() != zdcVar.b() - 1 && (536870912 & i2) == 0) {
                            rect.bottom = ((yh9) this.o).c(i4);
                            break;
                        }
                    }
                }
                break;
            default:
                super.f(rect, view, recyclerView, zdcVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    @Override // defpackage.ndc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.graphics.Canvas r12, androidx.recyclerview.widget.RecyclerView r13, defpackage.zdc r14) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz7.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, zdc):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nz7(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new xq0(1, fk4.d().getDisplayMetrics().density * 16.0f);
                this.c = new ix3(fk4.d().getDisplayMetrics().density * 16.0f);
                this.o = new xq0(0, fk4.d().getDisplayMetrics().density * 16.0f);
                break;
            default:
                float f = 12;
                float f2 = 8;
                float f3 = 8;
                this(ay7.x(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f), 512, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)), ay7.x(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f2), 512, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(6 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)), ay7.x(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), 512, tu0.G(fk4.d().getDisplayMetrics().density * f3), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(3 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)), 0);
                break;
        }
    }
}

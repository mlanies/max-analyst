package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class k61 {
    public RecyclerView a;

    public void a(w8 w8Var) {
        int i = w8Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.B0.d0(w8Var.b, w8Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.B0.g0(w8Var.b, w8Var.d);
        } else if (i == 4) {
            recyclerView.B0.i0(recyclerView, w8Var.b, w8Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.B0.f0(w8Var.b, w8Var.d);
        }
    }

    public dec b(int i) {
        RecyclerView recyclerView = this.a;
        int iD = recyclerView.t0.D();
        int i2 = 0;
        dec decVar = null;
        while (true) {
            if (i2 >= iD) {
                break;
            }
            dec decVarU = RecyclerView.U(recyclerView.t0.C(i2));
            if (decVarU != null && !decVarU.p() && decVarU.c == i) {
                if (!recyclerView.t0.H(decVarU.a)) {
                    decVar = decVarU;
                    break;
                }
                decVar = decVarU;
            }
            i2++;
        }
        if (decVar == null) {
            return null;
        }
        if (!recyclerView.t0.H(decVar.a)) {
            return decVar;
        }
        boolean z = RecyclerView.L1;
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iD = recyclerView.t0.D();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iD; i6++) {
            View viewC = recyclerView.t0.C(i6);
            dec decVarU = RecyclerView.U(viewC);
            if (decVarU != null && !decVarU.w() && (i4 = decVarU.c) >= i && i4 < i5) {
                decVarU.f(2);
                if (obj == null) {
                    decVarU.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if ((1024 & decVarU.u0) == 0) {
                    if (decVarU.v0 == null) {
                        ArrayList arrayList = new ArrayList();
                        decVarU.v0 = arrayList;
                        decVarU.w0 = Collections.unmodifiableList(arrayList);
                    }
                    decVarU.v0.add(obj);
                }
                ((pdc) viewC.getLayoutParams()).c = true;
            }
        }
        vdc vdcVar = recyclerView.c;
        for (int size = vdcVar.c.size() - 1; size >= 0; size--) {
            dec decVar = (dec) vdcVar.c.get(size);
            if (decVar != null && (i3 = decVar.c) >= i && i3 < i5) {
                decVar.f(2);
                vdcVar.f(size);
            }
        }
        recyclerView.w1 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iD = recyclerView.t0.D();
        for (int i3 = 0; i3 < iD; i3++) {
            dec decVarU = RecyclerView.U(recyclerView.t0.C(i3));
            if (decVarU != null && !decVarU.w() && decVarU.c >= i) {
                if (RecyclerView.M1) {
                    decVarU.toString();
                }
                decVarU.t(i2, false);
                recyclerView.s1.g = true;
            }
        }
        vdc vdcVar = recyclerView.c;
        int size = vdcVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            dec decVar = (dec) vdcVar.c.get(i4);
            if (decVar != null && decVar.c >= i) {
                if (RecyclerView.M1) {
                    decVar.toString();
                }
                decVar.t(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iD = recyclerView.t0.D();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iD; i11++) {
            dec decVarU = RecyclerView.U(recyclerView.t0.C(i11));
            if (decVarU != null && (i9 = decVarU.c) >= i4 && i9 <= i3) {
                if (RecyclerView.M1) {
                    decVarU.toString();
                }
                if (decVarU.c == i) {
                    decVarU.t(i2 - i, false);
                } else {
                    decVarU.t(i5, false);
                }
                recyclerView.s1.g = true;
            }
        }
        vdc vdcVar = recyclerView.c;
        vdcVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = vdcVar.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            dec decVar = (dec) vdcVar.c.get(i12);
            if (decVar != null && (i8 = decVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    decVar.t(i2 - i, false);
                } else {
                    decVar.t(i10, false);
                }
                if (RecyclerView.M1) {
                    decVar.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }
}

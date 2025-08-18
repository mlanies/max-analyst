package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dec;
import defpackage.fk4;
import defpackage.ga5;
import defpackage.hdc;
import defpackage.hm9;
import defpackage.ir6;
import defpackage.ri9;
import defpackage.ry8;
import defpackage.t3a;
import defpackage.tu0;
import defpackage.u92;
import defpackage.us7;
import defpackage.vsc;
import defpackage.wg0;
import defpackage.y19;
import defpackage.z19;
import defpackage.zdc;
import defpackage.zj7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "y19", "z19", "message-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final float E;
    public final String F;
    public boolean G;
    public boolean H;
    public RecyclerView I;
    public final Rect J;
    public final ri9 K;

    public MessagesLayoutManager() {
        super(1, false);
        this.E = 2.0f;
        this.F = MessagesLayoutManager.class.getName();
        this.J = new Rect();
        int i = vsc.a;
        this.K = new ri9();
        p1(true);
        this.h = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void I0(RecyclerView recyclerView, int i) {
        boolean z = true;
        this.H = true;
        int iW0 = W0();
        int iY0 = Y0();
        if (iW0 == -1 || iY0 == -1) {
            y0(i);
            return;
        }
        if (iW0 > i || i > iY0) {
            int i2 = (iY0 + iW0) / 2 <= i ? 1 : -1;
            if (i >= iW0) {
                iW0 = iY0;
            }
            if (Math.abs(iW0 - i) > 10) {
                int iG = tu0.G(i2 * this.E * recyclerView.getHeight());
                String str = this.F;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    us7 us7Var = us7.X;
                    hdc adapter = recyclerView.getAdapter();
                    Integer numValueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                    StringBuilder sbJ = wg0.j("LM fast scroll by pos:", i, " and offset:", iG, ", curSize:");
                    sbJ.append(numValueOf);
                    ir6Var.d(us7Var, str, sbJ.toString(), null);
                }
                n1(i, iG);
            }
        }
        Context context = recyclerView.getContext();
        int iW02 = W0();
        boolean z2 = iW02 == Y0();
        boolean z3 = G() - 1 == i;
        boolean z4 = iW02 == i;
        if ((!z2 || !z3 || !z4) && !this.G) {
            z = false;
        }
        y19 y19Var = new y19(context, i, z, new zj7(8, this));
        String str2 = this.F;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            us7 us7Var2 = us7.X;
            hdc adapter2 = recyclerView.getAdapter();
            ir6Var2.d(us7Var2, str2, "LM smooth scroll by pos:" + i + ", curSize:" + (adapter2 != null ? Integer.valueOf(adapter2.j()) : null), null);
        }
        J0(y19Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void S(View view, int i, int i2, int i3, int i4) {
        dec decVarT;
        RecyclerView recyclerView = this.I;
        if (recyclerView == null || (decVarT = recyclerView.T(view)) == null) {
            return;
        }
        boolean z = decVarT instanceof u92;
        int i5 = decVarT.Y;
        if (!ry8.a(i5, 0) && !z && !ry8.a(i5, 131072)) {
            super.S(view, i, i2, i3, i4);
            return;
        }
        int i6 = i3 - i;
        int width = ((recyclerView.getWidth() - i6) / 2) + recyclerView.getLeft();
        super.S(view, width, i2, width + i6, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        this.I = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        this.I = null;
        this.J.setEmpty();
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i, int i2) {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i3 << 3) + i5]).a();
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0() {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i << 3) + i3]).a();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i3 << 3) + i5]).a();
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i3 << 3) + i5]).a();
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i) {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i2 << 3) + i4]).a();
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h0(i);
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i3 << 3) + i5]).a();
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void k0(zdc zdcVar) {
        super.k0(zdcVar);
        if (W0() == -1 || Y0() == -1) {
            return;
        }
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((z19) objArr[(i << 3) + i3]).b();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1(defpackage.z19 r15) {
        /*
            r14 = this;
            ri9 r14 = r14.K
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L55
            r3 = 0
            r4 = r3
        Ld:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            z19 r11 = (defpackage.z19) r11
            java.lang.String r11 = r11.getTag()
            java.lang.String r12 = r15.getTag()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L4a
            r14.g(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r2) goto L55
            int r4 = r4 + 1
            goto Ld
        L55:
            r14.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.recycler.MessagesLayoutManager.t1(z19):void");
    }

    public final void u1(String str) {
        ri9 ri9Var = this.K;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (((z19) objArr[i4]).getTag().equals(str)) {
                            ri9Var.g(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void v1(View view, int i) {
        if (!this.G) {
            n1(i, tu0.G(30 * fk4.d().getDisplayMetrics().density));
            return;
        }
        Rect rect = this.J;
        RecyclerView.V(rect, view);
        RecyclerView recyclerView = this.I;
        int height = (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height();
        n1(i, height >= 0 ? height : 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void y0(int i) {
        hdc adapter;
        this.H = true;
        View viewR = r(i);
        if (viewR == null) {
            super.y0(i);
            RecyclerView recyclerView = this.I;
            if (recyclerView == null) {
                this.H = false;
                return;
            }
            t3a t3aVar = new t3a(recyclerView, true, new ga5(i, 2, this));
            ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(t3aVar);
            }
            recyclerView.addOnAttachStateChangeListener(t3aVar);
            return;
        }
        String str = this.F;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            RecyclerView recyclerView2 = this.I;
            ir6Var.d(us7Var, str, "LM scroll to inflated view by pos:" + i + ", curSize:" + ((recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null) ? null : Integer.valueOf(adapter.j())), null);
        }
        v1(viewR, i);
        this.H = false;
    }
}

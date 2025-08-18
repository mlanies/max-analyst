package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class s15 extends tdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tdc
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((z15) this.b).Z1.iterator();
                while (it.hasNext()) {
                    ((tdc) it.next()).a(recyclerView, i);
                }
                break;
        }
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Iterator it = ((z15) obj).Z1.iterator();
                while (it.hasNext()) {
                    ((tdc) it.next()).b(recyclerView, i, i2);
                }
                break;
            case 1:
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                zb5 zb5Var = (zb5) obj;
                int iComputeVerticalScrollRange = zb5Var.D0.computeVerticalScrollRange();
                int i3 = zb5Var.C0;
                int i4 = iComputeVerticalScrollRange - i3;
                int i5 = zb5Var.a;
                zb5Var.E0 = i4 > 0 && i3 >= i5;
                int iComputeHorizontalScrollRange = zb5Var.D0.computeHorizontalScrollRange();
                int i6 = zb5Var.B0;
                boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
                zb5Var.F0 = z;
                boolean z2 = zb5Var.E0;
                if (!z2 && !z) {
                    if (zb5Var.G0 != 0) {
                        zb5Var.l(0);
                        break;
                    }
                } else {
                    if (z2) {
                        float f = i3;
                        zb5Var.w0 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        zb5Var.v0 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
                    }
                    if (zb5Var.F0) {
                        float f2 = i6;
                        zb5Var.z0 = (int) ((((f2 / 2.0f) + iComputeHorizontalScrollOffset) * f2) / iComputeHorizontalScrollRange);
                        zb5Var.y0 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    int i7 = zb5Var.G0;
                    if (i7 == 0 || i7 == 1) {
                        zb5Var.l(1);
                        break;
                    }
                }
                break;
            case 2:
                if (i != 0 || i2 != 0) {
                    pnf.o(((cc8) ((KeyboardStickersWidget) obj).b.getValue()).X, yb8.a);
                    break;
                }
            default:
                bc7[] bc7VarArr = MediaGalleryWidget.Z;
                s86 s86VarN0 = ((MediaGalleryWidget) obj).n0();
                s86VarN0.getClass();
                pnf.o(s86VarN0.c, new q86(-recyclerView.computeVerticalScrollOffset()));
                break;
        }
    }
}

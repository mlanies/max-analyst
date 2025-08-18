package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class vz1 extends yh7 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz1(Object obj, Context context, int i) {
        super(context);
        this.p = i;
        this.q = obj;
    }

    @Override // defpackage.yh7
    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.yh7
    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.yh7
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            case 2:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.yh7
    public int f(int i) {
        switch (this.p) {
            case 1:
                return Math.min(100, super.f(i));
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.yh7
    public PointF g(int i) {
        switch (this.p) {
            case 0:
                return ((CarouselLayoutManager) this.q).a(i);
            default:
                return super.g(i);
        }
    }

    @Override // defpackage.yh7
    public void k(View view, n64 n64Var) {
        switch (this.p) {
            case 1:
                g34 g34Var = (g34) this.q;
                int[] iArrB = g34Var.b(g34Var.a.getLayoutManager(), view);
                int i = iArrB[0];
                int i2 = iArrB[1];
                int iE = e(Math.max(Math.abs(i), Math.abs(i2)));
                if (iE > 0) {
                    n64Var.e(i, i2, iE, this.i);
                    break;
                }
                break;
            case 2:
                g34 g34Var2 = (g34) this.q;
                RecyclerView recyclerView = g34Var2.a;
                if (recyclerView != null) {
                    int[] iArrB2 = g34Var2.b(recyclerView.getLayoutManager(), view);
                    int i3 = iArrB2[0];
                    int i4 = iArrB2[1];
                    int iE2 = e(Math.max(Math.abs(i3), Math.abs(i4)));
                    if (iE2 > 0) {
                        n64Var.e(i3, i4, iE2, this.i);
                        break;
                    }
                }
                break;
            default:
                super.k(view, n64Var);
                break;
        }
    }
}

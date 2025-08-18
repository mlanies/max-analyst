package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class e62 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e62(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                if (outline != null) {
                    f62 f62Var = (f62) this.b;
                    outline.setRoundRect(0, 0, f62Var.getWidth(), f62Var.getHeight(), fk4.d().getDisplayMetrics().density * 12.0f);
                    break;
                }
                break;
            case 1:
                n03 n03Var = ((Chip) this.b).s0;
                if (n03Var == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    n03Var.getOutline(outline);
                    break;
                }
            case 2:
                n63 n63Var = (n63) this.b;
                outline.setOval(0, 0, n63Var.getWidth(), n63Var.getHeight());
                break;
            case 3:
                if (outline != null) {
                    zt3 zt3Var = (zt3) this.b;
                    outline.setRoundRect(zt3Var.getLeft(), zt3Var.getTop(), zt3Var.getRight(), zt3Var.getBottom(), zt3Var.a);
                    break;
                }
                break;
            case 4:
                if (outline != null) {
                    ImageView imageView = (ImageView) this.b;
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                    break;
                }
                break;
            case 5:
                if (outline != null) {
                    zre zreVar = (zre) this.b;
                    outline.setRoundRect(0, 0, zreVar.getWidth(), zreVar.getHeight(), fk4.d().getDisplayMetrics().density * 10.0f);
                    break;
                }
                break;
            default:
                if (outline != null) {
                    q8b q8bVar = (q8b) this.b;
                    outline.setOval(0, 0, view != null ? view.getMeasuredWidth() : q8bVar.getMeasuredWidth(), view != null ? view.getMeasuredHeight() : q8bVar.getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}

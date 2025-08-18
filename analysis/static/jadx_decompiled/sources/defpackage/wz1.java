package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wz1 extends ndc {
    public final Paint a;
    public final List b;

    public wz1() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(stb.m3_carousel_debug_keyline_width));
        for (kd7 kd7Var : this.b) {
            kd7Var.getClass();
            paint.setColor(s63.c(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).O0()) {
                float fM = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.m();
                float fH = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.h();
                kd7Var.getClass();
                canvas.drawLine(0.0f, fM, 0.0f, fH, paint);
            } else {
                float fJ = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.j();
                float fK = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k();
                kd7Var.getClass();
                canvas.drawLine(fJ, 0.0f, fK, 0.0f, paint);
            }
        }
    }
}

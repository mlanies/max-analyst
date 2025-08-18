package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class fn5 extends ndc {
    public final int Y;
    public final int Z;
    public final Context a;
    public final m56 b;
    public boolean s0;
    public RecyclerView t0;
    public final fi9 c = new fi9(3);
    public final Rect o = new Rect();
    public final int X = tu0.G(32 * fk4.d().getDisplayMetrics().density);
    public final je7 u0 = tu0.r(3, new es3(16, this));

    public fn5(Application application, o59 o59Var) {
        this.a = application;
        this.b = o59Var;
        float f = 6;
        this.Y = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.Z = tu0.G(f * fk4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.ndc
    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        fi9 fi9Var = this.c;
        if (fi9Var.e == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getAlpha() != 0.0f) {
                dec decVarT = recyclerView.T(childAt);
                ht8 ht8Var = decVarT instanceof ht8 ? (ht8) decVarT : null;
                if (ht8Var == null) {
                    continue;
                } else {
                    int i2 = ht8Var.Y;
                    View view = ht8Var.a;
                    zs8 zs8Var = view instanceof zs8 ? (zs8) view : null;
                    if (zs8Var != null) {
                        boolean z = (67108864 & i2) == 0;
                        RectF rectF = zs8Var.y0;
                        if (z || ry8.a(i2, 0) || ry8.a(i2, 131072)) {
                            rectF.setEmpty();
                            zs8Var.setOnAvatarClickListener$message_list_release(null);
                        } else {
                            g5a g5aVar = (g5a) fi9Var.d(zs8Var.getAvatarId());
                            if (g5aVar == null) {
                                continue;
                            } else {
                                Rect rect = this.o;
                                zs8Var.getDrawingRect(rect);
                                recyclerView.offsetDescendantRectToMyCoords(zs8Var, rect);
                                g5aVar.setAlpha(tu0.G(childAt.getAlpha() * 255));
                                float translationX = view.getTranslationX() + this.Z;
                                float contentViewTopMargin = zs8Var.getContentViewTopMargin() + this.Y;
                                int iSave = canvas.save();
                                canvas.translate(rect.left + translationX, rect.top + contentViewTopMargin);
                                try {
                                    g5aVar.draw(canvas);
                                    rectF.left = translationX;
                                    rectF.top = contentViewTopMargin;
                                    float f = zs8Var.b;
                                    rectF.right = translationX + f;
                                    rectF.bottom = contentViewTopMargin + f;
                                    zs8Var.setOnAvatarClickListener$message_list_release(this.b);
                                } finally {
                                    canvas.restoreToCount(iSave);
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}

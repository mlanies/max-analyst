package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class vge extends e77 implements kre {
    public PorterDuffColorFilter A0;
    public final je7 B0;
    public final WeakReference Y;
    public final Context Z;
    public final k56 s0;
    public final m56 t0;
    public final je7 u0;
    public boolean v0;
    public boolean w0;
    public final RectF x0;
    public final Paint y0;
    public final Paint z0;

    public vge(je7 je7Var, WeakReference weakReference, im imVar, p59 p59Var, o59 o59Var) {
        super(0, 4);
        this.Y = weakReference;
        this.Z = imVar;
        this.s0 = p59Var;
        this.t0 = o59Var;
        this.u0 = je7Var;
        this.v0 = true;
        this.w0 = true;
        this.x0 = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.y0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.z0 = paint2;
        qp4.u0.b(imVar).i().getIcon();
        this.A0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.B0 = tu0.r(3, new zja(je7Var, 27, this));
    }

    @Override // defpackage.e77
    public final void a(RecyclerView recyclerView, dec decVar) {
        super.a(recyclerView, decVar);
        this.w0 = true;
        this.v0 = true;
    }

    @Override // defpackage.e77
    public final float d(float f) {
        return Float.MAX_VALUE;
    }

    @Override // defpackage.e77
    public final float e() {
        return 1.0f;
    }

    @Override // defpackage.e77
    public final boolean g() {
        return ((Boolean) this.s0.invoke()).booleanValue();
    }

    @Override // defpackage.e77
    public final void h(Canvas canvas, RecyclerView recyclerView, dec decVar, float f, float f2, int i, boolean z) {
        float f3;
        if (decVar instanceof ht8) {
            ht8 ht8Var = (ht8) decVar;
            zof zofVar = ht8Var.K0;
            zofVar.getClass();
            if (zofVar == zof.o || zofVar == zof.X || zofVar == zof.b) {
                float fD = ote.d(f, -(fk4.d().getDisplayMetrics().density * 96.0f), 0.0f);
                super.h(canvas, recyclerView, decVar, fD, f2, i, z);
                float fAbs = Math.abs(fD) / (fk4.d().getDisplayMetrics().density * 96.0f);
                Paint paint = this.y0;
                paint.setAlpha((int) (255 * fAbs));
                paint.setColorFilter(this.A0);
                pq9 pq9Var = qp4.u0;
                Context context = this.Z;
                int iAlpha = Color.alpha(pq9Var.b(context).i().a().s().b.g);
                Paint paint2 = this.z0;
                paint2.setColor(pq9Var.b(context).i().a().s().b.g);
                paint2.setAlpha((int) (iAlpha * fAbs));
                View view = ht8Var.I0;
                float right = (fk4.d().getDisplayMetrics().density * 8.0f) + view.getRight() + fD + ((1 - fAbs) * fk4.d().getDisplayMetrics().density * 32.0f) + (fk4.d().getDisplayMetrics().density * 20.0f);
                View view2 = decVar.a;
                int bottom = ((RecyclerView) view2.getParent()).getBottom();
                float f4 = (fk4.d().getDisplayMetrics().density * 20.0f) + (fk4.d().getDisplayMetrics().density * 8.0f);
                float f5 = (fk4.d().getDisplayMetrics().density * 20.0f) + f4;
                if (view.getHeight() < f5 || bottom - view2.getTop() < f5) {
                    float top = (fk4.d().getDisplayMetrics().density * 20.0f) + view2.getTop();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    f3 = top + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r2.topMargin : 0);
                } else if (view2.getBottom() < bottom) {
                    float bottom2 = view2.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    f3 = bottom2 - (((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r2.bottomMargin : 0) + f4);
                } else {
                    f3 = bottom - f4;
                }
                canvas.drawCircle(right, f3, fk4.d().getDisplayMetrics().density * 20.0f, paint2);
                float f6 = fk4.d().getDisplayMetrics().density * 20.0f;
                RectF rectF = this.x0;
                float f7 = f6 / 2.0f;
                rectF.set(right - f7, f3 - f7, right + f7, f3 + f7);
                canvas.drawBitmap((Bitmap) this.B0.getValue(), (Rect) null, rectF, paint);
                boolean z2 = fD < (-(fk4.d().getDisplayMetrics().density * 70.0f));
                WeakReference weakReference = this.Y;
                if (z2 && this.v0) {
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        pag.F(view3, mi6.CONFIRM);
                    }
                    this.v0 = false;
                } else if (!z2) {
                    this.v0 = true;
                }
                if (z || fD >= (-(fk4.d().getDisplayMetrics().density * 70.0f)) || !this.w0) {
                    return;
                }
                this.w0 = false;
                View view4 = (View) weakReference.get();
                if (view4 != null) {
                    view4.post(new vs5(view4, 10, view4));
                }
                this.t0.invoke(Integer.valueOf(ht8Var.h()));
            }
        }
    }

    @Override // defpackage.e77
    public final boolean i(dec decVar, dec decVar2) {
        return false;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.A0 = new PorterDuffColorFilter(fkaVar.getIcon().f, PorterDuff.Mode.SRC_IN);
    }
}

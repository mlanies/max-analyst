package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public final class ek6 implements spf {
    public final Rect a = new Rect();
    public final /* synthetic */ jec b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ Path d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ Rect f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ Rect h;
    public final /* synthetic */ RectF i;
    public final /* synthetic */ Float j;
    public final /* synthetic */ float[] k;
    public final /* synthetic */ RectF l;
    public final /* synthetic */ View m;

    public ek6(jec jecVar, Path path, Path path2, Rect rect, Rect rect2, Integer num, Rect rect3, RectF rectF, Float f, float[] fArr, RectF rectF2, View view) {
        this.b = jecVar;
        this.c = path;
        this.d = path2;
        this.e = rect;
        this.f = rect2;
        this.g = num;
        this.h = rect3;
        this.i = rectF;
        this.j = f;
        this.k = fArr;
        this.l = rectF2;
        this.m = view;
    }

    @Override // defpackage.spf
    public final void a() {
        this.c.reset();
        this.d.reset();
        this.b.a = false;
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }

    @Override // defpackage.spf
    public final void c(Rect rect, View view) {
        View viewT;
        Rect rect2 = this.a;
        if (tpa.f(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        this.b.a = true;
        Path path = this.c;
        path.reset();
        Path path2 = this.d;
        path2.reset();
        Rect rect3 = this.e;
        rect3.set(rect);
        Rect rect4 = fk6.b;
        Rect rect5 = this.f;
        if (rect5 != rect4) {
            rect3.left += rect5.left;
            rect3.top += rect5.top;
            rect3.right -= rect5.right;
            rect3.bottom -= rect5.bottom;
        }
        Integer num = this.g;
        if (num == null || (viewT = br7.t(view, num.intValue())) == null) {
            viewT = (View) view.getParent();
        }
        mpf.d(this.h, viewT);
        RectF rectF = this.i;
        rectF.set(rect3);
        rectF.top = Math.max(rect3.top, r7.top);
        rectF.bottom = Math.max(rect3.bottom, r7.top);
        if (this.j != null) {
            Path.Direction direction = Path.Direction.CCW;
            path2.addRect(rectF, direction);
            RectF rectF2 = this.l;
            rectF2.set(rect3);
            path.addRoundRect(rectF2, this.k, direction);
            path.op(path2, Path.Op.INTERSECT);
        } else {
            path.addRect(rectF, Path.Direction.CCW);
        }
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }
}

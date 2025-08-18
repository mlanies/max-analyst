package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class no9 extends bmd {
    public static final /* synthetic */ bc7[] j;
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final yj i = new yj(this);

    static {
        oi9 oi9Var = new oi9(no9.class, "cornerRadius", "getCornerRadius()F");
        nec.a.getClass();
        j = new bc7[]{oi9Var};
    }

    @Override // defpackage.bmd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.h;
        rectF.set(getBounds());
        Path path = this.g;
        path.reset();
        bc7[] bc7VarArr = j;
        bc7 bc7Var = bc7VarArr[0];
        yj yjVar = this.i;
        float fFloatValue = ((Number) yjVar.b).floatValue();
        bc7 bc7Var2 = bc7VarArr[0];
        path.addRoundRect(rectF, fFloatValue, ((Number) yjVar.b).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}

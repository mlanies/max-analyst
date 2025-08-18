package defpackage;

import android.R;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class f7a extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] v0;
    public static final float[] w0;
    public final yj a;
    public final ShapeDrawable b;
    public final ShapeDrawable c;
    public final ShapeDrawable o;
    public final Matrix s0;
    public final je7 t0;
    public final je7 u0;

    static {
        oi9 oi9Var = new oi9(f7a.class, "state", "getState()Lone/me/sdk/uikit/common/button/OneMeButtonTextPromo$State;");
        nec.a.getClass();
        v0 = new bc7[]{oi9Var};
        w0 = new float[]{0.0f, 0.41f, 1.0f};
    }

    public f7a(Context context) {
        super(context, null);
        this.a = new yj(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.b = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.c = shapeDrawable2;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        this.o = shapeDrawable3;
        this.s0 = new Matrix();
        this.t0 = tu0.r(3, new hy4(context, 23));
        this.u0 = tu0.r(3, new yf3(context, 23, this));
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        float f = 52;
        setMinimumWidth(tu0.G(fk4.d().getDisplayMetrics().density * f));
        setMinimumHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, shapeDrawable);
        stateListDrawable.addState(new int[]{-16842910}, shapeDrawable3);
        setBackground(stateListDrawable);
        float f2 = 20;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
        a(getState());
        onThemeChanged(qp4.u0.j(this));
    }

    public final void a(e7a e7aVar) {
        int iOrdinal = e7aVar.ordinal();
        je7 je7Var = this.u0;
        je7 je7Var2 = this.t0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((View) je7Var2.getValue()).setVisibility(8);
            ((View) je7Var.getValue()).setVisibility(0);
            return;
        }
        ((View) je7Var2.getValue()).setVisibility(0);
        if (je7Var.a()) {
            ((nfa) je7Var.getValue()).setVisibility(8);
        }
    }

    public final e7a getState() {
        bc7 bc7Var = v0[0];
        return (e7a) this.a.b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Matrix matrix = this.s0;
        matrix.reset();
        matrix.setScale(i, i2);
        matrix.postTranslate(0.0f, 0.0f);
        ((LinearGradient) this.b.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.c.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.o.getPaint().getShader()).setLocalMatrix(matrix);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Paint paint = this.b.getPaint();
        int[] iArr = fkaVar.e().b.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float[] fArr = w0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, iArr, fArr, tileMode);
        Matrix matrix = this.s0;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        Paint paint2 = this.c.getPaint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, fkaVar.e().b.c, fArr, tileMode);
        linearGradient2.setLocalMatrix(matrix);
        paint2.setShader(linearGradient2);
        Paint paint3 = this.o.getPaint();
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, fkaVar.e().b.b, fArr, tileMode);
        linearGradient3.setLocalMatrix(matrix);
        paint3.setShader(linearGradient3);
        je7 je7Var = this.t0;
        if (je7Var.a()) {
            ((TextView) je7Var.getValue()).setTextColor(-1);
        }
    }

    public final void setState(e7a e7aVar) {
        this.a.o1(this, v0[0], e7aVar);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.t0.getValue();
        textView.setId(xoc.j);
        textView.setText(charSequence);
        br7.b(this, textView, -1);
    }

    public final void setText(int i) {
        TextView textView = (TextView) this.t0.getValue();
        textView.setText(i);
        br7.b(this, textView, -1);
    }
}

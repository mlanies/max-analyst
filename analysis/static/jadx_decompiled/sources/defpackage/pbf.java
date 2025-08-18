package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class pbf extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public pbf(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        qbf qbfVar = new qbf();
        qbfVar.a = (VectorDrawable) this.a.newDrawable();
        return qbfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        qbf qbfVar = new qbf();
        qbfVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return qbfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        qbf qbfVar = new qbf();
        qbfVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return qbfVar;
    }
}

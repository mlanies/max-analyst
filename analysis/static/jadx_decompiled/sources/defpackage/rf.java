package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes.dex */
public final class rf extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public rf(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.b = enhancedVectorDrawable;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                sf sfVar = new sf(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                sfVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) this.b;
                return new EnhancedVectorDrawable(enhancedVectorDrawable.resources, enhancedVectorDrawable.resId);
        }
    }

    public rf(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                sf sfVar = new sf(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                sfVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                return resources != null ? new EnhancedVectorDrawable(resources, ((EnhancedVectorDrawable) this.b).resId) : newDrawable();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                sf sfVar = new sf(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                sfVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}

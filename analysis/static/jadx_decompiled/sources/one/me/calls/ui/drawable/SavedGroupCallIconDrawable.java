package one.me.calls.ui.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import defpackage.je7;
import defpackage.ngg;
import defpackage.pub;
import defpackage.qic;
import defpackage.qp4;
import defpackage.vic;
import defpackage.yi1;
import defpackage.zi1;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J5\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0018\u00010\u0017R\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lone/me/calls/ui/drawable/SavedGroupCallIconDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "alpha", "Le5f;", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "Landroid/content/res/Resources;", "r", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "inflate", "(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/content/Context;", "context$delegate", "Lje7;", "getContext", "()Landroid/content/Context;", "context", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class SavedGroupCallIconDrawable extends Drawable {
    private final ShapeDrawable backgroundDrawable;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final je7 context;
    private Drawable iconDrawable;

    public SavedGroupCallIconDrawable() {
        je7 je7Var = yi1.a;
        this.context = zi1.a.getAccessor().d(Context.class);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(qp4.u0.o(getContext()).c.b().d);
        this.backgroundDrawable = shapeDrawable;
    }

    private final Context getContext() {
        return (Context) this.context.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds;
        this.backgroundDrawable.draw(canvas);
        Drawable drawable = this.iconDrawable;
        if (drawable == null || (bounds = drawable.getBounds()) == null) {
            return;
        }
        float fWidth = bounds.width() / 2.0f;
        float fExactCenterX = getBounds().exactCenterX() - fWidth;
        float fExactCenterY = getBounds().exactCenterY() - fWidth;
        int iSave = canvas.save();
        canvas.translate(fExactCenterX, fExactCenterY);
        try {
            Drawable drawable2 = this.iconDrawable;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int i = pub.ic_group_call_fill_16;
        ThreadLocal threadLocal = vic.a;
        Drawable drawableA = qic.a(r, i, null);
        ngg.G(drawableA, qp4.u0.o(getContext()).c.getIcon().f);
        this.iconDrawable = drawableA;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        this.backgroundDrawable.setBounds(bounds);
        int iWidth = (int) (bounds.width() * 0.6d);
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, iWidth, iWidth);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

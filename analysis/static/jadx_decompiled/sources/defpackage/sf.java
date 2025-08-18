package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class sf extends hbf implements Animatable {
    public final Context c;
    public h6 o = null;
    public ArrayList X = null;
    public final pf Y = new pf(0, this);
    public final qf b = new qf();

    public sf(Context context) {
        this.c = context;
    }

    @Override // defpackage.hbf, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return aq4.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        qf qfVar = this.b;
        qfVar.a.draw(canvas);
        if (qfVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? aq4.c(drawable) : this.b.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new rf(this.a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : this.b.a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.b.playTogether(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.a
            if (r0 == 0) goto L8
            defpackage.aq4.d(r0, r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            qf r3 = r8.b
            if (r0 == r2) goto Lc8
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc8
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc2
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L68
            int[] r0 = defpackage.tu0.e
            android.content.res.TypedArray r0 = defpackage.ote.G(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L64
            qbf r6 = new qbf
            r6.<init>()
            java.lang.ThreadLocal r7 = defpackage.vic.a
            android.graphics.drawable.Drawable r4 = defpackage.qic.a(r9, r4, r12)
            r6.a = r4
            pbf r4 = new pbf
            android.graphics.drawable.Drawable r7 = r6.a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r4.<init>(r7)
            r6.Y = r5
            pf r4 = r8.Y
            r6.setCallback(r4)
            qbf r4 = r3.a
            if (r4 == 0) goto L62
            r5 = 0
            r4.setCallback(r5)
        L62:
            r3.a = r6
        L64:
            r0.recycle()
            goto Lc2
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc2
            int[] r0 = defpackage.tu0.f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lbf
            android.content.Context r7 = r8.c
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            qbf r7 = r3.a
            obf r7 = r7.b
            nbf r7 = r7.b
            us r7 = r7.o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.c
            if (r7 != 0) goto La9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.c = r7
            us r7 = new us
            r7.<init>(r5)
            r3.d = r7
        La9:
            java.util.ArrayList r5 = r3.c
            r5.add(r6)
            us r3 = r3.d
            r3.put(r6, r4)
            goto Lbf
        Lb4:
            r0.recycle()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Context can't be null when inflating animators"
            r8.<init>(r9)
            throw r8
        Lbf:
            r0.recycle()
        Lc2:
            int r0 = r10.next()
            goto L12
        Lc8:
            android.animation.AnimatorSet r8 = r3.b
            if (r8 != 0) goto Ld3
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r3.b = r8
        Ld3:
            android.animation.AnimatorSet r8 = r3.b
            java.util.ArrayList r9 = r3.c
            r8.playTogether(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : this.b.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.a.setBounds(rect);
        }
    }

    @Override // defpackage.hbf, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : this.b.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : this.b.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ote.R(drawable, i);
        } else {
            this.b.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ote.S(drawable, colorStateList);
        } else {
            this.b.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ote.T(drawable, mode);
        } else {
            this.b.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        qf qfVar = this.b;
        if (qfVar.b.isStarted()) {
            return;
        }
        qfVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

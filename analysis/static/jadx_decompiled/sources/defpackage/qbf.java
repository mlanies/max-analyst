package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class qbf extends hbf {
    public static final PorterDuff.Mode u0 = PorterDuff.Mode.SRC_IN;
    public boolean X;
    public boolean Y;
    public final float[] Z;
    public obf b;
    public PorterDuffColorFilter c;
    public ColorFilter o;
    public final Matrix s0;
    public final Rect t0;

    public qbf() {
        this.Y = true;
        this.Z = new float[9];
        this.s0 = new Matrix();
        this.t0 = new Rect();
        obf obfVar = new obf();
        obfVar.c = null;
        obfVar.d = u0;
        obfVar.b = new nbf();
        this.b = obfVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        aq4.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.t0;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.o;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.s0;
        canvas.getMatrix(matrix);
        float[] fArr = this.Z;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && bq4.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        obf obfVar = this.b;
        Bitmap bitmap = obfVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != obfVar.f.getHeight()) {
            obfVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            obfVar.k = true;
        }
        if (this.Y) {
            obf obfVar2 = this.b;
            if (obfVar2.k || obfVar2.g != obfVar2.c || obfVar2.h != obfVar2.d || obfVar2.j != obfVar2.e || obfVar2.i != obfVar2.b.getRootAlpha()) {
                obf obfVar3 = this.b;
                obfVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(obfVar3.f);
                nbf nbfVar = obfVar3.b;
                nbfVar.a(nbfVar.g, nbf.p, canvas2, iMin, iMin2);
                obf obfVar4 = this.b;
                obfVar4.g = obfVar4.c;
                obfVar4.h = obfVar4.d;
                obfVar4.i = obfVar4.b.getRootAlpha();
                obfVar4.j = obfVar4.e;
                obfVar4.k = false;
            }
        } else {
            obf obfVar5 = this.b;
            obfVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(obfVar5.f);
            nbf nbfVar2 = obfVar5.b;
            nbfVar2.a(nbfVar2.g, nbf.p, canvas3, iMin, iMin2);
        }
        obf obfVar6 = this.b;
        if (obfVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (obfVar6.l == null) {
                Paint paint2 = new Paint();
                obfVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            obfVar6.l.setAlpha(obfVar6.b.getRootAlpha());
            obfVar6.l.setColorFilter(colorFilter);
            paint = obfVar6.l;
        }
        canvas.drawBitmap(obfVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? aq4.c(drawable) : this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new pbf(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            obf obfVar = this.b;
            if (obfVar != null) {
                nbf nbfVar = obfVar.b;
                if (nbfVar.n == null) {
                    nbfVar.n = Boolean.valueOf(nbfVar.g.a());
                }
                if (nbfVar.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            obf obfVar = this.b;
            obf obfVar2 = new obf();
            obfVar2.c = null;
            obfVar2.d = u0;
            if (obfVar != null) {
                obfVar2.a = obfVar.a;
                nbf nbfVar = new nbf(obfVar.b);
                obfVar2.b = nbfVar;
                if (obfVar.b.e != null) {
                    nbfVar.e = new Paint(obfVar.b.e);
                }
                if (obfVar.b.d != null) {
                    obfVar2.b.d = new Paint(obfVar.b.d);
                }
                obfVar2.c = obfVar.c;
                obfVar2.d = obfVar.d;
                obfVar2.e = obfVar.e;
            }
            this.b = obfVar2;
            this.X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        obf obfVar = this.b;
        ColorStateList colorStateList = obfVar.c;
        if (colorStateList == null || (mode = obfVar.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        nbf nbfVar = obfVar.b;
        if (nbfVar.n == null) {
            nbfVar.n = Boolean.valueOf(nbfVar.g.a());
        }
        if (nbfVar.n.booleanValue()) {
            boolean zB = obfVar.b.g.b(iArr);
            obfVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.o = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ote.R(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.h(drawable, colorStateList);
            return;
        }
        obf obfVar = this.b;
        if (obfVar.c != colorStateList) {
            obfVar.c = colorStateList;
            this.c = a(colorStateList, obfVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.i(drawable, mode);
            return;
        }
        obf obfVar = this.b;
        if (obfVar.d != mode) {
            obfVar.d = mode;
            this.c = a(obfVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        nbf nbfVar;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        obf obfVar = this.b;
        obfVar.b = new nbf();
        TypedArray typedArrayG = ote.G(resources, theme, attributeSet, tu0.a);
        obf obfVar2 = this.b;
        nbf nbfVar2 = obfVar2.b;
        int i4 = !ote.z(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        obfVar2.d = mode;
        int i6 = 1;
        ColorStateList colorStateListA = null;
        boolean z3 = false;
        if (ote.z(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = r63.a;
                try {
                    colorStateListA = r63.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            obfVar2.c = colorStateList;
        }
        boolean z4 = obfVar2.e;
        if (ote.z(xmlPullParser, "autoMirrored")) {
            z4 = typedArrayG.getBoolean(5, z4);
        }
        obfVar2.e = z4;
        float f = nbfVar2.j;
        if (ote.z(xmlPullParser, "viewportWidth")) {
            f = typedArrayG.getFloat(7, f);
        }
        nbfVar2.j = f;
        float f2 = nbfVar2.k;
        if (ote.z(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayG.getFloat(8, f2);
        }
        nbfVar2.k = f2;
        if (nbfVar2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            nbfVar2.h = typedArrayG.getDimension(3, nbfVar2.h);
            float dimension = typedArrayG.getDimension(2, nbfVar2.i);
            nbfVar2.i = dimension;
            if (nbfVar2.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nbfVar2.getAlpha();
                if (ote.z(xmlPullParser, "alpha")) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                nbfVar2.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    nbfVar2.m = string;
                    nbfVar2.o.put(string, nbfVar2);
                }
                typedArrayG.recycle();
                obfVar.a = getChangingConfigurations();
                obfVar.k = true;
                obf obfVar3 = this.b;
                nbf nbfVar3 = obfVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nbfVar3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z5 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        kbf kbfVar = (kbf) arrayDeque.peek();
                        boolean zEquals = ClientCookie.PATH_ATTR.equals(name);
                        i = depth;
                        us usVar = nbfVar3.o;
                        if (zEquals) {
                            jbf jbfVar = new jbf();
                            jbfVar.f = 0.0f;
                            jbfVar.h = 1.0f;
                            jbfVar.i = 1.0f;
                            jbfVar.j = 0.0f;
                            jbfVar.k = 1.0f;
                            jbfVar.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jbfVar.m = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            jbfVar.n = join3;
                            nbfVar = nbfVar3;
                            jbfVar.o = 4.0f;
                            TypedArray typedArrayG2 = ote.G(resources, theme, attributeSet, tu0.c);
                            if (ote.z(xmlPullParser, "pathData")) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    jbfVar.b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    jbfVar.a = m6d.h(string3);
                                }
                                jbfVar.g = ote.t(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = jbfVar.i;
                                if (ote.z(xmlPullParser, "fillAlpha")) {
                                    f3 = typedArrayG2.getFloat(12, f3);
                                }
                                jbfVar.i = f3;
                                int i8 = !ote.z(xmlPullParser, "strokeLineCap") ? -1 : typedArrayG2.getInt(8, -1);
                                Paint.Cap cap3 = jbfVar.m;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                jbfVar.m = cap;
                                int i9 = !ote.z(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayG2.getInt(9, -1);
                                Paint.Join join4 = jbfVar.n;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                jbfVar.n = join2;
                                float f4 = jbfVar.o;
                                if (ote.z(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = typedArrayG2.getFloat(10, f4);
                                }
                                jbfVar.o = f4;
                                jbfVar.e = ote.t(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = jbfVar.h;
                                if (ote.z(xmlPullParser, "strokeAlpha")) {
                                    f5 = typedArrayG2.getFloat(11, f5);
                                }
                                jbfVar.h = f5;
                                float f6 = jbfVar.f;
                                if (ote.z(xmlPullParser, "strokeWidth")) {
                                    f6 = typedArrayG2.getFloat(4, f6);
                                }
                                jbfVar.f = f6;
                                float f7 = jbfVar.k;
                                if (ote.z(xmlPullParser, "trimPathEnd")) {
                                    f7 = typedArrayG2.getFloat(6, f7);
                                }
                                jbfVar.k = f7;
                                float f8 = jbfVar.l;
                                if (ote.z(xmlPullParser, "trimPathOffset")) {
                                    f8 = typedArrayG2.getFloat(7, f8);
                                }
                                jbfVar.l = f8;
                                float f9 = jbfVar.j;
                                if (ote.z(xmlPullParser, "trimPathStart")) {
                                    f9 = typedArrayG2.getFloat(5, f9);
                                }
                                jbfVar.j = f9;
                                int i10 = jbfVar.c;
                                if (ote.z(xmlPullParser, "fillType")) {
                                    i10 = typedArrayG2.getInt(13, i10);
                                }
                                jbfVar.c = i10;
                            }
                            typedArrayG2.recycle();
                            kbfVar.b.add(jbfVar);
                            if (jbfVar.getPathName() != null) {
                                usVar.put(jbfVar.getPathName(), jbfVar);
                            }
                            obfVar3.a |= jbfVar.d;
                            z2 = false;
                            i2 = 1;
                            z5 = false;
                        } else {
                            nbfVar = nbfVar3;
                            if ("clip-path".equals(name)) {
                                ibf ibfVar = new ibf();
                                if (ote.z(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayG3 = ote.G(resources, theme, attributeSet, tu0.d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        ibfVar.b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        ibfVar.a = m6d.h(string5);
                                    }
                                    ibfVar.c = !ote.z(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                kbfVar.b.add(ibfVar);
                                if (ibfVar.getPathName() != null) {
                                    usVar.put(ibfVar.getPathName(), ibfVar);
                                }
                                obfVar3.a = ibfVar.d | obfVar3.a;
                            } else if ("group".equals(name)) {
                                kbf kbfVar2 = new kbf();
                                TypedArray typedArrayG4 = ote.G(resources, theme, attributeSet, tu0.b);
                                float f10 = kbfVar2.c;
                                if (ote.z(xmlPullParser, "rotation")) {
                                    f10 = typedArrayG4.getFloat(5, f10);
                                }
                                kbfVar2.c = f10;
                                i2 = 1;
                                kbfVar2.d = typedArrayG4.getFloat(1, kbfVar2.d);
                                kbfVar2.e = typedArrayG4.getFloat(2, kbfVar2.e);
                                float f11 = kbfVar2.f;
                                if (ote.z(xmlPullParser, "scaleX")) {
                                    f11 = typedArrayG4.getFloat(3, f11);
                                }
                                kbfVar2.f = f11;
                                float f12 = kbfVar2.g;
                                if (ote.z(xmlPullParser, "scaleY")) {
                                    f12 = typedArrayG4.getFloat(4, f12);
                                }
                                kbfVar2.g = f12;
                                float f13 = kbfVar2.h;
                                if (ote.z(xmlPullParser, "translateX")) {
                                    f13 = typedArrayG4.getFloat(6, f13);
                                }
                                kbfVar2.h = f13;
                                float f14 = kbfVar2.i;
                                if (ote.z(xmlPullParser, "translateY")) {
                                    f14 = typedArrayG4.getFloat(7, f14);
                                }
                                kbfVar2.i = f14;
                                z2 = false;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    kbfVar2.l = string6;
                                }
                                kbfVar2.c();
                                typedArrayG4.recycle();
                                kbfVar.b.add(kbfVar2);
                                arrayDeque.push(kbfVar2);
                                if (kbfVar2.getGroupName() != null) {
                                    usVar.put(kbfVar2.getGroupName(), kbfVar2);
                                }
                                obfVar3.a = kbfVar2.k | obfVar3.a;
                            }
                            z2 = false;
                            i2 = 1;
                        }
                        z = z2;
                        i3 = 3;
                    } else {
                        nbfVar = nbfVar3;
                        i = depth;
                        i2 = i6;
                        z = z3;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z3 = z;
                    i6 = i2;
                    depth = i;
                    nbfVar3 = nbfVar;
                }
                if (!z5) {
                    this.c = a(obfVar.c, obfVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public qbf(obf obfVar) {
        this.Y = true;
        this.Z = new float[9];
        this.s0 = new Matrix();
        this.t0 = new Rect();
        this.b = obfVar;
        this.c = a(obfVar.c, obfVar.d);
    }
}

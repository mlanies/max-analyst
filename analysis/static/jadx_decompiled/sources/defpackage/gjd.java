package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class gjd {
    public hm9 a = new rnc();
    public hm9 b = new rnc();
    public hm9 c = new rnc();
    public hm9 d = new rnc();
    public hx3 e = new a0(0.0f);
    public hx3 f = new a0(0.0f);
    public hx3 g = new a0(0.0f);
    public hx3 h = new a0(0.0f);
    public vu4 i = new vu4();
    public vu4 j = new vu4();
    public vu4 k = new vu4();
    public vu4 l = new vu4();

    public static i8g a(Context context, int i, int i2, a0 a0Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(z2c.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(z2c.ShapeAppearance_cornerFamilyBottomLeft, i3);
            hx3 hx3VarC = c(typedArrayObtainStyledAttributes, z2c.ShapeAppearance_cornerSize, a0Var);
            hx3 hx3VarC2 = c(typedArrayObtainStyledAttributes, z2c.ShapeAppearance_cornerSizeTopLeft, hx3VarC);
            hx3 hx3VarC3 = c(typedArrayObtainStyledAttributes, z2c.ShapeAppearance_cornerSizeTopRight, hx3VarC);
            hx3 hx3VarC4 = c(typedArrayObtainStyledAttributes, z2c.ShapeAppearance_cornerSizeBottomRight, hx3VarC);
            hx3 hx3VarC5 = c(typedArrayObtainStyledAttributes, z2c.ShapeAppearance_cornerSizeBottomLeft, hx3VarC);
            i8g i8gVar = new i8g();
            hm9 hm9VarF = nu0.f(i4);
            i8gVar.a = hm9VarF;
            i8g.d(hm9VarF);
            i8gVar.e = hx3VarC2;
            hm9 hm9VarF2 = nu0.f(i5);
            i8gVar.b = hm9VarF2;
            i8g.d(hm9VarF2);
            i8gVar.f = hx3VarC3;
            hm9 hm9VarF3 = nu0.f(i6);
            i8gVar.c = hm9VarF3;
            i8g.d(hm9VarF3);
            i8gVar.g = hx3VarC4;
            hm9 hm9VarF4 = nu0.f(i7);
            i8gVar.d = hm9VarF4;
            i8g.d(hm9VarF4);
            i8gVar.h = hx3VarC5;
            return i8gVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static i8g b(Context context, AttributeSet attributeSet, int i, int i2) {
        a0 a0Var = new a0(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, a0Var);
    }

    public static hx3 c(TypedArray typedArray, int i, hx3 hx3Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return hx3Var;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new a0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new nfc(typedValuePeekValue.getFraction(1.0f, 1.0f)) : hx3Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(vu4.class) && this.j.getClass().equals(vu4.class) && this.i.getClass().equals(vu4.class) && this.k.getClass().equals(vu4.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof rnc) && (this.a instanceof rnc) && (this.c instanceof rnc) && (this.d instanceof rnc));
    }

    public final i8g e() {
        i8g i8gVar = new i8g();
        i8gVar.a = this.a;
        i8gVar.b = this.b;
        i8gVar.c = this.c;
        i8gVar.d = this.d;
        i8gVar.e = this.e;
        i8gVar.f = this.f;
        i8gVar.g = this.g;
        i8gVar.h = this.h;
        i8gVar.i = this.i;
        i8gVar.j = this.j;
        i8gVar.k = this.k;
        i8gVar.l = this.l;
        return i8gVar;
    }
}

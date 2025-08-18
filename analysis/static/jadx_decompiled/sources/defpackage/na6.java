package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class na6 extends uq4 {
    public na6(Context context) throws Throwable {
        super(context);
        k(context, null);
    }

    public final void k(Context context, AttributeSet attributeSet) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        boolean z5;
        Context context2 = context;
        f46.I();
        f46.I();
        ma6 ma6Var = new ma6(context.getResources());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, w2c.GenericDraweeHierarchy);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                boolean z6 = true;
                int i6 = 0;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int integer = 0;
                int dimensionPixelSize = 0;
                while (i6 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i6);
                        if (index == w2c.GenericDraweeHierarchy_actualImageScaleType) {
                            ma6Var.l = v3c.t(typedArrayObtainStyledAttributes, index);
                        } else if (index == w2c.GenericDraweeHierarchy_placeholderImage) {
                            ma6Var.d = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                        } else {
                            i3 = indexCount;
                            if (index == w2c.GenericDraweeHierarchy_pressedStateOverlayImage) {
                                Drawable drawableN = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                                if (drawableN == null) {
                                    ma6Var.o = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableN);
                                    ma6Var.o = stateListDrawable;
                                }
                            } else if (index == w2c.GenericDraweeHierarchy_progressBarImage) {
                                ma6Var.j = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_fadeDuration) {
                                ma6Var.b = typedArrayObtainStyledAttributes.getInt(index, 0);
                            } else if (index == w2c.GenericDraweeHierarchy_viewAspectRatio) {
                                ma6Var.c = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                            } else if (index == w2c.GenericDraweeHierarchy_placeholderImageScaleType) {
                                ma6Var.e = v3c.t(typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_retryImage) {
                                ma6Var.f = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_retryImageScaleType) {
                                ma6Var.g = v3c.t(typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_failureImage) {
                                ma6Var.h = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_failureImageScaleType) {
                                ma6Var.i = v3c.t(typedArrayObtainStyledAttributes, index);
                            } else if (index == w2c.GenericDraweeHierarchy_progressBarImageScaleType) {
                                ma6Var.k = v3c.t(typedArrayObtainStyledAttributes, index);
                            } else {
                                if (index == w2c.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                                    integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                                } else {
                                    int i7 = integer;
                                    if (index == w2c.GenericDraweeHierarchy_backgroundImage) {
                                        ma6Var.m = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                                    } else if (index == w2c.GenericDraweeHierarchy_overlayImage) {
                                        Drawable drawableN2 = v3c.n(context2, typedArrayObtainStyledAttributes, index);
                                        if (drawableN2 == null) {
                                            ma6Var.n = null;
                                        } else {
                                            ma6Var.n = Arrays.asList(drawableN2);
                                        }
                                    } else if (index == w2c.GenericDraweeHierarchy_roundAsCircle) {
                                        v3c.s(ma6Var).b = typedArrayObtainStyledAttributes.getBoolean(index, false);
                                    } else {
                                        if (index == w2c.GenericDraweeHierarchy_roundedCornerRadius) {
                                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                                        } else {
                                            int i8 = dimensionPixelSize;
                                            if (index == w2c.GenericDraweeHierarchy_roundTopLeft) {
                                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopRight) {
                                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomLeft) {
                                                z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomRight) {
                                                z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopStart) {
                                                z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundTopEnd) {
                                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomStart) {
                                                z6 = typedArrayObtainStyledAttributes.getBoolean(index, z6);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundBottomEnd) {
                                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                                            } else if (index == w2c.GenericDraweeHierarchy_roundWithOverlayColor) {
                                                wnc wncVarS = v3c.s(ma6Var);
                                                i4 = i8;
                                                wncVarS.d = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                wncVarS.a = 1;
                                                i5 = i7;
                                                int i9 = i5;
                                                dimensionPixelSize = i4;
                                                integer = i9;
                                            } else {
                                                i4 = i8;
                                                if (index == w2c.GenericDraweeHierarchy_roundingBorderWidth) {
                                                    wnc wncVarS2 = v3c.s(ma6Var);
                                                    float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                    wncVarS2.getClass();
                                                    if (dimensionPixelSize2 >= 0.0f) {
                                                        i5 = i7;
                                                        z5 = true;
                                                    } else {
                                                        i5 = i7;
                                                        z5 = false;
                                                    }
                                                    od2.k("the border width cannot be < 0", z5);
                                                    wncVarS2.e = dimensionPixelSize2;
                                                } else {
                                                    i5 = i7;
                                                    if (index == w2c.GenericDraweeHierarchy_roundingBorderColor) {
                                                        v3c.s(ma6Var).f = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                    } else if (index == w2c.GenericDraweeHierarchy_roundingBorderPadding) {
                                                        wnc wncVarS3 = v3c.s(ma6Var);
                                                        float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                        wncVarS3.getClass();
                                                        od2.k("the padding cannot be < 0", dimensionPixelSize3 >= 0.0f);
                                                        wncVarS3.g = dimensionPixelSize3;
                                                    }
                                                }
                                                int i92 = i5;
                                                dimensionPixelSize = i4;
                                                integer = i92;
                                            }
                                            dimensionPixelSize = i8;
                                        }
                                        integer = i7;
                                    }
                                    i4 = dimensionPixelSize;
                                    i5 = i7;
                                    int i922 = i5;
                                    dimensionPixelSize = i4;
                                    integer = i922;
                                }
                                i6++;
                                context2 = context;
                                indexCount = i3;
                            }
                            int i10 = dimensionPixelSize;
                            i5 = integer;
                            i4 = i10;
                            int i9222 = i5;
                            dimensionPixelSize = i4;
                            integer = i9222;
                            i6++;
                            context2 = context;
                            indexCount = i3;
                        }
                        i3 = indexCount;
                        int i102 = dimensionPixelSize;
                        i5 = integer;
                        i4 = i102;
                        int i92222 = i5;
                        dimensionPixelSize = i4;
                        integer = i92222;
                        i6++;
                        context2 = context;
                        indexCount = i3;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                int i11 = dimensionPixelSize;
                int i12 = integer;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z = z7 && z10;
                    z2 = z9 && z8;
                    z3 = z11 && z6;
                    z4 = z13 && z12;
                    i2 = i11;
                    i = i12;
                } else {
                    z = z7 && z8;
                    z2 = z9 && z10;
                    i2 = i11;
                    i = i12;
                    boolean z14 = z11 && z12;
                    z4 = z13 && z6;
                    z3 = z14;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i = 0;
            i2 = 0;
        }
        if (ma6Var.j == null || i <= 0) {
            f = 0.0f;
        } else {
            Drawable drawable = ma6Var.j;
            drawable.getClass();
            h90 h90Var = new h90(drawable);
            f = 0.0f;
            h90Var.Z = 0.0f;
            h90Var.s0 = false;
            h90Var.X = i;
            h90Var.Y = true;
            ma6Var.j = h90Var;
        }
        if (i2 > 0) {
            v3c.s(ma6Var).c(z ? i2 : f, z2 ? i2 : f, z3 ? i2 : f, z4 ? i2 : f);
        }
        f46.I();
        setAspectRatio(ma6Var.c);
        setHierarchy(ma6Var.a());
        f46.I();
    }

    public na6(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        k(context, attributeSet);
    }

    public na6(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        k(context, attributeSet);
    }
}

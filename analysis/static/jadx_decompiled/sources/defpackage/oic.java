package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oic {
    public static oic g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public q40 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final bo0 h = new bo0(6, 2);

    public static synchronized oic c() {
        try {
            if (g == null) {
                g = new oic();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        bo0 bo0Var = h;
        bo0Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) bo0Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                wv7 wv7Var = (wv7) this.b.get(context);
                if (wv7Var == null) {
                    wv7Var = new wv7((Object) null);
                    this.b.put(context, wv7Var);
                }
                wv7Var.f(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i) throws Resources.NotFoundException {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableD = d(j, context);
        if (drawableD != null) {
            return drawableD;
        }
        LayerDrawable layerDrawableF = null;
        if (this.e != null) {
            if (i == bvb.abc_cab_background_top_material) {
                layerDrawableF = new LayerDrawable(new Drawable[]{f(context, bvb.abc_cab_background_internal_bg), f(context, bvb.abc_cab_background_top_mtrl_alpha)});
            } else if (i == bvb.abc_ratingbar_material) {
                layerDrawableF = q40.f(this, context, xtb.abc_star_big);
            } else if (i == bvb.abc_ratingbar_indicator_material) {
                layerDrawableF = q40.f(this, context, xtb.abc_star_medium);
            } else if (i == bvb.abc_ratingbar_small_material) {
                layerDrawableF = q40.f(this, context, xtb.abc_star_small);
            }
        }
        if (layerDrawableF != null) {
            layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j, layerDrawableF);
        }
        return layerDrawableF;
    }

    public final synchronized Drawable d(long j, Context context) {
        wv7 wv7Var = (wv7) this.b.get(context);
        if (wv7Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) wv7Var.c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            wv7Var.g(j);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00d6, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0025, B:14:0x002b, B:16:0x0031, B:18:0x0038, B:25:0x004c, B:21:0x0044, B:23:0x0048, B:26:0x0051, B:28:0x0055, B:30:0x0061, B:31:0x008e, B:33:0x0092, B:35:0x0096, B:37:0x009a, B:38:0x00c7, B:43:0x00d2, B:6:0x0006, B:8:0x0011, B:10:0x0015, B:50:0x00db, B:51:0x00e4), top: B:54:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable e(int r7, android.content.Context r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.d     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L6
            goto L25
        L6:
            r0 = 1
            r6.d = r0     // Catch: java.lang.Throwable -> Ld6
            int r0 = defpackage.iub.abc_vector_test     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r0 = r6.f(r8, r0)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lda
            boolean r1 = r0 instanceof defpackage.qbf     // Catch: java.lang.Throwable -> Ld6
            if (r1 != 0) goto L25
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lda
        L25:
            android.graphics.drawable.Drawable r0 = r6.b(r8, r7)     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = defpackage.kt3.b(r8, r7)     // Catch: java.lang.Throwable -> Ld6
        L2f:
            if (r0 == 0) goto Ld0
            android.content.res.ColorStateList r1 = r6.h(r8, r7)     // Catch: java.lang.Throwable -> Ld6
            r2 = 0
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> Ld6
            defpackage.aq4.h(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            q40 r8 = r6.e     // Catch: java.lang.Throwable -> Ld6
            if (r8 != 0) goto L44
            goto L4a
        L44:
            int r8 = defpackage.bvb.abc_switch_thumb_material     // Catch: java.lang.Throwable -> Ld6
            if (r7 != r8) goto L4a
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> Ld6
        L4a:
            if (r2 == 0) goto Ld0
            defpackage.aq4.i(r0, r2)     // Catch: java.lang.Throwable -> Ld6
            goto Ld0
        L51:
            q40 r1 = r6.e     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto Lc7
            int r1 = defpackage.bvb.abc_seekbar_track_material     // Catch: java.lang.Throwable -> Ld6
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r7 != r1) goto L8e
            r7 = r0
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.vsb.colorControlNormal     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.gse.c(r8, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.PorterDuff$Mode r2 = defpackage.gn.b     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r9, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.vsb.colorControlNormal     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.gse.c(r8, r1)     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r9, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r7 = r7.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Ld6
            int r9 = defpackage.vsb.colorControlActivated     // Catch: java.lang.Throwable -> Ld6
            int r8 = defpackage.gse.c(r8, r9)     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r7, r8)     // Catch: java.lang.Throwable -> Ld6
            goto Ld0
        L8e:
            int r1 = defpackage.bvb.abc_ratingbar_material     // Catch: java.lang.Throwable -> Ld6
            if (r7 == r1) goto L9a
            int r1 = defpackage.bvb.abc_ratingbar_indicator_material     // Catch: java.lang.Throwable -> Ld6
            if (r7 == r1) goto L9a
            int r1 = defpackage.bvb.abc_ratingbar_small_material     // Catch: java.lang.Throwable -> Ld6
            if (r7 != r1) goto Lc7
        L9a:
            r7 = r0
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.vsb.colorControlNormal     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.gse.b(r8, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.PorterDuff$Mode r2 = defpackage.gn.b     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r9, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r9 = r7.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.vsb.colorControlActivated     // Catch: java.lang.Throwable -> Ld6
            int r1 = defpackage.gse.c(r8, r1)     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r9, r1)     // Catch: java.lang.Throwable -> Ld6
            android.graphics.drawable.Drawable r7 = r7.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Ld6
            int r9 = defpackage.vsb.colorControlActivated     // Catch: java.lang.Throwable -> Ld6
            int r8 = defpackage.gse.c(r8, r9)     // Catch: java.lang.Throwable -> Ld6
            defpackage.q40.n(r7, r8)     // Catch: java.lang.Throwable -> Ld6
            goto Ld0
        Lc7:
            boolean r7 = r6.i(r7, r8, r0)     // Catch: java.lang.Throwable -> Ld6
            if (r7 != 0) goto Ld0
            if (r9 == 0) goto Ld0
            r0 = r2
        Ld0:
            if (r0 == 0) goto Ld8
            defpackage.hq4.a(r0)     // Catch: java.lang.Throwable -> Ld6
            goto Ld8
        Ld6:
            r7 = move-exception
            goto Le5
        Ld8:
            monitor-exit(r6)
            return r0
        Lda:
            r7 = 0
            r6.d = r7     // Catch: java.lang.Throwable -> Ld6
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r8 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Ld6
            throw r7     // Catch: java.lang.Throwable -> Ld6
        Le5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oic.e(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i) {
        return e(i, context, false);
    }

    public final synchronized ColorStateList h(Context context, int i) {
        ColorStateList colorStateList;
        kvd kvdVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListI = null;
        colorStateList = (weakHashMap == null || (kvdVar = (kvd) weakHashMap.get(context)) == null) ? null : (ColorStateList) kvdVar.c(i);
        if (colorStateList == null) {
            q40 q40Var = this.e;
            if (q40Var != null) {
                colorStateListI = q40Var.i(context, i);
            }
            if (colorStateListI != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                kvd kvdVar2 = (kvd) this.a.get(context);
                if (kvdVar2 == null) {
                    kvdVar2 = new kvd();
                    this.a.put(context, kvdVar2);
                }
                kvdVar2.a(i, colorStateListI);
            }
            colorStateList = colorStateListI;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r7, android.content.Context r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            q40 r6 = r6.e
            r0 = 0
            if (r6 == 0) goto L68
            android.graphics.PorterDuff$Mode r1 = defpackage.gn.b
            java.lang.Object r2 = r6.a
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.a(r7, r2)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L18
            int r6 = defpackage.vsb.colorControlNormal
        L15:
            r2 = r3
        L16:
            r7 = r4
            goto L51
        L18:
            java.lang.Object r2 = r6.c
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.a(r7, r2)
            if (r2 == 0) goto L25
            int r6 = defpackage.vsb.colorControlActivated
            goto L15
        L25:
            java.lang.Object r6 = r6.o
            int[] r6 = (int[]) r6
            boolean r6 = defpackage.q40.a(r7, r6)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r6 == 0) goto L36
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L34:
            r6 = r2
            goto L15
        L36:
            int r6 = defpackage.bvb.abc_list_divider_mtrl_alpha
            if (r7 != r6) goto L49
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L51
        L49:
            int r6 = defpackage.bvb.abc_dialog_material_background
            if (r7 != r6) goto L4e
            goto L34
        L4e:
            r6 = r0
            r2 = r6
            goto L16
        L51:
            if (r2 == 0) goto L68
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r6 = defpackage.gse.c(r8, r6)
            android.graphics.PorterDuffColorFilter r6 = defpackage.gn.c(r6, r1)
            r9.setColorFilter(r6)
            if (r7 == r4) goto L67
            r9.setAlpha(r7)
        L67:
            r0 = r3
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oic.i(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}

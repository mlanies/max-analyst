package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import com.google.android.material.chip.ChipGroup;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ana implements t2b, f2a {
    public static final byte[] Y = {-1, -39};
    public Object X;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object o;

    public ana() {
        this.c = new HashMap();
        this.o = new HashSet();
    }

    public static BitmapFactory.Options k(g05 g05Var, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = g05Var.s0;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(g05Var.n(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // defpackage.t2b
    public o43 a(g05 g05Var, Bitmap.Config config) {
        BitmapFactory.Options optionsK = k(g05Var, config, this.a);
        boolean z = optionsK.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamN = g05Var.n();
            inputStreamN.getClass();
            return h(inputStreamN, optionsK, null);
        } catch (RuntimeException e) {
            if (z) {
                return this.a(g05Var, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    @Override // defpackage.f2a
    public void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a = true;
        ((f2a) this.c).b();
    }

    @Override // defpackage.f2a
    public void c(zl4 zl4Var) {
        uy1 uy1Var = (uy1) this.X;
        uy1Var.getClass();
        dm4.c(uy1Var, zl4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // defpackage.t2b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.o43 d(defpackage.g05 r6, android.graphics.Bitmap.Config r7, int r8, android.graphics.ColorSpace r9) throws java.io.IOException {
        /*
            r5 = this;
            ou6 r0 = r6.c
            ou6 r1 = defpackage.qb4.a
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Le
            ou6 r1 = defpackage.qb4.l
            if (r0 == r1) goto Le
        Lc:
            r0 = r2
            goto L37
        Le:
            ide r0 = r6.b
            if (r0 == 0) goto L13
            goto Lc
        L13:
            o43 r0 = r6.a
            r0.getClass()
            java.lang.Object r0 = r0.e0()
            qq8 r0 = (defpackage.qq8) r0
            r1 = 2
            if (r8 >= r1) goto L23
        L21:
            r0 = r3
            goto L37
        L23:
            int r1 = r8 + (-2)
            byte r1 = r0.o(r1)
            r4 = -1
            if (r1 != r4) goto L21
            int r1 = r8 + (-1)
            byte r0 = r0.o(r1)
            r1 = -39
            if (r0 != r1) goto L21
            goto Lc
        L37:
            boolean r1 = r5.a
            android.graphics.BitmapFactory$Options r7 = k(r6, r7, r1)
            java.io.InputStream r1 = r6.n()
            r1.getClass()
            int r4 = r6.o()
            if (r4 <= r8) goto L50
            lh7 r4 = new lh7
            r4.<init>(r1, r8)
            r1 = r4
        L50:
            if (r0 != 0) goto L5a
            tje r0 = new tje
            byte[] r4 = defpackage.ana.Y
            r0.<init>(r1, r4)
            r1 = r0
        L5a:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r4) goto L61
            goto L62
        L61:
            r2 = r3
        L62:
            v84 r5 = r5.h(r1, r7, r9)     // Catch: java.lang.Throwable -> L6f java.lang.RuntimeException -> L71
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r6.printStackTrace()
        L6e:
            return r5
        L6f:
            r5 = move-exception
            goto L84
        L71:
            r7 = move-exception
            if (r2 == 0) goto L83
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L6f
            o43 r5 = r5.d(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6f
            r1.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r6 = move-exception
            r6.printStackTrace()
        L82:
            return r5
        L83:
            throw r7     // Catch: java.lang.Throwable -> L6f
        L84:
            r1.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r6 = move-exception
            r6.printStackTrace()
        L8c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.d(g05, android.graphics.Bitmap$Config, int, android.graphics.ColorSpace):o43");
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        if (this.b) {
            return;
        }
        ((f2a) this.c).e(obj);
    }

    public boolean f(n18 n18Var) {
        int id = n18Var.getId();
        HashSet hashSet = (HashSet) this.o;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        n18 n18Var2 = (n18) ((HashMap) this.c).get(Integer.valueOf(l()));
        if (n18Var2 != null) {
            n(n18Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!n18Var.isChecked()) {
            n18Var.setChecked(true);
        }
        return zAdd;
    }

    public void g() {
        boolean z = !((HashSet) this.o).isEmpty();
        Iterator it = ((HashMap) this.c).values().iterator();
        while (it.hasNext()) {
            n((n18) it.next(), false);
        }
        if (z) {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.v84 h(java.io.InputStream r8, android.graphics.BitmapFactory.Options r9, android.graphics.ColorSpace r10) {
        /*
            r7 = this;
            buc r0 = defpackage.o43.Y
            int r1 = r9.outWidth
            int r2 = r9.outHeight
            r3 = 0
            java.lang.Object r4 = r7.o
            com.facebook.imagepipeline.platform.PreverificationHelper r4 = (com.facebook.imagepipeline.platform.PreverificationHelper) r4
            if (r4 == 0) goto L17
            android.graphics.Bitmap$Config r5 = r9.inPreferredConfig
            boolean r4 = r4.shouldUseHardwareBitmapConfig(r5)
            if (r4 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = r3
        L18:
            r5 = 0
            java.lang.Object r6 = r7.c
            go0 r6 = (defpackage.go0) r6
            if (r4 == 0) goto L22
            r9.inMutable = r3
            goto L3b
        L22:
            boolean r3 = r7.a
            if (r3 != 0) goto L3b
            int r1 = r7.i(r1, r2, r9)
            java.lang.Object r1 = r6.get(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L33
            goto L3c
        L33:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "BitmapPool.get returned null"
            r7.<init>(r8)
            throw r7
        L3b:
            r1 = r5
        L3c:
            r9.inBitmap = r1
            if (r10 != 0) goto L46
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
        L46:
            r9.inPreferredColorSpace = r10
            java.lang.Object r10 = r7.X
            t5b r10 = (defpackage.t5b) r10
            java.lang.Object r2 = r10.f()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L5c
            yu0 r2 = defpackage.f54.a
            r2 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L5c:
            byte[] r3 = r2.array()     // Catch: java.lang.Throwable -> L8b java.lang.RuntimeException -> L8d java.lang.IllegalArgumentException -> L8f
            r9.inTempStorage = r3     // Catch: java.lang.Throwable -> L8b java.lang.RuntimeException -> L8d java.lang.IllegalArgumentException -> L8f
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r5, r9)     // Catch: java.lang.Throwable -> L8b java.lang.RuntimeException -> L8d java.lang.IllegalArgumentException -> L8f
            r10.e(r2)
            if (r1 == 0) goto L7b
            if (r1 == r8) goto L7b
            r6.e(r1)
            if (r8 == 0) goto L75
            r8.recycle()
        L75:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L7b:
            boolean r7 = r7.b
            if (r7 == 0) goto L86
            mq9 r7 = defpackage.mq9.o
            v84 r7 = defpackage.o43.p0(r8, r7, r0)
            return r7
        L86:
            v84 r7 = defpackage.o43.p0(r8, r6, r0)
            return r7
        L8b:
            r7 = move-exception
            goto Lb3
        L8d:
            r7 = move-exception
            goto L91
        L8f:
            r7 = move-exception
            goto L97
        L91:
            if (r1 == 0) goto L96
            r6.e(r1)     // Catch: java.lang.Throwable -> L8b
        L96:
            throw r7     // Catch: java.lang.Throwable -> L8b
        L97:
            if (r1 == 0) goto L9c
            r6.e(r1)     // Catch: java.lang.Throwable -> L8b
        L9c:
            r8.reset()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> Lb2
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> Lb2
            if (r8 == 0) goto Lb1
            pq9 r9 = defpackage.pq9.q()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> Lb2
            v84 r7 = defpackage.o43.p0(r8, r9, r0)     // Catch: java.lang.Throwable -> L8b java.io.IOException -> Lb2
            r10.e(r2)
            return r7
        Lb1:
            throw r7     // Catch: java.lang.Throwable -> L8b java.io.IOException -> Lb2
        Lb2:
            throw r7     // Catch: java.lang.Throwable -> L8b
        Lb3:
            r10.e(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.h(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.ColorSpace):v84");
    }

    public int i(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return qo0.c(i, i2, config);
    }

    public ArrayList j(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.o);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof n18) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int l() {
        if (this.a) {
            HashSet hashSet = (HashSet) this.o;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public void m() {
        y8 y8Var = (y8) this.X;
        if (y8Var != null) {
            new HashSet((HashSet) this.o);
            ChipGroup chipGroup = (ChipGroup) y8Var.a;
            q03 q03Var = chipGroup.u0;
            if (q03Var != null) {
                chipGroup.v0.j(chipGroup);
                ph4 ph4Var = (ph4) q03Var;
                ChipGroup chipGroup2 = (ChipGroup) ph4Var.b;
                if (chipGroup2.v0.a) {
                    int checkedChipId = chipGroup2.getCheckedChipId();
                    il9 il9Var = (il9) ((p03) ph4Var.a);
                    il9Var.getClass();
                    for (int i = 0; i < chipGroup.getChildCount(); i++) {
                        View childAt = chipGroup.getChildAt(i);
                        childAt.setClickable(childAt.getId() != checkedChipId);
                    }
                    il9Var.B();
                    il9Var.n(new cy1(5, il9Var));
                }
            }
        }
    }

    public boolean n(n18 n18Var, boolean z) {
        int id = n18Var.getId();
        HashSet hashSet = (HashSet) this.o;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            n18Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (n18Var.isChecked()) {
            n18Var.setChecked(false);
        }
        return zRemove;
    }

    @Override // defpackage.f2a
    public void onError(Throwable th) {
        boolean z = this.a;
        f2a f2aVar = (f2a) this.c;
        if (z) {
            if (this.b) {
                j47.Z(th);
                return;
            } else {
                f2aVar.onError(th);
                return;
            }
        }
        this.a = true;
        try {
            r1a r1aVar = (r1a) ((b66) this.o).mo131apply(th);
            if (r1aVar != null) {
                r1aVar.a(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th);
            f2aVar.onError(nullPointerException);
        } catch (Throwable th2) {
            c37.B(th2);
            f2aVar.onError(new CompositeException(th, th2));
        }
    }

    public ana(f2a f2aVar, pc5 pc5Var) {
        this.c = f2aVar;
        this.o = pc5Var;
        this.X = new uy1(2);
    }

    public ana(go0 go0Var, t5b t5bVar, oq0 oq0Var) {
        this.o = new PreverificationHelper();
        this.c = go0Var;
        if (go0Var instanceof ys4) {
            this.a = oq0Var.a;
            this.b = oq0Var.b;
        }
        this.X = t5bVar;
    }

    public ana(Context context, String str, l0f l0fVar, boolean z, boolean z2) {
        this.c = context;
        this.o = str;
        this.X = l0fVar;
        this.a = z;
        this.b = z2;
    }
}

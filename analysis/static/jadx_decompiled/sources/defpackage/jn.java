package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class jn implements edc, mm0, z66 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ jn(char c, int i) {
        this.a = i;
    }

    public static jn H(char c) {
        return new jn(new wmc(new t42(c), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ff, code lost:
    
        if (r6 == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0201, code lost:
    
        if (r6 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0203, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020b, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020e, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r24, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0225, code lost:
    
        r3 = new android.graphics.SweepGradient(r20, r21, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023e, code lost:
    
        if (r22 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0243, code lost:
    
        if (r6 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
    
        if (r6 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0248, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024b, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024e, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0250, code lost:
    
        r3 = new android.graphics.RadialGradient(r20, r21, r22, (int[]) r0.b, (float[]) r0.c, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0270, code lost:
    
        return new defpackage.jn(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0278, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dd, code lost:
    
        if (r15.size() <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
    
        r0 = new defpackage.va8(r15, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e6, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ea, code lost:
    
        if (r18 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ec, code lost:
    
        r0 = new defpackage.va8(r7, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f2, code lost:
    
        r0 = new defpackage.va8(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f8, code lost:
    
        if (r8 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fb, code lost:
    
        if (r8 == 2) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jn l(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn.l(android.content.res.Resources, int, android.content.res.Resources$Theme):jn");
    }

    public void A(yn7 yn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new ck8(this, fk8Var.b, yn7Var, pc8Var, 1));
        }
    }

    public void B(yn7 yn7Var, int i, int i2, qy5 qy5Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        D(yn7Var, new pc8(i, i2, qy5Var, i3, obj, oaf.h0(j), oaf.h0(j2)), iOException, z);
    }

    public void C(yn7 yn7Var, int i, IOException iOException, boolean z) {
        B(yn7Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void D(yn7 yn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new dk8(this, fk8Var.b, yn7Var, pc8Var, iOException, z, 1));
        }
    }

    public void E(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        k8g k8gVarX = k8g.x(imageView.getContext(), attributeSet, p3c.AppCompatImageView, i, 0);
        ImageView imageView2 = (ImageView) this.c;
        Context context = imageView2.getContext();
        int[] iArr = p3c.AppCompatImageView;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(imageView2, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) k8gVarX.b;
            if (drawable == null && (resourceId = typedArray.getResourceId(p3c.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = s36.n(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                hq4.a(drawable);
            }
            if (typedArray.hasValue(p3c.AppCompatImageView_tint)) {
                aw6.c(imageView, k8gVarX.l(p3c.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(p3c.AppCompatImageView_tintMode)) {
                aw6.d(imageView, hq4.c(typedArray.getInt(p3c.AppCompatImageView_tintMode, -1), null));
            }
            k8gVarX.z();
        } catch (Throwable th) {
            k8gVarX.z();
            throw th;
        }
    }

    public void F(yn7 yn7Var, int i, int i2, qy5 qy5Var, int i3, Object obj, long j, long j2) {
        G(yn7Var, new pc8(i, i2, qy5Var, i3, obj, oaf.h0(j), oaf.h0(j2)));
    }

    public void G(yn7 yn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new ck8(this, fk8Var.b, yn7Var, pc8Var, 0));
        }
    }

    public jn I(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, pw6.h(objArr.length, i));
        }
        wmd.g(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public synchronized void J(Object obj, Object obj2) {
        Object objRemove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= objRemove == null ? 0 : ((vaf) this.c).j(objRemove);
        ((LinkedHashMap) this.o).put(obj, obj2);
        this.b += ((vaf) this.c).j(obj2);
    }

    public void K(Map.Entry entry) {
        I(entry.getKey(), entry.getValue());
    }

    public jn L(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, pw6.h(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            K((Map.Entry) it.next());
        }
        return this;
    }

    public synchronized Object M(Object obj) {
        Object objRemove;
        objRemove = ((LinkedHashMap) this.o).remove(obj);
        this.b -= objRemove == null ? 0 : ((vaf) this.c).j(objRemove);
        return objRemove;
    }

    public synchronized ArrayList N(d7b d7bVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.o).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (d7bVar.mo0apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i = this.b;
                Object value = entry.getValue();
                this.b = i - (value == null ? 0 : ((vaf) this.c).j(value));
                it.remove();
            }
        }
        return arrayList;
    }

    public List O(CharSequence charSequence) {
        charSequence.getClass();
        wmc wmcVar = (wmc) this.o;
        wmcVar.getClass();
        jwd jwdVar = new jwd(wmcVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jwdVar.hasNext()) {
            arrayList.add((String) jwdVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void P(pc8 pc8Var) {
        yj8 yj8Var = (yj8) this.c;
        yj8Var.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new yg3(this, fk8Var.b, yj8Var, pc8Var, 13));
        }
    }

    @Override // defpackage.z66
    public void a(Object obj) {
        List list = (List) obj;
        ii8 ii8Var = ((si8) this.o).f;
        Handler handler = ii8Var.l;
        int i = this.b;
        oh8 oh8Var = (oh8) this.c;
        oaf.W(handler, new vs5(ii8Var, oh8Var, new t05(this, i, list, oh8Var, 3), 19));
    }

    public boolean b(vae vaeVar) {
        Object obj;
        Object obj2 = this.c;
        while (true) {
            Object[] objArr = (Object[]) obj2;
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == hv9.a) {
                    vaeVar.b();
                    return true;
                }
                if (obj instanceof fv9) {
                    vaeVar.onError(((fv9) obj).a);
                    return true;
                }
                if (obj instanceof gv9) {
                    vaeVar.f(((gv9) obj).a);
                } else {
                    vaeVar.e(obj);
                }
            }
            obj2 = objArr[4];
        }
    }

    public void c(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.o)[4] = objArr;
            this.o = objArr;
            i = 0;
        }
        ((Object[]) this.o)[i] = obj;
        this.b = i + 1;
    }

    @Override // defpackage.z66
    public void d(Throwable th) {
    }

    public void e(int i, int i2) {
        int i3 = (i2 << 16) + i;
        boolean z = this.b != i3;
        this.b = i3;
        for (int i4 = 0; i4 < vo0.z; i4++) {
            Bitmap[] bitmapArr = (Bitmap[]) this.o;
            if (z || bitmapArr[i4] == null) {
                Bitmap bitmap = bitmapArr[i4];
                if (bitmap != null) {
                    ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).execute(new b(17, bitmap));
                }
                bitmapArr[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            ow6[] ow6VarArr = (ow6[]) this.c;
            if (ow6VarArr[i4] == null) {
                ow6 ow6Var = new ow6();
                ow6Var.a = new byte[i2 * i * 2];
                ow6VarArr[i4] = ow6Var;
            }
        }
    }

    public void g() {
        qh3 qh3Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            hq4.a(drawable);
        }
        if (drawable == null || (qh3Var = (qh3) this.o) == null) {
            return;
        }
        gn.e(drawable, qh3Var, imageView.getDrawableState());
    }

    @Override // defpackage.mm0
    public lm0 h(ra4 ra4Var, long j) {
        long j2 = ra4Var.o;
        long jO = o(ra4Var);
        long jR = ra4Var.r();
        ra4Var.b(Math.max(6, ((qm5) this.c).d), false);
        long jO2 = o(ra4Var);
        return (jO > j || jO2 <= j) ? jO2 <= j ? new lm0(-2, jO2, ra4Var.r()) : new lm0(-1, jO, j2) : new lm0(0, -9223372036854775807L, jR);
    }

    public gc0 i() {
        String str = ((Long) this.o) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new gc0(((Long) this.o).longValue(), (String) this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public cx6 j() {
        kfc kfcVar;
        bx6 bx6Var = (bx6) this.o;
        if (bx6Var != null) {
            throw bx6Var.a();
        }
        int i = this.b;
        Object[] objArrCopyOf = (Object[]) this.c;
        if (i == 0) {
            kfcVar = kfc.s0;
        } else if (i == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            kfcVar = new kfc(null, objArrCopyOf, 1);
        } else {
            z04.m(i, objArrCopyOf.length >> 1);
            Object objJ = kfc.j(objArrCopyOf, i, jx6.h(i), 0);
            if (objJ instanceof Object[]) {
                Object[] objArr = (Object[]) objJ;
                this.o = (bx6) objArr[2];
                Object obj = objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                objJ = obj;
                i = iIntValue;
            }
            kfcVar = new kfc(objJ, objArrCopyOf, i);
        }
        bx6 bx6Var2 = (bx6) this.o;
        if (bx6Var2 == null) {
            return kfcVar;
        }
        throw bx6Var2.a();
    }

    public g94 k(lo7 lo7Var, i14 i14Var, die dieVar, int i, int[] iArr, n85 n85Var, int i2, long j, boolean z, ArrayList arrayList, d4b d4bVar, z0f z0fVar) {
        t24 t24VarA = ((q24) this.c).a();
        if (z0fVar != null) {
            t24VarA.H(z0fVar);
        }
        return new g94((cb4) this.o, lo7Var, i14Var, dieVar, i, iArr, n85Var, i2, t24VarA, j, this.b, z, arrayList, d4bVar);
    }

    public void m(int i, qy5 qy5Var, int i2, Object obj, long j) {
        n(new pc8(1, i, qy5Var, i2, obj, oaf.h0(j), -9223372036854775807L));
    }

    public void n(pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new v05(this, fk8Var.b, pc8Var, 18));
        }
    }

    public long o(ra4 ra4Var) {
        long j;
        lh4 lh4Var;
        qm5 qm5Var;
        boolean zK;
        int iD;
        while (true) {
            long jR = ra4Var.r();
            j = ra4Var.c;
            long j2 = j - 6;
            lh4Var = (lh4) this.o;
            qm5Var = (qm5) this.c;
            if (jR >= j2) {
                break;
            }
            long jR2 = ra4Var.r();
            byte[] bArr = new byte[2];
            ra4Var.q(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i2 = this.b;
            if (i != i2) {
                ra4Var.Y = 0;
                ra4Var.b((int) (jR2 - ra4Var.o), false);
                zK = false;
            } else {
                yaf yafVar = new yaf(16);
                System.arraycopy(bArr, 0, yafVar.a, 0, 2);
                byte[] bArr2 = yafVar.a;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iD = ra4Var.d(i4 + i3, bArr2, 14 - i3)) != -1; i4 = 2) {
                    i3 += iD;
                }
                yafVar.G(i3);
                ra4Var.Y = 0;
                ra4Var.b((int) (jR2 - ra4Var.o), false);
                zK = ngg.k(yafVar, qm5Var, i2, lh4Var);
            }
            if (zK) {
                break;
            }
            ra4Var.b(1, false);
        }
        if (ra4Var.r() < j - 6) {
            return lh4Var.a;
        }
        ra4Var.b((int) (j - ra4Var.r()), false);
        return qm5Var.k;
    }

    public void p(as asVar) {
        Object obj;
        for (Object[] objArr = (Object[]) this.c; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (asVar.test(obj)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.edc
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudVarArr) {
        int i;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        boolean zExists = new File(str).exists();
        sh0 sh0Var = (sh0) this.o;
        if (!zExists || !sh0Var.z(str)) {
            int i2 = this.b;
            synchronized (sh0Var) {
                i = sh0Var.b;
            }
            return i2 != i;
        }
        for (int i3 = 0; i3 < nudVarArr.length; i3++) {
            Object[] objArr = nudVarArr[i3];
            if (objArr instanceof ddc) {
                nudVarArr[i3] = ((ddc) objArr).a(context);
            }
        }
        return true;
    }

    public void r(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.o).concat(str);
    }

    public Object s(int i) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        switch (this.a) {
            case 18:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i2 = this.b;
                    sparseArray = (SparseArray) this.c;
                    if (i2 > 0 && i < sparseArray.keyAt(i2)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray.valueAt(this.b);
            default:
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i3 = this.b;
                    sparseArray2 = (SparseArray) this.c;
                    if (i3 > 0 && i < sparseArray2.keyAt(i3)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray2.size() - 1 && i >= sparseArray2.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray2.valueAt(this.b);
        }
    }

    public synchronized int t() {
        return ((LinkedHashMap) this.o).size();
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return u();
            case 21:
                StringBuilder sb = new StringBuilder();
                if (((sob) this.c) == sob.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.o);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof r6d) {
                r6d r6dVar = (r6d) obj;
                if (!tpa.f(r6dVar.e(), nae.f)) {
                    int i3 = ((int[]) this.o)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(r6dVar.g(i3));
                    }
                } else if (((int[]) this.o)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.o)[i2]);
                    sb.append("]");
                }
            } else if (obj != nd2.X) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public synchronized int v() {
        return this.b;
    }

    public boolean w() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.o) != null && colorStateList.isStateful();
    }

    public void x(yn7 yn7Var, int i, int i2, qy5 qy5Var, int i3, Object obj, long j, long j2) {
        y(yn7Var, new pc8(i, i2, qy5Var, i3, obj, oaf.h0(j), oaf.h0(j2)));
    }

    public void y(yn7 yn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            oaf.W(fk8Var.a, new ck8(this, fk8Var.b, yn7Var, pc8Var, 2));
        }
    }

    public void z(yn7 yn7Var, int i, int i2, qy5 qy5Var, int i3, Object obj, long j, long j2) {
        A(yn7Var, new pc8(i, i2, qy5Var, i3, obj, oaf.h0(j), oaf.h0(j2)));
    }

    public /* synthetic */ jn(int i, int i2, Object obj, String str) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = str;
    }

    public jn(String str, String[] strArr) {
        String string;
        this.a = 14;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.o = string;
        this.c = str;
        fp3.h(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public jn(Context context) {
        this.a = 9;
        this.o = new GestureDetector(context, new q00(6, this));
    }

    public jn(Context context, sh0 sh0Var) {
        int i;
        this.a = 8;
        this.c = context;
        this.o = sh0Var;
        synchronized (sh0Var) {
            i = sh0Var.b;
        }
        this.b = i;
    }

    public jn(imc imcVar) {
        this.a = 5;
        this.o = new LinkedHashMap();
        this.b = 0;
        this.c = imcVar;
    }

    public jn(int i, byte b) {
        this.a = i;
        switch (i) {
            case 3:
                int i2 = vo0.z;
                this.c = new ow6[i2];
                this.o = new Bitmap[i2];
                break;
            default:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.o = objArr;
                break;
        }
    }

    public jn(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }

    public jn(p4c p4cVar) {
        this.a = 18;
        this.c = new SparseArray();
        this.o = p4cVar;
        this.b = -1;
    }

    public jn(p4c p4cVar, byte b) {
        this.a = 19;
        this.c = new SparseArray();
        this.o = p4cVar;
        this.b = -1;
    }

    public jn(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 4;
        this.c = shader;
        this.o = colorStateList;
        this.b = i;
    }

    public jn(qm5 qm5Var, int i) {
        this.a = 10;
        this.c = qm5Var;
        this.b = i;
        this.o = new lh4();
    }

    public jn(q24 q24Var) {
        this.a = 6;
        this.o = xu0.u0;
        this.c = q24Var;
        this.b = 1;
    }

    public jn(wmc wmcVar) {
        this.a = 20;
        this.o = wmcVar;
        this.c = u42.b;
        this.b = Integer.MAX_VALUE;
    }

    public jn(CopyOnWriteArrayList copyOnWriteArrayList, int i, yj8 yj8Var) {
        this.a = 17;
        this.o = copyOnWriteArrayList;
        this.b = i;
        this.c = yj8Var;
    }

    public jn(int i) {
        this.a = 12;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public jn(si8 si8Var, oh8 oh8Var, int i) {
        this.a = 16;
        this.o = si8Var;
        this.c = oh8Var;
        this.b = i;
    }

    public jn(int i, List list, t26 t26Var) {
        this.a = 7;
        this.b = i;
        this.c = list;
        this.o = t26Var;
    }
}

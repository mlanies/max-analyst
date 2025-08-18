package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public abstract class i24 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final long[] c = {-9187201950435737345L, -1};
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];
    public static final ky6 f = new ky6(15);

    public static final boolean A(String str, Bundle bundle) {
        Boolean boolU = u(str, bundle);
        if (boolU != null) {
            return boolU.booleanValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final double B(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Double dValueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final int C(String str, Bundle bundle) {
        String string = bundle.getString(str);
        Integer numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long D(String str, Bundle bundle) {
        Long lV = v(str, bundle);
        if (lV != null) {
            return lV.longValue();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final long[] E(String str, Bundle bundle) {
        return x53.E0(l6d.i0(new r1f(l6d.Z(w9e.R0(F(str, bundle), new String[]{","}, true, 4), y54.a), z54.a)));
    }

    public static final String F(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final void G(y5f y5fVar) {
        y5fVar.e(wj8.class, new sx6(5));
        y5fVar.e(jb4.class, new sx6(6));
        y5fVar.e(so4.class, new sx6(7));
        y5fVar.e(spd.class, new sx6(8));
        y5fVar.e(wxd.class, new ze7(24));
        y5fVar.e(taa.class, new ze7(25));
    }

    public static final void H(y5f y5fVar) {
        y5fVar.c(b64.class, new it7(5));
    }

    public static final int I(float f2) {
        return f2 >= ((float) 16) ? 2 : 1;
    }

    public static void J(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void K(int i, ByteArrayOutputStream byteArrayOutputStream) {
        J(byteArrayOutputStream, i, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(kotlin.coroutines.Continuation r5) {
        /*
            lx3 r0 = r5.getContext()
            defpackage.pag.j(r0)
            kotlin.coroutines.Continuation r5 = defpackage.v3c.u(r5)
            boolean r1 = r5 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
            goto L13
        L12:
            r5 = 0
        L13:
            tx3 r1 = defpackage.tx3.a
            e5f r2 = defpackage.e5f.a
            if (r5 != 0) goto L1b
        L19:
            r5 = r2
            goto L40
        L1b:
            nx3 r3 = r5.dispatcher
            boolean r3 = r3.isDispatchNeeded(r0)
            if (r3 == 0) goto L27
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L3f
        L27:
            u9g r3 = new u9g
            vu4 r4 = defpackage.u9g.b
            r3.<init>(r4)
            lx3 r0 = r0.plus(r3)
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            boolean r0 = r3.a
            if (r0 == 0) goto L3f
            boolean r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5)
            if (r5 == 0) goto L19
        L3f:
            r5 = r1
        L40:
            if (r5 != r1) goto L43
            return r5
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.L(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0707 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.ij3 r36, defpackage.zh7 r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.a(ij3, zh7, java.util.ArrayList, int):void");
    }

    public static void b(View view, qka qkaVar, fka fkaVar) {
        OneMeButton oneMeButton;
        boolean z = qkaVar instanceof oka;
        z6a z6aVar = z6a.c;
        b7a b7aVar = b7a.o;
        c7a c7aVar = c7a.b;
        if (z) {
            yka ykaVar = ((oka) qkaVar).a;
            if (!(ykaVar instanceof vka)) {
                if (!(ykaVar instanceof xka) && !(ykaVar instanceof wka)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
                if (oneMeButton != null) {
                    oneMeButton.setSize(c7aVar);
                    oneMeButton.setMode(b7aVar);
                    oneMeButton.setAppearance(z6aVar);
                    return;
                }
                return;
            }
        }
        if (!(qkaVar instanceof kka) && !(qkaVar instanceof lka)) {
            if (!(qkaVar instanceof nka)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
        if (oneMeButton != null) {
            oneMeButton.setSize(c7aVar);
            oneMeButton.setMode(b7aVar);
            oneMeButton.setAppearance(z6aVar);
            oneMeButton.setCustomTheme(fkaVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public static void c(View view, ska skaVar, boolean z) {
        boolean z2 = skaVar instanceof pka;
        c7a c7aVar = c7a.b;
        z6a z6aVar = z6a.c;
        b7a b7aVar = b7a.o;
        if (!z2) {
            if (skaVar instanceof rka) {
                OneMeButton oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
                if (oneMeButton != null) {
                    oneMeButton.setSize(c7a.a);
                    oneMeButton.setMode(b7aVar);
                    oneMeButton.setAppearance(z6aVar);
                    return;
                }
                return;
            }
            if (!(skaVar instanceof mka) && !(skaVar instanceof lka)) {
                if (!(skaVar instanceof nka)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : 0;
            if (oneMeButton != 0) {
                oneMeButton.setSize(c7aVar);
                oneMeButton.setMode(b7aVar);
                oneMeButton.setAppearance(z6aVar);
                return;
            }
            return;
        }
        pka pkaVar = (pka) skaVar;
        yka ykaVar = z ? pkaVar.b : pkaVar.a;
        if (ykaVar instanceof xka) {
            eha ehaVar = view instanceof eha ? (eha) view : null;
            if (ehaVar != null) {
                ehaVar.setCollapsedStyle(aha.b);
                return;
            }
            return;
        }
        if (ykaVar instanceof vka) {
            OneMeButton oneMeButton2 = view instanceof OneMeButton ? (OneMeButton) view : null;
            if (oneMeButton2 != null) {
                oneMeButton2.setSize(c7aVar);
                oneMeButton2.setMode(b7aVar);
                oneMeButton2.setAppearance(z6aVar);
                return;
            }
            return;
        }
        if (!(ykaVar instanceof wka)) {
            if (ykaVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                v3c.y(new m1d((wka) ykaVar, (Continuation) oneMeButton, 4), imageView);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v12 */
    public static void d(View view, ska skaVar, boolean z) {
        boolean z2 = skaVar instanceof pka;
        z6a z6aVar = z6a.c;
        z6a z6aVar2 = z6a.o;
        if (!z2) {
            if (!(skaVar instanceof rka) && !(skaVar instanceof mka) && !(skaVar instanceof lka)) {
                if (!(skaVar instanceof nka)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : 0;
            if (oneMeButton != 0) {
                oneMeButton.setSize(c7a.b);
                oneMeButton.setMode(b7a.o);
                if (z) {
                    z6aVar = z6aVar2;
                }
                oneMeButton.setAppearance(z6aVar);
                return;
            }
            return;
        }
        pka pkaVar = (pka) skaVar;
        yka ykaVar = z ? pkaVar.b : pkaVar.a;
        b7a b7aVar = z ? b7a.a : b7a.b;
        if (ykaVar instanceof xka) {
            eha ehaVar = view instanceof eha ? (eha) view : null;
            if (ehaVar != null) {
                ehaVar.setCollapsedStyle(aha.a);
                return;
            }
            return;
        }
        if (ykaVar instanceof vka) {
            OneMeButton oneMeButton = view instanceof OneMeButton ? (OneMeButton) view : null;
            if (oneMeButton != null) {
                oneMeButton.setSize(c7a.a);
                oneMeButton.setMode(b7aVar);
                if (z) {
                    z6aVar = z6aVar2;
                }
                oneMeButton.setAppearance(z6aVar);
                return;
            }
            return;
        }
        if (!(ykaVar instanceof wka)) {
            if (ykaVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                v3c.y(new r1b(view, (Continuation) oneMeButton, 18), imageView);
            }
        }
    }

    public static final coc e(uu3 uu3Var, zu3 zu3Var, zu3 zu3Var2) {
        coc cocVar = new coc(uu3Var, null, null, null, false, -1);
        cocVar.c(zu3Var2);
        cocVar.a(zu3Var);
        return cocVar;
    }

    public static String f(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = maf.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static final Layout g(Context context, fe7 fe7Var, CharSequence charSequence, int i, TextPaint textPaint, m56 m56Var) {
        int I = I(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((char) 8288);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(new fcf(context, I, false, m56Var), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int iC = fe7Var.a(spannableStringBuilder, textPaint, i, Integer.MAX_VALUE, false, TextUtils.TruncateAt.END).getLineCount() > 1 ? i - rh4.c(h4f.f(I), fk4.d().getDisplayMetrics().density, tu0.G(h4f.i(I) * fk4.d().getDisplayMetrics().density)) : i;
        int i2 = iC;
        Layout layoutA = fe7Var.a(spannableStringBuilder, textPaint, iC, 1, false, TextUtils.TruncateAt.END);
        if (i2 == i) {
            return layoutA;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(layoutA.getText().subSequence(0, layoutA.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append((char) 8288);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.setSpan(new fcf(context, I, false, m56Var), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return fe7Var.a(spannableStringBuilder2, textPaint, i, 1, false, TextUtils.TruncateAt.END);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] i(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ty j(defpackage.mn5 r7, int r8) {
        /*
            d32 r0 = defpackage.e32.l
            r0.getClass()
            int r0 = defpackage.d32.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof defpackage.l32
            r2 = 1
            if (r1 == 0) goto L3a
            r1 = r7
            l32 r1 = (defpackage.l32) r1
            mn5 r3 = r1.l()
            if (r3 == 0) goto L3a
            ty r7 = new ty
            r4 = -3
            int r5 = r1.c
            int r6 = r1.b
            if (r6 == r4) goto L2a
            r4 = -2
            if (r6 == r4) goto L2a
            if (r6 == 0) goto L2a
            r0 = r6
            goto L34
        L2a:
            r4 = 0
            if (r5 != r2) goto L31
            if (r6 != 0) goto L34
        L2f:
            r0 = r4
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = r2
        L34:
            lx3 r8 = r1.a
            r7.<init>(r0, r5, r8, r3)
            return r7
        L3a:
            ty r8 = new ty
            hz4 r1 = defpackage.hz4.a
            r8.<init>(r0, r2, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.j(mn5, int):ty");
    }

    public static ApiException k(Status status) {
        return status.c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static final Bitmap l(go0 go0Var, Context context, int i) {
        Drawable drawableB = kt3.b(context, i);
        if (drawableB == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Bitmap bitmap = (Bitmap) go0Var.get(drawableB.getIntrinsicHeight() * drawableB.getIntrinsicWidth() * 4);
        bitmap.reconfigure(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawableB.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableB.draw(canvas);
        return bitmap;
    }

    public static ou6 o(InputStream inputStream) {
        int iY;
        pu6 pu6VarP = p();
        int i = pu6VarP.a;
        byte[] bArr = new byte[i];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                iY = hm9.Y(inputStream, bArr, i);
            } finally {
                inputStream.reset();
            }
        } else {
            iY = hm9.Y(inputStream, bArr, i);
        }
        ou6 ou6VarA = pu6VarP.c.a(iY, bArr);
        boolean zEquals = ou6VarA.equals(qb4.m);
        ou6 ou6Var = ou6.c;
        if (zEquals) {
            ou6VarA = ou6Var;
        }
        if (ou6VarA != ou6Var) {
            return ou6VarA;
        }
        List list = pu6VarP.b;
        if (list == null) {
            return ou6Var;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ou6 ou6VarA2 = ((nu6) it.next()).a(iY, bArr);
            if (ou6VarA2 != ou6Var) {
                return ou6VarA2;
            }
        }
        return ou6Var;
    }

    public static pu6 p() {
        return (pu6) pu6.d.getValue();
    }

    public static ArrayList q(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final boolean r(uj3 uj3Var) {
        return uj3Var == null || uj3Var.w();
    }

    public static final vxd s(mn5 mn5Var, pg7 pg7Var) {
        return j47.T(pg7Var, null, null, new og7(pg7Var, new mg7(mn5Var, null), null), 3);
    }

    public static String t(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    StringBuilder sbM = au1.m("<", str2, " threw ");
                    sbM.append(e2.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final Boolean u(String str, Bundle bundle) {
        String string = bundle.getString(str, null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static final Long v(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static final long[] w(String str, Bundle bundle) {
        return bundle.containsKey(str) ? E(str, bundle) : new long[0];
    }

    public static byte[] x(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(zr6.h(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] y(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long z(InputStream inputStream, int i) {
        byte[] bArrX = x(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrX[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public abstract jqe m();

    public abstract Integer n();
}

package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class pag implements p05, en9 {
    public static final o97 b = new o97("HEAP_DUMP", 1);
    public static final ma7 c = new ma7(2);
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ pag(int i) {
        this.a = i;
    }

    public static ul A(wpa wpaVar) {
        int iG = wpaVar.g();
        if (wpaVar.g() != 1684108385) {
            z04.c0("Failed to parse cover art attribute");
            return null;
        }
        int iG2 = wpaVar.g() & 16777215;
        String str = iG2 == 13 ? "image/jpeg" : iG2 == 14 ? "image/png" : null;
        if (str == null) {
            ey8.k(iG2, "Unrecognized cover art flags: ");
            return null;
        }
        wpaVar.H(4);
        int i = iG - 16;
        byte[] bArr = new byte[i];
        wpaVar.e(0, bArr, i);
        return new ul(str, null, 3, bArr);
    }

    public static jpe B(int i, wpa wpaVar, String str) {
        int iG = wpaVar.g();
        if (wpaVar.g() == 1684108385 && iG >= 22) {
            wpaVar.H(10);
            int iA = wpaVar.A();
            if (iA > 0) {
                String strH = zr6.h(iA, "");
                int iA2 = wpaVar.A();
                if (iA2 > 0) {
                    strH = strH + "/" + iA2;
                }
                return new jpe(str, null, zw6.n(strH));
            }
        }
        z04.c0("Failed to parse index/count attribute: " + oy.e(i));
        return null;
    }

    public static int C(wpa wpaVar) {
        int iG = wpaVar.g();
        if (wpaVar.g() == 1684108385) {
            wpaVar.H(8);
            int i = iG - 16;
            if (i == 1) {
                return wpaVar.u();
            }
            if (i == 2) {
                return wpaVar.A();
            }
            if (i == 3) {
                return wpaVar.x();
            }
            if (i == 4 && (wpaVar.a[wpaVar.b] & 128) == 0) {
                return wpaVar.y();
            }
        }
        z04.c0("Failed to parse data atom to int");
        return -1;
    }

    public static dt6 D(int i, String str, wpa wpaVar, boolean z, boolean z2) {
        int iC = C(wpaVar);
        if (z2) {
            iC = Math.min(1, iC);
        }
        if (iC >= 0) {
            return z ? new jpe(str, null, zw6.n(Integer.toString(iC))) : new h73("und", str, Integer.toString(iC));
        }
        z04.c0("Failed to parse uint8 attribute: " + oy.e(i));
        return null;
    }

    public static jpe E(int i, wpa wpaVar, String str) {
        int iG = wpaVar.g();
        if (wpaVar.g() == 1684108385) {
            wpaVar.H(8);
            return new jpe(str, null, zw6.n(wpaVar.q(iG - 16)));
        }
        z04.c0("Failed to parse text attribute: " + oy.e(i));
        return null;
    }

    public static final boolean F(View view, oi6 oi6Var) {
        Object njcVar;
        try {
            njcVar = Boolean.valueOf(view.performHapticFeedback(oi6Var.a()));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    public static final void G(zy zyVar, bk bkVar) {
        DataInputStream dataInputStream;
        y7g y7gVar;
        Object objValueOf;
        FileInputStream fileInputStreamC = zyVar.c();
        if (fileInputStreamC != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStreamC, 8192);
            try {
                dataInputStream = new DataInputStream(bufferedInputStream);
                try {
                    y7gVar = new y7g(28);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    v3c.i(bufferedInputStream, th);
                    throw th2;
                }
            }
            while (dataInputStream.available() > 0) {
                String utf = dataInputStream.readUTF();
                int unsignedByte = dataInputStream.readUnsignedByte();
                z3f.b.getClass();
                switch (((z3f) mz7.X(z3f.c, Integer.valueOf(unsignedByte))).ordinal()) {
                    case 0:
                        objValueOf = Integer.valueOf(dataInputStream.readInt());
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 1:
                        objValueOf = Float.valueOf(dataInputStream.readFloat());
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 2:
                        objValueOf = Long.valueOf(dataInputStream.readLong());
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 3:
                        objValueOf = dataInputStream.readUTF();
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 4:
                        objValueOf = z04.Z(dataInputStream.readUTF());
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 5:
                        objValueOf = Boolean.valueOf(dataInputStream.readBoolean());
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 6:
                        objValueOf = z7.L(dataInputStream, y7gVar);
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    case 7:
                        objValueOf = z04.Z(z7.L(dataInputStream, y7gVar));
                        continue;
                        bkVar.invoke(utf, objValueOf);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            v3c.i(dataInputStream, null);
            v3c.i(bufferedInputStream, null);
        }
    }

    public static int H(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iA = xfg.A(obj);
        int i4 = iA & i;
        int iL = L(i4, obj3);
        if (iL == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = iA & i5;
        int i7 = -1;
        while (true) {
            i2 = iL - 1;
            i3 = iArr[i2];
            if ((i3 & i5) == i6 && f46.B(obj, objArr[i2]) && (objArr2 == null || f46.B(obj2, objArr2[i2]))) {
                break;
            }
            int i8 = i3 & i;
            if (i8 == 0) {
                return -1;
            }
            i7 = i2;
            iL = i8;
        }
        int i9 = i3 & i;
        if (i7 == -1) {
            M(i4, i9, obj3);
        } else {
            iArr[i7] = w(iArr[i7], i9, i);
        }
        return i2;
    }

    public static void I(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b(textView, drawable);
        b(textView, drawable2);
        b(textView, drawable3);
        b(textView, drawable4);
    }

    public static b11 J(int i, sa4 sa4Var, wpa wpaVar) throws ParserException {
        b11 b11VarC = b11.c(sa4Var, wpaVar);
        while (true) {
            int i2 = b11VarC.b;
            if (i2 == i) {
                return b11VarC;
            }
            ey8.k(i2, "Ignoring unknown WAV chunk: ");
            long j = b11VarC.c;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            sa4Var.z((int) j2);
            b11VarC = b11.c(sa4Var, wpaVar);
        }
    }

    public static boolean K(File file, Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
            } catch (Exception e) {
                e = e;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
            try {
                objectOutputStream.writeObject(obj);
                g(fileOutputStream2, objectOutputStream);
                return true;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    hm9.p("pag", "Failed to store object to file", e);
                    g(fileOutputStream, objectOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    g(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                g(fileOutputStream, objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
    }

    public static int L(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void M(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final String N(int i, long j) {
        if (j >= 0) {
            nd7.e(i);
            return Long.toString(j, i);
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        nd7.e(i);
        String string = Long.toString(j3, i);
        nd7.e(i);
        return string.concat(Long.toString(j4, i));
    }

    public static y77 a() {
        return new y77(null);
    }

    public static void b(View view, Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            Objects.requireNonNull(animationDrawable);
            view.post(new dd4(6, animationDrawable));
        }
    }

    public static final Object c(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? nz4.a : new de0((yf4[]) collection.toArray(new yf4[0])).a(continuation);
    }

    public static void d(lx3 lx3Var) {
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    public static final void e(lx3 lx3Var, CancellationException cancellationException) {
        c6d children;
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var == null || (children = x77Var.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((x77) it.next()).cancel(cancellationException);
        }
    }

    public static boolean f(sa4 sa4Var) {
        wpa wpaVar = new wpa(8);
        int i = b11.c(sa4Var, wpaVar).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        sa4Var.q(wpaVar.a, 0, 4, false);
        wpaVar.G(0);
        int iG = wpaVar.g();
        if (iG == 1463899717) {
            return true;
        }
        z04.u("Unsupported form type: " + iG);
        return false;
    }

    public static void g(Closeable... closeableArr) throws IOException {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    hm9.n("pag", "Failed to close output stream: " + e.getMessage());
                }
            }
        }
    }

    public static Object h(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(zr6.h(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static float i(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + 0.0f;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + 0.0f;
    }

    public static final void j(lx3 lx3Var) {
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var != null && !x77Var.isActive()) {
            throw x77Var.getCancellationException();
        }
    }

    public static boolean k(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists()) {
                return file.canRead();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean l(String str) {
        return !oag.t(str) && k(new File(str));
    }

    public static TextDirectionHeuristic m(zoe zoeVar) {
        return zoeVar == bpe.a ? TextDirectionHeuristics.LTR : zoeVar == bpe.b ? TextDirectionHeuristics.RTL : zoeVar == bpe.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : zoeVar == bpe.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : zoeVar == bpe.e ? TextDirectionHeuristics.ANYRTL_LTR : zoeVar == ape.c ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final x77 n(lx3 lx3Var) {
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var != null) {
            return x77Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + lx3Var).toString());
    }

    public static File o(File file, String str) {
        String string;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int i = 0;
        while (i < 100) {
            if (iLastIndexOf != -1) {
                string = str.substring(0, iLastIndexOf) + "(" + (i + 1) + ")" + str.substring(iLastIndexOf);
            } else {
                StringBuilder sbO = rh4.o(str, "(");
                sbO.append(i + 1);
                sbO.append(")");
                string = sbO.toString();
            }
            File file3 = new File(file, string);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static int p(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final cm4 q(x77 x77Var, boolean z, k87 k87Var) {
        if (x77Var instanceof z87) {
            return ((z87) x77Var).invokeOnCompletionInternal$kotlinx_coroutines_core(z, k87Var);
        }
        return x77Var.invokeOnCompletion(k87Var.c(), z, new f(1, k87Var, k87.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 27));
    }

    public static final boolean r(lx3 lx3Var) {
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var != null) {
            return x77Var.isActive();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.util.ArrayList r4, kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.fe0
            if (r0 == 0) goto L13
            r0 = r5
            fe0 r0 = (defpackage.fe0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fe0 r0 = new fe0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.o
            defpackage.od2.a0(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            x77 r5 = (defpackage.x77) r5
            r0.o = r4
            r0.Y = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.s(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.x77[] r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.ee0
            if (r0 == 0) goto L13
            r0 = r7
            ee0 r0 = (defpackage.ee0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            ee0 r0 = new ee0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.Y
            int r2 = r0.X
            java.lang.Object[] r4 = r0.o
            x77[] r4 = (defpackage.x77[]) r4
            defpackage.od2.a0(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.od2.a0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.o = r7
            r0.X = r2
            r0.Y = r6
            r0.s0 = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.t(x77[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static long u(String str) {
        if (oag.t(str)) {
            return 0L;
        }
        try {
            return new File(str).lastModified();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object v(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        if (!k(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    g(fileInputStream, objectInputStream);
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    g(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }

    public static int w(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final String x(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (nd7.E(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static long y(long... jArr) {
        if (jArr.length <= 0) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static h73 z(int i, wpa wpaVar) {
        int iG = wpaVar.g();
        if (wpaVar.g() == 1684108385) {
            wpaVar.H(8);
            String strQ = wpaVar.q(iG - 16);
            return new h73("und", strQ, strQ);
        }
        z04.c0("Failed to parse comment attribute: " + oy.e(i));
        return null;
    }

    public int hashCode() {
        switch (this.a) {
            case 16:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return nec.a(getClass()).b();
            default:
                return super.toString();
        }
    }
}

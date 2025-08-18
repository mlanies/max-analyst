package defpackage;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.http.protocol.HTTP;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public abstract class hm9 {
    public static im9 a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] e = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] f = {5, 8, 10, 12};
    public static final int[] g = {6, 9, 12, 15};
    public static final int[] h = {2, 4, 6, 8};
    public static final int[] i = {9, 11, 13, 16};
    public static final int[] j = {5, 8, 10, 12};
    public static final /* synthetic */ int k = 0;
    public static ArrayList l;
    public static volatile ir6 m;
    public static boolean n;

    public static s02 E(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new s02(bArr, bArr.length, 2, (byte) 0);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        s02 s02Var = new s02(bArrCopyOf, bArrCopyOf.length, 2, (byte) 0);
        if (bArrCopyOf[0] == 31) {
            s02 s02Var2 = new s02(bArrCopyOf, bArrCopyOf.length, 2, (byte) 0);
            while (s02Var2.b() >= 16) {
                s02Var2.t(2);
                int i4 = s02Var2.i(14) & 16383;
                int iMin = Math.min(8 - s02Var.d, 14);
                int i5 = s02Var.d;
                int i6 = (8 - i5) - iMin;
                byte[] bArr2 = s02Var.b;
                int i7 = s02Var.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - iMin;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    s02Var.b[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = s02Var.b;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                s02Var.t(14);
                s02Var.a();
            }
        }
        s02Var.o(bArrCopyOf.length, bArrCopyOf);
        return s02Var;
    }

    public static final void G(String str, String str2, Throwable th) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            us7 us7Var = us7.Y;
            if (str2 == null) {
                str2 = "";
            }
            ir6Var.a(us7Var, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
        }
    }

    public static final void H(String str, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var == null) {
            return;
        }
        if (objArr.length == 0) {
            ir6Var.d(us7.Y, str, str2, null);
        } else {
            ir6Var.a(us7.Y, str, str2, (8 & 8) != 0 ? null : objArr, (8 & 16) != 0 ? null : null);
        }
    }

    public static void I(im9 im9Var) {
        boolean z;
        synchronized (hm9.class) {
            z = a != null;
        }
        if (z) {
            return;
        }
        synchronized (hm9.class) {
            try {
                if (a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a = im9Var;
            } finally {
            }
        }
    }

    public static void J(e92 e92Var, long j2, mg4 mg4Var) {
        if (((d92) u(j2, e92Var.d(mg4Var)).b) == null) {
            e92Var.a(new d92(j2, j2), mg4Var);
        }
    }

    public static boolean K(long j2, d92 d92Var) {
        return d92Var != null && d92Var.a <= j2 && j2 <= d92Var.b;
    }

    public static final RippleDrawable L(int i2, int i3) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
        ColorDrawable colorDrawable = i2 != 0 ? new ColorDrawable(i2) : null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(-65536);
        return new RippleDrawable(colorStateListValueOf, colorDrawable, shapeDrawable);
    }

    public static boolean M(String str) {
        im9 im9Var;
        synchronized (hm9.class) {
            im9Var = a;
            if (im9Var == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return im9Var.b(str);
    }

    public static final void N(us7 us7Var, String str, String str2, Object... objArr) {
        int iOrdinal = us7Var.ordinal();
        if (iOrdinal == 0) {
            h0(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 1) {
            m(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 2) {
            H(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 3) {
            m0(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal == 4) {
            q(str, str2, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ir6 ir6Var = m;
        if (ir6Var != null) {
            ir6Var.a(us7.t0, str, str2, (8 & 8) != 0 ? null : objArrCopyOf, (8 & 16) != 0 ? null : null);
        }
    }

    public static void O(ArrayList arrayList) {
        Iterator it;
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = null;
        boolean z = true;
        for (int i2 = 1; z && arrayList.size() > i2; i2 = 1) {
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                d92 d92Var = (d92) it2.next();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                } else {
                    arrayList2.clear();
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        break;
                    }
                    d92 d92Var2 = (d92) it3.next();
                    if (d92Var != d92Var2) {
                        long j2 = d92Var.a;
                        long j3 = d92Var2.a;
                        long j4 = d92Var.b;
                        it = it2;
                        long j5 = d92Var2.b;
                        if ((j2 >= j3 && j2 <= j5) || (j4 >= j3 && j4 <= j5)) {
                            d92 d92Var3 = new d92(Math.min(j2, j3), Math.max(j4, j5));
                            arrayList2.add(d92Var);
                            arrayList2.add(d92Var2);
                            arrayList.add(d92Var3);
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        } else {
                            it2 = it;
                        }
                    }
                }
                arrayList.removeAll(arrayList2);
                if (z2) {
                    break;
                } else {
                    it2 = it;
                }
            }
            z = z2;
        }
        Collections.sort(arrayList, new v00(16));
    }

    public static e2f P(int i2, w1f... w1fVarArr) {
        e2f e2fVar = new e2f();
        for (w1f w1fVar : w1fVarArr) {
            if (w1fVar != null) {
                e2fVar.R(w1fVar);
            }
        }
        e2fVar.U(i2);
        return e2fVar;
    }

    public static void Q(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
            n("hm9", "openExternalBrowser: flagActivityNoHistory = false");
        } catch (ActivityNotFoundException e2) {
            a14.N(0, context, context.getString(jpc.v));
            p("hm9", "openWebLink: " + e2.getMessage(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5 A[EDGE_INSN: B:202:0x02c5->B:137:0x02c5 BREAK  A[LOOP:3: B:120:0x0292->B:203:0x0292]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114 A[Catch: Exception -> 0x015c, TryCatch #2 {Exception -> 0x015c, blocks: (B:9:0x0029, B:11:0x0035, B:14:0x005d, B:18:0x0072, B:20:0x0081, B:35:0x00d1, B:37:0x00d7, B:39:0x00e7, B:46:0x00fc, B:48:0x0102, B:67:0x0143, B:54:0x0114, B:56:0x011a, B:58:0x0126, B:63:0x0137, B:21:0x0086, B:22:0x0091, B:24:0x0097, B:26:0x00a9, B:30:0x00c0, B:31:0x00c5, B:33:0x00cb), top: B:173:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void R(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.R(android.content.Context, java.lang.String):void");
    }

    public static final GradientDrawable S(Integer num, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList T(defpackage.yaf r28) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.T(yaf):java.util.ArrayList");
    }

    public static int U(s02 s02Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && s02Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return s02Var.i(iArr[i2]) + i4;
    }

    public static void V(Context context, String str) {
        if (context != null) {
            ((y8a) vl.b()).b().g("MESSAGE_LINK_OPEN", MediaStreamTrack.VIDEO_TRACK_KIND);
            R(context, str);
        } else {
            o("hm9", "playVideoLink: can't play " + str + " on a null context");
        }
    }

    public static String W(d92 d92Var) {
        if (d92Var == null) {
            return null;
        }
        Date date = new Date(d92Var.a);
        Date date2 = new Date(d92Var.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], millis[%d - %d]", date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime()));
    }

    public static String X(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() <= 0) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(W((d92) it.next()));
                sb.append(", ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static int Y(InputStream inputStream, byte[] bArr, int i2) throws IOException {
        inputStream.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    public static final byte[] Z(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ema.l(fileInputStream, gZIPOutputStream, 8192);
            v3c.i(fileInputStream, null);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    public static final int[] a(fka fkaVar) {
        int iOrdinal = fkaVar.h().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new int[]{f8.G(-1, 0.2f), 0};
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new int[]{f8.G(-1, 0.5f), 0};
    }

    public static void a0(w1f w1fVar, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int i2 = 0;
        if (w1fVar instanceof e2f) {
            e2f e2fVar = (e2f) w1fVar;
            int size = e2fVar.R0.size();
            while (i2 < size) {
                a0(e2fVar.S(i2), list, arrayList);
                i2++;
            }
            return;
        }
        ArrayList arrayList3 = w1fVar.X;
        if ((!(arrayList3 == null || arrayList3.isEmpty())) || (arrayList2 = w1fVar.Y) == null || arrayList2.size() != list.size() || !arrayList2.containsAll(list)) {
            return;
        }
        int size2 = arrayList == null ? 0 : arrayList.size();
        while (i2 < size2) {
            w1fVar.b((View) arrayList.get(i2));
            i2++;
        }
        for (int size3 = list.size() - 1; size3 >= 0; size3--) {
            w1fVar.E((View) list.get(size3));
        }
    }

    public static void b(w1f w1fVar, ArrayList arrayList) {
        if (w1fVar == null) {
            return;
        }
        int i2 = 0;
        if (w1fVar instanceof e2f) {
            e2f e2fVar = (e2f) w1fVar;
            int size = e2fVar.R0.size();
            while (i2 < size) {
                b(e2fVar.S(i2), arrayList);
                i2++;
            }
            return;
        }
        ArrayList arrayList2 = w1fVar.X;
        if (!(arrayList2 == null || arrayList2.isEmpty())) {
            return;
        }
        ArrayList arrayList3 = w1fVar.Y;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            int size2 = arrayList.size();
            while (i2 < size2) {
                w1fVar.b((View) arrayList.get(i2));
                i2++;
            }
        }
    }

    public static final GradientDrawable b0(Integer num, Integer num2, Integer num3, int i2) {
        float f2 = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = f2;
        }
        return c0(num, num2, num3, fArr);
    }

    public static final GradientDrawable c0(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static void d0(b bVar, File file, kk5 kk5Var) {
        try {
            Uri uriF = kk5Var.f(bVar, file);
            die dieVar = new die(bVar, 13);
            ((Intent) dieVar.b).setType("image/*");
            dieVar.Q(uriF);
            dieVar.R(null);
            dieVar.S();
        } catch (Exception e2) {
            p("hm9", "sharePhoto error", e2);
        }
    }

    public static wx e() throws InterruptedException {
        wx wxVar = wx.j.f;
        if (wxVar == null) {
            long jNanoTime = System.nanoTime();
            wx.class.wait(wx.h);
            if (wx.j.f != null || System.nanoTime() - jNanoTime < wx.i) {
                return null;
            }
            return wx.j;
        }
        long jNanoTime2 = wxVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j2 = jNanoTime2 / 1000000;
            wx.class.wait(j2, (int) (jNanoTime2 - (1000000 * j2)));
            return null;
        }
        wx.j.f = wxVar.f;
        wxVar.f = null;
        return wxVar;
    }

    public static void e0(Context context, String str) {
        try {
            die dieVar = new die(context, 13);
            ((Intent) dieVar.b).setType(HTTP.PLAIN_TEXT_TYPE);
            dieVar.R(str);
            dieVar.S();
        } catch (Exception e2) {
            p("hm9", "shareText error", e2);
        }
    }

    public static final RippleDrawable f(int i2, int i3, int i4, int i5) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i5);
        return new RippleDrawable(ColorStateList.valueOf(i3), g0(c0(Integer.valueOf(i2), null, null, fArr), null, c0(Integer.valueOf(i4), null, null, fArr)), c0(-65536, null, null, fArr));
    }

    public static void f0(Context context, File file, kk5 kk5Var) {
        try {
            Uri uriF = kk5Var.f(context, file);
            die dieVar = new die(context, 13);
            ((Intent) dieVar.b).setType("video/*");
            dieVar.Q(uriF);
            dieVar.R(null);
            dieVar.S();
        } catch (Exception e2) {
            p("hm9", "shareVideo error", e2);
        }
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbK = au1.k(j2, "size=", " offset=");
            sbK.append(j3);
            sbK.append(" byteCount=");
            sbK.append(j4);
            throw new ArrayIndexOutOfBoundsException(sbK.toString());
        }
    }

    public static final StateListDrawable g0(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (gradientDrawable2 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
            stateListDrawable.addState(new int[]{R.attr.state_activated}, gradientDrawable2);
        }
        if (gradientDrawable3 != null) {
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static ArrayList h(e92 e92Var, long j2, mg4 mg4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = e92Var.d(mg4Var).iterator();
        while (it.hasNext()) {
            d92 d92Var = (d92) it.next();
            if (d92Var.b >= j2) {
                if (d92Var.a > j2) {
                    arrayList.add(d92Var);
                } else if (K(j2, d92Var)) {
                    long j3 = 1 + j2;
                    long j4 = d92Var.b;
                    if (j3 <= j4) {
                        if (j3 == -1) {
                            l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        if (j4 == -1) {
                            l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
                        }
                        arrayList.add(new d92(j3, j4));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void h0(String str, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var == null) {
            return;
        }
        if (objArr.length == 0) {
            ir6Var.d(us7.o, str, str2, null);
        } else {
            ir6Var.a(us7.o, str, str2, (8 & 8) != 0 ? null : objArr, (8 & 16) != 0 ? null : null);
        }
    }

    public static mud i(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        mud mudVar;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                mudVar = new kud(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                mudVar = new mud(str, unsatisfiedLinkError.toString());
            }
        } else {
            mudVar = new kud(str, unsatisfiedLinkError.toString());
        }
        mudVar.initCause(unsatisfiedLinkError);
        return mudVar;
    }

    public static final void j(String str, k56 k56Var) {
        ir6 ir6Var = m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, (String) k56Var.invoke(), null);
        }
    }

    public static void j0(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }

    public static final void k(String str, String str2) {
        n(str, str2);
    }

    public static final void k0(String str, Exception exc, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var == null) {
            return;
        }
        if (objArr.length == 0) {
            ir6Var.a(us7.Z, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : exc);
        } else {
            ir6Var.a(us7.Z, str, str2, objArr, exc);
        }
    }

    public static final void l(String str, String str2, Throwable th) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            us7 us7Var = us7.X;
            if (str2 == null) {
                str2 = "";
            }
            ir6Var.a(us7Var, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
        }
    }

    public static final void l0(String str, String str2, Throwable th) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            ir6Var.a(us7.Z, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
        }
    }

    public static final void m(String str, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var == null) {
            return;
        }
        if (objArr.length == 0) {
            ir6Var.d(us7.X, str, str2, null);
        } else {
            ir6Var.a(us7.X, str, str2, (8 & 8) != 0 ? null : objArr, (8 & 16) != 0 ? null : null);
        }
    }

    public static final void m0(String str, String str2, Object... objArr) {
        k0(str, null, str2, Arrays.copyOf(objArr, objArr.length));
    }

    public static /* synthetic */ void n(String str, String str2) {
        m(str, str2, new Object[0]);
    }

    public static final void o(String str, String str2) {
        p(str, str2, null);
    }

    public static final void p(String str, String str2, Throwable th) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            us7 us7Var = us7.s0;
            if (str2 == null) {
                str2 = "";
            }
            ir6Var.a(us7Var, str, str2, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : th);
        }
    }

    public static final void q(String str, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            ir6Var.a(us7.s0, str, str2, (8 & 8) != 0 ? null : objArr, (8 & 16) != 0 ? null : null);
        }
    }

    public static final void r(String str, Throwable th, String str2, Object... objArr) {
        ir6 ir6Var = m;
        if (ir6Var != null) {
            ir6Var.a(us7.s0, str, str2, objArr, th);
        }
    }

    public static ArrayList s(List list, List list2, long j2, int i2, long j3, int i3, long j4) {
        ArrayList arrayList = new ArrayList(list);
        if (list2.size() > 0) {
            fs8 fs8Var = (fs8) list2.get(0);
            fs8 fs8Var2 = (fs8) list2.get(list2.size() - 1);
            ng4 ng4Var = fs8Var.D0;
            long j5 = ng4Var != null ? ng4Var.a : fs8Var.b;
            ng4 ng4Var2 = fs8Var2.D0;
            long jMin = ng4Var2 != null ? ng4Var2.a : fs8Var2.b;
            if (i2 > 0 && i3 > 0) {
                if (j3 <= 0) {
                    j3 = Math.min(j2, j5);
                } else if (j5 < j2) {
                    j3 = j3 > 0 ? Math.max(j3, j5) : j5;
                }
                if (j4 > 0) {
                    if (jMin <= j2) {
                        if (j4 <= 0) {
                        }
                        j2 = j4;
                    } else if (j4 > 0) {
                        jMin = Math.min(j4, jMin);
                    }
                    j4 = jMin;
                    j2 = j4;
                } else {
                    j2 = Math.max(j2, jMin);
                }
            } else if (i3 > 0) {
                if (jMin <= j2) {
                    if (j4 <= 0) {
                    }
                } else if (j4 > 0) {
                    jMin = Math.min(j4, jMin);
                }
                j4 = jMin;
            } else {
                if (i2 <= 0) {
                    return arrayList;
                }
                if (j5 < j2) {
                    j3 = j3 > 0 ? Math.max(j3, j5) : j5;
                }
            }
            j4 = j2;
            j2 = j3;
        } else {
            if (j3 <= 0) {
                j3 = j2;
            }
            if (j4 > 0) {
                j2 = j4;
            }
            j4 = j2;
            j2 = j3;
        }
        if (j2 == -1) {
            l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        if (j4 == -1) {
            l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        arrayList.add(new d92(j2, j4));
        O(arrayList);
        return arrayList;
    }

    public static boolean t(e92 e92Var, long j2, long j3, mg4 mg4Var) {
        kpa kpaVarU = u(j2, e92Var.d(mg4Var));
        Object obj = kpaVarU.b;
        if (obj == null) {
            return false;
        }
        l7 l7VarC = ((d92) obj).c();
        l7VarC.b(j3);
        e92Var.d(mg4Var).remove(((Integer) kpaVarU.a).intValue());
        e92.e(mg4Var);
        e92Var.a(l7VarC.a(), mg4Var);
        return true;
    }

    public static kpa u(long j2, ArrayList arrayList) {
        d92 d92Var;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                d92Var = null;
                i2 = -1;
                break;
            }
            d92Var = (d92) arrayList.get(i2);
            long j3 = d92Var.a;
            long j4 = d92Var.b;
            if (j3 != j4) {
                if (j2 >= j3 && j2 <= j4) {
                    break;
                }
                i2++;
            } else {
                if (j2 == j3) {
                    break;
                }
                i2++;
            }
        }
        return new kpa(Integer.valueOf(i2), d92Var);
    }

    public static d92 v(long j2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        d92 d92Var = null;
        while (it.hasNext()) {
            d92 d92Var2 = (d92) it.next();
            long j3 = d92Var2.b;
            if (j3 < j2 && (d92Var == null || j3 > d92Var.b)) {
                d92Var = d92Var2;
            }
        }
        return d92Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kpa w(java.util.ArrayList r8) {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
        L3:
            int r3 = r8.size()
            if (r2 >= r3) goto L1f
            java.lang.Object r3 = r8.get(r2)
            d92 r3 = (defpackage.d92) r3
            if (r0 != 0) goto L12
            goto L1a
        L12:
            long r4 = r3.b
            long r6 = r0.b
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L1c
        L1a:
            r1 = r2
            r0 = r3
        L1c:
            int r2 = r2 + 1
            goto L3
        L1f:
            kpa r8 = new kpa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.<init>(r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm9.w(java.util.ArrayList):kpa");
    }

    public static View x(View view, String str) {
        WeakHashMap weakHashMap = zmf.a;
        if (str.equals(omf.k(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewX = x(viewGroup.getChildAt(i2), str);
            if (viewX != null) {
                return viewX;
            }
        }
        return null;
    }

    public static void y(us usVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = zmf.a;
            String strK = omf.k(view);
            if (strK != null) {
                usVar.put(strK, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    y(usVar, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static final void z(int i2, int i3, int i4, int i5, int[] iArr) {
        if (iArr.length <= 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        float f2 = i5;
        float f3 = i4;
        int i6 = (int) ((f2 / f3) * i2);
        if (1 > i3 || i3 >= i6) {
            i3 = i6;
        } else {
            i2 = (int) ((f3 / f2) * i3);
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public Object A(int i2, int i3) {
        return null;
    }

    public abstract void B(pjd pjdVar, float f2, float f3);

    public abstract jqe C();

    public abstract int D();

    public abstract int F();

    public abstract boolean c(int i2, int i3);

    public abstract boolean d(int i2, int i3);
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ImageReader;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class s36 {
    public static f2b a = null;
    public static volatile boolean b = false;
    public static final float[] c = new float[0];
    public static volatile py7 d = new yxc(13);
    public static final Object e = new Object();
    public static final /* synthetic */ int f = 0;
    public static Boolean g;

    public static void A(vz3 vz3Var) {
        vz3Var.k = -3.4028235E38f;
        vz3Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = vz3Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                vz3Var.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = vz3Var.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float B(float f2, int i, int i2, int i3) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f3 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i2;
        }
        return f2 * f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List C(java.util.List r18, defpackage.v02 r19, defpackage.v02 r20, defpackage.ol3 r21, long r22, long r24) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s36.C(java.util.List, v02, v02, ol3, long, long):java.util.List");
    }

    public static final dh7 D(em emVar, fm fmVar, eh7 eh7Var) {
        return new dh7(fmVar, eh7Var.Q(), emVar);
    }

    public static Drawable a(Context context, int i, float f2, boolean z) {
        return z ? new sp0(context, i, f2, true, false) : new ColorDrawable(i);
    }

    public static final w12 b(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new w12(context) : new x12(context, null, 0);
    }

    public static int c(int i, int i2) {
        return k7d.e(i, i2, 31);
    }

    public static final LinkedHashMap d(AttributeSet attributeSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(attributeSet.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final Object e(pa3 pa3Var, Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        pa3Var.i(new spc(sy1Var, 0));
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5f.a;
    }

    public static final Object f(iqd iqdVar, Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        iqdVar.k(new spc(sy1Var, 1));
        return sy1Var.m();
    }

    public static final Object g(qy9 qy9Var, Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        cd6 cd6Var = new cd6();
        cd6Var.c = sy1Var;
        cd6Var.a = 1;
        cd6Var.Y = null;
        qy9Var.a(cd6Var);
        return sy1Var.m();
    }

    public static void h(hl3 hl3Var, String str, String str2) {
        if (str == null) {
            hl3Var.f.remove(0);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        il3 il3Var = il3.o;
        if (hl3Var.f.isEmpty()) {
            hl3Var.f.add(0, new jl3(str, il3Var, str2));
        } else {
            hl3Var.f.set(0, new jl3(str, ((jl3) hl3Var.f.get(0)).c, str2));
        }
    }

    public static mx5 i(Context context) {
        ProviderInfo providerInfo;
        bg4 bg4Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        c54.o(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            bg4Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                bg4Var = new bg4(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (bg4Var == null) {
            return null;
        }
        return new mx5(new lx5(context, bg4Var));
    }

    public static pl3 j(wm3 wm3Var, ol3 ol3Var, long j, long j2) {
        ArrayList arrayListJ = iz7.j(wm3Var.X);
        jc7 jc7Var = wm3Var.y0;
        kl3 kl3Var = jc7Var == null ? null : new kl3((String) jc7Var.a);
        hl3 hl3Var = new hl3();
        hl3Var.a = wm3Var.a;
        hl3Var.f = arrayListJ;
        hl3Var.o = wm3Var.v0;
        hl3Var.p = wm3Var.w0;
        hl3Var.k = ol3Var;
        hl3Var.b = null;
        hl3Var.c = null;
        hl3Var.e = wm3Var.Y;
        hl3Var.s = j;
        hl3Var.t = j2;
        hl3Var.u = kl3Var;
        hl3Var.v = wm3Var.z0;
        return hl3Var.a();
    }

    public static td k(int i, int i2, int i3, int i4) {
        return new td(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean m(int i, int i2) {
        return i == i2;
    }

    public static Drawable n(Context context, int i) {
        return oic.c().f(context, i);
    }

    public static iv6 o() {
        return lv6.g().f();
    }

    public static k12 p(Context context) {
        oq1 oq1VarG;
        k9b k9bVar = k9b.f;
        synchronized (k9bVar.a) {
            oq1VarG = k9bVar.b;
            if (oq1VarG == null) {
                oq1VarG = f8.g(new y98(k9bVar, 20, new ay1(context)));
                k9bVar.b = oq1VarG;
            }
        }
        iw1 iw1Var = new iw1(3, new c0(4, context));
        return kq0.K(oq1VarG, new re6(15, iw1Var), ju0.k());
    }

    public static int r(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    public static long s(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                long jT = t(mediaMetadataRetriever2);
                z(mediaMetadataRetriever2);
                return jT;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    hm9.p("s36", "getVideoDuration from uri: failed", th);
                    z(mediaMetadataRetriever);
                    return 0L;
                } catch (Throwable th2) {
                    z(mediaMetadataRetriever);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long t(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoDuration: failed ", th);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.em5 u(android.content.Context r21, android.net.Uri r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s36.u(android.content.Context, android.net.Uri):em5");
    }

    public static Point v(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i == 90 || i == 270) {
                strExtractMetadata2 = strExtractMetadata;
                strExtractMetadata = strExtractMetadata2;
            }
            return new Point(Integer.parseInt(strExtractMetadata), Integer.parseInt(strExtractMetadata2));
        } catch (Throwable th) {
            hm9.p("s36", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static final int x(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        }
        if (length != 4) {
            if (length == 7 || length == 9) {
                return Color.parseColor(str);
            }
            return 0;
        }
        return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
    }

    public static void y(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (e) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new h12(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static void z(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever == null) {
            return;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused) {
        }
    }

    public abstract CharSequence q();

    public abstract apd w(uod uodVar);
}

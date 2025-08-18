package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes.dex */
public abstract class kp {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ou6 c = new ou6("SVG", ".svg");
    public static final Object d = null;

    public static void A(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            a6g.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void B(va7 va7Var, Appendable appendable) throws IOException {
        int iS = va7Var.S();
        if (iS != 34 && iS != 49) {
            boolean z = true;
            if (iS == 91) {
                va7Var.a(appendable);
                while (va7Var.S() != 93) {
                    if (!z) {
                        va7Var.d(44);
                        va7Var.a(appendable);
                    }
                    B(va7Var, appendable);
                    z = false;
                }
                va7Var.a(appendable);
                return;
            }
            if (iS != 98 && iS != 110) {
                if (iS != 123) {
                    throw JsonSyntaxException.b(va7Var.o, va7Var.m(), va7Var.S());
                }
                va7Var.a(appendable);
                while (va7Var.S() != 125) {
                    if (!z) {
                        va7Var.d(44);
                        va7Var.a(appendable);
                    }
                    va7Var.d(34);
                    va7Var.a(appendable);
                    va7Var.d(58);
                    va7Var.a(appendable);
                    B(va7Var, appendable);
                    z = false;
                }
                va7Var.a(appendable);
                return;
            }
        }
        va7Var.a(appendable);
    }

    public static int C(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unsupported surface rotation: "));
    }

    public static final void D(y5f y5fVar) {
        y5fVar.e(mb6.class, new mxc(1));
        y5fVar.e(hhb.class, new mxc(2));
    }

    public static final void E(y5f y5fVar) {
        y5fVar.e(wc7.class, new k1e(10));
        y5fVar.e(b6e.class, new mxc(5));
        y5fVar.e(g6e.class, new mxc(6));
    }

    public static double a(JSONObject jSONObject, String str, double d2) {
        return jSONObject != null ? jSONObject.optDouble(str, d2) : d2;
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        return jSONObject != null ? jSONObject.optBoolean(str, z) : z;
    }

    public static final void c(final RecyclerView recyclerView, final int i, final int i2, final Runnable runnable, final Runnable runnable2) {
        if (recyclerView == null) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Handler handler = recyclerView.getHandler();
        if (handler != null && handler.hasMessages(61453)) {
            recyclerView.getHandler().removeMessages(61453, runnable);
        }
        if (!recyclerView.Z() && Looper.getMainLooper().isCurrentThread()) {
            a layoutManager = recyclerView.getLayoutManager();
            MessagesLayoutManager messagesLayoutManager = layoutManager instanceof MessagesLayoutManager ? (MessagesLayoutManager) layoutManager : null;
            if (messagesLayoutManager == null || !messagesLayoutManager.H) {
                runnable.run();
                return;
            }
        }
        if (i == i2) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Runnable runnable3 = new Runnable() { // from class: gec
            @Override // java.lang.Runnable
            public final void run() {
                kp.c(recyclerView, i + 1, i2, runnable, runnable2);
            }
        };
        Message messageObtain = Message.obtain(recyclerView.getHandler(), runnable3);
        messageObtain.what = 61453;
        messageObtain.obj = runnable;
        Handler handler2 = recyclerView.getHandler();
        if (handler2 != null) {
            handler2.sendMessageAtFrontOfQueue(messageObtain);
        } else {
            recyclerView.post(runnable3);
        }
    }

    public static final boolean e(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return x53.n0(uri.getPathSegments(), "/", null, null, null, 62).equals(x53.n0(uri2.getPathSegments(), "/", null, null, null, 62));
    }

    public static z24 f(khc khcVar, String str, q4c q4cVar, int i) {
        y24 y24Var = new y24(0);
        y24Var.b = kq0.F(str, q4cVar.c);
        y24Var.g = q4cVar.a;
        y24Var.h = q4cVar.b;
        String strA = khcVar.a();
        if (strA == null) {
            strA = q4cVar.b(((lk0) khcVar.b.get(0)).a).toString();
        }
        y24Var.e(strA);
        y24Var.c(i);
        return y24Var.a();
    }

    public static final void g(Spannable spannable, boolean z) {
        Object[] spans;
        int spanStart;
        int spanEnd;
        int length;
        try {
            spans = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            spans = null;
        }
        if (spans != null) {
            for (Object obj : spans) {
                if (obj == null || ((z && (obj instanceof NoCopySpan)) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final Map h(Map map) {
        Object njcVar;
        try {
            njcVar = map.keySet();
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = wz4.a;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
        return m6d.n(new qqd(27, (Iterable) njcVar));
    }

    public static final boolean i(sk6 sk6Var, sk6 sk6Var2) {
        if (sk6Var.g() != sk6Var2.g() || sk6Var.h() != sk6Var2.h() || sk6Var.i().size() != sk6Var2.i().size()) {
            return false;
        }
        int size = sk6Var.i().size();
        for (int i = 0; i < size; i++) {
            i13 i13Var = (i13) sk6Var.i().get(i);
            i13 i13Var2 = (i13) sk6Var2.i().get(i);
            if (i13Var.a() != i13Var2.a() || i13Var.b() != i13Var2.b()) {
                return false;
            }
        }
        return true;
    }

    public static final String j(zua zuaVar, String str, String str2, String str3, int i) {
        try {
            qva qvaVarT = zuaVar.t(str3, str2);
            if (zuaVar.m(qvaVarT)) {
                str2 = zuaVar.d(qvaVarT, 2);
            }
        } catch (NumberParseException unused) {
        }
        if (w9e.Y0(str.length(), str2).equals(str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(cCharAt);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                i2++;
            }
        }
        return w9e.b1(sb.toString()).toString();
    }

    public static float k(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return pu4.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int l(zua zuaVar, String str) {
        qva qvaVarE = zuaVar.e(str);
        if (!zuaVar.m(qvaVarE)) {
            return Integer.MAX_VALUE;
        }
        return w9e.b1(w9e.K0(zuaVar.d(qvaVarE, 1), "+" + qvaVarE.a)).toString().length();
    }

    public static int m(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (mqd.u(2, "CameraOrientationUtil")) {
            StringBuilder sbJ = wg0.j("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i2, ", isOppositeFacing=");
            sbJ.append(z);
            sbJ.append(", result=");
            sbJ.append(i3);
        }
        return i3;
    }

    public static int n(s02 s02Var) throws ParserException {
        int i = s02Var.i(4);
        if (i == 15) {
            if (s02Var.b() >= 24) {
                return s02Var.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i < 13) {
            return a[i];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final String o(zua zuaVar, String str) {
        qva qvaVarE = zuaVar.e(str);
        if (!zuaVar.m(qvaVarE)) {
            return null;
        }
        String strReplaceAll = Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(zuaVar.d(qvaVarE, 2)).replaceAll("");
        Pattern patternCompile = Pattern.compile("\\d");
        String strReplaceAll2 = patternCompile.matcher(strReplaceAll).replaceAll(String.valueOf('X'));
        StringBuilder sb = new StringBuilder();
        int length = strReplaceAll2.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = strReplaceAll2.charAt(i2);
            if (cCharAt == 'X') {
                sb.append(i);
                i = (i + 1) % 10;
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static float q(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return pu4.c(edgeEffect, f, f2);
        }
        ou4.a(edgeEffect, f, f2);
        return f;
    }

    public static e s(s02 s02Var, boolean z) throws ParserException {
        int i = s02Var.i(5);
        if (i == 31) {
            i = s02Var.i(6) + 32;
        }
        int iN = n(s02Var);
        int i2 = s02Var.i(4);
        String strH = zr6.h(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            iN = n(s02Var);
            int i3 = s02Var.i(5);
            if (i3 == 31) {
                i3 = s02Var.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = s02Var.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i);
                }
            }
            if (s02Var.h()) {
                z04.c0("Unexpected frameLengthFlag = 1");
            }
            if (s02Var.h()) {
                s02Var.t(14);
            }
            boolean zH = s02Var.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                s02Var.t(3);
            }
            if (zH) {
                if (i == 22) {
                    s02Var.t(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    s02Var.t(3);
                }
                s02Var.t(1);
            }
            switch (i) {
                case LangUtils.HASH_SEED /* 17 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i4 = s02Var.i(2);
                    if (i4 == 2 || i4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i4);
                    }
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new e(iN, i5, strH);
        }
        throw ParserException.a(null, null);
    }

    public static va8 t(yaf yafVar) {
        yafVar.I(1);
        int iX = yafVar.x();
        long j = yafVar.b + iX;
        int i = iX / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jP = yafVar.p();
            if (jP == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jP;
            jArrCopyOf2[i2] = yafVar.p();
            yafVar.I(2);
            i2++;
        }
        yafVar.I((int) (j - yafVar.b));
        return new va8(jArrCopyOf, 18, jArrCopyOf2);
    }

    public static final void u(Editable editable, int i, int i2, boolean z, yz7 yz7Var) {
        Class<?> cls = yz7Var.getClass();
        String string = editable.toString();
        List<yz7> listM0 = ys.m0(editable.getSpans(i, i2, cls));
        for (yz7 yz7Var2 : listM0) {
            if (editable.getSpanStart(yz7Var2) <= i && editable.getSpanEnd(yz7Var2) >= i2) {
                v(editable, yz7Var2, i, i2);
                return;
            }
        }
        if (!z) {
            for (int i3 = i; i3 < i2; i3++) {
                if (!nd7.E(string.charAt(i3))) {
                    for (Object obj : listM0) {
                        int spanStart = editable.getSpanStart(obj);
                        if (i3 > editable.getSpanEnd(obj) || spanStart > i3) {
                        }
                    }
                }
            }
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                v(editable, (yz7) it.next(), i, i2);
            }
            return;
        }
        ft.B(editable, yz7Var, i, i2);
    }

    public static final void v(Spannable spannable, uw3 uw3Var, int i, int i2) {
        int spanStart = spannable.getSpanStart(uw3Var);
        if (spanStart == -1) {
            return;
        }
        int spanEnd = spannable.getSpanEnd(uw3Var);
        if (spanStart >= i && spanEnd <= i2) {
            spannable.removeSpan(uw3Var);
            return;
        }
        int spanFlags = spannable.getSpanFlags(uw3Var);
        spannable.removeSpan(uw3Var);
        if (spanStart < i) {
            spannable.setSpan(uw3Var.copy(), spanStart, i, spanFlags);
        }
        if (spanEnd > i2) {
            spannable.setSpan(uw3Var.copy(), i2, spanEnd, spanFlags);
        }
    }

    public static final void w(Spannable spannable, Class cls, int i, int i2) {
        try {
            Object[] spans = spannable.getSpans(i, i2, cls);
            for (Object obj : spans) {
                spannable.removeSpan(obj);
            }
        } catch (Throwable unused) {
        }
    }

    public static void x(RecyclerView recyclerView, Runnable runnable) {
        c(recyclerView, 0, 5, runnable, null);
    }

    public static final CharSequence y(CharSequence charSequence) {
        return z(charSequence);
    }

    public static CharSequence z(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof gvd) {
                charSequence = (SpannableString) charSequence;
            } else {
                int i = gvd.a;
                charSequence = crd.l(charSequence, true);
            }
            return charSequence;
        } catch (Throwable th) {
            hm9.p("Markdown", "fail to make safeCopy of " + ((Object) charSequence), th);
            return charSequence;
        }
    }

    public abstract kp d(Object obj);

    public abstract void p();

    public void r() {
    }
}

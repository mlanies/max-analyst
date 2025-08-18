package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Property;
import android.util.Rational;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.themes.IncorrectThemeVersionException;
import ru.ok.tamtam.themes.ParseThemeJsonException;

/* loaded from: classes.dex */
public abstract class ema {
    public static final String[] a = {"standard", "accelerate", "decelerate", "linear"};
    public static final Object[] b = new Object[0];
    public static hx9 c;

    public static String A(us7 us7Var, String str, String str2, Long l) {
        StringBuilder sb = new StringBuilder();
        long jLongValue = l.longValue();
        ThreadLocal threadLocal = os7.h;
        ls7 ls7Var = (ls7) threadLocal.get();
        if (ls7Var == null) {
            ls7Var = new ls7();
            threadLocal.set(ls7Var);
        }
        String string = ls7Var.d;
        if (ls7Var.c != jLongValue || string == null) {
            Time time = ls7Var.a;
            time.set(jLongValue);
            StringBuilder sb2 = ls7Var.b;
            sb2.setLength(0);
            int i = (int) (jLongValue % 1000);
            b(sb2, time.month + 1);
            sb2.append('-');
            b(sb2, time.monthDay);
            sb2.append(' ');
            b(sb2, time.hour);
            sb2.append(':');
            b(sb2, time.minute);
            sb2.append(':');
            b(sb2, time.second);
            sb2.append('.');
            if (i < 10) {
                sb2.append('0');
            }
            if (i < 100) {
                sb2.append('0');
            }
            sb2.append(i);
            string = sb2.toString();
            ls7Var.d = string;
            ls7Var.c = jLongValue;
        }
        sb.append(string);
        sb.append(' ');
        sb.append(us7Var.b);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static die B(oz ozVar, Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return null;
        }
        ozVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            lz lzVar = (lz) ozVar.a.get(it.next());
            if (lzVar != null) {
                arrayList.add(lzVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new die(ozVar.c, arrayList, stringArrayList);
    }

    public static Object C(k56 k56Var, Continuation continuation) {
        return j47.t0(hz4.a, new h47(k56Var, null), continuation);
    }

    public static CharSequence D(CharSequence charSequence, List list, String[] strArr) {
        if (charSequence.length() != 0 && !list.isEmpty() && strArr.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.length() != 0) {
                        String str2 = strArr[i];
                        Pattern pattern = bre.a;
                        if (str2.regionMatches(true, 0, str, 0, str.length())) {
                            return (i == 0 || w9e.A0(charSequence.toString(), strArr[i], 0, false, 6) <= 10) ? charSequence : new SpannableString(new SpannableStringBuilder().append((CharSequence) "...").append(charSequence.subSequence((int) Math.max(0.0d, r12 - 10), charSequence.length())));
                        }
                    }
                }
                i++;
            }
        }
        return charSequence;
    }

    public static final int a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static void b(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb.append(i);
    }

    public static boolean c(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static String f(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        int iF0 = w9e.F0(".", str2, 6);
        if (iF0 != -1) {
            str2 = str2.substring(1 + iF0, str2.length());
        }
        return g(str, str2);
    }

    public static String g(String str, String str2) {
        StringBuilder sbL = au1.l(str);
        if (str2 != null && str2.length() != 0) {
            sbL.append(' ');
            sbL.append(str2);
        }
        return w9e.b1(sbL.toString()).toString();
    }

    public static HashMap h(Rect rect, boolean z, Rational rational, int i, int i2, int i3, HashMap map) {
        RectF rectF;
        boolean z2 = false;
        c54.j("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF2 = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(0.0f, 0.0f, ((vb0) entry.getValue()).a.getWidth(), ((vb0) entry.getValue()).a.getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            map2.put((l9f) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        Rational rationalO = f46.O(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(0.0f, 0.0f, rationalO.getNumerator(), rationalO.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(zr6.h(i2, "Unexpected scale type: "));
                }
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            boolean z3 = (i3 == 1) ^ z;
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF3 = rectF7;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF3.centerX();
                    float f = fCenterX + fCenterX;
                    rectF = new RectF(f - rectF7.right, rectF7.top, f - rectF7.left, rectF7.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF3.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF = new RectF(rectF7.left, f2 - rectF7.bottom, rectF7.right, f2 - rectF7.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF3.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF8 = new RectF(rectF7.left, f3 - rectF7.bottom, rectF7.right, f3 - rectF7.top);
                        float fCenterX2 = rectF3.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF3 = new RectF(f4 - rectF8.right, rectF8.top, f4 - rectF8.left, rectF8.bottom);
                    }
                }
                rectF3 = rectF;
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect2 = new Rect();
            rectF9.round(rect2);
            map3.put((l9f) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static final void i(int i, int i2, int i3, int i4, int i5) {
        od2.l(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        od2.l(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        od2.l(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        od2.l(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        od2.l(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    public static Class j(String str, boolean z) {
        if (z && TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Exception e) {
            StringBuilder sbM = au1.m("An exception occurred while finding class for name ", str, ". ");
            sbM.append(e.getMessage());
            throw new RuntimeException(sbM.toString());
        }
    }

    public static int k(JSONObject jSONObject, String str, int i) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0) {
            return i;
        }
        try {
            if (strOptString.length() == 7) {
                strOptString = "#FF".concat(w9e.K0(strOptString, "#"));
            }
            return Color.parseColor(strOptString);
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/color: error while parse color by key ".concat(str), th);
        }
    }

    public static final long l(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static sme n(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(ClientCookie.VERSION_ATTR);
            if (i > 1) {
                throw new IncorrectThemeVersionException();
            }
            boolean z = jSONObject.getBoolean("night");
            sme smeVar = z ? hq9.e0 : ee4.e0;
            JSONObject jSONObject2 = jSONObject.getJSONObject("colors");
            String string = jSONObject.getString("title");
            t63 t63Var = new t63(k(jSONObject2, "accent", smeVar.k), k(jSONObject2, "accentText", smeVar.l), k(jSONObject2, "background", smeVar.m), k(jSONObject2, "bubbleBorder", smeVar.p), k(jSONObject2, "bubbleBorderHighLight", smeVar.n), k(jSONObject2, "bubbleClickableBackground", smeVar.o), k(jSONObject2, "bubbleControlBackground", smeVar.q), k(jSONObject2, "bubbleControlsText", smeVar.s), k(jSONObject2, "bubbleDecoratorBackground", smeVar.r), k(jSONObject2, "bubbleDecoratorText", smeVar.t), k(jSONObject2, "bubbleOuterBorder", smeVar.u), k(jSONObject2, "bubbleSecondaryText", smeVar.v), k(jSONObject2, "buttonTint", smeVar.w), k(jSONObject2, "chatBackground", smeVar.x), k(jSONObject2, "destructive", smeVar.y), k(jSONObject2, "lightBadgeBackground", smeVar.z), k(jSONObject2, "highlightBackground", smeVar.A), k(jSONObject2, "incomingBubbleBackground", smeVar.B), k(jSONObject2, "incomingBubbleBackgroundHighlighted", smeVar.C), k(jSONObject2, "outgoingBubbleBackground", smeVar.D), k(jSONObject2, "outgoingBubbleBackgroundHighlighted", smeVar.E), k(jSONObject2, "primaryText", smeVar.F), k(jSONObject2, "profileBackground", smeVar.G), k(jSONObject2, "secondaryBackground", smeVar.H), k(jSONObject2, "secondaryButton", smeVar.I), k(jSONObject2, "secondaryText", smeVar.J), k(jSONObject2, "separatorBackground", smeVar.K), k(jSONObject2, "statusBarBackground", smeVar.L), k(jSONObject2, "tertiaryText", smeVar.M), k(jSONObject2, "toolBarBackground", smeVar.N), k(jSONObject2, "unreadBackground", smeVar.O), k(jSONObject2, "unreadBackgroundMuted", smeVar.P), k(jSONObject2, "unreadText", smeVar.Q), k(jSONObject2, "callAccent", smeVar.R), k(jSONObject2, "callBackground", smeVar.S), k(jSONObject2, "callControl", smeVar.T), k(jSONObject2, "groupCallBackground", smeVar.U), y(jSONObject2, "switchThumb", smeVar.V), y(jSONObject2, "switchThumbChecked", smeVar.W), y(jSONObject2, "switchTrack", smeVar.X), y(jSONObject2, "switchTrackChecked", smeVar.Y), y(jSONObject2, "switchTint", smeVar.Z));
            String string2 = jSONObject.getString("author");
            if (str2 == null) {
                str3 = string + ".ttstyle";
            } else {
                str3 = str2;
            }
            return new sme(string, string2, z, i, str3, t63Var, b46.X, b46.o);
        } catch (JSONException e) {
            throw new ParseThemeJsonException(e);
        }
    }

    public static ObjectAnimator o(View view, g2f g2fVar, int i, int i2, float f, float f2, float f3, float f4, BaseInterpolator baseInterpolator, w1f w1fVar) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) g2fVar.b.getTag(gvb.transition_position)) != null) {
            f5 = (r7[0] - i) + translationX;
            f6 = (r7[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        h2f h2fVar = new h2f(view, g2fVar.b, translationX, translationY);
        w1fVar.a(h2fVar);
        objectAnimatorOfPropertyValuesHolder.addListener(h2fVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int p(char[] r40, char[] r41, int r42) {
        /*
            Method dump skipped, instructions count: 7048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ema.p(char[], char[], int):int");
    }

    public static sob q(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return sob.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return sob.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return sob.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return sob.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return sob.SPDY_3;
        }
        if (str.equals("quic")) {
            return sob.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static List s(String str, List list) {
        return jyc.a.r().d(bre.e(str), list);
    }

    public static boolean t(Iterable iterable, Comparator comparator) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = sm9.a;
            }
        } else {
            if (!(iterable instanceof xud)) {
                return false;
            }
            objComparator = ((ox6) ((xud) iterable)).o;
        }
        return comparator.equals(objComparator);
    }

    public static SpannableString u(CharSequence charSequence, List list, fka fkaVar) {
        if (charSequence == null || charSequence.length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(charSequence);
        if (charSequence.length() != 0 && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0d a0dVar = (a0d) it.next();
                spannableString.setSpan(new mse(fkaVar, new ww9(12)), a0dVar.a, a0dVar.b, 17);
            }
        }
        return spannableString;
    }

    public static SpannableString v(fka fkaVar, w6b w6bVar, List list) {
        CharSequence charSequence = w6bVar.a;
        return charSequence.length() == 0 ? new SpannableString("") : u(bre.e(charSequence.toString()), list, fkaVar);
    }

    public static tf5 w(String str) {
        return (str == null || w9e.C0(str) || str.length() > 4) ? tf5.c : new tf5(str.toUpperCase(Locale.ROOT));
    }

    public static boolean x(String str, List list) {
        return !jyc.a.r().d(str, list).isEmpty();
    }

    public static Integer y(JSONObject jSONObject, String str, Integer num) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0) {
            return num;
        }
        try {
            if (strOptString.length() == 7) {
                strOptString = "#FF".concat(w9e.K0(strOptString, "#"));
            }
            return Integer.valueOf(Color.parseColor(strOptString));
        } catch (Throwable th) {
            throw new RuntimeException("TamThemeFactory/optColor: error while parse color by key ".concat(str), th);
        }
    }

    public static lx3 z(lx3 lx3Var, lx3 lx3Var2) {
        return lx3Var2 == hz4.a ? lx3Var : (lx3) lx3Var2.fold(lx3Var, y63.c);
    }

    public abstract boolean d(Object obj, Object obj2);

    public abstract boolean e(Object obj, Object obj2);

    public Object r(Object obj, Object obj2) {
        return null;
    }
}

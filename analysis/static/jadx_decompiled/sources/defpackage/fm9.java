package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes.dex */
public abstract class fm9 implements rsc {
    public static boolean a;
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final byte[] e = {0, 0, 0, 1};
    public static final float[] f = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object g = new Object();
    public static int[] h = new int[10];
    public static final pe5[] i = {new pe5("name_ulr_private", 1), new pe5("name_sleep_segment_request", 1), new pe5("get_last_activity_feature_id", 1), new pe5("support_context_feature_id", 1), new pe5("get_current_location", 2), new pe5("get_last_location_with_request", 1), new pe5("set_mock_mode_with_callback", 1), new pe5("set_mock_location_with_callback", 1), new pe5("inject_location_with_callback", 1), new pe5("location_updates_with_callback", 1), new pe5("use_safe_parcelable_in_intents", 1), new pe5("flp_debug_updates", 1), new pe5("google_location_accuracy_enabled", 1), new pe5("geofences_with_callback", 1), new pe5("location_enabled", 1)};

    public static rl8 A(String str) {
        Matcher matcher = rl8.d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = rl8.e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (eae.o0(strGroup3, "'", false) && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                arrayList.add(strGroup2);
                arrayList.add(strGroup3);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new rl8(str, lowerCase, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final long B(e52 e52Var) {
        cu8 cu8Var;
        long jN = e52Var.n();
        es8 es8Var = e52Var.c;
        long j = (es8Var == null || (cu8Var = es8Var.a) == null) ? Long.MAX_VALUE : cu8Var.o;
        return jN > j ? j : jN;
    }

    public static Object C(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(i24.t("Future was expected to be done: %s", future));
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object D(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return m37.c(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static ew6 F(Object obj) {
        return obj == null ? ew6.b : new ew6(obj);
    }

    public static final boolean G(xd7 xd7Var) {
        return xd7Var == null || w9e.C0(xd7Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long I(int r13, java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.I(int, java.lang.String):long");
    }

    public static xl9 J(int i2, byte[] bArr, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        s02 s02Var = new s02(i2 + 2, i3, 4, bArr);
        int i14 = 4;
        s02Var.t(4);
        int i15 = s02Var.i(3);
        s02Var.s();
        int i16 = s02Var.i(2);
        boolean zH = s02Var.h();
        int i17 = s02Var.i(5);
        int i18 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (s02Var.h()) {
                i18 |= 1 << i19;
            }
        }
        int[] iArr2 = new int[6];
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = s02Var.i(8);
        }
        int i21 = s02Var.i(8);
        int i22 = 0;
        for (int i23 = 0; i23 < i15; i23++) {
            if (s02Var.h()) {
                i22 += 89;
            }
            if (s02Var.h()) {
                i22 += 8;
            }
        }
        s02Var.t(i22);
        if (i15 > 0) {
            s02Var.t((8 - i15) * 2);
        }
        s02Var.m();
        int iM = s02Var.m();
        if (iM == 3) {
            s02Var.s();
        }
        int iM2 = s02Var.m();
        int iM3 = s02Var.m();
        if (s02Var.h()) {
            int iM4 = s02Var.m();
            int iM5 = s02Var.m();
            int iM6 = s02Var.m();
            int iM7 = s02Var.m();
            iM2 -= (iM4 + iM5) * ((iM == 1 || iM == 2) ? 2 : 1);
            iM3 -= (iM6 + iM7) * (iM == 1 ? 2 : 1);
        }
        int i24 = iM3;
        int i25 = iM2;
        int iM8 = s02Var.m();
        int iM9 = s02Var.m();
        int iM10 = s02Var.m();
        int iH = -1;
        int iMax = -1;
        for (int i26 = s02Var.h() ? 0 : i15; i26 <= i15; i26++) {
            s02Var.m();
            iMax = Math.max(s02Var.m(), iMax);
            s02Var.m();
        }
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        s02Var.m();
        if (s02Var.h() && s02Var.h()) {
            int i27 = 0;
            while (i27 < i14) {
                int i28 = 0;
                while (i28 < 6) {
                    if (s02Var.h()) {
                        int iMin = Math.min(64, 1 << ((i27 << 1) + i14));
                        if (i27 > 1) {
                            s02Var.n();
                        }
                        for (int i29 = 0; i29 < iMin; i29++) {
                            s02Var.n();
                        }
                    } else {
                        s02Var.m();
                    }
                    i28 += i27 == 3 ? 3 : 1;
                    i14 = 4;
                }
                i27++;
                i14 = 4;
            }
        }
        s02Var.t(2);
        if (s02Var.h()) {
            s02Var.t(8);
            s02Var.m();
            s02Var.m();
            s02Var.s();
        }
        int iM11 = s02Var.m();
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i30 = 0;
        int i31 = -1;
        int i32 = -1;
        while (i30 < iM11) {
            if (i30 == 0 || !s02Var.h()) {
                i8 = iM11;
                i9 = i17;
                i10 = i18;
                iArr = iArr2;
                i11 = i21;
                i12 = iMax;
                int iM12 = s02Var.m();
                int iM13 = s02Var.m();
                iArr3 = new int[iM12];
                int i33 = 0;
                while (i33 < iM12) {
                    iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (s02Var.m() + 1);
                    s02Var.s();
                    i33++;
                }
                iArrCopyOf = new int[iM13];
                int i34 = 0;
                while (i34 < iM13) {
                    iArrCopyOf[i34] = s02Var.m() + 1 + (i34 > 0 ? iArrCopyOf[i34 - 1] : 0);
                    s02Var.s();
                    i34++;
                }
                i31 = iM12;
                i13 = iM13;
            } else {
                i8 = iM11;
                int i35 = i31 + i32;
                int iM14 = (1 - ((s02Var.h() ? 1 : 0) * 2)) * (s02Var.m() + 1);
                i12 = iMax;
                int i36 = i35 + 1;
                i11 = i21;
                boolean[] zArr = new boolean[i36];
                iArr = iArr2;
                for (int i37 = 0; i37 <= i35; i37++) {
                    if (s02Var.h()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = s02Var.h();
                    }
                }
                int[] iArr4 = new int[i36];
                int[] iArr5 = new int[i36];
                int i38 = 0;
                for (int i39 = i32 - 1; i39 >= 0; i39--) {
                    int i40 = iArrCopyOf[i39] + iM14;
                    if (i40 < 0 && zArr[i31 + i39]) {
                        iArr4[i38] = i40;
                        i38++;
                    }
                }
                if (iM14 < 0 && zArr[i35]) {
                    iArr4[i38] = iM14;
                    i38++;
                }
                i10 = i18;
                int i41 = i38;
                i9 = i17;
                for (int i42 = 0; i42 < i31; i42++) {
                    int i43 = iArr3[i42] + iM14;
                    if (i43 < 0 && zArr[i42]) {
                        iArr4[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i41);
                int i44 = 0;
                for (int i45 = i31 - 1; i45 >= 0; i45--) {
                    int i46 = iArr3[i45] + iM14;
                    if (i46 > 0 && zArr[i45]) {
                        iArr5[i44] = i46;
                        i44++;
                    }
                }
                if (iM14 > 0 && zArr[i35]) {
                    iArr5[i44] = iM14;
                    i44++;
                }
                i13 = i44;
                for (int i47 = 0; i47 < i32; i47++) {
                    int i48 = iArrCopyOf[i47] + iM14;
                    if (i48 > 0 && zArr[i31 + i47]) {
                        iArr5[i13] = i48;
                        i13++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i13);
                iArr3 = iArrCopyOf2;
                i31 = i41;
            }
            i30++;
            i32 = i13;
            iM11 = i8;
            iMax = i12;
            i21 = i11;
            iArr2 = iArr;
            i18 = i10;
            i17 = i9;
        }
        int i49 = i17;
        int i50 = i18;
        int[] iArr6 = iArr2;
        int i51 = i21;
        int i52 = iMax;
        if (s02Var.h()) {
            int iM15 = s02Var.m();
            for (int i53 = 0; i53 < iM15; i53++) {
                s02Var.t(iM10 + 5);
            }
        }
        s02Var.t(2);
        float f2 = 1.0f;
        if (s02Var.h()) {
            if (s02Var.h()) {
                int i54 = s02Var.i(8);
                if (i54 == 255) {
                    int i55 = s02Var.i(16);
                    int i56 = s02Var.i(16);
                    if (i55 != 0 && i56 != 0) {
                        f2 = i55 / i56;
                    }
                } else if (i54 < 17) {
                    f2 = f[i54];
                } else {
                    ey8.k(i54, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (s02Var.h()) {
                s02Var.s();
            }
            if (s02Var.h()) {
                s02Var.t(3);
                i7 = s02Var.h() ? 1 : 2;
                if (s02Var.h()) {
                    int i57 = s02Var.i(8);
                    int i58 = s02Var.i(8);
                    s02Var.t(8);
                    iH = i63.h(i57);
                    i5 = i63.i(i58);
                } else {
                    i5 = -1;
                }
            } else {
                i7 = -1;
                i5 = -1;
            }
            if (s02Var.h()) {
                s02Var.m();
                s02Var.m();
            }
            s02Var.s();
            if (s02Var.h()) {
                i24 *= 2;
            }
            i6 = i7;
            i4 = i24;
        } else {
            i4 = i24;
            i5 = -1;
            i6 = -1;
        }
        return new xl9(i16, zH, i49, i50, iM8, iM9, iArr6, i51, i25, i4, f2, i52, iH, i6, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bm9 K(int r30, byte[] r31, int r32) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.K(int, byte[], int):bm9");
    }

    public static bdb L(byte[] bArr) throws ProtoException {
        int i2 = 0;
        byte[] bArr2 = b.a;
        try {
            Protos.SelfProfile from = Protos.SelfProfile.parseFrom(bArr);
            HashMap map = new HashMap();
            Map<Integer, Protos.RestrictionsInfo> map2 = from.restrictions;
            if (map2 != null && !map2.isEmpty()) {
                for (Integer num : from.restrictions.keySet()) {
                    map.put(num, new jjc(from.restrictions.get(num).expiration));
                }
            }
            ArrayList arrayList = new ArrayList();
            int[] iArr = from.profileOptions;
            if (iArr != null && iArr.length >= 1) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = from.profileOptions;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(iArr2[i3]));
                    i3++;
                }
            }
            return new bdb(map, i2, arrayList);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new ProtoException(e2);
        }
    }

    public static void M(Context context, String str, s08 s08Var, boolean z) {
        khe kheVar = sme.a0;
        sme smeVarR = R(context);
        View viewInflate = z ? LayoutInflater.from(context).inflate(yyb.dialog_progress_with_text, (ViewGroup) null) : LayoutInflater.from(context).inflate(yyb.dialog_progress_horizontal, (ViewGroup) null);
        if (z) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(xxb.dialog_progress__text);
            if (appCompatTextView != null) {
                appCompatTextView.setText(str);
                appCompatTextView.setTextColor(smeVarR.J);
                appCompatTextView.setTextSize(13.0f);
            }
        } else {
            s08Var.a.f = str;
        }
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(xxb.dialog_progress__progress);
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
            progressBar.setMax(100);
            ngg.H(progressBar, smeVarR.k);
        }
        s08Var.f(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(Widget widget) {
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarE = wg0.e(v0c.oneme_login_sms_count_exceeded_title, 6, null);
        lg3VarE.f(new eqe(v0c.oneme_login_sms_count_exceeded_description));
        lg3VarE.d(hwb.oneme_login_sms_code_exceeded_ok_btn, new eqe(jpc.k0));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
        confirmationBottomSheetE.setTargetController(widget);
        uu3 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(widget);
        if (zncVarT != null) {
            coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    public static void O(s02 s02Var) {
        int iM = s02Var.m() + 1;
        s02Var.t(8);
        for (int i2 = 0; i2 < iM; i2++) {
            s02Var.m();
            s02Var.m();
            s02Var.s();
        }
        s02Var.t(20);
    }

    public static byte[] P(yv0 yv0Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = yv0Var.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return o(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (yv0Var.read() == -1) {
            return o(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int Q(int i2, byte[] bArr) {
        int i3;
        synchronized (g) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = h;
                    if (iArr.length <= i5) {
                        h = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    h[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = h[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static sme R(Context context) {
        Object njcVar;
        Object baseContext = context;
        while (!(baseContext instanceof ase)) {
            if (!(baseContext instanceof ContextWrapper)) {
                try {
                    ase aseVar = sme.b0;
                    if (aseVar == null) {
                        aseVar = null;
                    }
                    njcVar = aseVar.u();
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (pjc.a(njcVar) != null) {
                    njcVar = ee4.e0;
                }
                return (sme) njcVar;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((ase) baseContext).u();
    }

    public static void b(bm7 bm7Var, z66 z66Var, Executor executor) {
        bm7Var.d(new h76(bm7Var, 0, z66Var), executor);
    }

    public static void c(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else {
                    if (cause instanceof UnknownHostException) {
                        strReplace = "UnknownHostException (no network)";
                        break;
                    }
                    cause = cause.getCause();
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return;
        }
        String strValueOf = String.valueOf(str);
        new StringBuilder(rh4.e(strValueOf.length() + 4, strReplace.replace("\n", "\n  ")));
    }

    public static final Object d(iv6 iv6Var, wv6 wv6Var, long j, Object obj, hu3 hu3Var) {
        cf5 cf5Var = new cf5(iv6Var.a(wv6Var, obj), null);
        return j == Long.MAX_VALUE ? j1e.k(new ze5(cf5Var, null), hu3Var) : fp3.I(j, cf5Var, hu3Var);
    }

    public static void e(Object obj, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(Object obj, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void n(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static byte[] o(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final boolean p(long j, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i13 i13Var = (i13) it.next();
            if (i13Var.a() <= j && j <= i13Var.b()) {
                return true;
            }
        }
        return false;
    }

    public static int q(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static void r(IllegalArgumentException illegalArgumentException) {
        c("", illegalArgumentException);
    }

    public static synchronized void s() {
        if (!a) {
            hm9.M("native-imagetranscoder");
            a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.iv6 r8, defpackage.wv6 r9, long r10, java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.ye5
            if (r0 == 0) goto L14
            r0 = r14
            ye5 r0 = (defpackage.ye5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ye5 r0 = new ye5
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Z
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L2d
            boolean r13 = r6.X
            wv6 r9 = r6.o
            defpackage.od2.a0(r14)
            goto L49
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.od2.a0(r14)
            r6.o = r9
            r6.X = r13
            r6.Z = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r14 = d(r1, r2, r3, r5, r6)
            if (r14 != r0) goto L49
            return r0
        L49:
            o43 r14 = (defpackage.o43) r14
            r8 = 0
            if (r14 != 0) goto L4f
            return r8
        L4f:
            java.lang.Object r10 = r14.e0()
            l43 r10 = (defpackage.l43) r10
            boolean r11 = r10 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            r12 = 0
            if (r11 == 0) goto L61
            com.facebook.imagepipeline.image.CloseableStaticBitmap r10 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r10
            android.graphics.Bitmap r9 = r10.getUnderlyingBitmap()
            goto L83
        L61:
            boolean r11 = r10 instanceof defpackage.p43
            if (r11 == 0) goto L93
            p43 r10 = (defpackage.p43) r10
            android.graphics.drawable.Drawable r10 = r10.J()
            if (r10 == 0) goto L81
            jic r9 = r9.i
            r11 = 200(0xc8, float:2.8E-43)
            if (r9 == 0) goto L76
            int r14 = r9.a
            goto L77
        L76:
            r14 = r11
        L77:
            if (r9 == 0) goto L7b
            int r11 = r9.b
        L7b:
            android.graphics.Bitmap r9 = defpackage.f8.B(r10, r14, r11)
        L7f:
            r7 = r12
            goto L83
        L81:
            r9 = r8
            goto L7f
        L83:
            if (r13 == 0) goto L92
            if (r7 == 0) goto L92
            if (r9 == 0) goto L91
            android.graphics.Bitmap$Config r8 = r9.getConfig()
            android.graphics.Bitmap r8 = r9.copy(r8, r12)
        L91:
            return r8
        L92:
            return r9
        L93:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm9.t(iv6, wv6, long, java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object u(iv6 iv6Var, wv6 wv6Var, long j, Object obj, Continuation continuation, int i2) {
        if ((i2 & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return t(iv6Var, wv6Var, j2, obj, true, continuation);
    }

    public static final i13 v(long j, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            i13 i13Var = (i13) next;
            if (i13Var.a() <= j && j <= i13Var.b()) {
                break;
            }
        }
        return (i13) next;
    }

    public static final i13 w(long j, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((i13) obj2).a() > j) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jB = ((i13) next).b();
                do {
                    Object next2 = it.next();
                    long jB2 = ((i13) next2).b();
                    if (jB > jB2) {
                        next = next2;
                        jB = jB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (i13) obj;
    }

    public static final i13 x(long j, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((i13) obj2).b() < j) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jB = ((i13) next).b();
                do {
                    Object next2 = it.next();
                    long jB2 = ((i13) next2).b();
                    if (jB < jB2) {
                        next = next2;
                        jB = jB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (i13) obj;
    }

    public static int y(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        k(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            n(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            n(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            n(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    n(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static final void z(ViewPager2 viewPager2) {
        RecyclerView recyclerView = (RecyclerView) l6d.c0(l6d.Z(new at(7, viewPager2), n71.z0));
        if (recyclerView != null) {
            recyclerView.setId(xoc.W0);
        }
    }

    public abstract void E(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5);

    public abstract Rect H();

    @Override // defpackage.rsc
    public Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
        E(matrix, rect, i2, i3, f2, f3, rect.width() / i2, rect.height() / i3);
        return matrix;
    }
}

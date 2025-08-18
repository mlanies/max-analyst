package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;

/* loaded from: classes.dex */
public abstract class tu0 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final yxc g = new yxc(10);
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static boolean j;
    public static long k;
    public static jm9 l;
    public static final /* synthetic */ int m = 0;

    public static void A(Set set, pi0 pi0Var, boolean z) {
        hm9.n("tu0", "event: " + pi0Var.getClass().getName() + " postponed");
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                pi0 pi0Var2 = (pi0) it.next();
                if (pi0Var2.getClass().equals(pi0Var.getClass())) {
                    arrayList.add(pi0Var2);
                }
            }
            set.removeAll(arrayList);
        }
        set.add(pi0Var);
    }

    public static long B(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    public static final int C(InputStream inputStream, int i2, boolean z) throws IOException {
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = inputStream.read();
            if (i6 == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i3 = (i6 & 255) << (i5 * 8);
            } else {
                i4 <<= 8;
                i3 = i6 & 255;
            }
            i4 |= i3;
        }
        return i4;
    }

    public static long D(int i2, byte[] bArr) {
        long jB = B(i2, bArr);
        long jB2 = B(i2 + 4, bArr);
        if (jB == 0 && jB2 == 0) {
            return 0L;
        }
        return ((jB2 * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }

    public static final gaf E(gy8 gy8Var) {
        int iN;
        String strP;
        String string;
        String string2;
        eaf eafVar = new eaf();
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        for (int i2 = 0; i2 < iN; i2++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                try {
                    String str = strP + "=";
                    switch (strP.hashCode()) {
                        case -2099474505:
                            if (strP.equals("DIALOGS_LED")) {
                                int iV0 = gy8Var.v0();
                                Integer numValueOf = Integer.valueOf(iV0);
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) str);
                                sb.append(iV0);
                                string = sb.toString();
                                eafVar.j = numValueOf;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1972016425:
                            if (strP.equals("INCOMING_CALL")) {
                                String strZ0 = gy8Var.z0();
                                string2 = ((Object) str) + strZ0;
                                eafVar.p = h4f.d(strZ0);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1965172674:
                            if (strP.equals("DIALOGS_PUSH_SOUND")) {
                                String strZ02 = gy8Var.z0();
                                string2 = ((Object) str) + strZ02;
                                eafVar.f = strZ02;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -1917056995:
                            if (strP.equals("SEARCH_BY_PHONE")) {
                                String strP2 = lz7.P(gy8Var);
                                string2 = ((Object) str) + strP2;
                                eafVar.v = h4f.d(strP2);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -952000630:
                            if (strP.equals("PUSH_SOUND")) {
                                String strZ03 = gy8Var.z0();
                                string2 = ((Object) str) + strZ03;
                                eafVar.e = strZ03;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -747186863:
                            if (strP.equals("SUGGEST_STICKERS")) {
                                String strP3 = lz7.P(gy8Var);
                                string2 = ((Object) str) + strP3;
                                eafVar.s = h4f.e(strP3);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -694542025:
                            if (strP.equals("PUSH_NEW_CONTACTS")) {
                                boolean zU0 = gy8Var.u0();
                                Boolean boolValueOf = Boolean.valueOf(zU0);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((Object) str);
                                sb2.append(zU0);
                                string = sb2.toString();
                                eafVar.a = boolValueOf;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -658898441:
                            if (strP.equals("DIALOGS_VIBR")) {
                                boolean zU02 = gy8Var.u0();
                                Boolean boolValueOf2 = Boolean.valueOf(zU02);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append((Object) str);
                                sb3.append(zU02);
                                string = sb3.toString();
                                eafVar.m = boolValueOf2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -389923664:
                            if (strP.equals("DONT_DISTURB_UNTIL")) {
                                long jW0 = gy8Var.w0();
                                Long lValueOf = Long.valueOf(jW0);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append((Object) str);
                                sb4.append(jW0);
                                string2 = sb4.toString();
                                eafVar.b = lValueOf;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case -248197113:
                            if (strP.equals("CHATS_VIBR")) {
                                boolean zU03 = gy8Var.u0();
                                Boolean boolValueOf3 = Boolean.valueOf(zU03);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append((Object) str);
                                sb5.append(zU03);
                                string = sb5.toString();
                                eafVar.n = boolValueOf3;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 75243:
                            if (strP.equals("LED")) {
                                int iV02 = gy8Var.v0();
                                Integer numValueOf2 = Integer.valueOf(iV02);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append((Object) str);
                                sb6.append(iV02);
                                string = sb6.toString();
                                eafVar.i = numValueOf2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 2634307:
                            if (strP.equals("VIBR")) {
                                boolean zU04 = gy8Var.u0();
                                Boolean boolValueOf4 = Boolean.valueOf(zU04);
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append((Object) str);
                                sb7.append(zU04);
                                string = sb7.toString();
                                eafVar.l = boolValueOf4;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 130531239:
                            if (strP.equals("CHATS_LED")) {
                                int iV03 = gy8Var.v0();
                                Integer numValueOf3 = Integer.valueOf(iV03);
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append((Object) str);
                                sb8.append(iV03);
                                string = sb8.toString();
                                eafVar.k = numValueOf3;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 136965804:
                            if (strP.equals("CHATS_PUSH_NOTIFICATION")) {
                                String strZ04 = gy8Var.z0();
                                string2 = ((Object) str) + strZ04;
                                eafVar.d = strZ04;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 345218686:
                            if (strP.equals("UNSAFE_FILES")) {
                                boolean zH = lz7.H(gy8Var);
                                Boolean boolValueOf5 = Boolean.valueOf(zH);
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append((Object) str);
                                sb9.append(zH);
                                string = sb9.toString();
                                eafVar.w = boolValueOf5;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 640193528:
                            if (strP.equals("INACTIVE_TTL")) {
                                String strP4 = lz7.P(gy8Var);
                                string2 = ((Object) str) + strP4;
                                faf fafVar = faf.TTL_6M;
                                if (strP4 != null) {
                                    switch (strP4) {
                                        case "1M":
                                            fafVar = faf.TTL_1M;
                                            break;
                                        case "3M":
                                            fafVar = faf.TTL_3M;
                                            break;
                                    }
                                }
                                eafVar.q = fafVar;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 836229259:
                            if (strP.equals("AUDIO_TRANSCRIPTION_ENABLED")) {
                                boolean zH2 = lz7.H(gy8Var);
                                Boolean boolValueOf6 = Boolean.valueOf(zH2);
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append((Object) str);
                                sb10.append(zH2);
                                string = sb10.toString();
                                eafVar.t = boolValueOf6;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1633771469:
                            if (strP.equals("CHATS_INVITE")) {
                                String strZ05 = gy8Var.z0();
                                string2 = ((Object) str) + strZ05;
                                eafVar.o = h4f.d(strZ05);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1684923157:
                            if (strP.equals("SAFE_MODE")) {
                                boolean zH3 = lz7.H(gy8Var);
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append((Object) str);
                                sb11.append(zH3);
                                string2 = sb11.toString();
                                eafVar.u = Boolean.valueOf(zH3);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1911151182:
                            if (strP.equals("CHATS_PUSH_SOUND")) {
                                String strZ06 = gy8Var.z0();
                                string2 = ((Object) str) + strZ06;
                                eafVar.g = strZ06;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1950966460:
                            if (strP.equals("DIALOGS_PUSH_NOTIFICATION")) {
                                String strZ07 = gy8Var.z0();
                                string2 = ((Object) str) + strZ07;
                                eafVar.c = strZ07;
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 1958389377:
                            if (strP.equals("M_CALL_PUSH_NOTIFICATION")) {
                                String strP5 = lz7.P(gy8Var);
                                string2 = ((Object) str) + strP5;
                                eafVar.r = h4f.c(strP5);
                                string = string2;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        case 2130809258:
                            if (strP.equals("HIDDEN")) {
                                boolean zU05 = gy8Var.u0();
                                Boolean boolValueOf7 = Boolean.valueOf(zU05);
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append((Object) str);
                                sb12.append(zU05);
                                string = sb12.toString();
                                eafVar.h = boolValueOf7;
                                break;
                            } else {
                                gy8Var.z();
                                string = ((Object) str) + "skip!";
                                break;
                            }
                        default:
                            gy8Var.z();
                            string = ((Object) str) + "skip!";
                            break;
                    }
                    hm9.n("ConfigurationUserSettingsParsing", string);
                } catch (Throwable th3) {
                    try {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new gaf(eafVar);
    }

    public static int F(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int G(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static long H(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    public static final Map I(gy8 gy8Var) {
        int iA = gy8Var.n().a();
        oz4 oz4Var = oz4.a;
        if (iA != 8) {
            gy8Var.z();
            return oz4Var;
        }
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return oz4Var;
        }
        us usVar = new us(iN);
        for (int i2 = 0; i2 < iN; i2++) {
            String strP = lz7.P(gy8Var);
            if (strP != null) {
                usVar.put(strP, J(gy8Var));
            } else {
                gy8Var.z();
            }
        }
        return usVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final Object J(gy8 gy8Var) {
        int iA = gy8Var.n().a();
        Object objValueOf = 0;
        objValueOf = 0;
        switch (iA == 0 ? -1 : qe3.$EnumSwitchMapping$0[au1.s(iA)]) {
            case 1:
                byte b2 = gy8Var.readByte();
                if (b2 == -64) {
                    return e5f.a;
                }
                throw gy8.r0("Nil", b2);
            case 2:
                return Boolean.valueOf(lz7.H(gy8Var));
            case 3:
                if (gy8Var.n().a() == 3) {
                    objValueOf = Long.valueOf(gy8Var.w0());
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            case 4:
                return lz7.K(gy8Var, null);
            case 5:
                return lz7.Q(gy8Var, null);
            case 6:
                if (gy8Var.n().a() == 7) {
                    objValueOf = new ArrayList();
                    int iS0 = gy8Var.s0();
                    for (int i2 = 0; i2 < iS0; i2++) {
                        objValueOf.add(J(gy8Var));
                    }
                    break;
                } else {
                    gy8Var.z();
                    break;
                }
            case 7:
                return I(gy8Var);
            default:
                gy8Var.z();
                return null;
        }
        return objValueOf;
    }

    public static final void K(View view, long j2, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new e44(j2, onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    public static void M(a66 a66Var, Object obj, Continuation continuation) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(v3c.u(v3c.j(a66Var, obj, continuation)), e5f.a, null);
        } catch (Throwable th) {
            continuation.resumeWith(new njc(th));
            throw th;
        }
    }

    public static final void N(y9b y9bVar, WorkDatabase workDatabase, me3 me3Var, List list, h8g h8gVar, Set set) {
        i8g i8gVarY = workDatabase.y();
        String str = h8gVar.a;
        h8g h8gVarL = i8gVarY.l(str);
        if (h8gVarL == null) {
            throw new IllegalArgumentException(zr6.i("Worker with ", str, " doesn't exist"));
        }
        if (h8gVarL.b.a()) {
            return;
        }
        if (h8gVarL.d() ^ h8gVar.d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(h8gVarL.d() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(zr6.l(sb, h8gVar.d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        boolean zD = y9bVar.d(str);
        if (!zD) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((auc) it.next()).d(str);
            }
        }
        workDatabase.q(new dk8(workDatabase, h8gVar, h8gVarL, list, str, set, zD));
        if (zD) {
            return;
        }
        nuc.a(me3Var, workDatabase, list);
    }

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        long j2;
        synchronized (i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j2 = jCurrentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j3 = jCurrentTimeMillis / 1000;
                long j4 = jCurrentTimeMillis - (j3 * 1000);
                long j5 = j3 + 2208988800L;
                j2 = jCurrentTimeMillis;
                bArr[40] = (byte) (j5 >> 24);
                bArr[41] = (byte) (j5 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j5 >> 8);
                    bArr[43] = (byte) j5;
                    long j6 = (j4 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j6 >> 24);
                    bArr[45] = (byte) (j6 >> 16);
                    bArr[46] = (byte) (j6 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = (jElapsedRealtime2 - jElapsedRealtime) + j2;
            byte b2 = bArr[0];
            int i2 = bArr[1] & 255;
            long jD = D(24, bArr);
            long jD2 = D(32, bArr);
            long jD3 = D(40, bArr);
            d((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i2, jD3);
            long j8 = (j7 + (((jD3 - j7) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j8;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static final void b(LinkedHashMap linkedHashMap, r6d r6dVar, String str, int i2) {
        String str2 = tpa.f(r6dVar.e(), w6d.f) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + r6dVar.g(i2) + " is already one of the names for " + str2 + ' ' + r6dVar.g(((Number) mz7.X(linkedHashMap, str)).intValue()) + " in " + r6dVar);
    }

    public static void d(byte b2, byte b3, int i2, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(zr6.h(b3, "SNTP: Untrusted mode: "));
        }
        if (i2 == 0 || i2 > 15) {
            throw new IOException(zr6.h(i2, "SNTP: Untrusted stratum: "));
        }
        if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static Uri e(Uri uri, Context context, zi5 zi5Var) throws IOException {
        InputStream inputStreamOpenInputStream;
        String type;
        File fileQ;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            hm9.n("tu0", "Uri is from FileProvider, need copy: " + uri);
            type = context.getContentResolver().getType(uri);
            if (type == null) {
                type = "application/octet-stream";
            }
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
            StringBuilder sb = new StringBuilder();
            if (uri.getLastPathSegment() != null) {
                sb.append(uri.getLastPathSegment());
            }
            if (extensionFromMimeType != null && !sb.toString().endsWith(extensionFromMimeType)) {
                sb.append(".");
                sb.append(extensionFromMimeType);
            }
            fileQ = ((kk5) zi5Var).q(sb.toString());
            fileOutputStream = new FileOutputStream(fileQ);
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                th = th;
                inputStreamOpenInputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            s5c.t(inputStreamOpenInputStream, fileOutputStream);
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
            Uri uriFromFile = Uri.fromFile(fileQ);
            ContentValues contentValues = new ContentValues();
            contentValues.put("mime_type", type);
            try {
                try {
                    context.getContentResolver().update(uriFromFile, contentValues, null, null);
                } catch (IllegalArgumentException e2) {
                    hm9.l0("tu0", "copyContentOfUri failed to copy mimetype", e2);
                }
            } catch (IllegalArgumentException unused) {
                context.getContentResolver().insert(uriFromFile, contentValues);
            }
            try {
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
            } catch (Exception unused2) {
            }
            return uriFromFile;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                hm9.p("tu0", "handleSingleMediaIntent failed to copy FileProvider uri: ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                        return uri;
                    }
                }
                return uri;
            } finally {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        }
    }

    public static int f(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static final kq1 g(mn5 mn5Var, gh7 gh7Var, fg7 fg7Var) {
        return od2.g(new go5(gh7Var, fg7Var, mn5Var, null));
    }

    public static ffc h(ru0 ru0Var, ArrayList arrayList) {
        ww6 ww6VarI = zw6.i();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            ww6VarI.a(ru0Var.g(bundle));
        }
        return ww6VarI.j();
    }

    public static List i(ru0 ru0Var, ArrayList arrayList, ffc ffcVar) {
        return arrayList == null ? ffcVar : h(ru0Var, arrayList);
    }

    public static final int j(r6d r6dVar, ja7 ja7Var, String str) {
        Object objInvoke;
        boolean z = ja7Var.a.m;
        yxc yxcVar = g;
        xh3 xh3Var = ja7Var.c;
        if (z && tpa.f(r6dVar.e(), w6d.f)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            yf3 yf3Var = new yf3(r6dVar, 14, ja7Var);
            ConcurrentHashMap concurrentHashMap = xh3Var.a;
            Map map = (Map) concurrentHashMap.get(r6dVar);
            Object obj = map != null ? map.get(yxcVar) : null;
            objInvoke = obj != null ? obj : null;
            if (objInvoke == null) {
                objInvoke = yf3Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(r6dVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(r6dVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(yxcVar, objInvoke);
            }
            Integer num = (Integer) ((Map) objInvoke).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        t(ja7Var, r6dVar);
        int iD = r6dVar.d(str);
        if (iD != -3 || !ja7Var.a.l) {
            return iD;
        }
        yf3 yf3Var2 = new yf3(r6dVar, 14, ja7Var);
        ConcurrentHashMap concurrentHashMap3 = xh3Var.a;
        Map map2 = (Map) concurrentHashMap3.get(r6dVar);
        Object obj2 = map2 != null ? map2.get(yxcVar) : null;
        objInvoke = obj2 != null ? obj2 : null;
        if (objInvoke == null) {
            objInvoke = yf3Var2.invoke();
            Object concurrentHashMap4 = concurrentHashMap3.get(r6dVar);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(r6dVar, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(yxcVar, objInvoke);
        }
        Integer num2 = (Integer) ((Map) objInvoke).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int k(r6d r6dVar, ja7 ja7Var, String str, String str2) {
        int iJ = j(r6dVar, ja7Var, str);
        if (iJ != -3) {
            return iJ;
        }
        throw new SerializationException(r6dVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static int l(Intent intent) {
        String type = intent.getType();
        boolean z = false;
        if ((type != null ? eae.o0(type, ey8.f(10), true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        if (type != null ? eae.o0(type, ey8.f(11), true) : false) {
            return 5;
        }
        if ((type == null || type.length() == 0 || !eae.o0(type, "image/", true) || w9e.p0(type, "djvu", true)) ? false : true) {
            return 1;
        }
        if (type != null && type.length() != 0 && eae.o0(type, "video/", true)) {
            z = true;
        }
        return z ? 2 : 4;
    }

    public static ArrayList m(Intent intent, Context context, o45 o45Var, zi5 zi5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                Uri uriE = parcelable == null ? null : parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
                if (uriE != null && !tfg.x(uriE, context, o45Var)) {
                    if (zi5Var != null) {
                        uriE = e(uriE, context, zi5Var);
                    }
                    arrayList.add(uriE);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList n(Intent intent, Context context, o45 o45Var, zi5 zi5Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra == null) {
            return arrayList;
        }
        Uri uriE = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : Uri.parse(parcelableExtra.toString());
        if (uriE == null) {
            return arrayList;
        }
        if (uriE.toString().startsWith("content://ru.oneme.app")) {
            arrayList.add(uriE);
        } else if (!tfg.x(uriE, context, o45Var)) {
            if (zi5Var != null) {
                uriE = e(uriE, context, zi5Var);
            }
            arrayList.add(uriE);
        }
        return arrayList;
    }

    public static String o(Intent intent) {
        CharSequence charSequenceExtra;
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        return (stringExtra != null || (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) == null) ? stringExtra : charSequenceExtra.toString();
    }

    public static final boolean p(int i2, int i3, jic jicVar) {
        if (jicVar == null) {
            if (((int) (i2 * 1.3333334f)) < 2048.0f || ((int) (i3 * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (i2 * 1.3333334f)) < jicVar.a || ((int) (i3 * 1.3333334f)) < jicVar.b) {
            return false;
        }
        return true;
    }

    public static final boolean q(g05 g05Var, jic jicVar) {
        if (g05Var == null) {
            return false;
        }
        g05Var.o0();
        int i2 = g05Var.o;
        if (i2 == 90 || i2 == 270) {
            g05Var.o0();
            int i3 = g05Var.Z;
            g05Var.o0();
            return p(i3, g05Var.Y, jicVar);
        }
        g05Var.o0();
        int i4 = g05Var.Y;
        g05Var.o0();
        return p(i4, g05Var.Z, jicVar);
    }

    public static je7 r(int i2, k56 k56Var) {
        int i3 = oe7.$EnumSwitchMapping$0[au1.s(i2)];
        if (i3 == 1) {
            return new khe(k56Var);
        }
        qq9 qq9Var = qq9.v0;
        if (i3 == 2) {
            uqc uqcVar = new uqc();
            uqcVar.a = k56Var;
            uqcVar.b = qq9Var;
            return uqcVar;
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        x5f x5fVar = new x5f();
        x5fVar.a = k56Var;
        x5fVar.b = qq9Var;
        return x5fVar;
    }

    public static rk0 s(String str) {
        return new rk0(sl.a(str));
    }

    public static final void t(ja7 ja7Var, r6d r6dVar) {
        if (tpa.f(r6dVar.e(), nae.e)) {
            ja7Var.a.getClass();
        }
    }

    public static void u(Bundle bundle, Set set) {
        List list;
        hm9.k("tu0", "onCreate");
        if (!bundle.containsKey("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS") || (list = (List) bundle.get("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS")) == null) {
            return;
        }
        set.clear();
        set.addAll(list);
    }

    public static final boolean z(String str) {
        return (str.equals(HttpGet.METHOD_NAME) || str.equals(HttpHead.METHOD_NAME)) ? false : true;
    }

    public void c(int i2) {
        new Handler(Looper.getMainLooper()).post(new l40(i2, 14, this));
    }

    public abstract void v(Throwable th);

    public abstract void w(int i2);

    public abstract void x(Typeface typeface);

    public abstract void y(t99 t99Var);
}

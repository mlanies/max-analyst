package defpackage;

import android.R;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Looper;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import net.jpountz.lz4.LZ4Factory;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.TracerLibraryManifest;

/* loaded from: classes2.dex */
public abstract class nd7 {
    public static volatile LZ4Factory a;
    public static final String[] b = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final float[] e = new float[0];
    public static final String[] f = new String[0];
    public static final byte[] g = new byte[0];
    public static x6a h;
    public static final /* synthetic */ int i = 0;
    public static volatile wbd j;

    public static final void A(Context context, String str) {
        if (str.length() == 0) {
            return;
        }
        try {
            Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(str);
            Linkify.addLinks(spannableNewSpannable, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), URLSpan.class);
            if (true ^ (uRLSpanArr.length == 0)) {
                if (uRLSpanArr.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                str = uRLSpanArr[0].getURL();
            }
        } catch (Throwable unused) {
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.getMessage();
        }
    }

    public static final boolean B(uu3 uu3Var) {
        return uu3Var.viewState != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v54 */
    public static nab C(gy8 gy8Var) {
        int iN;
        ?? P;
        Integer numValueOf;
        wm3 wm3VarValueOf;
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
        wm3 wm3Var = null;
        if (iN == 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        wm3 wm3VarE = null;
        while (i2 < iN) {
            try {
                P = lz7.P(gy8Var);
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
                P = wm3Var;
            }
            if (P != 0) {
                int iHashCode = P.hashCode();
                if (iHashCode != -2078600011) {
                    if (iHashCode != -1148295641) {
                        if (iHashCode == 951526432 && P.equals("contact")) {
                            try {
                                wm3VarE = wm3.e(gy8Var);
                            } catch (Throwable th3) {
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
                                wm3VarE = wm3Var;
                            }
                        }
                    } else if (P.equals("restrictions")) {
                        Integer numValueOf2 = 0;
                        try {
                            numValueOf2 = Integer.valueOf(lz7.N(gy8Var));
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
                        int iIntValue = numValueOf2.intValue();
                        int i3 = 0;
                        while (i3 < iIntValue) {
                            try {
                                wm3VarValueOf = Integer.valueOf(lz7.L(gy8Var));
                            } catch (Throwable th5) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it5 = u7d.a.iterator();
                                while (it5.hasNext()) {
                                    ((r4a) it5.next()).getClass();
                                    r4a.a(th5);
                                }
                                int iS5 = au1.s(k7d.a);
                                if (iS5 != 0) {
                                    if (iS5 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th5;
                                }
                                wm3VarValueOf = wm3Var;
                            }
                            if (wm3VarValueOf != null) {
                                Long lValueOf = 0L;
                                try {
                                    lValueOf = Long.valueOf(lz7.M(gy8Var, 0L));
                                } catch (Throwable th6) {
                                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                    Iterator it6 = u7d.a.iterator();
                                    while (it6.hasNext()) {
                                        ((r4a) it6.next()).getClass();
                                        r4a.a(th6);
                                    }
                                    int iS6 = au1.s(k7d.a);
                                    if (iS6 != 0) {
                                        if (iS6 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th6;
                                    }
                                }
                                linkedHashMap.put(wm3VarValueOf, new kjc(lValueOf.longValue()));
                            }
                            i3++;
                            wm3Var = null;
                        }
                    }
                } else if (P.equals("profileOptions")) {
                    Integer numValueOf3 = 0;
                    try {
                        numValueOf3 = Integer.valueOf(lz7.G(gy8Var));
                    } catch (Throwable th7) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it7 = u7d.a.iterator();
                        while (it7.hasNext()) {
                            ((r4a) it7.next()).getClass();
                            r4a.a(th7);
                        }
                        int iS7 = au1.s(k7d.a);
                        if (iS7 != 0) {
                            if (iS7 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th7;
                        }
                    }
                    int iIntValue2 = numValueOf3.intValue();
                    for (int i4 = 0; i4 < iIntValue2; i4++) {
                        try {
                            numValueOf = Integer.valueOf(lz7.L(gy8Var));
                        } catch (Throwable th8) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it8 = u7d.a.iterator();
                            while (it8.hasNext()) {
                                ((r4a) it8.next()).getClass();
                                r4a.a(th8);
                            }
                            int iS8 = au1.s(k7d.a);
                            if (iS8 != 0) {
                                if (iS8 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th8;
                            }
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList.add(Integer.valueOf(numValueOf.intValue()));
                        }
                    }
                }
                try {
                    gy8Var.z();
                } catch (Throwable th9) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                    Iterator it9 = u7d.a.iterator();
                    while (it9.hasNext()) {
                        ((r4a) it9.next()).getClass();
                        r4a.a(th9);
                    }
                    int iS9 = au1.s(k7d.a);
                    if (iS9 != 0) {
                        if (iS9 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th9;
                    }
                }
            }
            i2++;
            wm3Var = null;
        }
        return new nab(wm3VarE, linkedHashMap, arrayList);
    }

    public static boolean D(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean E(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static ArrayList F(Collection collection, b66 b66Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(b66Var.mo131apply(it.next()));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static qy5[] G(ArrayList arrayList) {
        int size = arrayList.size();
        qy5[] qy5VarArr = new qy5[size];
        for (int i2 = 0; i2 < size; i2++) {
            qy5 qy5Var = ((ua8) arrayList.get(i2)).a;
            if (qy5Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            qy5VarArr[i2] = qy5Var;
        }
        return qy5VarArr;
    }

    public static ipe L(int i2, yaf yafVar, String str) {
        int iH = yafVar.h();
        if (yafVar.h() == 1684108385 && iH >= 22) {
            yafVar.I(10);
            int iA = yafVar.A();
            if (iA > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iA);
                String string = sb.toString();
                int iA2 = yafVar.A();
                if (iA2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iA2);
                    string = sb2.toString();
                }
                return new ipe(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(oy.d(i2));
        if (strValueOf2.length() != 0) {
            "Failed to parse index/count attribute: ".concat(strValueOf2);
        }
        return null;
    }

    public static ipe M(int i2, yaf yafVar, String str) {
        int iH = yafVar.h();
        if (yafVar.h() == 1684108385) {
            yafVar.I(8);
            return new ipe(str, null, yafVar.r(iH - 16));
        }
        String strValueOf = String.valueOf(oy.d(i2));
        if (strValueOf.length() != 0) {
            "Failed to parse text attribute: ".concat(strValueOf);
        }
        return null;
    }

    public static ct6 N(int i2, String str, yaf yafVar, boolean z, boolean z2) {
        int iMin;
        yafVar.I(4);
        if (yafVar.h() == 1684108385) {
            yafVar.I(8);
            iMin = yafVar.v();
        } else {
            iMin = -1;
        }
        if (z2) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z ? new ipe(str, null, Integer.toString(iMin)) : new g73("und", str, Integer.toString(iMin));
        }
        String strValueOf = String.valueOf(oy.d(i2));
        if (strValueOf.length() != 0) {
            "Failed to parse uint8 attribute: ".concat(strValueOf);
        }
        return null;
    }

    public static void O(List list) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        list.clear();
        list.addAll(linkedHashSet);
    }

    public static final yye P(String str) {
        Set setQ = q();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((wbd) setQ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (tpa.f(((yye) next).namespace(), str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder sbM = au1.m("More then one manifest found for ", str, ": ");
            sbM.append(x53.n0(arrayList, null, null, null, n71.x0, 31));
            throw new IllegalStateException(sbM.toString().toString());
        }
        if (arrayList.size() == 1) {
            return (yye) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            yye yyeVar = (yye) Class.forName(str2).newInstance();
            if (tpa.f(yyeVar.namespace(), str)) {
                return yyeVar;
            }
            throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }

    public static void Q(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            R(runnable, 0L);
        }
    }

    public static zl4 R(Runnable runnable, long j2) {
        return ce.a().c(runnable, j2, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void S(CharSequence charSequence, Widget widget) {
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarA = od2.a(new gqe(qba.a, ys.m0(new Object[]{charSequence})), null, 6);
        lg3VarA.f(new eqe(qba.f));
        lg3VarA.b(oba.c, new eqe(qba.e));
        lg3VarA.d(oba.b, new eqe(qba.d));
        lg3VarA.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
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

    public static ArrayList T(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() <= 0 || arrayList.size() > 1000) {
            while (arrayList.size() != 0) {
                List listSubList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
                ArrayList arrayList3 = new ArrayList(listSubList.size());
                arrayList3.addAll(listSubList);
                listSubList.clear();
                arrayList2.add(arrayList3);
            }
        } else {
            arrayList2.add(arrayList);
        }
        return arrayList2;
    }

    public static void U(qy9 qy9Var, qj3 qj3Var, qj3 qj3Var2, f6 f6Var) throws InterruptedException {
        sd7 sd7Var = new sd7(qj3Var, qj3Var2, f6Var);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ra3 ra3Var = new ra3(1, linkedBlockingQueue);
        sd7Var.c(ra3Var);
        qy9Var.a(ra3Var);
        while (!ra3Var.h()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e2) {
                    ra3Var.g();
                    sd7Var.onError(e2);
                    return;
                }
            }
            if (ra3Var.h() || objPoll == ra3.c || hv9.b(sd7Var, objPoll)) {
                return;
            }
        }
    }

    public static int V(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void a(int i2, String str) {
        if (i2 < 0) {
            throw new RuntimeException(zr6.i("Unable to locate '", str, "' in program"));
        }
    }

    public static final void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        e(16);
        throw new RuntimeException(rh4.j(str, ": glError 0x", pag.N(16, iGlGetError & 4294967295L)));
    }

    public static boolean c(Iterable iterable, b7b b7bVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            try {
                if (b7bVar.test(it.next())) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public static final int d(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        b("glShaderSource");
        GLES20.glCompileShader(iGlCreateShader);
        b("glCompileShader");
        int[] iArr = {1};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        hm9.p("j", "Could not compile shader " + i2 + ": " + GLES20.glGetShaderInfoLog(iGlCreateShader), null);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static void e(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbN = rh4.n(i2, "radix ", " was not in valid range ");
            sbN.append(new j37(2, 36, 1));
            throw new IllegalArgumentException(sbN.toString());
        }
    }

    public static sd7 h(View view, f6 f6Var) {
        r0a r0aVarN = new hb3(7, view).t(300L, TimeUnit.MILLISECONDS).n(ce.a());
        sd7 sd7Var = new sd7(new aqc(f6Var), new p4c(14), ft.d);
        r0aVarN.a(sd7Var);
        return sd7Var;
    }

    public static ArrayList i(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static long[] j(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = ((Long) list.get(i2)).longValue();
        }
        return jArr;
    }

    public static a20 k(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new a20(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[PHI: r18
      0x008e: PHI (r18v3 boolean) = (r18v1 boolean), (r18v1 boolean), (r18v4 boolean) binds: [B:45:0x009e, B:50:0x00ae, B:41:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6 A[LOOP:0: B:79:0x01a0->B:81:0x01a6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yie l(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.l(android.content.Context):yie");
    }

    public static final boolean o(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static List p(Iterable iterable, b7b b7bVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            try {
                if (b7bVar.test(obj)) {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static final Set q() {
        wbd wbdVar = j;
        if (wbdVar != null) {
            return wbdVar;
        }
        wbd wbdVar2 = new wbd();
        try {
            Iterator it = Arrays.asList(new TracerLibraryManifest(), new ru.ok.android.externcalls.sdk.audio.TracerLibraryManifest(), new tye()).iterator();
            while (it.hasNext()) {
                wbdVar2.add(it.next());
            }
            j = wbdVar2;
            return z7.a(wbdVar2);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Object r(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final nx3 s(Executor executor) {
        nx3 nx3Var;
        pl4 pl4Var = executor instanceof pl4 ? (pl4) executor : null;
        return (pl4Var == null || (nx3Var = pl4Var.a) == null) ? new z45(executor) : nx3Var;
    }

    public static Application t() {
        Application application = ApplicationProvider.a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static LZ4Factory u() {
        if (a == null) {
            synchronized (nd7.class) {
                try {
                    if (a == null) {
                        a = LZ4Factory.fastestInstance();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static final int w(x43 x43Var, int i2) {
        int iC = x43Var.c();
        x43Var.u(i2);
        int i3 = 1;
        while (x43Var.s() == i2) {
            x43Var.u(i2);
            i3++;
        }
        x43Var.t(iC);
        return i3;
    }

    public static final WindowManager z(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public void H(View view, int i2) {
    }

    public void I(int i2) {
    }

    public abstract void J(View view, int i2, int i3);

    public abstract void K(View view, float f2, float f3);

    public abstract boolean W(View view, int i2);

    public int f(View view, int i2) {
        return 0;
    }

    public int g(View view, int i2) {
        return 0;
    }

    public f99 m(k99 k99Var) {
        ByteBuffer byteBuffer = k99Var.X;
        byteBuffer.getClass();
        fm9.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return n(k99Var, byteBuffer);
    }

    public abstract f99 n(k99 k99Var, ByteBuffer byteBuffer);

    public int v(int i2) {
        return i2;
    }

    public int x(View view) {
        return 0;
    }

    public int y(View view) {
        return 0;
    }
}

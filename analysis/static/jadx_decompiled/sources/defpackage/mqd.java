package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.android.concurrent.SingleCoreActivity;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public abstract class mqd {
    public static boolean a = false;
    public static final qq9 b = new qq9();
    public static final String[] c = {"_id", "lookup"};
    public static final String[] d = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};
    public static int e = 3;

    public static PorterDuff.Mode A(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final w4d D() {
        w4d w4dVar = new w4d(10, false);
        w4dVar.b = new AtomicReference(null);
        return w4dVar;
    }

    public static u3f E(u3f u3fVar, String[] strArr, Map map) {
        int i = 0;
        if (u3fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (u3f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                u3f u3fVar2 = new u3f();
                int length = strArr.length;
                while (i < length) {
                    u3fVar2.a((u3f) map.get(strArr[i]));
                    i++;
                }
                return u3fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                u3fVar.a((u3f) map.get(strArr[0]));
                return u3fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    u3fVar.a((u3f) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return u3fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List F(java.util.List r3, int r4, int r5) {
        /*
        L0:
            nz4 r0 = defpackage.nz4.a
            if (r4 < 0) goto L33
            int r1 = defpackage.y53.L(r3)
            if (r4 <= r1) goto Lb
            goto L33
        Lb:
            if (r5 != 0) goto L18
            java.lang.Object r3 = defpackage.x53.j0(r4, r3)
            if (r3 == 0) goto L17
            java.util.List r0 = java.util.Collections.singletonList(r3)
        L17:
            return r0
        L18:
            if (r5 <= 0) goto L2b
            int r5 = r5 + r4
            int r1 = r3.size()
            if (r5 <= r1) goto L25
            int r5 = r3.size()
        L25:
            java.util.List r3 = r3.subList(r4, r5)     // Catch: java.lang.Throwable -> L2a
            return r3
        L2a:
            return r0
        L2b:
            int r5 = r5 + r4
            if (r5 >= 0) goto L2f
            r5 = 0
        L2f:
            r2 = r5
            r5 = r4
            r4 = r2
            goto L0
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.F(java.util.List, int, int):java.util.List");
    }

    public static void G(Status status, Object obj, qne qneVar) {
        if (status.a <= 0) {
            qneVar.b(obj);
        } else {
            qneVar.a(i24.k(status));
        }
    }

    public static void H(List list, a7b a7bVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (a7bVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final tad I(kl1 kl1Var) {
        bg1 bg1Var = kl1Var.f;
        Long l = kl1Var.g;
        return new tad(kl1Var.e, bg1Var, kl1Var.a, l, kl1Var.b, kl1Var.d, kl1Var.c);
    }

    public static final void J(y5f y5fVar) {
        y5fVar.e(t50.class, new cl(9));
    }

    public static final void K(y5f y5fVar) {
        y5fVar.e(u8e.class, new td3(20));
        y5fVar.e(ay6.class, new td3(21));
        y5fVar.e(up.class, new td3(22));
        y5fVar.e(pk4.class, new zq3(19));
        y5fVar.e(me6.class, new cl(27));
        y5fVar.e(oe6.class, new cl(28));
        y5fVar.e(cud.class, new cl(29));
    }

    public static void L(File file, ej5 ej5Var) {
        ej5Var.j(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    L(file2, ej5Var);
                } else {
                    ej5Var.f(file2);
                }
            }
        }
        ej5Var.m(file);
    }

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            new ArrayList().add("");
        } catch (Throwable th) {
            hm9.p("ServerPrefs", "validate host failure", th);
            str = null;
        }
        if (mr0.Y(buc.z(0, str, 0, 7, false)) != null) {
            return str;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean f(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                f(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(defpackage.anc r17, defpackage.jic r18, defpackage.g05 r19, int r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.g(anc, jic, g05, int):int");
    }

    public static float h(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static String i(SSLSocket sSLSocket, String str) {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            StringBuilder sb = new StringBuilder("host=" + str + ", certificates(" + peerCertificates.length + ")=\n");
            int length = peerCertificates.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                sb.append("#" + i2 + " " + peerCertificates[i] + "\n");
                i++;
                i2++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "failed to retrieve certificates, host=".concat(str);
        }
    }

    public static ViewGroup j(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static y7f k(View view) {
        ViewGroup viewGroupJ = j(view);
        if (viewGroupJ == null) {
            return null;
        }
        return new y7f(viewGroupJ);
    }

    public static Object l(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object m(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object n(ArrayList arrayList) {
        Object next = null;
        if (arrayList instanceof Collection) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList instanceof List) {
                return wg0.f(arrayList, 1);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
        }
        return next;
    }

    public static Object o(ffc ffcVar) {
        ls5 ls5VarListIterator = ffcVar.listIterator(0);
        Object next = ls5VarListIterator.next();
        if (!ls5VarListIterator.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && ls5VarListIterator.hasNext(); i++) {
            sb.append(", ");
            sb.append(ls5VarListIterator.next());
        }
        if (ls5VarListIterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Collection p(android.content.Context r24, defpackage.o45 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.p(android.content.Context, o45):java.util.Collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(android.content.ContentResolver r5, android.net.Uri r6, defpackage.o45 r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "mqd"
            r1 = 0
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r6, r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r5 != 0) goto L1c
            java.lang.String r6 = "getVCardStringFromUri: failed to get file descriptor"
            defpackage.hm9.p(r0, r6, r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            if (r5 == 0) goto L15
            r5.close()     // Catch: java.lang.Exception -> L15
        L15:
            return r1
        L16:
            r2 = r1
            goto L3a
        L18:
            r6 = move-exception
            goto L59
        L1a:
            r6 = move-exception
            goto L16
        L1c:
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            java.lang.String r7 = defpackage.s5c.J(r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2f
            defpackage.s5c.n(r6)
            r5.close()     // Catch: java.lang.Exception -> L2a
        L2a:
            return r7
        L2b:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto L59
        L2f:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L3a
        L34:
            r6 = move-exception
            r5 = r1
            goto L59
        L37:
            r6 = move-exception
            r5 = r1
            r2 = r5
        L3a:
            java.lang.String r3 = "getVCardStringFromUri: failed to get vCardString from Uri"
            defpackage.hm9.p(r0, r3, r6)     // Catch: java.lang.Throwable -> L57
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "getVCardStringFromUri failed"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L57
            cba r7 = (defpackage.cba) r7     // Catch: java.lang.Throwable -> L57
            r0 = 1
            r7.c(r6, r0)     // Catch: java.lang.Throwable -> L57
            defpackage.s5c.n(r2)
            if (r5 == 0) goto L54
            r5.close()     // Catch: java.lang.Exception -> L54
        L54:
            return r1
        L55:
            r1 = r2
            goto L59
        L57:
            r6 = move-exception
            goto L55
        L59:
            defpackage.s5c.n(r1)
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Exception -> L61
        L61:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.q(android.content.ContentResolver, android.net.Uri, o45):java.lang.String");
    }

    public static SparseArray r(Context context, List list, o45 o45Var) {
        SparseArray sparseArray = new SparseArray(list.size());
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            hm9.o("mqd", "getVCardsByPhoneContactIds failed: contentResolver is null");
            return sparseArray;
        }
        Cursor cursorQuery = null;
        try {
            try {
                String strJoin = TextUtils.join(",", list);
                cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, c, "_id IN (" + strJoin + ")", null, null);
            } catch (Exception e2) {
                hm9.p("mqd", "getVCardsByPhoneContactIds failed", e2);
                ((cba) o45Var).c(new HandledException("getVCardsByPhoneContactIds failed"), true);
                if (0 != 0 && !cursorQuery.isClosed()) {
                }
            }
            if (cursorQuery == null) {
                hm9.o("mqd", "getVCardsByPhoneContactIds failed: cursor is null");
                return sparseArray;
            }
            int columnIndex = cursorQuery.getColumnIndex("_id");
            int columnIndex2 = cursorQuery.getColumnIndex("lookup");
            while (cursorQuery.moveToNext()) {
                int i = cursorQuery.getInt(columnIndex);
                String string = cursorQuery.getString(columnIndex2);
                if (oag.t(string)) {
                    hm9.o("mqd", "getVCardsByPhoneContactIds failed: lookupKey is empty or null");
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return sparseArray;
                }
                String strQ = q(contentResolver, Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, string), o45Var);
                if (!oag.t(strQ)) {
                    sparseArray.put(i, strQ);
                }
            }
            if (!cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return sparseArray;
        } finally {
            if (0 != 0 && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        }
    }

    public static boolean s(Context context) {
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName())) != 1) {
                z = false;
            }
            a = z;
            String name = mqd.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, "isEnabled=" + a, null);
            }
            return a;
        } catch (Throwable th) {
            hm9.p(mqd.class.getName(), "fail to get component", th);
            return false;
        }
    }

    public static boolean t(View view) {
        WeakHashMap weakHashMap = zmf.a;
        return view.getLayoutDirection() == 1;
    }

    public static boolean u(int i, String str) {
        return e <= i || Log.isLoggable(str, i);
    }

    public static cx8 v(gy8 gy8Var) {
        String strP;
        String strP2;
        int iN = lz7.N(gy8Var);
        bx8 bx8Var = null;
        int iIntValue = 0;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
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
                strP = null;
            }
            if (tpa.f(strP, "reaction")) {
                gx8 gx8Var = gx8.c;
                try {
                    strP2 = lz7.P(gy8Var);
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
                }
                if (strP2 == null) {
                    strP2 = "";
                }
                bx8Var = new bx8(gx8Var, strP2);
            } else if (tpa.f(strP, NewHtcHomeBadger.COUNT)) {
                Integer numValueOf = 0;
                try {
                    numValueOf = Integer.valueOf(lz7.L(gy8Var));
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
                }
                iIntValue = numValueOf.intValue();
            } else {
                try {
                    gy8Var.z();
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
        if (bx8Var != null) {
            return new cx8(bx8Var, iIntValue);
        }
        throw new IllegalArgumentException("reaction is null");
    }

    public static JSONObject w(db7 db7Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            db7Var.s();
            while (db7Var.peek() != 125) {
                jSONObject.put(db7Var.T(), x(db7Var, JSONObject.NULL));
            }
            db7Var.q();
            return jSONObject;
        } catch (JSONException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Object x(db7 db7Var, Object obj) throws NumberFormatException {
        try {
            int iPeek = db7Var.peek();
            if (iPeek == 34) {
                return db7Var.H();
            }
            if (iPeek == 49) {
                String strV = db7Var.V();
                if (strV.indexOf(46) >= 0 || strV.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || strV.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(strV));
                }
                long j = Long.parseLong(strV);
                return (j < -2147483648L || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
            }
            if (iPeek == 91) {
                JSONArray jSONArray = new JSONArray();
                db7Var.u();
                while (db7Var.peek() != 93) {
                    jSONArray.put(x(db7Var, null));
                }
                db7Var.t();
                return jSONArray;
            }
            if (iPeek == 98) {
                return Boolean.valueOf(db7Var.a0());
            }
            if (iPeek == 110) {
                db7Var.z();
                return obj;
            }
            if (iPeek == 123) {
                return w(db7Var);
            }
            throw JsonStateException.d(iPeek);
        } catch (JsonTypeMismatchException e2) {
            throw new AssertionError(e2);
        }
    }

    public static tpb y(byte[] bArr) {
        wpa wpaVar = new wpa(bArr);
        if (wpaVar.c < 32) {
            return null;
        }
        wpaVar.G(0);
        int iA = wpaVar.a();
        int iG = wpaVar.g();
        if (iG != iA) {
            z04.c0("Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = wpaVar.g();
        if (iG2 != 1886614376) {
            ey8.k(iG2, "Atom type is not pssh: ");
            return null;
        }
        int iT = oy.t(wpaVar.g());
        if (iT > 1) {
            ey8.k(iT, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(wpaVar.o(), wpaVar.o());
        if (iT == 1) {
            int iY = wpaVar.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i = 0; i < iY; i++) {
                uuidArr[i] = new UUID(wpaVar.o(), wpaVar.o());
            }
        }
        int iY2 = wpaVar.y();
        int iA2 = wpaVar.a();
        if (iY2 == iA2) {
            byte[] bArr2 = new byte[iY2];
            wpaVar.e(0, bArr2, iY2);
            return new tpb(uuid, iT, bArr2);
        }
        z04.c0("Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] z(UUID uuid, byte[] bArr) {
        tpb tpbVarY = y(bArr);
        if (tpbVarY == null) {
            return null;
        }
        UUID uuid2 = tpbVarY.a;
        if (uuid.equals(uuid2)) {
            return tpbVarY.c;
        }
        z04.c0("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public abstract void B(l3 l3Var, l3 l3Var2);

    public abstract void C(l3 l3Var, Thread thread);

    public abstract boolean c(m3 m3Var, i3 i3Var, i3 i3Var2);

    public abstract boolean d(m3 m3Var, Object obj, Object obj2);

    public abstract boolean e(m3 m3Var, l3 l3Var, l3 l3Var2);
}

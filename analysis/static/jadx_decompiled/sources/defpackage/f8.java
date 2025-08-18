package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f8 {
    public static final o97 b = new o97("CRASH_FREE", 1);
    public static final ob6 c = new ob6();
    public static boolean d;
    public final /* synthetic */ int a;

    public /* synthetic */ f8(int i) {
        this.a = i;
    }

    public static void A(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(rh4.j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        tpa.G(classCastException, f8.class.getName());
        throw classCastException;
    }

    public static Bitmap B(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    public static final ih1 C(y4c y4cVar, boolean z) {
        int iOrdinal = y4cVar.ordinal();
        switch (y4cVar.ordinal()) {
            case 0:
                return new ih1(iOrdinal, new eqe(b8a.t0));
            case 1:
                return new ih1(iOrdinal, new eqe(b8a.r0));
            case 2:
                return new ih1(iOrdinal, new eqe(b8a.C0));
            case 3:
                return new ih1(iOrdinal, new eqe(b8a.u0));
            case 4:
                return new ih1(iOrdinal, new eqe(b8a.s0));
            case 5:
                return new ih1(iOrdinal, new eqe(b8a.z0));
            case 6:
                return new ih1(iOrdinal, new eqe(b8a.A0));
            case 7:
                return new ih1(iOrdinal, new eqe(b8a.B0));
            case 8:
                return new ih1(iOrdinal, new eqe(b8a.y0));
            case 9:
                return new ih1(iOrdinal, new eqe(b8a.x0));
            case 10:
                return new ih1(iOrdinal, z ? new eqe(b8a.w0) : new eqe(b8a.v0));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void D(RippleDrawable rippleDrawable, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = rippleDrawable.getBounds().left;
        }
        if ((i4 & 2) != 0) {
            i2 = rippleDrawable.getBounds().top;
        }
        int i5 = rippleDrawable.getBounds().right;
        if ((i4 & 8) != 0) {
            i3 = rippleDrawable.getBounds().bottom;
        }
        rippleDrawable.setBounds(i, i2, i5, i3);
    }

    public static boolean E(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static boolean F(int i, yaf yafVar, boolean z) throws ParserException {
        if (yafVar.c() < 7) {
            if (z) {
                return false;
            }
            int iC = yafVar.c();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iC);
            throw ParserException.a(null, sb.toString());
        }
        if (yafVar.v() != i) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw ParserException.a(null, strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (yafVar.v() == 118 && yafVar.v() == 111 && yafVar.v() == 114 && yafVar.v() == 98 && yafVar.v() == 105 && yafVar.v() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static final int G(int i, float f) {
        return Color.argb(tu0.G(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void H(Parcel parcel, String str) {
        byte b2 = str != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeString(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2 A[FALL_THROUGH, PHI: r11
      0x01a2: PHI (r11v2 xu3) = (r11v1 xu3), (r11v1 xu3), (r11v1 xu3), (r11v1 xu3), (r11v3 xu3) binds: [B:87:0x013f, B:89:0x0145, B:91:0x0148, B:123:0x019f, B:124:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141  */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(android.content.Context r17, java.util.concurrent.Executor r18, defpackage.ihb r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8.I(android.content.Context, java.util.concurrent.Executor, ihb, boolean):void");
    }

    public static List a(List list) {
        if (!(list instanceof qb7) || (list instanceof sb7)) {
            return list;
        }
        A(list, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map b(Map map) {
        if (!(map instanceof qb7) || (map instanceof ub7)) {
            return map;
        }
        A(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i, Object obj) {
        if (obj == null || n(i, obj)) {
            return;
        }
        A(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static o5g e(hj3 hj3Var, int i, ArrayList arrayList, o5g o5gVar) {
        int i2;
        int i3 = i == 0 ? hj3Var.n0 : hj3Var.o0;
        if (i3 != -1 && (o5gVar == null || i3 != o5gVar.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o5g o5gVar2 = (o5g) arrayList.get(i4);
                if (o5gVar2.b == i3) {
                    if (o5gVar != null) {
                        o5gVar.c(i, o5gVar2);
                        arrayList.remove(o5gVar);
                    }
                    o5gVar = o5gVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return o5gVar;
        }
        if (o5gVar == null) {
            if (hj3Var instanceof uj6) {
                uj6 uj6Var = (uj6) hj3Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= uj6Var.r0) {
                        i2 = -1;
                        break;
                    }
                    hj3 hj3Var2 = uj6Var.q0[i5];
                    if ((i == 0 && (i2 = hj3Var2.n0) != -1) || (i == 1 && (i2 = hj3Var2.o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        o5g o5gVar3 = (o5g) arrayList.get(i6);
                        if (o5gVar3.b == i2) {
                            o5gVar = o5gVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (o5gVar == null) {
                o5gVar = new o5g();
                o5gVar.a = new ArrayList();
                o5gVar.d = null;
                o5gVar.e = -1;
                int i7 = o5g.f;
                o5g.f = i7 + 1;
                o5gVar.b = i7;
                o5gVar.c = i;
            }
            arrayList.add(o5gVar);
        }
        ArrayList arrayList2 = o5gVar.a;
        if (!arrayList2.contains(hj3Var)) {
            arrayList2.add(hj3Var);
            if (hj3Var instanceof fh6) {
                fh6 fh6Var = (fh6) hj3Var;
                fh6Var.t0.c(fh6Var.u0 == 0 ? 1 : 0, o5gVar, arrayList);
            }
            int i8 = o5gVar.b;
            if (i == 0) {
                hj3Var.n0 = i8;
                hj3Var.I.c(i, o5gVar, arrayList);
                hj3Var.K.c(i, o5gVar, arrayList);
            } else {
                hj3Var.o0 = i8;
                hj3Var.J.c(i, o5gVar, arrayList);
                hj3Var.M.c(i, o5gVar, arrayList);
                hj3Var.L.c(i, o5gVar, arrayList);
            }
            hj3Var.P.c(i, o5gVar, arrayList);
        }
        return o5gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[PHI: r8
      0x002e: PHI (r8v3 android.database.Cursor) = (r8v2 android.database.Cursor), (r8v4 android.database.Cursor) binds: [B:21:0x003c, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L32 java.lang.IllegalArgumentException -> L34
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32 java.lang.IllegalArgumentException -> L34
            if (r8 == 0) goto L2c
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2a
            if (r9 == 0) goto L2c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2a
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalArgumentException -> L2a
            r8.close()
            return r9
        L27:
            r9 = move-exception
            r7 = r8
            goto L40
        L2a:
            r9 = move-exception
            goto L36
        L2c:
            if (r8 == 0) goto L3f
        L2e:
            r8.close()
            goto L3f
        L32:
            r9 = move-exception
            goto L40
        L34:
            r9 = move-exception
            r8 = r7
        L36:
            java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L27
            r9.getMessage()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L3f
            goto L2e
        L3f:
            return r7
        L40:
            if (r7 == 0) goto L45
            r7.close()
        L45:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8.f(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static oq1 g(mq1 mq1Var) {
        lq1 lq1Var = new lq1();
        lq1Var.c = new nic();
        oq1 oq1Var = new oq1(lq1Var);
        lq1Var.b = oq1Var;
        lq1Var.a = mq1Var.getClass();
        try {
            String strQ = mq1Var.q(lq1Var);
            if (strQ != null) {
                lq1Var.a = strQ;
            }
        } catch (Exception e) {
            oq1Var.b.j(e);
        }
        return oq1Var;
    }

    public static final nx3 h(ilc ilcVar) {
        Map map = ilcVar.k;
        Object objS = map.get("QueryDispatcher");
        if (objS == null) {
            Executor executor = ilcVar.b;
            if (executor == null) {
                executor = null;
            }
            objS = nd7.s(executor);
            map.put("QueryDispatcher", objS);
        }
        return (nx3) objS;
    }

    public static final nx3 k(ilc ilcVar) {
        Map map = ilcVar.k;
        Object objS = map.get("TransactionDispatcher");
        if (objS == null) {
            qm qmVar = ilcVar.c;
            if (qmVar == null) {
                qmVar = null;
            }
            objS = nd7.s(qmVar);
            map.put("TransactionDispatcher", objS);
        }
        return (nx3) objS;
    }

    public static int l(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean m(int i) {
        return (i & 32768) != 0;
    }

    public static boolean n(int i, Object obj) {
        if (obj instanceof f66) {
            return (obj instanceof n66 ? ((n66) obj).getArity() : obj instanceof k56 ? 0 : obj instanceof m56 ? 1 : obj instanceof a66 ? 2 : obj instanceof c66 ? 3 : obj instanceof e66 ? 4 : obj instanceof g66 ? 5 : obj instanceof h66 ? 6 : -1) == i;
        }
        return false;
    }

    public static iy8 o(ky8 ky8Var) {
        nw8 nw8Var;
        hy8 hy8Var = new hy8();
        bu1 bu1Var = ky8Var.a;
        ref refVarA = null;
        if (bu1Var == null) {
            nw8Var = null;
        } else {
            nw8Var = new nw8(bu1Var.a, (String) bu1Var.c, bu1Var.b);
        }
        hy8Var.a = nw8Var;
        hy8Var.c = ky8Var.c;
        hy8Var.b = ky8Var.b;
        hy8Var.d = ky8Var.d;
        i20 i20Var = ky8Var.e;
        if (i20Var != null) {
            i20 i20Var2 = new i20(1);
            i20Var2.a = i20Var.a;
            i20Var2.c = i20Var.c;
            i20Var2.b = i20Var.b;
            i20Var2.d = i20Var.d;
            refVarA = i20Var2.a();
        }
        hy8Var.e = refVarA;
        return new iy8(hy8Var);
    }

    public static MappedByteBuffer p(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static qzd q(gy8 gy8Var) {
        int iN;
        String strP;
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
        d5g d5gVarR = null;
        bz bzVarB = null;
        for (int i = 0; i < iN; i++) {
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
                    if (strP.equals("media")) {
                        try {
                            bzVarB = bz.b(gy8Var);
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
                            bzVarB = null;
                        }
                    } else if (strP.equals("text")) {
                        try {
                            d5gVarR = r(gy8Var);
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
                            d5gVarR = null;
                        }
                    } else {
                        try {
                            gy8Var.z();
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
                        }
                    }
                } catch (Throwable th6) {
                    try {
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
                }
            }
        }
        if (d5gVarR == null) {
            return null;
        }
        return new qzd(bzVarB, d5gVarR);
    }

    public static d5g r(gy8 gy8Var) {
        int iN;
        String strP;
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
        if (iN == 0) {
            return null;
        }
        List listB = null;
        String strP2 = null;
        for (int i = 0; i < iN; i++) {
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
                if (strP.equals("text")) {
                    try {
                        strP2 = lz7.P(gy8Var);
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
                        strP2 = null;
                    }
                } else if (strP.equals("elements")) {
                    om8 om8Var = new om8(1, lu8.Z, ku8.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/messages/MessageElement;", 0, 18);
                    CopyOnWriteArraySet copyOnWriteArraySet = u7d.a;
                    listB = u7d.b(gy8Var, nz4.a, om8Var);
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
        }
        if (strP2 == null || strP2.length() == 0) {
            return null;
        }
        if (strP2 != null) {
            return new d5g(strP2, listB);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void s(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final String t(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static e99 v(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = maf.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                if (str.length() != 0) {
                    "Failed to parse Vorbis comment: ".concat(str);
                }
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(rza.a(new yaf(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    fm9.c("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new yqf(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e99(arrayList);
    }

    public static boolean w(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static String x(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return parcel.readString();
        }
        return null;
    }

    public static hgf y(yaf yafVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            F(3, yafVar, false);
        }
        yafVar.t((int) yafVar.m(), b52.c);
        long jM = yafVar.m();
        String[] strArr = new String[(int) jM];
        for (int i = 0; i < jM; i++) {
            strArr[i] = yafVar.t((int) yafVar.m(), b52.c);
        }
        if (z2 && (yafVar.v() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new hgf(strArr);
    }

    public static final int z(c3d c3dVar, int i) {
        int i2;
        int i3 = i + 1;
        int length = c3dVar.X.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = c3dVar.Y[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public final Intent d(Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            default:
                n37 n37Var = (n37) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = n37Var.b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        n37Var = new n37(n37Var.a, null, n37Var.c, n37Var.o);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", n37Var);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    public o9g i(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new o9g(1, oz4.a);
                }
                for (String str : strArr) {
                    if (z7.c(context, str) != 0) {
                        return null;
                    }
                }
                int iZ = mz7.Z(strArr.length);
                if (iZ < 16) {
                    iZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new o9g(1, linkedHashMap);
            default:
                return j(context, obj);
        }
    }

    public final o9g j(Context context, Object obj) {
        return null;
    }

    public final Object u(Intent intent, int i) {
        switch (this.a) {
            case 0:
                oz4 oz4Var = oz4.a;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        break;
                    }
                }
                break;
        }
        return new d8(intent, i);
    }
}

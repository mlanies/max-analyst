package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Size;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.loader.MessageModel;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public abstract class tfg {
    public static hgf a;
    public static final o97 b = new o97("PERFORMANCE_METRICS", 1);
    public static final /* synthetic */ int c = 0;
    public static Integer d;
    public static Integer e;
    public static ScheduledExecutorService f;
    public static gta g;

    public static void A(String str, boolean z, q33 q33Var) {
        if (z) {
            ((t33) q33Var).m("app.chat.background.dark.id", str);
        } else {
            ((t33) q33Var).m("app.chat.background.light.id", str);
        }
    }

    public static final List B(MessageModel messageModel) {
        ArrayList arrayList;
        sb8 qb8Var;
        o00 o00Var = messageModel.u0.d;
        boolean z = o00Var instanceof x38;
        nz4 nz4Var = nz4.a;
        if (!z && !(o00Var instanceof zf5)) {
            return nz4Var;
        }
        if (o00Var instanceof f53) {
            List<a53> list = ((f53) o00Var).b;
            arrayList = new ArrayList(z53.S(list, 10));
            for (a53 a53Var : list) {
                if (a53Var instanceof yt6) {
                    yt6 yt6Var = (yt6) a53Var;
                    qb8Var = new jb8(messageModel.a, yt6Var.a, o00Var, yt6Var, null, 48);
                } else {
                    if (!(a53Var instanceof wcf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wcf wcfVar = (wcf) a53Var;
                    qb8Var = new qb8(messageModel.a, wcfVar.a, o00Var, wcfVar);
                }
                arrayList.add(qb8Var);
            }
        } else {
            if (o00Var instanceof vqd) {
                yt6 yt6Var2 = ((vqd) o00Var).c;
                return Collections.singletonList(new jb8(messageModel.a, yt6Var2.a, o00Var, yt6Var2, null, 48));
            }
            if (o00Var instanceof bsd) {
                wcf wcfVar2 = ((bsd) o00Var).c;
                return Collections.singletonList(new qb8(messageModel.a, wcfVar2.a, o00Var, wcfVar2));
            }
            if (!(o00Var instanceof zf5)) {
                return nz4Var;
            }
            arrayList = new ArrayList();
            zf5 zf5Var = (zf5) o00Var;
            yt6 yt6Var3 = zf5Var.k;
            if (yt6Var3 != null) {
                arrayList.add(new jb8(messageModel.a, yt6Var3.a, o00Var, yt6Var3, zf5Var.c, 16));
            } else {
                wcf wcfVar3 = zf5Var.l;
                if (wcfVar3 != null) {
                    arrayList.add(new qb8(messageModel.a, wcfVar3.a, o00Var, wcfVar3, zf5Var.c));
                }
            }
        }
        return arrayList;
    }

    public static final void C(y5f y5fVar) {
        y5fVar.e(an9.class, new k1e(1));
        y5fVar.e(w1e.class, new k1e(2));
        y5fVar.e(tg1.class, new k1e(3));
        y5fVar.e(ax7.class, new k1e(4));
        y5fVar.e(ita.class, new k1e(5));
        y5fVar.e(aua.class, new k1e(6));
        y5fVar.e(kh0.class, new k1e(7));
        y5fVar.e(bt1.class, new k1e(8));
        y5fVar.e(vsf.class, new k1e(9));
        y5fVar.e(iwf.class, new txc(29));
        y5fVar.e(it8.class, new k1e(0));
    }

    public static final void D(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(22));
        y5fVar.e(aa7.class, new ybf(2));
        y5fVar.e(y83.class, new ybf(3));
        y5fVar.e(gc6.class, new mxc(7));
        y5fVar.e(uc6.class, new mxc(8));
        y5fVar.e(ysf.class, new mxc(9));
        y5fVar.c(pi4.class, new lxc(23));
        y5fVar.c(ia7.class, new lxc(24));
        y5fVar.c(ia7.class, new lxc(25));
        y5fVar.c(ia7.class, new lxc(26));
        y5fVar.c(ia7.class, new lxc(27));
        y5fVar.c(ia7.class, new lxc(28));
        y5fVar.c(pi4.class, new lxc(29));
        y5fVar.c(ia7.class, new xsf(0));
        y5fVar.c(pi4.class, new lxc(21));
    }

    public static final b10 a(int i) {
        switch (e8f.$EnumSwitchMapping$0[au1.s(i)]) {
        }
        return b10.UNKNOWN;
    }

    public static void b(Context context, l20 l20Var, e2b e2bVar, boolean z, boolean z2) {
        jic jicVarV;
        Object obj;
        Object obj2;
        Object obj3 = e2bVar.e;
        if (obj3 == null || ((wv6) obj3).i == null) {
            jic jicVarV2 = v(context, l20Var, z);
            if (jicVarV2 != null && (obj2 = e2bVar.e) != null) {
                xv6 xv6VarB = xv6.b((wv6) obj2);
                xv6VarB.d = jicVarV2;
                e2bVar.e = xv6VarB.a();
            }
            if (z || !z2 || (jicVarV = v(context, l20Var, true)) == null || (obj = e2bVar.e) == null) {
                return;
            }
            xv6 xv6VarB2 = xv6.b((wv6) obj);
            xv6VarB2.d = jicVarV;
            e2bVar.f = xv6VarB2.a();
        }
    }

    public static final String c(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (j2 - (60000 * j3)) / 1000;
        if (hours > 0) {
            return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        }
        return String.format(j3 + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
    }

    public static final String d(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = 1000;
        long j5 = (j2 - (60000 * j3)) / j4;
        long j6 = (j % j4) / 10;
        if (hours <= 0) {
            return String.format("%02d:%02d,%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
    }

    public static String e(String str) {
        if (oag.t(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 0 && cCharAt <= 31) || cCharAt == '\"' || cCharAt == '*' || cCharAt == '/' || cCharAt == ':' || cCharAt == '<' || cCharAt == '\\' || cCharAt == '|' || cCharAt == 127 || cCharAt == '>' || cCharAt == '?') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 255) {
            while (bytes.length > 252) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            }
            sb.insert(sb.length() / 2, "...");
        }
        return sb.toString();
    }

    public static final String f(Long l, Long l2) {
        int iCompareTo = l2.compareTo(l);
        return iCompareTo > 0 ? "<" : iCompareTo < 0 ? ">" : "=";
    }

    public static final int i(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static String[] j(fw4 fw4Var) {
        long jW;
        long jW2;
        long jW3;
        long jW4;
        long j;
        long jW5;
        int i;
        long j2;
        long j3;
        long jW6;
        long j4;
        char c2;
        long jW7;
        long j5;
        long jW8;
        int i2;
        long jW9;
        long jW10;
        long jW11;
        int i3 = 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jW12 = w(fw4Var, byteBufferAllocate, 0L);
        if (jW12 != 1179403647) {
            throw new ja9("file is not ELF: magic is 0x" + Long.toHexString(jW12) + ", it should be " + Long.toHexString(1179403647L));
        }
        z(fw4Var, byteBufferAllocate, 1, 4L);
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 1;
        z(fw4Var, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            jW = w(fw4Var, byteBufferAllocate, 28L);
        } else {
            z(fw4Var, byteBufferAllocate, 8, 32L);
            jW = byteBufferAllocate.getLong();
        }
        if (z) {
            z(fw4Var, byteBufferAllocate, 2, 44L);
            jW2 = byteBufferAllocate.getShort() & 65535;
        } else {
            z(fw4Var, byteBufferAllocate, 2, 56L);
            jW2 = byteBufferAllocate.getShort() & 65535;
        }
        z(fw4Var, byteBufferAllocate, 2, z ? 42L : 54L);
        int i4 = byteBufferAllocate.getShort() & 65535;
        if (jW2 == 65535) {
            if (z) {
                jW11 = w(fw4Var, byteBufferAllocate, 32L);
            } else {
                z(fw4Var, byteBufferAllocate, 8, 40L);
                jW11 = byteBufferAllocate.getLong();
            }
            jW2 = z ? w(fw4Var, byteBufferAllocate, jW11 + 28) : w(fw4Var, byteBufferAllocate, jW11 + 44);
        }
        long j6 = jW;
        long j7 = 0;
        while (true) {
            if (j7 >= jW2) {
                jW3 = 0;
                break;
            }
            if ((z ? w(fw4Var, byteBufferAllocate, j6) : w(fw4Var, byteBufferAllocate, j6)) != 2) {
                j6 += i4;
                j7++;
            } else if (z) {
                jW3 = w(fw4Var, byteBufferAllocate, j6 + 4);
            } else {
                z(fw4Var, byteBufferAllocate, 8, j6 + 8);
                jW3 = byteBufferAllocate.getLong();
            }
        }
        if (jW3 == 0) {
            throw new ja9("ELF file does not contain dynamic linking information");
        }
        long j8 = jW3;
        int i5 = 0;
        long j9 = 0;
        while (true) {
            if (z) {
                jW4 = w(fw4Var, byteBufferAllocate, j8);
            } else {
                z(fw4Var, byteBufferAllocate, i3, j8);
                jW4 = byteBufferAllocate.getLong();
            }
            char c3 = 65535;
            if (jW4 != 1) {
                j = jW3;
                if (jW4 == 5) {
                    if (z) {
                        jW5 = w(fw4Var, byteBufferAllocate, j8 + 4);
                    } else {
                        z(fw4Var, byteBufferAllocate, 8, j8 + 8);
                        jW5 = byteBufferAllocate.getLong();
                    }
                    j9 = jW5;
                }
            } else {
                if (i5 == Integer.MAX_VALUE) {
                    throw new ja9("malformed DT_NEEDED section");
                }
                i5++;
                j = jW3;
            }
            j8 += z ? 8L : 16L;
            if (jW4 != 0) {
                jW2 = jW2;
                jW3 = j;
                i3 = 8;
            } else {
                if (j9 == 0) {
                    throw new ja9("Dynamic section string-table not found");
                }
                long j10 = jW;
                int i6 = 0;
                while (true) {
                    if (i6 >= jW2) {
                        i = i5;
                        j2 = 0;
                        j3 = 0;
                        break;
                    }
                    if ((z ? w(fw4Var, byteBufferAllocate, j10) : w(fw4Var, byteBufferAllocate, j10)) == 1) {
                        if (z) {
                            j5 = jW2;
                            jW8 = w(fw4Var, byteBufferAllocate, j10 + 8);
                        } else {
                            j5 = jW2;
                            z(fw4Var, byteBufferAllocate, 8, j10 + 16);
                            jW8 = byteBufferAllocate.getLong();
                        }
                        if (z) {
                            jW9 = w(fw4Var, byteBufferAllocate, j10 + 20);
                            i2 = i4;
                            i = i5;
                        } else {
                            i2 = i4;
                            i = i5;
                            z(fw4Var, byteBufferAllocate, 8, j10 + 40);
                            jW9 = byteBufferAllocate.getLong();
                        }
                        if (jW8 > j9 || j9 >= jW9 + jW8) {
                            i4 = i2;
                        } else {
                            if (z) {
                                jW10 = w(fw4Var, byteBufferAllocate, j10 + 4);
                            } else {
                                z(fw4Var, byteBufferAllocate, 8, j10 + 8);
                                jW10 = byteBufferAllocate.getLong();
                            }
                            j3 = jW10 + (j9 - jW8);
                            j2 = 0;
                        }
                    } else {
                        i = i5;
                        j5 = jW2;
                    }
                    j10 += i4;
                    i6++;
                    i5 = i;
                    jW2 = j5;
                }
                if (j3 == j2) {
                    throw new ja9("did not find file offset of DT_STRTAB table");
                }
                int i7 = i;
                String[] strArr = new String[i7];
                long j11 = j;
                int i8 = 0;
                while (true) {
                    if (z) {
                        jW6 = w(fw4Var, byteBufferAllocate, j11);
                    } else {
                        z(fw4Var, byteBufferAllocate, 8, j11);
                        jW6 = byteBufferAllocate.getLong();
                    }
                    if (jW6 == 1) {
                        if (z) {
                            jW7 = w(fw4Var, byteBufferAllocate, j11 + 4);
                        } else {
                            z(fw4Var, byteBufferAllocate, 8, j11 + 8);
                            jW7 = byteBufferAllocate.getLong();
                        }
                        long j12 = jW7 + j3;
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            long j13 = j12 + 1;
                            j4 = j3;
                            z(fw4Var, byteBufferAllocate, 1, j12);
                            short s = (short) (byteBufferAllocate.get() & 255);
                            if (s == 0) {
                                break;
                            }
                            sb.append((char) s);
                            j12 = j13;
                            j3 = j4;
                        }
                        strArr[i8] = sb.toString();
                        c2 = 65535;
                        if (i8 == Integer.MAX_VALUE) {
                            throw new ja9("malformed DT_NEEDED section");
                        }
                        i8++;
                    } else {
                        j4 = j3;
                        c2 = c3;
                    }
                    j11 += z ? 8L : 16L;
                    if (jW6 == 0) {
                        if (i8 == i7) {
                            return strArr;
                        }
                        throw new ja9("malformed DT_NEEDED section");
                    }
                    c3 = c2;
                    j3 = j4;
                }
            }
        }
    }

    public static String k(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() <= 2) {
            return null;
        }
        String str = pathSegments.get(0);
        if (oag.t(str) || !str.equalsIgnoreCase("external_files")) {
            return null;
        }
        Uri.Builder builderBuildUpon = Uri.fromFile(Environment.getExternalStorageDirectory()).buildUpon();
        for (int i = 1; i < pathSegments.size(); i++) {
            builderBuildUpon.appendPath(pathSegments.get(i));
        }
        String path = builderBuildUpon.build().getPath();
        if (pag.l(path)) {
            return path;
        }
        return null;
    }

    public static String l(q33 q33Var, boolean z) {
        return z ? ((t33) q33Var).g.getString("app.chat.background.dark.id", null) : ((t33) q33Var).g.getString("app.chat.background.light.id", null);
    }

    public static final int m(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int n(Cursor cursor, String str) {
        String strJ0;
        int iM = m(cursor, str);
        if (iM >= 0) {
            return iM;
        }
        try {
            strJ0 = ys.j0(cursor.getColumnNames(), null, 63);
        } catch (Exception unused) {
            strJ0 = "unknown";
        }
        throw new IllegalArgumentException(rh4.k("column '", str, "' does not exist. Available columns: ", strJ0));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[PHI: r10
      0x0065: PHI (r10v4 android.database.Cursor) = (r10v3 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:33:0x007a, B:26:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "file://"
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r2 = "getDataColumn: uri = %s, selection = %s, selection args = %s"
            java.lang.String r3 = "tfg"
            defpackage.hm9.m(r3, r2, r1)
            java.lang.String r1 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            r2 = 0
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r9 = 0
            r5 = r11
            r7 = r12
            r8 = r13
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r10 == 0) goto L63
            boolean r12 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r12 == 0) goto L63
            int r12 = r10.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r12 = r10.getString(r12)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            boolean r13 = defpackage.oag.t(r12)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r13 == 0) goto L3e
            r10.close()
            return r2
        L3e:
            java.lang.String r13 = "/"
            boolean r13 = r12.startsWith(r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r13 == 0) goto L4a
            r10.close()
            return r12
        L4a:
            boolean r13 = r12.startsWith(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            if (r13 == 0) goto L5f
            java.lang.String r13 = ""
            java.lang.String r11 = r12.replace(r0, r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r10.close()
            return r11
        L5a:
            r11 = move-exception
            r2 = r10
            goto L7e
        L5d:
            r12 = move-exception
            goto L6d
        L5f:
            r10.close()
            return r2
        L63:
            if (r10 == 0) goto L7d
        L65:
            r10.close()
            goto L7d
        L69:
            r11 = move-exception
            goto L7e
        L6b:
            r12 = move-exception
            r10 = r2
        L6d:
            java.lang.String r13 = "getDataColumn: error for uri = %s, e = %s"
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}     // Catch: java.lang.Throwable -> L5a
            defpackage.hm9.q(r3, r13, r11)     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L7d
            goto L65
        L7d:
            return r2
        L7e:
            if (r2 == 0) goto L83
            r2.close()
        L83:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static int p(Context context) {
        if (e == null) {
            ((y8a) vl.b()).f().getClass();
            Size sizeI = ti4.i(context);
            int iMin = (int) ((Math.min(sizeI.getWidth(), sizeI.getHeight()) / 3.0f) * 2.0f);
            if (iMin < 400) {
                iMin = 400;
            }
            e = Integer.valueOf(iMin);
        }
        return e.intValue();
    }

    public static String q(String str) {
        try {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            String strSubstring = str.substring(iLastIndexOf + 1);
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(strSubstring.toLowerCase());
            return (!oag.t(mimeTypeFromExtension) || oag.t(strSubstring)) ? mimeTypeFromExtension : "application/".concat(strSubstring);
        } catch (Exception e2) {
            hm9.o("tfg", "getMimeTypeFromFileName: failed, e: " + e2.toString());
            return null;
        }
    }

    public static String r(Context context, Uri uri, yx4 yx4Var) {
        try {
            String string = uri.toString();
            try {
                String path = uri.getPath();
                if (oag.t(path)) {
                    hm9.m("tfg", "getPath: path from uri.getPath is empty, uri = %s", string);
                } else {
                    File file = new File(path);
                    if (file.exists()) {
                        hm9.n("tfg", "getPath: from file: " + string);
                        return file.getAbsolutePath();
                    }
                }
                File file2 = new File(uri.toString());
                if (file2.exists()) {
                    hm9.n("tfg", "getPath: from file: " + string);
                    return file2.getAbsolutePath();
                }
            } catch (Exception e2) {
                hm9.p("tfg", "getPath: error check file exists", e2);
            }
            char c2 = 65535;
            if (string.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str = string.split("/1/")[1];
                    int iIndexOf = str.indexOf("/ACTUAL");
                    if (iIndexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str.substring(0, iIndexOf), StandardCharsets.UTF_8));
                    }
                } catch (Exception e3) {
                    hm9.p("tfg", "getPath: error on get google photos uri", e3);
                }
            }
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    hm9.n("tfg", "getPath: is external document: " + uri);
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                    }
                } else {
                    if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                        hm9.n("tfg", "getPath: is download document: " + uri);
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (oag.t(documentId) || !documentId.toLowerCase().startsWith("raw:")) {
                            return o(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                        }
                        String strSubstring = documentId.substring(4);
                        if (pag.l(strSubstring)) {
                            return strSubstring;
                        }
                        return null;
                    }
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        hm9.n("tfg", "getPath: is media document: " + uri);
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str2 = strArrSplit2[0];
                        int iHashCode = str2.hashCode();
                        if (iHashCode != 93166550) {
                            if (iHashCode != 100313435) {
                                if (iHashCode == 112202875 && str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                    c2 = 1;
                                }
                            } else if (str2.equals("image")) {
                                c2 = 0;
                            }
                        } else if (str2.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            c2 = 2;
                        }
                        return o(context, c2 != 0 ? c2 != 1 ? c2 != 2 ? null : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArrSplit2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    String authority = uri.getAuthority();
                    if (!oag.t(authority) && authority.equalsIgnoreCase(yx4Var.a)) {
                        hm9.n("tfg", "getPath: from application content scheme: " + uri);
                        String strK = k(uri);
                        if (!oag.t(strK)) {
                            return strK;
                        }
                    }
                    hm9.n("tfg", "getPath: from content scheme: " + uri);
                    return o(context, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    hm9.n("tfg", "getPath: from file scheme: " + uri);
                    return uri.getPath();
                }
            }
        } catch (Exception e4) {
            hm9.q("tfg", "getPath: error for uri %s, e: %s", uri, e4.toString());
        }
        return null;
    }

    public static final gta s(Context context) {
        gta gtaVar = g;
        if (gtaVar != null) {
            return gtaVar;
        }
        gta gtaVar2 = new gta(context.getApplicationContext());
        g = gtaVar2;
        return gtaVar2;
    }

    public static jic t(Context context, int i, int i2, boolean z) {
        int i3;
        int iP = p(context);
        if (d == null) {
            ((y8a) vl.b()).f().getClass();
            Size sizeI = ti4.i(context);
            d = Integer.valueOf(Math.max(sizeI.getWidth(), sizeI.getHeight()));
        }
        int iIntValue = d.intValue();
        if (z) {
            iIntValue = iP;
        }
        if (i2 * i < iIntValue * iIntValue) {
            return null;
        }
        if (i2 <= iIntValue && i <= iIntValue) {
            return null;
        }
        if (i2 > i) {
            int i4 = (int) ((i / i2) * iIntValue);
            i3 = iIntValue;
            iIntValue = i4;
        } else {
            i3 = (int) ((i2 / i) * iIntValue);
        }
        return new jic(iIntValue, z ? iP : 2048.0f, i3);
    }

    public static jic u(Context context, k20 k20Var, boolean z) {
        int i;
        int i2 = k20Var.e;
        int i3 = k20Var.f;
        jic jicVarT = t(context, i2, i3, z);
        if (jicVarT == null && (i = k20Var.e) > 0 && i3 > 0) {
            jicVarT = new jic(i, z ? p(context) : 2048.0f, i3);
        }
        return jicVarT;
    }

    public static jic v(Context context, l20 l20Var, boolean z) {
        g20 g20Var = l20Var.a;
        if (g20Var == g20.Z) {
            c20 c20Var = l20Var.g;
            if (c20Var.a()) {
                return v(context, c20Var.g, z);
            }
            x10 x10Var = c20Var.f;
            if (x10Var != null) {
                return t(context, x10Var.c, x10Var.o, z);
            }
        } else {
            if (g20Var == g20.c) {
                x10 x10Var2 = l20Var.b;
                return t(context, x10Var2.c, x10Var2.o, z);
            }
            boolean zN = s5c.N(l20Var);
            s10 s10Var = l20Var.j;
            if (zN) {
                if (!z) {
                    return null;
                }
                x10 x10Var3 = s10Var.d.b;
                return t(context, x10Var3.c, x10Var3.o, z);
            }
            if (l20Var.a == g20.o) {
                return u(context, l20Var.d, z);
            }
            if (s5c.P(l20Var)) {
                return u(context, s10Var.d.d, z);
            }
        }
        return null;
    }

    public static long w(fw4 fw4Var, ByteBuffer byteBuffer, long j) {
        z(fw4Var, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r0.contains(r10.getFilesDir().getParent()) == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(android.net.Uri r9, android.content.Context r10, defpackage.o45 r11) throws java.io.IOException, android.system.ErrnoException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.x(android.net.Uri, android.content.Context, o45):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.n7d y(defpackage.gy8 r26) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfg.y(gy8):n7d");
    }

    public static void z(fw4 fw4Var, ByteBuffer byteBuffer, int i, long j) {
        int iB;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iB = fw4Var.b(j, byteBuffer)) != -1) {
            j += iB;
        }
        if (byteBuffer.remaining() > 0) {
            throw new ja9("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    public abstract void E(eu0 eu0Var);

    public abstract long g();

    public abstract rl8 h();
}

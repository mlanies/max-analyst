package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* loaded from: classes.dex */
public abstract class lz7 implements qsd {
    public static boolean a = false;
    public static int b = 1;
    public static final fs4 c = new fs4(24);
    public static final Object d = new Object();
    public static boolean e;
    public static int f;
    public static final /* synthetic */ int g = 0;

    public static void C(ww8 ww8Var, Map map) throws IOException {
        ww8Var.o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            D(ww8Var, entry.getKey());
            D(ww8Var, entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(defpackage.ww8 r17, java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz7.D(ww8, java.lang.Object):void");
    }

    public static Set E(String str) {
        Character ch;
        if (str.length() == 0) {
            return wz4.a;
        }
        String strSubstring = str.substring(w9e.z0(str, '(', 0, false, 6) + 1, w9e.E0(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i2);
            int i4 = i3 + 1;
            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(cCharAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == cCharAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (cCharAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(cCharAt));
                }
            } else if (cCharAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = tpa.m(strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i5++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(w9e.b1(strSubstring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String[] strArr = h56.d;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                }
                if (eae.o0(str2, strArr[i6], false)) {
                    arrayList2.add(next);
                    break;
                }
                i6++;
            }
        }
        return x53.H0(arrayList2);
    }

    public static Object F(uaf uafVar) {
        switch (au1.s(uafVar.e())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((nw6) uafVar).a);
            case 2:
                return Long.valueOf(uafVar.f().i());
            case 3:
                return Float.valueOf((float) ((rw6) uafVar).a);
            case 4:
                return ((m1) uafVar.m()).y();
            case 5:
                return ByteBuffer.wrap(((m1) uafVar.o()).a).asReadOnlyBuffer();
            case 6:
                hw6 hw6VarC = uafVar.c();
                int length = hw6VarC.a.length;
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(F(hw6VarC.a[i]));
                }
                return arrayList;
            case 7:
                fx6 fx6VarG = uafVar.g();
                HashMap map = new HashMap(fx6VarG.a.length / 2);
                Iterator it = new ps(fx6VarG.a).iterator();
                while (true) {
                    gw6 gw6Var = (gw6) it;
                    if (!gw6Var.hasNext()) {
                        return map;
                    }
                    Map.Entry entry = (Map.Entry) gw6Var.next();
                    map.put(F((uaf) entry.getKey()), F((uaf) entry.getValue()));
                }
            default:
                throw new RuntimeException(zr6.i("Type ", h4f.s(uafVar.e()), " isn't yet implemented"));
        }
    }

    public static int G(gy8 gy8Var) {
        if (gy8Var.n().a() == 7) {
            return gy8Var.s0();
        }
        gy8Var.z();
        return 0;
    }

    public static boolean H(gy8 gy8Var) {
        Boolean boolValueOf = Boolean.FALSE;
        if (gy8Var.n().a() == 2) {
            boolValueOf = Boolean.valueOf(gy8Var.u0());
        } else {
            gy8Var.z();
        }
        return boolValueOf.booleanValue();
    }

    public static byte I(gy8 gy8Var) {
        int i;
        long j;
        if (gy8Var.n().a() != 3) {
            gy8Var.z();
            return (byte) 0;
        }
        byte b2 = gy8Var.readByte();
        if (wmd.w(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                byte b3 = gy8Var.readByte();
                if (b3 >= 0) {
                    return b3;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(b3 & 255));
            case -51:
                i = gy8Var.readShort();
                if (i < 0 || i > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i & 65535));
                }
                return (byte) i;
            case -50:
                i = gy8Var.readInt();
                if (i < 0 || i > 127) {
                    throw gy8.U(i);
                }
                return (byte) i;
            case -49:
                j = gy8Var.readLong();
                if (j < 0 || j > 127) {
                    throw gy8.e0(j);
                }
                i = (int) j;
                return (byte) i;
            case -48:
                return gy8Var.readByte();
            case -47:
                i = gy8Var.readShort();
                if (i < -128 || i > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i));
                }
                return (byte) i;
            case -46:
                i = gy8Var.readInt();
                if (i < -128 || i > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i));
                }
                return (byte) i;
            case -45:
                j = gy8Var.readLong();
                if (j < -128 || j > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
                }
                i = (int) j;
                return (byte) i;
            default:
                throw gy8.r0("Integer", b2);
        }
    }

    public static Double J(gy8 gy8Var, Double d2) {
        double d3;
        if (gy8Var.n().a() != 4) {
            gy8Var.z();
            return d2;
        }
        byte b2 = gy8Var.readByte();
        if (b2 == -54) {
            d3 = gy8Var.m0(4).getFloat(gy8Var.v0);
        } else {
            if (b2 != -53) {
                throw gy8.r0("Float", b2);
            }
            d3 = gy8Var.m0(8).getDouble(gy8Var.v0);
        }
        return Double.valueOf(d3);
    }

    public static Float K(gy8 gy8Var, Float f2) {
        float f3;
        if (gy8Var.n().a() != 4) {
            gy8Var.z();
            return f2;
        }
        byte b2 = gy8Var.readByte();
        if (b2 == -54) {
            f3 = gy8Var.m0(4).getFloat(gy8Var.v0);
        } else {
            if (b2 != -53) {
                throw gy8.r0("Float", b2);
            }
            f3 = (float) gy8Var.m0(8).getDouble(gy8Var.v0);
        }
        return Float.valueOf(f3);
    }

    public static int L(gy8 gy8Var) {
        Integer numValueOf = 0;
        if (gy8Var.n().a() == 3) {
            numValueOf = Integer.valueOf(gy8Var.v0());
        } else {
            gy8Var.z();
        }
        return numValueOf.intValue();
    }

    public static long M(gy8 gy8Var, long j) {
        if (gy8Var.n().a() == 3) {
            return gy8Var.w0();
        }
        gy8Var.z();
        return j;
    }

    public static int N(gy8 gy8Var) {
        if (gy8Var.n().a() == 8) {
            return gy8Var.x0();
        }
        gy8Var.z();
        return 0;
    }

    public static short O(gy8 gy8Var) {
        int i;
        long j;
        if (gy8Var.n().a() != 3) {
            gy8Var.z();
            return (short) 0;
        }
        byte b2 = gy8Var.readByte();
        if (wmd.w(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                i = gy8Var.readByte() & 255;
                return (short) i;
            case -51:
                short s = gy8Var.readShort();
                if (s >= 0) {
                    return s;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
            case -50:
                i = gy8Var.readInt();
                if (i < 0 || i > 32767) {
                    throw gy8.U(i);
                }
                return (short) i;
            case -49:
                j = gy8Var.readLong();
                if (j < 0 || j > 32767) {
                    throw gy8.e0(j);
                }
                i = (int) j;
                return (short) i;
            case -48:
                i = gy8Var.readByte();
                return (short) i;
            case -47:
                return gy8Var.readShort();
            case -46:
                i = gy8Var.readInt();
                if (i < -32768 || i > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i));
                }
                return (short) i;
            case -45:
                j = gy8Var.readLong();
                if (j < -32768 || j > 32767) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
                }
                i = (int) j;
                return (short) i;
            default:
                throw gy8.r0("Integer", b2);
        }
    }

    public static String P(gy8 gy8Var) {
        if (gy8Var.n().a() == 5) {
            return gy8Var.z0();
        }
        gy8Var.z();
        return null;
    }

    public static String Q(gy8 gy8Var, String str) {
        if (gy8Var.n().a() == 5) {
            return gy8Var.z0();
        }
        gy8Var.z();
        return str;
    }

    public static void R(Map map, ByteArrayOutputStream byteArrayOutputStream) {
        tw8 tw8Var = vw8.b;
        ww8 ww8Var = new ww8(new OutputStreamBufferOutput(byteArrayOutputStream, tw8Var.c), tw8Var);
        try {
            ww8Var.o(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                ww8Var.U(str);
                D(ww8Var, obj);
            }
        } finally {
            ww8Var.close();
        }
    }

    public static int S(fka fkaVar, b7a b7aVar, z6a z6aVar, boolean z) {
        if (!z) {
            int iOrdinal = b7aVar.ordinal();
            if (iOrdinal == 0) {
                int iOrdinal2 = z6aVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    return fkaVar.d().c.b.b;
                }
                if (iOrdinal2 == 2) {
                    return fkaVar.d().c.b.a;
                }
                if (iOrdinal2 == 3) {
                    return fkaVar.d().c.b.b;
                }
                if (iOrdinal2 == 4) {
                    return fkaVar.d().c.b.f;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal3 = z6aVar.ordinal();
            if (iOrdinal3 == 0) {
                return fkaVar.getText().j;
            }
            if (iOrdinal3 == 1) {
                return fkaVar.getText().b;
            }
            if (iOrdinal3 == 2) {
                return fkaVar.getText().e;
            }
            if (iOrdinal3 == 3) {
                return fkaVar.getText().c;
            }
            if (iOrdinal3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fkaVar.getText();
            return -1;
        }
        int iOrdinal4 = b7aVar.ordinal();
        if (iOrdinal4 == 0) {
            int iOrdinal5 = z6aVar.ordinal();
            if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                fkaVar.getText();
                return -1;
            }
            if (iOrdinal5 == 2) {
                return fkaVar.getText().a;
            }
            if (iOrdinal5 == 3) {
                fkaVar.getText();
                return -1;
            }
            if (iOrdinal5 == 4) {
                return fkaVar.getText().f;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iOrdinal4 != 1 && iOrdinal4 != 2 && iOrdinal4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal6 = z6aVar.ordinal();
        if (iOrdinal6 == 0) {
            return fkaVar.getText().j;
        }
        if (iOrdinal6 == 1) {
            return fkaVar.getText().b;
        }
        if (iOrdinal6 == 2) {
            return fkaVar.getText().e;
        }
        if (iOrdinal6 == 3) {
            return fkaVar.getText().c;
        }
        if (iOrdinal6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        fkaVar.getText();
        return -1;
    }

    public static String T(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String U(int i) {
        return wg0.g(i, "ProfileItemId(value=", ")");
    }

    public static String V(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static ArrayList W(gy8 gy8Var, df9 df9Var) {
        if (gy8Var.n().a() != 7) {
            gy8Var.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iS0 = gy8Var.s0();
        for (int i = 0; i < iS0; i++) {
            arrayList.add(df9Var.r(gy8Var));
        }
        return arrayList;
    }

    public static Set X(gy8 gy8Var, df9 df9Var) {
        if (gy8Var.n().a() != 7) {
            gy8Var.z();
            return Collections.emptySet();
        }
        int iS0 = gy8Var.s0();
        HashSet hashSet = new HashSet(iS0);
        for (int i = 0; i < iS0; i++) {
            hashSet.add(df9Var.r(gy8Var));
        }
        return hashSet;
    }

    public static long Y(gy8 gy8Var) {
        if (gy8Var.n().a() == 3) {
            return gy8Var.w0();
        }
        gy8Var.z();
        throw new IllegalArgumentException("invalid type " + gy8Var.n());
    }

    public static final void Z(y5f y5fVar) {
        y5fVar.e(w0f.class, new k1e(14));
        y5fVar.e(c7f.class, new k1e(15));
        y5fVar.e(x0f.class, new k1e(16));
        y5fVar.e(cge.class, new k1e(17));
        y5fVar.e(ige.class, new k1e(18));
        y5fVar.e(kq6.class, new k1e(19));
        y5fVar.e(gq6.class, new k1e(20));
        y5fVar.e(dfe.class, new k1e(21));
        y5fVar.e(ct0.class, new k1e(22));
        y5fVar.e(zve.class, new lxc(19));
        y5fVar.c(pi4.class, new lxc(18));
    }

    public static void a0(int i, int i2) {
        String strR;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strR = np8.R("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strR = np8.R("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static void b0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? c0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? c0(i2, i3, "end index") : np8.R("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static hv0 c(fka fkaVar, b7a b7aVar, z6a z6aVar, boolean z) {
        if (!z) {
            int iOrdinal = b7aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return new hv0(fkaVar.d().a.b.f, Integer.valueOf(fkaVar.d().a.b.f));
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    return new hv0(fkaVar.d().a.a.h, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal2 = z6aVar.ordinal();
            if (iOrdinal2 == 0) {
                return new hv0(fkaVar.d().a.b.l, Integer.valueOf(fkaVar.d().a.b.l));
            }
            if (iOrdinal2 == 1) {
                return new hv0(fkaVar.d().a.b.d, Integer.valueOf(fkaVar.d().a.b.d));
            }
            if (iOrdinal2 == 2) {
                return new hv0(fkaVar.d().a.b.e, Integer.valueOf(fkaVar.d().a.b.e));
            }
            if (iOrdinal2 == 3) {
                return new hv0(fkaVar.d().a.b.h, Integer.valueOf(fkaVar.d().a.b.h));
            }
            if (iOrdinal2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new hv0(fkaVar.d().a.b.c, Integer.valueOf(fkaVar.d().a.b.c));
        }
        int iOrdinal3 = b7aVar.ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                return new hv0(fkaVar.d().a.a.d, Integer.valueOf(fkaVar.b().a.g));
            }
            if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                return new hv0(fkaVar.d().a.a.h, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal4 = z6aVar.ordinal();
        if (iOrdinal4 == 0) {
            return new hv0(fkaVar.d().a.a.g, Integer.valueOf(fkaVar.b().a.m));
        }
        if (iOrdinal4 == 1) {
            return new hv0(fkaVar.d().a.a.b, Integer.valueOf(fkaVar.b().a.e));
        }
        if (iOrdinal4 == 2) {
            return new hv0(fkaVar.d().a.a.c, Integer.valueOf(fkaVar.b().a.f));
        }
        if (iOrdinal4 == 3) {
            return new hv0(fkaVar.d().a.a.e, Integer.valueOf(fkaVar.b().a.k));
        }
        if (iOrdinal4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        fkaVar.b().a.getClass();
        fkaVar.d().a.a.getClass();
        return new hv0(-1907998, -1);
    }

    public static String c0(int i, int i2, String str) {
        if (i < 0) {
            return np8.R("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return np8.R("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static float d(c7a c7aVar) {
        float f2;
        float f3;
        int iOrdinal = c7aVar.ordinal();
        if (iOrdinal == 0) {
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 10.0f;
        } else if (iOrdinal == 1) {
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 12.0f;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 16.0f;
        }
        return f2 * f3;
    }

    public static wj4 e(hm9 hm9Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        yj4 yj4Var;
        zj4 zj4Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        yj4 yj4Var2;
        yj4 yj4Var3;
        int i2;
        int i3;
        zj4 zj4Var2;
        zj4 zj4Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iF = hm9Var.F();
        int iD = hm9Var.D();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        yj4 yj4Var4 = new yj4();
        int i10 = 0;
        yj4Var4.a = 0;
        yj4Var4.b = iF;
        yj4Var4.c = 0;
        yj4Var4.d = iD;
        arrayList6.add(yj4Var4);
        int i11 = iF + iD;
        int i12 = 1;
        int i13 = (((i11 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i13];
        int i14 = i13 / 2;
        int[] iArr2 = new int[i13];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            yj4 yj4Var5 = (yj4) arrayList6.remove(arrayList6.size() - i12);
            if (yj4Var5.b() < i12 || yj4Var5.a() < i12) {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                yj4Var = yj4Var5;
                zj4Var = null;
            } else {
                int iA = ((yj4Var5.a() + yj4Var5.b()) + i12) / 2;
                int i15 = i12 + i14;
                iArr[i15] = yj4Var5.a;
                iArr2[i15] = yj4Var5.b;
                int i16 = i10;
                while (i16 < iA) {
                    int i17 = Math.abs(yj4Var5.b() - yj4Var5.a()) % 2 == i12 ? i12 : i10;
                    int iB = yj4Var5.b() - yj4Var5.a();
                    int i18 = -i16;
                    int i19 = i18;
                    while (true) {
                        if (i19 > i16) {
                            arrayList = arrayList6;
                            i2 = i10;
                            arrayList2 = arrayList7;
                            i3 = iA;
                            zj4Var2 = null;
                            break;
                        }
                        if (i19 == i18 || (i19 != i16 && iArr[i19 + 1 + i14] > iArr[(i19 - 1) + i14])) {
                            i7 = iArr[i19 + 1 + i14];
                            i8 = i7;
                        } else {
                            i7 = iArr[(i19 - 1) + i14];
                            i8 = i7 + 1;
                        }
                        i3 = iA;
                        arrayList = arrayList6;
                        int i20 = ((i8 - yj4Var5.a) + yj4Var5.c) - i19;
                        int i21 = (i16 == 0 || i8 != i7) ? i20 : i20 - 1;
                        arrayList2 = arrayList7;
                        while (i8 < yj4Var5.b && i20 < yj4Var5.d && hm9Var.d(i8, i20)) {
                            i8++;
                            i20++;
                        }
                        iArr[i19 + i14] = i8;
                        if (i17 != 0) {
                            int i22 = iB - i19;
                            i9 = i17;
                            if (i22 >= i18 + 1 && i22 <= i16 - 1 && iArr2[i22 + i14] <= i8) {
                                zj4Var2 = new zj4();
                                zj4Var2.a = i7;
                                zj4Var2.b = i21;
                                zj4Var2.c = i8;
                                zj4Var2.d = i20;
                                i2 = 0;
                                zj4Var2.e = false;
                                break;
                            }
                        } else {
                            i9 = i17;
                        }
                        i19 += 2;
                        i10 = 0;
                        iA = i3;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i17 = i9;
                    }
                    if (zj4Var2 != null) {
                        zj4Var = zj4Var2;
                        yj4Var = yj4Var5;
                        break;
                    }
                    int i23 = (yj4Var5.b() - yj4Var5.a()) % 2 == 0 ? 1 : i2;
                    int iB2 = yj4Var5.b() - yj4Var5.a();
                    int i24 = i18;
                    while (true) {
                        if (i24 > i16) {
                            yj4Var = yj4Var5;
                            zj4Var3 = null;
                            break;
                        }
                        if (i24 == i18 || (i24 != i16 && iArr2[i24 + 1 + i14] < iArr2[(i24 - 1) + i14])) {
                            i4 = iArr2[i24 + 1 + i14];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i24 - 1) + i14];
                            i5 = i4 - 1;
                        }
                        int i25 = yj4Var5.d - ((yj4Var5.b - i5) - i24);
                        int i26 = (i16 == 0 || i5 != i4) ? i25 : i25 + 1;
                        while (i5 > yj4Var5.a && i25 > yj4Var5.c) {
                            yj4Var = yj4Var5;
                            if (!hm9Var.d(i5 - 1, i25 - 1)) {
                                break;
                            }
                            i5--;
                            i25--;
                            yj4Var5 = yj4Var;
                        }
                        yj4Var = yj4Var5;
                        iArr2[i24 + i14] = i5;
                        if (i23 != 0 && (i6 = iB2 - i24) >= i18 && i6 <= i16 && iArr[i6 + i14] >= i5) {
                            zj4Var3 = new zj4();
                            zj4Var3.a = i5;
                            zj4Var3.b = i25;
                            zj4Var3.c = i4;
                            zj4Var3.d = i26;
                            zj4Var3.e = true;
                            break;
                        }
                        i24 += 2;
                        yj4Var5 = yj4Var;
                    }
                    if (zj4Var3 != null) {
                        zj4Var = zj4Var3;
                        break;
                    }
                    i16++;
                    iA = i3;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    yj4Var5 = yj4Var;
                    i12 = 1;
                    i10 = 0;
                }
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                yj4Var = yj4Var5;
                zj4Var = null;
            }
            if (zj4Var != null) {
                if (zj4Var.a() > 0) {
                    int i27 = zj4Var.d;
                    int i28 = zj4Var.b;
                    int i29 = i27 - i28;
                    int i30 = zj4Var.c;
                    int i31 = zj4Var.a;
                    int i32 = i30 - i31;
                    arrayList5.add(i29 != i32 ? zj4Var.e ? new vj4(i31, i28, zj4Var.a()) : i29 > i32 ? new vj4(i31, i28 + 1, zj4Var.a()) : new vj4(i31 + 1, i28, zj4Var.a()) : new vj4(i31, i28, i32));
                }
                if (arrayList2.isEmpty()) {
                    yj4Var2 = new yj4();
                    arrayList4 = arrayList2;
                    yj4Var3 = yj4Var;
                    i = 1;
                } else {
                    i = 1;
                    arrayList4 = arrayList2;
                    yj4Var2 = (yj4) arrayList4.remove(arrayList2.size() - 1);
                    yj4Var3 = yj4Var;
                }
                yj4Var2.a = yj4Var3.a;
                yj4Var2.c = yj4Var3.c;
                yj4Var2.b = zj4Var.a;
                yj4Var2.d = zj4Var.b;
                arrayList3 = arrayList;
                arrayList3.add(yj4Var2);
                yj4Var3.b = yj4Var3.b;
                yj4Var3.d = yj4Var3.d;
                yj4Var3.a = zj4Var.c;
                yj4Var3.c = zj4Var.d;
                arrayList3.add(yj4Var3);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i = 1;
                arrayList4.add(yj4Var);
            }
            i12 = i;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i10 = 0;
        }
        Collections.sort(arrayList5, c);
        return new wj4(hm9Var, arrayList5, iArr, iArr2);
    }

    public static void f(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static int g(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(wg0.h("overflow: checkedAdd(", i, ", ", i2, ")"));
    }

    public static csc h(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new csc();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
            return new csc(map);
        }
        bundle.setClassLoader(csc.class.getClassLoader());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new csc(linkedHashMap);
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static boolean j(CharSequence charSequence, CharSequence charSequence2) {
        char c2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i) && ((c2 = (char) ((r4 | ' ') - 97)) >= 26 || c2 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static long k(long j, k92 k92Var) {
        long j2;
        Long lB;
        Long l;
        uaa uaaVar = k92Var.f0;
        if (uaaVar == null) {
            j2 = 0;
        } else {
            j2 = k92Var.g0;
            if (j2 == 0 && (uaaVar.b() == null || ((lB = uaaVar.b()) != null && lB.longValue() == 0))) {
                j2 = k92Var.h0;
            }
        }
        Long[] lArr = {Long.valueOf(k92Var.P), Long.valueOf(j), Long.valueOf(j2)};
        if (lArr.length == 0) {
            l = null;
        } else {
            Long l2 = lArr[0];
            int i = 1;
            int length = lArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Long l3 = lArr[i];
                    if (l2.compareTo(l3) < 0) {
                        l2 = l3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            l = l2;
        }
        long jLongValue = (l != null ? l : 0L).longValue();
        return jLongValue == 0 ? k92Var.k : jLongValue;
    }

    public static final HashSet l(String str) {
        HashSet hashSet = new HashSet();
        try {
            Iterator it = w9e.Q0(str, new String[]{","}, false, 6).iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        } catch (Throwable th) {
            hm9.p("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
        }
        return hashSet;
    }

    public static final at m(View view) {
        return new at(5, new jnf(view, null));
    }

    public static Context n(Context context) {
        int iC;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iC = on0.c(context)) != on0.c(applicationContext)) {
            applicationContext = on0.a(applicationContext, iC);
        }
        if (i < 30) {
            return applicationContext;
        }
        String strB = eu3.b(context);
        return !Objects.equals(strB, eu3.b(applicationContext)) ? eu3.a(applicationContext, strB) : applicationContext;
    }

    public static int o(int i) {
        return i >= tu0.G(((float) 200) * fk4.d().getDisplayMetrics().density) ? tu0.G(90 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(36 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density) ? tu0.G(32 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density) ? tu0.G(28 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density) ? tu0.G(24 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density) ? tu0.G(20 * fk4.d().getDisplayMetrics().density) : i >= 28 ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : tu0.G(12 * fk4.d().getDisplayMetrics().density);
    }

    public static synchronized int p(Context context) {
        try {
            fp3.o(context, "Context is null");
            "preferredRenderer: ".concat("null");
            if (!a) {
                try {
                    hhg hhgVarN = dy7.N(context);
                    try {
                        sfg sfgVarI0 = hhgVarN.I0();
                        fp3.n(sfgVarI0);
                        mr0.m = sfgVarI0;
                        xig xigVarK0 = hhgVarN.K0();
                        if (z04.d == null) {
                            fp3.o(xigVarK0, "delegate must not be null");
                            z04.d = xigVarK0;
                        }
                        a = true;
                        try {
                            Parcel parcelR = hhgVarN.R(hhgVarN.G0(), 9);
                            int i = parcelR.readInt();
                            parcelR.recycle();
                            if (i == 2) {
                                b = 2;
                            }
                            oy9 oy9Var = new oy9(context);
                            Parcel parcelG0 = hhgVarN.G0();
                            agg.c(parcelG0, oy9Var);
                            parcelG0.writeInt(0);
                            hhgVarN.H0(parcelG0, 10);
                        } catch (RemoteException unused) {
                        }
                        int i2 = b;
                        "loadedRenderer: ".concat(i2 != 1 ? i2 != 2 ? "null" : "LATEST" : "LEGACY");
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    return e3.a;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    public static vi4 q(Context context) throws IOException {
        int memoryClass;
        long j;
        vi4 vi4Var = vi4.c;
        vi4 vi4Var2 = vi4.b;
        if (vi4Var2 != null) {
            return vi4Var2;
        }
        int i = Build.VERSION.SDK_INT;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
        } catch (Throwable unused) {
            memoryClass = 0;
        }
        if (activityManager.isLowRamDevice()) {
            return vi4Var;
        }
        memoryClass = activityManager.getMemoryClass();
        if (Build.VERSION.SDK_INT >= 31 && Build.SOC_MODEL != null && ys.R(Build.SOC_MODEL.toUpperCase(Locale.getDefault()).hashCode(), vi4.a)) {
            return vi4Var;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iAvailableProcessors; i4++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq", "r");
                String line = randomAccessFile.readLine();
                if (line != null && line.length() != 0) {
                    i3 += Integer.parseInt(line) / 1000;
                    i2++;
                }
                randomAccessFile.close();
            } catch (FileNotFoundException | IOException unused2) {
            }
        }
        int iCeil = i2 == 0 ? -1 : (int) Math.ceil(i3 / i2);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        } catch (Throwable unused3) {
            j = -1;
        }
        if (iAvailableProcessors > 2 && memoryClass > 100 && ((iAvailableProcessors > 4 || iCeil == -1 || iCeil > 1250) && (j == -1 || j >= 2147483648L))) {
            vi4Var = (iAvailableProcessors < 8 || memoryClass <= 160 || (iCeil != -1 && iCeil <= 2050)) ? vi4.o : vi4.X;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            String str = Build.MANUFACTURER;
            StringBuilder sb = new StringBuilder("selected_class = ");
            sb.append(vi4Var);
            sb.append(": (cpu_count = ");
            sb.append(iAvailableProcessors);
            sb.append(", freq = ");
            ms2.k(sb, iCeil, ", memoryClass = ", memoryClass, ", android version ");
            sb.append(i);
            sb.append(", manufacture ");
            sb.append(str);
            sb.append(")");
            ir6Var.d(us7Var, "DevicePerformanceClass", sb.toString(), null);
        }
        vi4.b = vi4Var;
        return vi4Var;
    }

    public static int r(c7a c7aVar) {
        int iOrdinal = c7aVar.ordinal();
        if (iOrdinal == 0) {
            return tu0.G(28 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return tu0.G(40 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return tu0.G(52 * fk4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    public void A(dh8 dh8Var) {
    }

    public void B() {
    }

    @Override // defpackage.qsd
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public abstract void w(dh8 dh8Var);

    public void x() {
    }

    public void y(dh8 dh8Var) {
    }

    public void z() {
    }
}

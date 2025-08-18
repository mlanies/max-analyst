package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class eef {
    public static final HashMap a;
    public static final bue b;

    static {
        HashMap map = new HashMap();
        a = map;
        b = bue.a;
        HashMap map2 = new HashMap();
        jc0 jc0Var = jc0.d;
        map2.put(1, jc0Var);
        jc0 jc0Var2 = jc0.f;
        map2.put(2, jc0Var2);
        jc0 jc0Var3 = jc0.g;
        map2.put(4096, jc0Var3);
        map2.put(8192, jc0Var3);
        HashMap map3 = new HashMap();
        map3.put(1, jc0Var);
        map3.put(2, jc0Var2);
        map3.put(4096, jc0Var3);
        map3.put(8192, jc0Var3);
        HashMap map4 = new HashMap();
        map4.put(1, jc0Var);
        map4.put(4, jc0Var2);
        map4.put(4096, jc0Var3);
        map4.put(16384, jc0Var3);
        map4.put(2, jc0Var);
        map4.put(8, jc0Var2);
        map4.put(8192, jc0Var3);
        map4.put(32768, jc0Var3);
        HashMap map5 = new HashMap();
        map5.put(256, jc0Var2);
        map5.put(512, jc0.e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static jc0 a(int i, String str) {
        jc0 jc0Var;
        Map map = (Map) a.get(str);
        if (map != null && (jc0Var = (jc0) map.get(Integer.valueOf(i))) != null) {
            return jc0Var;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i));
        return jc0.d;
    }

    public static kc0 b(ab0 ab0Var, eu4 eu4Var, nc0 nc0Var) {
        c54.p("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + eu4Var + "]", eu4Var.b());
        int i = ab0Var.c;
        String str = "video/avc";
        String str2 = i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i2 = eu4Var.a;
        if (nc0Var == null) {
            ha0Var = null;
        } else {
            Set setEmptySet = (Set) hu4.b.get(Integer.valueOf(i2));
            if (setEmptySet == null) {
                setEmptySet = Collections.emptySet();
            }
            Set setEmptySet2 = (Set) hu4.a.get(Integer.valueOf(eu4Var.b));
            if (setEmptySet2 == null) {
                setEmptySet2 = Collections.emptySet();
            }
            for (ha0 ha0Var : nc0Var.d) {
                if (setEmptySet.contains(Integer.valueOf(ha0Var.j)) && setEmptySet2.contains(Integer.valueOf(ha0Var.h))) {
                    String str3 = ha0Var.b;
                    if (!str2.equals(str3)) {
                        if (i == -1) {
                            eu4Var.toString();
                        }
                    }
                    str2 = str3;
                    break;
                }
            }
            ha0Var = null;
        }
        if (ha0Var == null) {
            if (i == -1) {
                if (i2 != 1) {
                    if (i2 == 3 || i2 == 4 || i2 == 5) {
                        str = "video/hevc";
                    } else {
                        if (i2 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + eu4Var + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (nc0Var == null) {
                eu4Var.toString();
            } else {
                eu4Var.toString();
            }
        }
        if (str2 != null) {
            return new kc0(str2, -1, ha0Var != null ? ha0Var : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (mqd.u(3, "VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue));
        }
        if (mc0.f.equals(range)) {
            return iDoubleValue;
        }
        Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
        int iIntValue = num.intValue();
        if (mqd.u(3, "VideoConfigUtil")) {
            String.format("\nClamped to range %s -> %dbps", range, num);
        }
        return iIntValue;
    }

    public static ic0 d(ha0 ha0Var) {
        qp4 qp4VarD = ic0.d();
        String str = ha0Var.b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        qp4VarD.a = str;
        qp4VarD.b = Integer.valueOf(ha0Var.g);
        qp4VarD.o = new Size(ha0Var.e, ha0Var.f);
        qp4VarD.Z = Integer.valueOf(ha0Var.d);
        qp4VarD.t0 = Integer.valueOf(ha0Var.c);
        bue bueVar = b;
        if (bueVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        qp4VarD.c = bueVar;
        return qp4VarD.b();
    }
}

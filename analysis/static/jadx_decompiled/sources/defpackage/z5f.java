package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public enum z5f {
    ;

    public static final int X;
    public static final long Y;
    public static final int Z;
    public static final Unsafe a;
    public static final long b;
    public static final int c;
    public static final long o;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            a = unsafe;
            b = unsafe.arrayBaseOffset(byte[].class);
            c = unsafe.arrayIndexScale(byte[].class);
            o = unsafe.arrayBaseOffset(int[].class);
            X = unsafe.arrayIndexScale(int[].class);
            Y = unsafe.arrayBaseOffset(short[].class);
            Z = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static byte a(int i, byte[] bArr) {
        return a.getByte(bArr, b + (c * i));
    }

    public static int b(int i, byte[] bArr) {
        return a.getInt(bArr, b + i);
    }

    public static int c(int i, int[] iArr) {
        return a.getInt(iArr, o + (X * i));
    }

    public static long d(int i, byte[] bArr) {
        return a.getLong(bArr, b + i);
    }

    public static int e(short[] sArr, int i) {
        return a.getShort(sArr, Y + (Z * i)) & 65535;
    }

    public static short f(int i, byte[] bArr) {
        return a.getShort(bArr, b + i);
    }

    public static void g(byte[] bArr, int i, byte b2) {
        a.putByte(bArr, b + (c * i), b2);
    }

    public static void h(int i, int i2, int[] iArr) {
        a.putInt(iArr, o + (X * i), i2);
    }

    public static void i(int i, byte[] bArr, int i2) {
        a.putInt(bArr, b + i, i2);
    }

    public static void j(int i, byte[] bArr, long j) {
        a.putLong(bArr, b + i, j);
    }

    public static void k(byte[] bArr, int i, short s) {
        a.putShort(bArr, b + i, s);
    }

    public static void l(short[] sArr, int i, int i2) {
        a.putShort(sArr, Y + (Z * i), (short) i2);
    }

    public static z5f valueOf(String str) {
        au1.r(Enum.valueOf(z5f.class, str));
        throw null;
    }
}

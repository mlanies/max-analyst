package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ys extends dy7 {
    public static c6d Q(Object[] objArr) {
        return objArr.length == 0 ? vz4.a : new at(0, objArr);
    }

    public static boolean R(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean S(long[] jArr, long j) {
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (j == jArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean T(Object[] objArr, Object obj) {
        return g0(objArr, obj) >= 0;
    }

    public static boolean U(Object[] objArr, Object[] objArr2) {
        boolean z = true;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!U((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof j4f) && (obj2 instanceof j4f)) {
                    ((j4f) obj).getClass();
                    ((j4f) obj2).getClass();
                    if (!Arrays.equals((byte[]) null, (byte[]) null)) {
                        return false;
                    }
                } else if ((obj instanceof m4f) && (obj2 instanceof m4f)) {
                    ((m4f) obj).getClass();
                    ((m4f) obj2).getClass();
                    if (!Arrays.equals((short[]) null, (short[]) null)) {
                        return false;
                    }
                } else if ((obj instanceof k4f) && (obj2 instanceof k4f)) {
                    ((k4f) obj).getClass();
                    ((k4f) obj2).getClass();
                    if (!Arrays.equals((int[]) null, (int[]) null)) {
                        return false;
                    }
                } else if ((obj instanceof l4f) && (obj2 instanceof l4f)) {
                    ((l4f) obj).getClass();
                    ((l4f) obj2).getClass();
                    if (!Arrays.equals((long[]) null, (long[]) null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            i++;
            z = true;
        }
        return z;
    }

    public static void V(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void W(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void X(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static void Y(byte[] bArr, int i, byte[] bArr2, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static byte[] Z(int i, byte[] bArr, int i2) {
        dy7.m(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static void a0(float[] fArr, float f) {
        Arrays.fill(fArr, 0, fArr.length, f);
    }

    public static void b0(long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
    }

    public static void c0(Object[] objArr, Object obj) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    public static ArrayList d0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object e0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Object f0(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int g0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String h0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, m56 m56Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (m56Var != null) {
                sb.append((CharSequence) m56Var.invoke(Long.valueOf(j)));
            } else {
                sb.append((CharSequence) String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static String j0(Object[] objArr, String str, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            c54.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void k0(Object[] objArr, HashSet hashSet) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List l0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return nz4.a;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List m0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new gs(objArr, false)) : Collections.singletonList(objArr[0]) : nz4.a;
    }

    public static Set n0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return wz4.a;
        }
        if (length == 1) {
            return Collections.singleton(Long.valueOf(jArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(jArr.length));
        for (long j : jArr) {
            linkedHashSet.add(Long.valueOf(j));
        }
        return linkedHashSet;
    }
}

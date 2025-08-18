package defpackage;

/* loaded from: classes.dex */
public final class ft4 implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int o = 0;
    public final long a;

    static {
        int i = ht4.a;
        b = z7.h(4611686018427387903L);
        c = z7.h(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return z7.h(ote.f(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return z7.j((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strH0 = w9e.H0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strH0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strH0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strH0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strH0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return tpa.n(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) == 1 && (f(j) ^ true)) ? j >> 1 : i(j, kt4.MILLISECONDS);
    }

    public static final boolean f(long j) {
        return j == b || j == c;
    }

    public static final long g(long j, long j2) {
        return h(j, k(j2));
    }

    public static final long h(long j, long j2) {
        if (f(j)) {
            if ((!f(j2)) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? z7.h(j3 / 1000000) : z7.j(j3) : z7.i(j3);
    }

    public static final long i(long j, kt4 kt4Var) {
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return kt4Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? kt4.NANOSECONDS : kt4.MILLISECONDS).a);
    }

    public static String j(long j) {
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long jK = j < 0 ? k(j) : j;
        long jI = i(jK, kt4.DAYS);
        int i2 = f(jK) ? 0 : (int) (i(jK, kt4.HOURS) % 24);
        int i3 = f(jK) ? 0 : (int) (i(jK, kt4.MINUTES) % 60);
        int i4 = f(jK) ? 0 : (int) (i(jK, kt4.SECONDS) % 60);
        if (!f(jK)) {
            i = (int) (((((int) jK) & 1) == 1 ? 1 : 0) != 0 ? ((jK >> 1) % 1000) * 1000000 : (jK >> 1) % 1000000000);
        }
        boolean z2 = jI != 0;
        boolean z3 = i2 != 0;
        boolean z4 = i3 != 0;
        boolean z5 = (i4 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(jI);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('h');
            i = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i3);
            sb.append('m');
            i = i6;
        }
        if (z5) {
            int i7 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (i4 != 0 || z2 || z3 || z4) {
                b(sb, i4, i, 9, "s", false);
            } else if (i >= 1000000) {
                b(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                b(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i = i7;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = ht4.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((ft4) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ft4) {
            return this.a == ((ft4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}

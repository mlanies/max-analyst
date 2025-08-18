package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xa0 extends qs7 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final sn9 g;

    public xa0(long j, Integer num, long j2, byte[] bArr, String str, long j3, bb0 bb0Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = bb0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qs7)) {
            return false;
        }
        qs7 qs7Var = (qs7) obj;
        if (this.a == ((xa0) qs7Var).a && ((num = this.b) != null ? num.equals(((xa0) qs7Var).b) : ((xa0) qs7Var).b == null)) {
            xa0 xa0Var = (xa0) qs7Var;
            if (this.c == xa0Var.c) {
                if (Arrays.equals(this.d, qs7Var instanceof xa0 ? ((xa0) qs7Var).d : xa0Var.d)) {
                    String str = xa0Var.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == xa0Var.f) {
                            sn9 sn9Var = xa0Var.g;
                            sn9 sn9Var2 = this.g;
                            if (sn9Var2 == null) {
                                if (sn9Var == null) {
                                    return true;
                                }
                            } else if (sn9Var2.equals(sn9Var)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        sn9 sn9Var = this.g;
        return i2 ^ (sn9Var != null ? sn9Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}

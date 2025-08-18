package defpackage;

/* loaded from: classes2.dex */
public final class fr7 {
    public final er7 a;
    public final long b;

    public fr7(er7 er7Var, long j) {
        this.a = er7Var;
        this.b = j;
    }

    public static fr7 a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        Double dValueOf = Double.valueOf(1.401298464324817E-45d);
        Float fValueOf = Float.valueOf(0.0f);
        double dDoubleValue = 1.401298464324817E-45d;
        double dDoubleValue2 = 1.401298464324817E-45d;
        long jM = 0;
        double dDoubleValue3 = 0.0d;
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "alt":
                    dDoubleValue3 = lz7.J(gy8Var, Double.valueOf(0.0d)).doubleValue();
                    break;
                case "epu":
                    fFloatValue = lz7.K(gy8Var, fValueOf).floatValue();
                    break;
                case "hdn":
                    fFloatValue2 = lz7.K(gy8Var, fValueOf).floatValue();
                    break;
                case "lat":
                    dDoubleValue = lz7.J(gy8Var, dValueOf).doubleValue();
                    break;
                case "lng":
                    dDoubleValue2 = lz7.J(gy8Var, dValueOf).doubleValue();
                    break;
                case "spd":
                    fFloatValue3 = lz7.K(gy8Var, fValueOf).floatValue();
                    break;
                case "time":
                    jM = lz7.M(gy8Var, 0L);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new fr7(new er7(dDoubleValue, dDoubleValue2, dDoubleValue3, fFloatValue, fFloatValue2, fFloatValue3), jM);
    }

    public final String toString() {
        return "LocationInfo{location=" + this.a + ", time=" + this.b + "}";
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class l60 {
    public static final float[] d = new float[3];
    public final long[] a = new long[3];
    public float b;
    public float c;

    static {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < 3; i++) {
            float[] fArr = d;
            float fExp = (float) Math.exp(i);
            fArr[i] = fExp;
            f2 += fExp;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            float[] fArr2 = d;
            float f3 = fArr2[i2] / f2;
            fArr2[i2] = f3;
            f += f3;
        }
        d[2] = 1.0f - f;
    }

    public final void a(long j) {
        float f = j;
        this.c = f;
        this.b = 0.0f;
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            int length = jArr.length - 1;
            float[] fArr = d;
            if (i >= length) {
                jArr[jArr.length - 1] = j;
                this.b = (fArr[jArr.length - 1] * f) + this.b;
                return;
            } else {
                int i2 = i + 1;
                long j2 = jArr[i2];
                jArr[i] = j2;
                this.b = (fArr[i] * j2) + this.b;
                i = i2;
            }
        }
    }
}

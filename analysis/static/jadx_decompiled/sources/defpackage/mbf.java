package defpackage;

/* loaded from: classes.dex */
public abstract class mbf extends lbf {
    public sra[] a;
    public String b;
    public int c;
    public final int d;

    public mbf() {
        this.a = null;
        this.c = 0;
    }

    public sra[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(sra[] sraVarArr) {
        if (!m6d.a(this.a, sraVarArr)) {
            this.a = m6d.j(sraVarArr);
            return;
        }
        sra[] sraVarArr2 = this.a;
        for (int i = 0; i < sraVarArr.length; i++) {
            sraVarArr2[i].a = sraVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = sraVarArr[i].b;
                if (i2 < fArr.length) {
                    sraVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public mbf(mbf mbfVar) {
        this.a = null;
        this.c = 0;
        this.b = mbfVar.b;
        this.d = mbfVar.d;
        this.a = m6d.j(mbfVar.a);
    }
}

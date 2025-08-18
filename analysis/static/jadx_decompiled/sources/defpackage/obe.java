package defpackage;

/* loaded from: classes.dex */
public interface obe {
    void G(byte[] bArr, int i, int i2, nbe nbeVar, pj3 pj3Var);

    int J();

    default bbe n(int i, byte[] bArr, int i2) {
        ww6 ww6VarI = zw6.i();
        G(bArr, i, i2, nbe.c, new bqc(21, ww6VarI));
        return new c04(ww6VarI.j());
    }

    default void reset() {
    }
}
